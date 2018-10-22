package io.vertx.test;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.JdkLoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.core.logging.JULLogDelegateFactory;
import io.vertx.lang.jphp.ClasspathFileResolver;

import java.util.concurrent.TimeUnit;

public class TestVertx {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("vertx.logger-delegate-factory-class-name", JULLogDelegateFactory.class.getName());
    InternalLoggerFactory.setDefaultFactory(JdkLoggerFactory.INSTANCE);
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle("php:test/testDataObjectArraySupport.php");


//        TimeUnit.SECONDS.sleep(3);
//        vertx.close();
  }
}
