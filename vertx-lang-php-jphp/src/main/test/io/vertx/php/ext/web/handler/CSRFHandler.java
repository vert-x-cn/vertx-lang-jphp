package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("CSRFHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface CSRFHandler<S extends io.vertx.ext.web.handler.CSRFHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CSRFHandlerImpl::new, io.vertx.ext.web.handler.CSRFHandler.create(secret)
    }

    @Signature
    default Memory setCookieName(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookieName(name)
    }

    @Signature
    default Memory setCookiePath(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookiePath(path)
    }

    @Signature
    default Memory setHeaderName(Environment __env__, Memory... args) {
        this.getWrappedObject().setHeaderName(name)
    }

    @Signature
    default Memory setNagHttps(Environment __env__, Memory... args) {
        this.getWrappedObject().setNagHttps(nag)
    }

    @Signature
    default Memory setResponseBody(Environment __env__, Memory... args) {
        this.getWrappedObject().setResponseBody(responseBody)
    }

    @Signature
    default Memory setTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setTimeout(timeout)
    }

}
