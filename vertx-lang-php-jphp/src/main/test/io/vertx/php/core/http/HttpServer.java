package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.php.core.http.ServerWebSocket;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.http.HttpConnection;
@Name("HttpServer")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpServer<S extends io.vertx.core.http.HttpServer> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }
    
    @Signature
    default Memory requestStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().requestStream()
    }

    @Signature
    default Memory requestHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().requestHandler(handler)
    }

    @Signature
    default Memory connectionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectionHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }
    
    @Signature
    default Memory websocketStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().websocketStream()
    }

    @Signature
    default Memory websocketHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().websocketHandler(handler)
    }
    
    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory actualPort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().actualPort()
    }

}
