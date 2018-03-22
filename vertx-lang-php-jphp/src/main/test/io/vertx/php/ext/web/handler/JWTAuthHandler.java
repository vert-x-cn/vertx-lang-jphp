package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.handler.AuthHandler;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.auth.jwt.JWTAuth;
@Name("JWTAuthHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface JWTAuthHandler<S extends io.vertx.ext.web.handler.JWTAuthHandler> extends IWrapper<S>{

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
        return Utils.convReturnVertxGen(__env__, JWTAuthHandlerImpl::new, io.vertx.ext.web.handler.JWTAuthHandler.create(authProvider)
    }

    @Signature
    default Memory setAudience(Environment __env__, Memory... args) {
        this.getWrappedObject().setAudience(audience)
    }

    @Signature
    default Memory setIssuer(Environment __env__, Memory... args) {
        this.getWrappedObject().setIssuer(issuer)
    }

    @Signature
    default Memory setIgnoreExpiration(Environment __env__, Memory... args) {
        this.getWrappedObject().setIgnoreExpiration(ignoreExpiration)
    }

}
