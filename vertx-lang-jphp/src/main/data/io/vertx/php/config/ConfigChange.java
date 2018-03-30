package io.vertx.php.config;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ConfigChange")
@Namespace("io\\vertx\\php\\config")
//false
public  class ConfigChange extends DataObjectWrapper<io.vertx.config.ConfigChange> { 
    public ConfigChange(Environment env, io.vertx.config.ConfigChange wrappedObject) {
        super(env, wrappedObject);
    }

    public ConfigChange(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.config.ConfigChange();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.config.ConfigChange(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Memory getNewConfiguration(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getNewConfiguration().encode());
    }

    @Signature
    public ConfigChange setNewConfiguration(Memory newConfiguration){ 
        this.getWrappedObject().setNewConfiguration(new JsonObject(JsonFunctions.json_encode(newConfiguration)));
        return this;
    }

    @Signature
    public Memory getPreviousConfiguration(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getPreviousConfiguration().encode());
    }

    @Signature
    public ConfigChange setPreviousConfiguration(Memory previousConfiguration){ 
        this.getWrappedObject().setPreviousConfiguration(new JsonObject(JsonFunctions.json_encode(previousConfiguration)));
        return this;
    }
}
