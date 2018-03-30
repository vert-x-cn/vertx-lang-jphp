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
@Name("EventListOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class EventListOptions extends DataObjectWrapper<io.vertx.ext.consul.EventListOptions> { 
    public EventListOptions(Environment env, io.vertx.ext.consul.EventListOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public EventListOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.EventListOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.EventListOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public BlockingQueryOptions getBlockingOptions(){ 
        return new BlockingQueryOptions(__env__, this.getWrappedObject().getBlockingOptions());
    }

    @Signature
    public EventListOptions setBlockingOptions(BlockingQueryOptions blockingOptions){ 
        this.getWrappedObject().setBlockingOptions(blockingOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public EventListOptions setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }
}
