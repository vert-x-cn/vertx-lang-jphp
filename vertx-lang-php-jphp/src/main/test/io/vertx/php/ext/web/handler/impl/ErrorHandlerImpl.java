package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.ErrorHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ErrorHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class ErrorHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.ErrorHandler> implements ErrorHandler<io.vertx.ext.web.handler.ErrorHandler>{
    
    public ErrorHandlerImpl(Environment env, io.vertx.ext.web.handler.ErrorHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ErrorHandlerImpl::new, io.vertx.ext.web.handler.ErrorHandler.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ErrorHandlerImpl::new, io.vertx.ext.web.handler.ErrorHandler.create()
    }

}
