package io.vertx.lang.php;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import io.vertx.core.spi.VerticleFactory;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class PhpVerticleFactory implements VerticleFactory{
    static {
        ClasspathFileResolver.init();
    }

    private Vertx vertx;
    private ScriptEngine engine;
    private ScriptObjectMirror futureJSClass;

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
    public Verticle createVerticle(String verticleName, ClassLoader classLoader) {
        init();
        return new PhpVerticle(VerticleFactory.removePrefix(verticleName));
    }

    public class PhpVerticle extends AbstractVerticle {

        private static final String VERTX_START_FUNCTION = "vertxStart";
        private static final String VERTX_START_ASYNC_FUNCTION = "vertxStartAsync";
        private static final String VERTX_STOP_FUNCTION = "vertxStop";
        private static final String VERTX_STOP_ASYNC_FUNCTION = "vertxStopAsync";

        private final String verticleName;

        private PhpVerticle(String verticleName) {
            this.verticleName = verticleName;
        }

        private ScriptObjectMirror exports;

        private boolean functionExists(String functionName) {
            Object som = exports.getMember(functionName);
            return som != null && !som.toString().equals("undefined");
        }

        @Override
        public void start(Future<Void> startFuture) throws Exception {
            exports = (ScriptObjectMirror) engine.eval("require.noCache('" + verticleName + "', null, true);");
            start(startFuture, VERTX_START_FUNCTION, VERTX_START_ASYNC_FUNCTION);
        }

        private void start(Future<Void> startFuture, String vertxStartFunction, String vertxStartAsyncFunction) {
            if (functionExists(vertxStartFunction)) {
                exports.callMember(vertxStartFunction);
                startFuture.complete();
            } else if (functionExists(vertxStartAsyncFunction)) {
                Object wrappedFuture = futureJSClass.newObject(startFuture);
                exports.callMember(vertxStartAsyncFunction, wrappedFuture);
            } else {
                startFuture.complete();
            }
        }

        @Override
        public void stop(Future<Void> stopFuture) {
            start(stopFuture, VERTX_STOP_FUNCTION, VERTX_STOP_ASYNC_FUNCTION);
        }
    }

    private synchronized void init() {
        if (engine == null) {
            ScriptEngineManager mgr = new ScriptEngineManager();
            engine = mgr.getEngineByName("nashorn");
            if (engine == null) {
                throw new IllegalStateException("Cannot find Nashorn JavaScript engine - maybe you are not running with Java 8 or later?");
            }

            try {
                futureJSClass = (ScriptObjectMirror) engine.eval("require('vertx-js/future');");
                // Put the globals in
                engine.put("__jvertx", vertx);
                String globs =
                        "var Vertx = require('vertx-js/vertx'); var vertx = new Vertx(__jvertx);" +
                                "var console = require('vertx-js/util/console');" +
                                "var setTimeout = function(callback,delay) { return vertx.setTimer(delay, callback).doubleValue(); };" +
                                "var clearTimeout = function(id) { vertx.cancelTimer(id); };" +
                                "var setInterval = function(callback, delay) { return vertx.setPeriodic(delay, callback).doubleValue(); };" +
                                "var clearInterval = clearTimeout;" +
                                "var parent = this;" +
                                "var global = this;";
                engine.eval(globs);
            } catch (ScriptException e) {
                throw new IllegalStateException("Failed to eval: " + e.getMessage(), e);
            }
        }
    }


}
