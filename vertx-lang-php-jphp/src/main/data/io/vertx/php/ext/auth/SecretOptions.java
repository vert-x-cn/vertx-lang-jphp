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
@Name("SecretOptions")
@Namespace("io\\vertx\\php\\ext\\auth")
//false
public  class SecretOptions extends DataObjectWrapper<io.vertx.ext.auth.SecretOptions> { 
    public SecretOptions(Environment env, io.vertx.ext.auth.SecretOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public SecretOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.SecretOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.SecretOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getSecret(){ 
        return this.getWrappedObject().getSecret();
    }

    @Signature
    public SecretOptions setSecret(String secret){ 
        this.getWrappedObject().setSecret(secret);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public SecretOptions setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
