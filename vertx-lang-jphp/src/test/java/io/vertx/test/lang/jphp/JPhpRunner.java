package io.vertx.test.lang.jphp;

import io.vertx.lang.jphp.ClasspathFileResolver;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JPhpRunner {
  void run(String script, String testName) throws Exception{
    try {
      ClasspathFileResolver.init();
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByName("jphp");
      engine.eval("<?php require '" + script + "';");
      engine.eval("<?php " + testName + "();");
    } catch (ScriptException e) {
      throw new AssertionError(e.getCause());
    }
  }

  public static void main(String[] args) throws Exception{
    new JPhpRunner().run("test.php", "test");
  }
}
