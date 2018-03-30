package io.vertx.test;


import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.JdkLoggerFactory;
import io.vertx.core.logging.JULLogDelegateFactory;
import io.vertx.lang.php.ClasspathFileResolver;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args) throws ScriptException {
        System.setProperty("vertx.logger-delegate-factory-class-name", JULLogDelegateFactory.class.getName());
        InternalLoggerFactory.setDefaultFactory(JdkLoggerFactory.INSTANCE);
        ClasspathFileResolver.init();
        ScriptEngineManager sm = new ScriptEngineManager();
        ScriptEngine engine = sm.getEngineByName("php");
        engine.eval("<?php require 'index.php';");
    }
}
