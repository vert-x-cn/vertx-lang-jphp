package io.vertx.php.ext.auth.jwt;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.ext.auth.KeyStoreOptions;
import io.vertx.php.ext.auth.PubSecKeyOptions;
import io.vertx.php.ext.auth.SecretOptions;
import io.vertx.php.ext.jwt.JWTOptions;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("JWTAuthOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\jwt")
//false
public  class JWTAuthOptions extends DataObjectWrapper<io.vertx.ext.auth.jwt.JWTAuthOptions> { 
    public JWTAuthOptions(Environment env, io.vertx.ext.auth.jwt.JWTAuthOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JWTAuthOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.jwt.JWTAuthOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.jwt.JWTAuthOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public JWTOptions getJWTOptions(){ 
        return new JWTOptions(__env__, this.getWrappedObject().getJWTOptions());
    }

    @Signature
    public JWTAuthOptions setJWTOptions(JWTOptions jwtOptions){ 
        this.getWrappedObject().setJWTOptions(jwtOptions.getWrappedObject());
        return this;
    }

    @Signature
    public KeyStoreOptions getKeyStore(){ 
        return new KeyStoreOptions(__env__, this.getWrappedObject().getKeyStore());
    }

    @Signature
    public JWTAuthOptions setKeyStore(KeyStoreOptions keyStore){ 
        this.getWrappedObject().setKeyStore(keyStore.getWrappedObject());
        return this;
    }

    @Signature
    public String getPermissionsClaimKey(){ 
        return this.getWrappedObject().getPermissionsClaimKey();
    }

    @Signature
    public JWTAuthOptions setPermissionsClaimKey(String permissionsClaimKey){ 
        this.getWrappedObject().setPermissionsClaimKey(permissionsClaimKey);
        return this;
    }

    @Signature
    public JWTAuthOptions addPubSecKey(io.vertx.ext.auth.PubSecKeyOptions pubSecKeys){ 
        this.getWrappedObject().addPubSecKey(pubSecKeys);
        return this;
    }

    @Signature
    public List<PubSecKeyOptions> getPubSecKeys(){ 
        return this.getWrappedObject().getPubSecKeys().stream().map(v -> new PubSecKeyOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public JWTAuthOptions setPubSecKeys(List<PubSecKeyOptions> pubSecKeys){ 
        this.getWrappedObject().setPubSecKeys((pubSecKeys.stream().map(PubSecKeyOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public JWTAuthOptions addSecret(io.vertx.ext.auth.SecretOptions secrets){ 
        this.getWrappedObject().addSecret(secrets);
        return this;
    }

    @Signature
    public List<SecretOptions> getSecrets(){ 
        return this.getWrappedObject().getSecrets().stream().map(v -> new SecretOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public JWTAuthOptions setSecrets(List<SecretOptions> secrets){ 
        this.getWrappedObject().setSecrets((secrets.stream().map(SecretOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
