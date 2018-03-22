package io.vertx.php.ext.web.client;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.client.HttpResponse;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.codec.BodyCodec;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
@Name("HttpRequest")
@Namespace("io\\vertx\\php\\ext\\web\\client")
public interface HttpRequest<S extends io.vertx.ext.web.client.HttpRequest<T>, T> extends IWrapper<S>{

    @Signature
    default Memory method(Environment __env__, Memory... args) {
        this.getWrappedObject().method(value)
    }

    @Signature
    default Memory port(Environment __env__, Memory... args) {
        this.getWrappedObject().port(value)
    }

    @Signature
    default Memory as(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().as(responseCodec)
    }

    @Signature
    default Memory host(Environment __env__, Memory... args) {
        this.getWrappedObject().host(value)
    }

    @Signature
    default Memory virtualHost(Environment __env__, Memory... args) {
        this.getWrappedObject().virtualHost(value)
    }

    @Signature
    default Memory uri(Environment __env__, Memory... args) {
        this.getWrappedObject().uri(value)
    }

    @Signature
    default Memory putHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().putHeader(name, value)
    }
    
    @Signature
    default Memory headers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().headers()
    }

    @Signature
    default Memory ssl(Environment __env__, Memory... args) {
        this.getWrappedObject().ssl(value)
    }

    @Signature
    default Memory timeout(Environment __env__, Memory... args) {
        this.getWrappedObject().timeout(value)
    }

    @Signature
    default Memory addQueryParam(Environment __env__, Memory... args) {
        this.getWrappedObject().addQueryParam(paramName, paramValue)
    }

    @Signature
    default Memory setQueryParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setQueryParam(paramName, paramValue)
    }

    @Signature
    default Memory followRedirects(Environment __env__, Memory... args) {
        this.getWrappedObject().followRedirects(value)
    }
    
    @Signature
    default Memory queryParams(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().queryParams()
    }
    
    @Signature
    default Memory copy(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpRequestImpl::new, this.getWrappedObject().copy()
    }

    @Signature
    default void sendStream(Environment __env__, Memory... args) {
        this.getWrappedObject().sendStream(body, handler)
    }

    @Signature
    default void sendBuffer(Environment __env__, Memory... args) {
        this.getWrappedObject().sendBuffer(body, handler)
    }

    @Signature
    default void sendJsonObject(Environment __env__, Memory... args) {
        this.getWrappedObject().sendJsonObject(body, handler)
    }

    @Signature
    default void sendJson(Environment __env__, Memory... args) {
        this.getWrappedObject().sendJson(body, handler)
    }

    @Signature
    default void sendForm(Environment __env__, Memory... args) {
        this.getWrappedObject().sendForm(body, handler)
    }

    @Signature
    default void send(Environment __env__, Memory... args) {
        this.getWrappedObject().send(handler)
    }

}
