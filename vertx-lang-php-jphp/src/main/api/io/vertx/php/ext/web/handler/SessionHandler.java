package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.sstore.SessionStore;
import io.vertx.php.ext.web.RoutingContext;
@Name("SessionHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface SessionHandler<S extends io.vertx.ext.web.handler.SessionHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionHandlerImpl::new, io.vertx.ext.web.handler.SessionHandler.create(sessionStore)
    }

    @Signature
    default Memory setSessionTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setSessionTimeout(timeout)
    }

    @Signature
    default Memory setNagHttps(Environment __env__, Memory... args) {
        this.getWrappedObject().setNagHttps(nag)
    }

    @Signature
    default Memory setCookieSecureFlag(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookieSecureFlag(secure)
    }

    @Signature
    default Memory setCookieHttpOnlyFlag(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookieHttpOnlyFlag(httpOnly)
    }

    @Signature
    default Memory setSessionCookieName(Environment __env__, Memory... args) {
        this.getWrappedObject().setSessionCookieName(sessionCookieName)
    }

    @Signature
    default Memory setMinLength(Environment __env__, Memory... args) {
        this.getWrappedObject().setMinLength(minLength)
    }

}
