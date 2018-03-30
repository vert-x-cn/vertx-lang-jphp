package io.vertx.php.kafka.client.common;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("TopicPartition")
@Namespace("io\\vertx\\php\\kafka\\client\\common")
//false
public  class TopicPartition extends DataObjectWrapper<io.vertx.kafka.client.common.TopicPartition> { 
    public TopicPartition(Environment env, io.vertx.kafka.client.common.TopicPartition wrappedObject) {
        super(env, wrappedObject);
    }

    public TopicPartition(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.kafka.client.common.TopicPartition();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.kafka.client.common.TopicPartition(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getPartition(){ 
        return this.getWrappedObject().getPartition();
    }

    @Signature
    public TopicPartition setPartition(int partition){ 
        this.getWrappedObject().setPartition(partition);
        return this;
    }

    @Signature
    public String getTopic(){ 
        return this.getWrappedObject().getTopic();
    }

    @Signature
    public TopicPartition setTopic(String topic){ 
        this.getWrappedObject().setTopic(topic);
        return this;
    }
}
