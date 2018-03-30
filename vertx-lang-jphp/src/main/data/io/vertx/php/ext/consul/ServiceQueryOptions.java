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
@Name("ServiceQueryOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class ServiceQueryOptions extends DataObjectWrapper<io.vertx.ext.consul.ServiceQueryOptions> { 
    public ServiceQueryOptions(Environment env, io.vertx.ext.consul.ServiceQueryOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public ServiceQueryOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.ServiceQueryOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.ServiceQueryOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public BlockingQueryOptions getBlockingOptions(){ 
        return new BlockingQueryOptions(__env__, this.getWrappedObject().getBlockingOptions());
    }

    @Signature
    public ServiceQueryOptions setBlockingOptions(BlockingQueryOptions blockingOptions){ 
        this.getWrappedObject().setBlockingOptions(blockingOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getNear(){ 
        return this.getWrappedObject().getNear();
    }

    @Signature
    public ServiceQueryOptions setNear(String near){ 
        this.getWrappedObject().setNear(near);
        return this;
    }

    @Signature
    public String getTag(){ 
        return this.getWrappedObject().getTag();
    }

    @Signature
    public ServiceQueryOptions setTag(String tag){ 
        this.getWrappedObject().setTag(tag);
        return this;
    }
}
