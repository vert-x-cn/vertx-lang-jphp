package io.vertx.php.ext.auth.oauth2.providers.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.providers.BoxAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("BoxAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers\\impl")
public class BoxAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.providers.BoxAuth> implements BoxAuth<io.vertx.ext.auth.oauth2.providers.BoxAuth>{
    
    public BoxAuthImpl(Environment env, io.vertx.ext.auth.oauth2.providers.BoxAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.providers.BoxAuth.create(vertx, clientId, clientSecret)
    }

}
