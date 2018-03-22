package io.vertx.php.ext.auth.htdigest.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.htdigest.HtdigestAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HtdigestAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\htdigest\\impl")
public class HtdigestAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.htdigest.HtdigestAuth> implements HtdigestAuth<io.vertx.ext.auth.htdigest.HtdigestAuth>{
    
    public HtdigestAuthImpl(Environment env, io.vertx.ext.auth.htdigest.HtdigestAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HtdigestAuthImpl::new, io.vertx.ext.auth.htdigest.HtdigestAuth.create(vertx)
    }

}
