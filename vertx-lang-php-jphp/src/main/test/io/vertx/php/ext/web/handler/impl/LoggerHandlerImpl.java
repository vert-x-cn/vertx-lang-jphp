package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.LoggerHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("LoggerHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class LoggerHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.LoggerHandler> implements LoggerHandler<io.vertx.ext.web.handler.LoggerHandler>{
    
    public LoggerHandlerImpl(Environment env, io.vertx.ext.web.handler.LoggerHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LoggerHandlerImpl::new, io.vertx.ext.web.handler.LoggerHandler.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LoggerHandlerImpl::new, io.vertx.ext.web.handler.LoggerHandler.create()
    }

}
