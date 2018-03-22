package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.auth.AuthProvider;
@Name("UserSessionHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface UserSessionHandler<S extends io.vertx.ext.web.handler.UserSessionHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, UserSessionHandlerImpl::new, io.vertx.ext.web.handler.UserSessionHandler.create(authProvider)
    }

}
