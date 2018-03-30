package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MaintenanceOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class MaintenanceOptions extends DataObjectWrapper<io.vertx.ext.consul.MaintenanceOptions> { 
    public MaintenanceOptions(Environment env, io.vertx.ext.consul.MaintenanceOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public MaintenanceOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.MaintenanceOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.MaintenanceOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isEnable(){ 
        return this.getWrappedObject().isEnable();
    }

    @Signature
    public MaintenanceOptions setEnable(boolean enable){ 
        this.getWrappedObject().setEnable(enable);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public MaintenanceOptions setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public String getReason(){ 
        return this.getWrappedObject().getReason();
    }

    @Signature
    public MaintenanceOptions setReason(String reason){ 
        this.getWrappedObject().setReason(reason);
        return this;
    }
}
