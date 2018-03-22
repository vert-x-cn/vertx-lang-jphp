package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("ResponseContentTypeHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface ResponseContentTypeHandler<S extends io.vertx.ext.web.handler.ResponseContentTypeHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ResponseContentTypeHandlerImpl::new, io.vertx.ext.web.handler.ResponseContentTypeHandler.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ResponseContentTypeHandlerImpl::new, io.vertx.ext.web.handler.ResponseContentTypeHandler.create()
    }

}
