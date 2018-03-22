package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.http.HttpClientRequest;
import io.vertx.php.core.http.HttpClientResponse;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.http.WebSocket;
import io.vertx.php.core.Future;
@Name("HttpClient")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpClient<S extends io.vertx.core.http.HttpClient> extends IWrapper<S>{
    
    @Signature
    default Memory isMetricsEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMetricsEnabled()
    }

    @Signature
    default Memory request(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().request(method, options)
    }

    @Signature
    default Memory requestAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().requestAbs(method, absoluteURI)
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().get(options)
    }

    @Signature
    default Memory getAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().getAbs(absoluteURI)
    }

    @Signature
    default Memory getNow(Environment __env__, Memory... args) {
        this.getWrappedObject().getNow(options, responseHandler)
    }

    @Signature
    default Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().post(options)
    }

    @Signature
    default Memory postAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().postAbs(absoluteURI)
    }

    @Signature
    default Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().head(options)
    }

    @Signature
    default Memory headAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().headAbs(absoluteURI)
    }

    @Signature
    default Memory headNow(Environment __env__, Memory... args) {
        this.getWrappedObject().headNow(options, responseHandler)
    }

    @Signature
    default Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().options(options)
    }

    @Signature
    default Memory optionsAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().optionsAbs(absoluteURI)
    }

    @Signature
    default Memory optionsNow(Environment __env__, Memory... args) {
        this.getWrappedObject().optionsNow(options, responseHandler)
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().put(options)
    }

    @Signature
    default Memory putAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().putAbs(absoluteURI)
    }

    @Signature
    default Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().delete(options)
    }

    @Signature
    default Memory deleteAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().deleteAbs(absoluteURI)
    }

    @Signature
    default Memory websocket(Environment __env__, Memory... args) {
        this.getWrappedObject().websocket(options, wsConnect)
    }

    @Signature
    default Memory websocketAbs(Environment __env__, Memory... args) {
        this.getWrappedObject().websocketAbs(url, headers, version, subProtocols, wsConnect, failureHandler)
    }

    @Signature
    default Memory websocketStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().websocketStream(options)
    }

    @Signature
    default Memory websocketStreamAbs(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().websocketStreamAbs(url, headers, version, subProtocols)
    }

    @Signature
    default Memory redirectHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().redirectHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
