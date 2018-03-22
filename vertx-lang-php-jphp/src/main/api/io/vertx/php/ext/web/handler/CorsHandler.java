package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("CorsHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface CorsHandler<S extends io.vertx.ext.web.handler.CorsHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CorsHandlerImpl::new, io.vertx.ext.web.handler.CorsHandler.create(allowedOriginPattern)
    }

    @Signature
    default Memory allowedMethod(Environment __env__, Memory... args) {
        this.getWrappedObject().allowedMethod(method)
    }

    @Signature
    default Memory allowedHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().allowedHeader(headerName)
    }

    @Signature
    default Memory allowedHeaders(Environment __env__, Memory... args) {
        this.getWrappedObject().allowedHeaders(headerNames)
    }

    @Signature
    default Memory exposedHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().exposedHeader(headerName)
    }

    @Signature
    default Memory exposedHeaders(Environment __env__, Memory... args) {
        this.getWrappedObject().exposedHeaders(headerNames)
    }

    @Signature
    default Memory allowCredentials(Environment __env__, Memory... args) {
        this.getWrappedObject().allowCredentials(allow)
    }

    @Signature
    default Memory maxAgeSeconds(Environment __env__, Memory... args) {
        this.getWrappedObject().maxAgeSeconds(maxAgeSeconds)
    }

}
