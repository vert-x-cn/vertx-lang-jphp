package io.vertx.php.kafka.client.consumer;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("OffsetAndMetadata")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
//false
public  class OffsetAndMetadata extends DataObjectWrapper<io.vertx.kafka.client.consumer.OffsetAndMetadata> { 
    public OffsetAndMetadata(Environment env, io.vertx.kafka.client.consumer.OffsetAndMetadata wrappedObject) {
        super(env, wrappedObject);
    }

    public OffsetAndMetadata(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.kafka.client.consumer.OffsetAndMetadata();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.kafka.client.consumer.OffsetAndMetadata(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getMetadata(){ 
        return this.getWrappedObject().getMetadata();
    }

    @Signature
    public OffsetAndMetadata setMetadata(String metadata){ 
        this.getWrappedObject().setMetadata(metadata);
        return this;
    }

    @Signature
    public long getOffset(){ 
        return this.getWrappedObject().getOffset();
    }

    @Signature
    public OffsetAndMetadata setOffset(long offset){ 
        this.getWrappedObject().setOffset(offset);
        return this;
    }
}
