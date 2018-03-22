package io.vertx.model;

import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.metrics.Measured;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

/**
 * Represents the result of an action that may, or may not, have occurred yet.
 * <p>
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface TestApi extends Measured, WriteStream<Object>{
    void test(Future future);
//    void test(String aaa);
    void test(HttpVersion version);

//    @Override
//    TestApi exceptionHandler(Handler handler);
}