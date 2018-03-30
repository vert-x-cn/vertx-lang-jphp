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
@Name("ConfigStoreOptions")
@Namespace("io\\vertx\\php\\config")
//false
public  class ConfigStoreOptions extends DataObjectWrapper<io.vertx.config.ConfigStoreOptions> { 
    public ConfigStoreOptions(Environment env, io.vertx.config.ConfigStoreOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ConfigStoreOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.config.ConfigStoreOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.config.ConfigStoreOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public Memory getConfig(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getConfig().encode());
    }

    @Signature
    public ConfigStoreOptions setConfig(Memory config){ 
        this.getWrappedObject().setConfig(new JsonObject(JsonFunctions.json_encode(config)));
        return this;
    }

    @Signature
    public String getFormat(){ 
        return this.getWrappedObject().getFormat();
    }

    @Signature
    public ConfigStoreOptions setFormat(String format){ 
        this.getWrappedObject().setFormat(format);
        return this;
    }

    @Signature
    public boolean isOptional(){ 
        return this.getWrappedObject().isOptional();
    }

    @Signature
    public ConfigStoreOptions setOptional(boolean optional){ 
        this.getWrappedObject().setOptional(optional);
        return this;
    }

    @Signature
    public String getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public ConfigStoreOptions setType(String type){ 
        this.getWrappedObject().setType(type);
        return this;
    }
}
