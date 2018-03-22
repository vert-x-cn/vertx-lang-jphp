package io.vertx.php.ext.shell.term.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.term.SignalHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SignalHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\term\\impl")
public class SignalHandlerImpl extends VertxGenWrapper<io.vertx.ext.shell.term.SignalHandler> implements SignalHandler<io.vertx.ext.shell.term.SignalHandler>{
    
    public SignalHandlerImpl(Environment env, io.vertx.ext.shell.term.SignalHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory deliver(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().deliver(key)
    }

}
