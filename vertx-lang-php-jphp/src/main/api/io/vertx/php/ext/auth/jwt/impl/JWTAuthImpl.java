package io.vertx.php.ext.auth.jwt.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.jwt.JWTAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JWTAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\jwt\\impl")
public class JWTAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.jwt.JWTAuth> implements JWTAuth<io.vertx.ext.auth.jwt.JWTAuth>{
    
    public JWTAuthImpl(Environment env, io.vertx.ext.auth.jwt.JWTAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JWTAuthImpl::new, io.vertx.ext.auth.jwt.JWTAuth.create(vertx, config)
    }

    @Signature
    public Memory generateToken(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().generateToken(claims)
    }

}
