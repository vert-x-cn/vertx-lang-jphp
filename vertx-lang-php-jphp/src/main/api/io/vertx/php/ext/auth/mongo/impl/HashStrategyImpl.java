package io.vertx.php.ext.auth.mongo.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.mongo.HashStrategy;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HashStrategyImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo\\impl")
public class HashStrategyImpl extends VertxGenWrapper<io.vertx.ext.auth.mongo.HashStrategy> implements HashStrategy<io.vertx.ext.auth.mongo.HashStrategy>{
    
    public HashStrategyImpl(Environment env, io.vertx.ext.auth.mongo.HashStrategy wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory computeHash(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().computeHash(password, user)
    }

    @Signature
    public Memory getStoredPwd(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getStoredPwd(user)
    }

    @Signature
    public Memory getSalt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSalt(user)
    }

    @Signature
    public void setExternalSalt(Environment __env__, Memory... args) {
        this.getWrappedObject().setExternalSalt(salt)
    }

    @Signature
    public void setSaltStyle(Environment __env__, Memory... args) {
        this.getWrappedObject().setSaltStyle(saltStyle)
    }

    @Signature
    public void setAlgorithm(Environment __env__, Memory... args) {
        this.getWrappedObject().setAlgorithm(algorithm)
    }

}
