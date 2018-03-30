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
@Name("KeyStoreOptions")
@Namespace("io\\vertx\\php\\ext\\auth")
//false
public  class KeyStoreOptions extends DataObjectWrapper<io.vertx.ext.auth.KeyStoreOptions> { 
    public KeyStoreOptions(Environment env, io.vertx.ext.auth.KeyStoreOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public KeyStoreOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.KeyStoreOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.KeyStoreOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public KeyStoreOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public String getPath(){ 
        return this.getWrappedObject().getPath();
    }

    @Signature
    public KeyStoreOptions setPath(String path){ 
        this.getWrappedObject().setPath(path);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public KeyStoreOptions setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
