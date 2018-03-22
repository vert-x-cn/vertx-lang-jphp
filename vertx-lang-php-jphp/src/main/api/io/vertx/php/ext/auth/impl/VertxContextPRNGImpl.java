package io.vertx.php.ext.auth.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.VertxContextPRNG;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("VertxContextPRNGImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\impl")
public class VertxContextPRNGImpl extends VertxGenWrapper<io.vertx.ext.auth.VertxContextPRNG> implements VertxContextPRNG<io.vertx.ext.auth.VertxContextPRNG>{
    
    public VertxContextPRNGImpl(Environment env, io.vertx.ext.auth.VertxContextPRNG wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory current(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxContextPRNGImpl::new, io.vertx.ext.auth.VertxContextPRNG.current()
    }

    @Signature
    public static Memory current(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxContextPRNGImpl::new, io.vertx.ext.auth.VertxContextPRNG.current()
    }

    @Signature
    public Memory nextString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nextString(length)
    }

    @Signature
    public Memory nextInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nextInt()
    }

}
