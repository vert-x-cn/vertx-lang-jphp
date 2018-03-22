package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.auth.AuthProvider;
@Name("FormLoginHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface FormLoginHandler<S extends io.vertx.ext.web.handler.FormLoginHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FormLoginHandlerImpl::new, io.vertx.ext.web.handler.FormLoginHandler.create(authProvider)
    }

    @Signature
    default Memory setUsernameParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setUsernameParam(usernameParam)
    }

    @Signature
    default Memory setPasswordParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setPasswordParam(passwordParam)
    }

    @Signature
    default Memory setReturnURLParam(Environment __env__, Memory... args) {
        this.getWrappedObject().setReturnURLParam(returnURLParam)
    }

    @Signature
    default Memory setDirectLoggedInOKURL(Environment __env__, Memory... args) {
        this.getWrappedObject().setDirectLoggedInOKURL(directLoggedInOKURL)
    }

}
