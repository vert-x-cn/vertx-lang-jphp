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
@Name("NodeQueryOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class NodeQueryOptions extends DataObjectWrapper<io.vertx.ext.consul.NodeQueryOptions> { 
    public NodeQueryOptions(Environment env, io.vertx.ext.consul.NodeQueryOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public NodeQueryOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.NodeQueryOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.NodeQueryOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public BlockingQueryOptions getBlockingOptions(){ 
        return new BlockingQueryOptions(__env__, this.getWrappedObject().getBlockingOptions());
    }

    @Signature
    public NodeQueryOptions setBlockingOptions(BlockingQueryOptions blockingOptions){ 
        this.getWrappedObject().setBlockingOptions(blockingOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getNear(){ 
        return this.getWrappedObject().getNear();
    }

    @Signature
    public NodeQueryOptions setNear(String near){ 
        this.getWrappedObject().setNear(near);
        return this;
    }
}
