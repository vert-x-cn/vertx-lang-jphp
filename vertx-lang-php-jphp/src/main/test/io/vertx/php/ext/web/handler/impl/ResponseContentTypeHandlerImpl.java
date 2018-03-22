package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.ResponseContentTypeHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ResponseContentTypeHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class ResponseContentTypeHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.ResponseContentTypeHandler> implements ResponseContentTypeHandler<io.vertx.ext.web.handler.ResponseContentTypeHandler>{
    
    public ResponseContentTypeHandlerImpl(Environment env, io.vertx.ext.web.handler.ResponseContentTypeHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ResponseContentTypeHandlerImpl::new, io.vertx.ext.web.handler.ResponseContentTypeHandler.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ResponseContentTypeHandlerImpl::new, io.vertx.ext.web.handler.ResponseContentTypeHandler.create()
    }

}
