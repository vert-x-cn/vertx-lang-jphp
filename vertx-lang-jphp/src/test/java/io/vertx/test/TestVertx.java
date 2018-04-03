package io.vertx.test;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.JdkLoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.core.logging.JULLogDelegateFactory;

public class TestVertx {
    public static void main(String[] args) {
        System.setProperty("vertx.logger-delegate-factory-class-name", JULLogDelegateFactory.class.getName());
        InternalLoggerFactory.setDefaultFactory(JdkLoggerFactory.INSTANCE);
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle("php:phpVerticle.php");
    }
}
