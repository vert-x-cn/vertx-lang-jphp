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
@Name("BlockingQueryOptions")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class BlockingQueryOptions extends DataObjectWrapper<io.vertx.ext.consul.BlockingQueryOptions> { 
    public BlockingQueryOptions(Environment env, io.vertx.ext.consul.BlockingQueryOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public BlockingQueryOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.BlockingQueryOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.BlockingQueryOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public BlockingQueryOptions setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public String getWait(){ 
        return this.getWrappedObject().getWait();
    }

    @Signature
    public BlockingQueryOptions setWait(String wait){ 
        this.getWrappedObject().setWait(wait);
        return this;
    }
}
