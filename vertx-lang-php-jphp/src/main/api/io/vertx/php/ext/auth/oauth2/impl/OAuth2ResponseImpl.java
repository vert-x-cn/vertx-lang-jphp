package io.vertx.php.ext.auth.oauth2.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.OAuth2Response;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("OAuth2ResponseImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\impl")
public class OAuth2ResponseImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.OAuth2Response> implements OAuth2Response<io.vertx.ext.auth.oauth2.OAuth2Response>{
    
    public OAuth2ResponseImpl(Environment env, io.vertx.ext.auth.oauth2.OAuth2Response wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory getHeader(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHeader(name)
    }

    @Signature
    public Memory is(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().is(contentType)
    }

}
