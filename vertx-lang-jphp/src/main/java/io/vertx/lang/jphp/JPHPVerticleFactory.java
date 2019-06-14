/*
 *                            ___====-_  _-====___
 *                      _--^^^#####//      \\#####^^^--_
 *                   _-^##########// (    ) \\##########^-_
 *                  -############//  |\^^/|  \\############-
 *                _/############//   (@::@)   \\############\_
 *               /#############((     \\//     ))#############\
 *              -###############\\    (oo)    //###############-
 *             -#################\\  / VV \  //#################-
 *            -###################\\/      \//###################-
 *           _#/|##########/\######(   /\   )######/\##########|\#_
 *           |/ |#/\#/\#/\/  \#/\##\  |  |  /##/\#/  \/\#/\#/\#| \|
 *           `  |/  V  V  `   V  \#\| |  | |/#/  V   '  V  V  \|  '
 *              `   `  `      `   / | |  | | \   '      '  '   '
 *                               (  | |  | |  )
 *                              __\ | |  | | /__
 *                             (vvv(VVV)(VVV)vvv)
 */
package io.vertx.lang.jphp;

import io.vertx.core.*;
import io.vertx.core.spi.VerticleFactory;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.IMemory;
import org.develnext.jphp.scripting.JPHPScriptEngine;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.reflection.FunctionEntity;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JPHPVerticleFactory implements VerticleFactory {
  static {
    ClasspathFileResolver.init();
  }

  private static final String VERTX_START_FUNCTION = "vertxStart";
  private static final String VERTX_START_ASYNC_FUNCTION = "vertxStartAsync";
  private static final String VERTX_STOP_FUNCTION = "vertxStop";
  private static final String VERTX_STOP_ASYNC_FUNCTION = "vertxStopAsync";

  private final Method PromiseCreator;
  private final Method vertxCreator;
  private final Method contextCreator;
  private final Field field;

  public JPHPVerticleFactory() throws Exception {
    field = JPHPScriptEngine.class.getDeclaredField("environment");
    field.setAccessible(true);
    Class<?> futureClass = Class.forName("io.vertx.jphp.core.Promise");
    PromiseCreator = futureClass.getDeclaredMethod("__create", Environment.class, Promise.class, TypeConverter.class);
    Class<?> vertxClass = Class.forName("io.vertx.jphp.core.Vertx");
    vertxCreator = vertxClass.getDeclaredMethod("__create", Environment.class, Vertx.class);
    Class<?> contextClass = io.vertx.jphp.core.Context.class;
    contextCreator = contextClass.getDeclaredMethod("__create", Environment.class, Context.class);
  }

  @Override
  public String prefix() {
    return "php";
  }

  @Override
  public boolean blockingCreate() {
    return true;
  }

  @Override
  public Verticle createVerticle(String verticleName, ClassLoader classLoader) throws Exception {
    if (!verticleName.endsWith(".php")) {
      verticleName += ".php";
    }
    ScriptEngine engine = initScriptEngine();
    return new JPHPVerticle(VerticleFactory.removePrefix(verticleName), engine);
  }

  private ScriptEngine initScriptEngine() {
    //每次创建一个新的引擎，因为每一个引擎相当于一个新的verticle
    return new JPHPScriptEngine();
  }

  public class JPHPVerticle extends AbstractVerticle {
    private final String verticleName;
    private final ScriptEngine engine;
    private final Environment env;
    private Memory jvertx;
    private Memory jcontext;

    private JPHPVerticle(String verticleName, ScriptEngine engine) throws Exception {
      this.verticleName = verticleName;
      this.engine = engine;
      env = (Environment) field.get(engine);
    }

    @Override
    public void init(Vertx vertx, Context context) {
      super.init(vertx, context);
      IMemory vertxMemory;
      IMemory contextMemory;
      try {
        vertxMemory = (IMemory) vertxCreator.invoke(null, env, vertx);
        contextMemory = (IMemory) contextCreator.invoke(null, env, context);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
      jvertx = vertxMemory.toMemory();
      jcontext = contextMemory.toMemory();
      engine.put("vertx", jvertx);
      engine.put("context", jcontext);
      engine.put("config", JsonFunctions.json_decode(env, context.config().encode(), true));
    }

    @Override
    public void start(Promise<Void> startFuture) throws ScriptException {
      engine.eval("<?php require '" + verticleName + "';");
      invoke(VERTX_START_FUNCTION, VERTX_START_ASYNC_FUNCTION, startFuture);
    }

    @Override
    public void stop(Promise<Void> stopFuture) {
      invoke(VERTX_STOP_FUNCTION, VERTX_STOP_ASYNC_FUNCTION, stopFuture);
    }

    private void invoke(String syncFunctionName, String asyncFunctionName, Promise<Void> future) {
      try {
        FunctionEntity function = env.fetchFunction(syncFunctionName);
        if (function != null) {
          function.invoke(env, null, null);
          future.complete();
        } else {
          function = env.fetchFunction(asyncFunctionName);
          if (function != null) {
            IMemory result = (IMemory) PromiseCreator.invoke(null, env, future, TypeConverter.VOID);
            function.invoke(env, null, new Memory[]{result.toMemory()});
          } else {
            future.complete();
          }
        }
      } catch (Throwable throwable) {
        future.fail(throwable);
      }
    }
  }
}
