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
@Name("EventOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class EventOptions extends DataObjectWrapper<io.vertx.ext.consul.EventOptions> { 
    public EventOptions(Environment env, io.vertx.ext.consul.EventOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public EventOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.EventOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.EventOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getNode(){ 
        return this.getWrappedObject().getNode();
    }

    @Signature
    public EventOptions setNode(String node){ 
        this.getWrappedObject().setNode(node);
        return this;
    }

    @Signature
    public String getPayload(){ 
        return this.getWrappedObject().getPayload();
    }

    @Signature
    public EventOptions setPayload(String payload){ 
        this.getWrappedObject().setPayload(payload);
        return this;
    }

    @Signature
    public String getService(){ 
        return this.getWrappedObject().getService();
    }

    @Signature
    public EventOptions setService(String service){ 
        this.getWrappedObject().setService(service);
        return this;
    }

    @Signature
    public String getTag(){ 
        return this.getWrappedObject().getTag();
    }

    @Signature
    public EventOptions setTag(String tag){ 
        this.getWrappedObject().setTag(tag);
        return this;
    }
}
