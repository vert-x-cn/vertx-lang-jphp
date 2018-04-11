package io.vertx.lang.jphp;

import io.vertx.core.*;
import io.vertx.core.spi.VerticleFactory;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.IMemory;
import org.develnext.jphp.scripting.JPHPScriptEngine;
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

    private Vertx vertx;
    private final Method futureCreator;
    private final Method vertxCreator;
    private final Field field;

    public JPHPVerticleFactory() throws Exception {
        field = JPHPScriptEngine.class.getDeclaredField("environment");
        field.setAccessible(true);
        Class<?> futureClass = Class.forName("io.vertx.jphp.core.Future");
        futureCreator = futureClass.getDeclaredMethod("__create", Environment.class, Future.class, TypeConverter.class);
        Class<?> vertxClass = Class.forName("io.vertx.jphp.core.Vertx");
        vertxCreator = vertxClass.getDeclaredMethod("__create", Environment.class, Vertx.class);
    }

    @Override
    public void init(Vertx vertx) {
        this.vertx = vertx;

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
        ScriptEngine engine = initScriptEngine();
        return new JPHPVerticle(VerticleFactory.removePrefix(verticleName), engine);
    }

    private ScriptEngine initScriptEngine() {
        return new JPHPScriptEngine();
    }

    public class JPHPVerticle extends AbstractVerticle {
        private final String verticleName;
        private final ScriptEngine engine;
        private final Environment env;
        private Memory jvertx;

        private JPHPVerticle(String verticleName, ScriptEngine engine) throws Exception {
            this.verticleName = verticleName;
            this.engine = engine;
            env = (Environment) field.get(engine);
        }

        @Override
        public void init(Vertx vertx, Context context) {
            super.init(vertx, context);
            IMemory m;
            try {
                m = (IMemory) vertxCreator.invoke(null, env, vertx);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            jvertx = m.toMemory();
            engine.put("vertx", jvertx);
        }

        @Override
        public void start(Future<Void> startFuture) throws ScriptException {
            engine.eval("<?php require '" + verticleName + "';");
            invoke(VERTX_START_FUNCTION, VERTX_START_ASYNC_FUNCTION, startFuture);
        }

        @Override
        public void stop(Future<Void> stopFuture) {
            invoke(VERTX_STOP_FUNCTION, VERTX_STOP_ASYNC_FUNCTION, stopFuture);
        }

        private void invoke(String syncFunctionName, String asyncFunctionName, Future<Void> future) {
            try {
                FunctionEntity function = env.fetchFunction(syncFunctionName);
                if (function != null) {
                    function.invoke(env, null, null);
                    future.complete();
                } else {
                    function = env.fetchFunction(asyncFunctionName);
                    if (function != null) {
                        IMemory result = (IMemory) futureCreator.invoke(null, env, future, TypeConverter.VOID);
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
