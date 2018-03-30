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
@Name("Event")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class Event extends DataObjectWrapper<io.vertx.ext.consul.Event> { 
    public Event(Environment env, io.vertx.ext.consul.Event wrappedObject) {
        super(env, wrappedObject);
    }

    public Event(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.Event();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.Event(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public Event setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public int getLTime(){ 
        return this.getWrappedObject().getLTime();
    }

    @Signature
    public Event setLTime(int lTime){ 
        this.getWrappedObject().setLTime(lTime);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public Event setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public String getNode(){ 
        return this.getWrappedObject().getNode();
    }

    @Signature
    public Event setNode(String node){ 
        this.getWrappedObject().setNode(node);
        return this;
    }

    @Signature
    public String getPayload(){ 
        return this.getWrappedObject().getPayload();
    }

    @Signature
    public Event setPayload(String payload){ 
        this.getWrappedObject().setPayload(payload);
        return this;
    }

    @Signature
    public String getService(){ 
        return this.getWrappedObject().getService();
    }

    @Signature
    public Event setService(String service){ 
        this.getWrappedObject().setService(service);
        return this;
    }

    @Signature
    public String getTag(){ 
        return this.getWrappedObject().getTag();
    }

    @Signature
    public Event setTag(String tag){ 
        this.getWrappedObject().setTag(tag);
        return this;
    }

    @Signature
    public int getVersion(){ 
        return this.getWrappedObject().getVersion();
    }

    @Signature
    public Event setVersion(int version){ 
        this.getWrappedObject().setVersion(version);
        return this;
    }
}
