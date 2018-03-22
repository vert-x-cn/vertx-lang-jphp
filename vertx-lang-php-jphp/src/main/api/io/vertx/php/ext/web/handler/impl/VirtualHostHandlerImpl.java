package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.VirtualHostHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("VirtualHostHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class VirtualHostHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.VirtualHostHandler> implements VirtualHostHandler<io.vertx.ext.web.handler.VirtualHostHandler>{
    
    public VirtualHostHandlerImpl(Environment env, io.vertx.ext.web.handler.VirtualHostHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VirtualHostHandlerImpl::new, io.vertx.ext.web.handler.VirtualHostHandler.create(hostname, handler)
    }

}
