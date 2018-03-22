package io.vertx.php.ext.auth.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AuthProviderImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\impl")
public class AuthProviderImpl extends VertxGenWrapper<io.vertx.ext.auth.AuthProvider> implements AuthProvider<io.vertx.ext.auth.AuthProvider>{
    
    public AuthProviderImpl(Environment env, io.vertx.ext.auth.AuthProvider wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

}
