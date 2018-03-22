package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.Route;
import io.vertx.php.ext.web.handler.AuthHandler;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;
@Name("OAuth2AuthHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface OAuth2AuthHandler<S extends io.vertx.ext.web.handler.OAuth2AuthHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    default Memory addAuthority(Environment __env__, Memory... args) {
        this.getWrappedObject().addAuthority(authority)
    }

    @Signature
    default Memory addAuthorities(Environment __env__, Memory... args) {
        this.getWrappedObject().addAuthorities(authorities)
    }

    @Signature
    default void parseCredentials(Environment __env__, Memory... args) {
        this.getWrappedObject().parseCredentials(context, handler)
    }

    @Signature
    default void authorize(Environment __env__, Memory... args) {
        this.getWrappedObject().authorize(user, handler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthHandlerImpl::new, io.vertx.ext.web.handler.OAuth2AuthHandler.create(authProvider)
    }

    @Signature
    default Memory extraParams(Environment __env__, Memory... args) {
        this.getWrappedObject().extraParams(extraParams)
    }

    @Signature
    default Memory setupCallback(Environment __env__, Memory... args) {
        this.getWrappedObject().setupCallback(route)
    }

}
