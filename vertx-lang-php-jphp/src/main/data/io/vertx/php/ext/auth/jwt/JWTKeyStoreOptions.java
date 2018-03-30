package io.vertx.php.ext.auth.jwt;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("JWTKeyStoreOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\jwt")
//false
public  class JWTKeyStoreOptions extends DataObjectWrapper<io.vertx.ext.auth.jwt.JWTKeyStoreOptions> { 
    public JWTKeyStoreOptions(Environment env, io.vertx.ext.auth.jwt.JWTKeyStoreOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JWTKeyStoreOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.jwt.JWTKeyStoreOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.jwt.JWTKeyStoreOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public JWTKeyStoreOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public String getPath(){ 
        return this.getWrappedObject().getPath();
    }

    @Signature
    public JWTKeyStoreOptions setPath(String path){ 
        this.getWrappedObject().setPath(path);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public JWTKeyStoreOptions setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
