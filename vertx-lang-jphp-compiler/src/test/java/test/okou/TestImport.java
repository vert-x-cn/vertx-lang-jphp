package test.okou;

import io.vertx.lang.php.ClasspathFileResolver;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestImport {
    public static void main(String[] args) throws ScriptException {
        ClasspathFileResolver.init();
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("jphp");
        engine.eval("<?php require 'index.php';?>");
    }
}
