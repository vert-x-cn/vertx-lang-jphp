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
@Name("OffsetAndTimestamp")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
//false
public  class OffsetAndTimestamp extends DataObjectWrapper<io.vertx.kafka.client.consumer.OffsetAndTimestamp> { 
    public OffsetAndTimestamp(Environment env, io.vertx.kafka.client.consumer.OffsetAndTimestamp wrappedObject) {
        super(env, wrappedObject);
    }

    public OffsetAndTimestamp(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.kafka.client.consumer.OffsetAndTimestamp();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.kafka.client.consumer.OffsetAndTimestamp(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getOffset(){ 
        return this.getWrappedObject().getOffset();
    }

    @Signature
    public OffsetAndTimestamp setOffset(long offset){ 
        this.getWrappedObject().setOffset(offset);
        return this;
    }

    @Signature
    public long getTimestamp(){ 
        return this.getWrappedObject().getTimestamp();
    }

    @Signature
    public OffsetAndTimestamp setTimestamp(long timestamp){ 
        this.getWrappedObject().setTimestamp(timestamp);
        return this;
    }
}
