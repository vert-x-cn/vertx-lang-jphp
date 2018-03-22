package io.vertx.php.ext.auth.shiro.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.shiro.ShiroAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ShiroAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\shiro\\impl")
public class ShiroAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.shiro.ShiroAuth> implements ShiroAuth<io.vertx.ext.auth.shiro.ShiroAuth>{
    
    public ShiroAuthImpl(Environment env, io.vertx.ext.auth.shiro.ShiroAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShiroAuthImpl::new, io.vertx.ext.auth.shiro.ShiroAuth.create(vertx, options)
    }

    @Signature
    public Memory setRolePrefix(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShiroAuthImpl::new, this.getWrappedObject().setRolePrefix(rolePrefix)
    }

}
