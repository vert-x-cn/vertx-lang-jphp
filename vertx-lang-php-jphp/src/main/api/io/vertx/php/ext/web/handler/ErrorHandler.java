package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("ErrorHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface ErrorHandler<S extends io.vertx.ext.web.handler.ErrorHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ErrorHandlerImpl::new, io.vertx.ext.web.handler.ErrorHandler.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ErrorHandlerImpl::new, io.vertx.ext.web.handler.ErrorHandler.create()
    }

}
