package io.vertx.test;


import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.JdkLoggerFactory;
import io.vertx.core.logging.JULLogDelegateFactory;
import io.vertx.lang.jphp.ClasspathFileResolver;
import org.develnext.jphp.scripting.JPHPScriptEngine;
import php.runtime.env.Environment;
import php.runtime.reflection.FunctionEntity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) throws Throwable {
    System.setProperty("vertx.logger-delegate-factory-class-name", JULLogDelegateFactory.class.getName());
    InternalLoggerFactory.setDefaultFactory(JdkLoggerFactory.INSTANCE);
    ClasspathFileResolver.init();
    ScriptEngineManager sm = new ScriptEngineManager();
    ScriptEngine engine = sm.getEngineByName("php");
    Field f = engine.getClass().getDeclaredField("environment");
    f.setAccessible(true);
    Environment e = (Environment) f.get(engine);
    System.out.println(e);
    ScriptEngineFactory factory = engine.getFactory();
    engine.eval("<?php require 'index.php';test();");
    FunctionEntity m = e.fetchFunction("test");
    System.out.println("=================");
    System.out.println(m);
    System.out.println("=================");
//        m.invoke(e, null, null);

    ScriptEngine newEngine = new JPHPScriptEngine();
    newEngine.eval("<?php require 'index2.php';test2();");
  }
}
