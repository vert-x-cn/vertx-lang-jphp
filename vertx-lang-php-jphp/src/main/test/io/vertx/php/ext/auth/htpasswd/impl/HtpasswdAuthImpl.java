package io.vertx.php.ext.auth.htpasswd.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.htpasswd.HtpasswdAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HtpasswdAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\htpasswd\\impl")
public class HtpasswdAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.htpasswd.HtpasswdAuth> implements HtpasswdAuth<io.vertx.ext.auth.htpasswd.HtpasswdAuth>{
    
    public HtpasswdAuthImpl(Environment env, io.vertx.ext.auth.htpasswd.HtpasswdAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HtpasswdAuthImpl::new, io.vertx.ext.auth.htpasswd.HtpasswdAuth.create(vertx)
    }

}
