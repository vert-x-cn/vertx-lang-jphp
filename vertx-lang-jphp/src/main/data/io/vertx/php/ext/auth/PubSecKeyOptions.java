package io.vertx.php.ext.auth;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("PubSecKeyOptions")
@Namespace("io\\vertx\\php\\ext\\auth")
//false
public  class PubSecKeyOptions extends DataObjectWrapper<io.vertx.ext.auth.PubSecKeyOptions> { 
    public PubSecKeyOptions(Environment env, io.vertx.ext.auth.PubSecKeyOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public PubSecKeyOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.PubSecKeyOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.PubSecKeyOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAlgorithm(){ 
        return this.getWrappedObject().getAlgorithm();
    }

    @Signature
    public PubSecKeyOptions setAlgorithm(String algorithm){ 
        this.getWrappedObject().setAlgorithm(algorithm);
        return this;
    }

    @Signature
    public boolean isCertificate(){ 
        return this.getWrappedObject().isCertificate();
    }

    @Signature
    public PubSecKeyOptions setCertificate(boolean certificate){ 
        this.getWrappedObject().setCertificate(certificate);
        return this;
    }

    @Signature
    public String getPublicKey(){ 
        return this.getWrappedObject().getPublicKey();
    }

    @Signature
    public PubSecKeyOptions setPublicKey(String publicKey){ 
        this.getWrappedObject().setPublicKey(publicKey);
        return this;
    }

    @Signature
    public String getSecretKey(){ 
        return this.getWrappedObject().getSecretKey();
    }

    @Signature
    public PubSecKeyOptions setSecretKey(String secretKey){ 
        this.getWrappedObject().setSecretKey(secretKey);
        return this;
    }

    @Signature
    public boolean isSymmetric(){ 
        return this.getWrappedObject().isSymmetric();
    }

    @Signature
    public PubSecKeyOptions setSymmetric(boolean symmetric){ 
        this.getWrappedObject().setSymmetric(symmetric);
        return this;
    }
}
