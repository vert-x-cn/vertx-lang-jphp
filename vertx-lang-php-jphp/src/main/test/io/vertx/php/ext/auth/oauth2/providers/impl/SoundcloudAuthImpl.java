package io.vertx.php.ext.auth.oauth2.providers.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.providers.SoundcloudAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SoundcloudAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers\\impl")
public class SoundcloudAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.providers.SoundcloudAuth> implements SoundcloudAuth<io.vertx.ext.auth.oauth2.providers.SoundcloudAuth>{
    
    public SoundcloudAuthImpl(Environment env, io.vertx.ext.auth.oauth2.providers.SoundcloudAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.providers.SoundcloudAuth.create(vertx, clientId, clientSecret)
    }

}
