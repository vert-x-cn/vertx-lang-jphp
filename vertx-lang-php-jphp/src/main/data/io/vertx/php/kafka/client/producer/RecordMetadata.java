package io.vertx.php.kafka.client.producer;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("RecordMetadata")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
//false
public  class RecordMetadata extends DataObjectWrapper<io.vertx.kafka.client.producer.RecordMetadata> { 
    public RecordMetadata(Environment env, io.vertx.kafka.client.producer.RecordMetadata wrappedObject) {
        super(env, wrappedObject);
    }

    public RecordMetadata(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.kafka.client.producer.RecordMetadata();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.kafka.client.producer.RecordMetadata(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public RecordMetadata setChecksum(long checksum){ 
        this.getWrappedObject().setChecksum(checksum);
        return this;
    }

    @Signature
    public long getOffset(){ 
        return this.getWrappedObject().getOffset();
    }

    @Signature
    public RecordMetadata setOffset(long offset){ 
        this.getWrappedObject().setOffset(offset);
        return this;
    }

    @Signature
    public int getPartition(){ 
        return this.getWrappedObject().getPartition();
    }

    @Signature
    public RecordMetadata setPartition(int partition){ 
        this.getWrappedObject().setPartition(partition);
        return this;
    }

    @Signature
    public long getTimestamp(){ 
        return this.getWrappedObject().getTimestamp();
    }

    @Signature
    public RecordMetadata setTimestamp(long timestamp){ 
        this.getWrappedObject().setTimestamp(timestamp);
        return this;
    }

    @Signature
    public String getTopic(){ 
        return this.getWrappedObject().getTopic();
    }

    @Signature
    public RecordMetadata setTopic(String topic){ 
        this.getWrappedObject().setTopic(topic);
        return this;
    }
}
