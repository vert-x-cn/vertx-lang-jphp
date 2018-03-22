package io.vertx.php.ext.shell.term.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.term.SockJSTermHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SockJSTermHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\term\\impl")
public class SockJSTermHandlerImpl extends VertxGenWrapper<io.vertx.ext.shell.term.SockJSTermHandler> implements SockJSTermHandler<io.vertx.ext.shell.term.SockJSTermHandler>{
    
    public SockJSTermHandlerImpl(Environment env, io.vertx.ext.shell.term.SockJSTermHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SockJSTermHandlerImpl::new, io.vertx.ext.shell.term.SockJSTermHandler.create(vertx, charset)
    }

    @Signature
    public Memory termHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().termHandler(handler)
    }

}
