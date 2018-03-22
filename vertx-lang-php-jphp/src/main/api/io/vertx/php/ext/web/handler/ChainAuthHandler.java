package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.handler.AuthHandler;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.web.RoutingContext;
@Name("ChainAuthHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface ChainAuthHandler<S extends io.vertx.ext.web.handler.ChainAuthHandler> extends IWrapper<S>{

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
        return Utils.convReturnVertxGen(__env__, ChainAuthHandlerImpl::new, io.vertx.ext.web.handler.ChainAuthHandler.create()
    }

    @Signature
    default Memory append(Environment __env__, Memory... args) {
        this.getWrappedObject().append(authHandler)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(authHandler)
    }
    
    @Signature
    default void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear()
    }

}
