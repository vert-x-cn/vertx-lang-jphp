package io.vertx.php.ext.auth.oauth2.providers.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.providers.CloudFoundryAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CloudFoundryAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers\\impl")
public class CloudFoundryAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth> implements CloudFoundryAuth<io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth>{
    
    public CloudFoundryAuthImpl(Environment env, io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth.create(vertx, clientId, clientSecret, uuaURL)
    }

}
