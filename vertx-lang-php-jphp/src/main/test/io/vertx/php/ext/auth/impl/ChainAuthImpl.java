package io.vertx.php.ext.auth.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.ChainAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ChainAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\impl")
public class ChainAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.ChainAuth> implements ChainAuth<io.vertx.ext.auth.ChainAuth>{
    
    public ChainAuthImpl(Environment env, io.vertx.ext.auth.ChainAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ChainAuthImpl::new, io.vertx.ext.auth.ChainAuth.create()
    }

    @Signature
    public Memory append(Environment __env__, Memory... args) {
        this.getWrappedObject().append(other)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(other)
    }

}
