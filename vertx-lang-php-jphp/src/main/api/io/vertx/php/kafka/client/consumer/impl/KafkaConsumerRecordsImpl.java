package io.vertx.php.kafka.client.consumer.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecords;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaConsumerRecordsImpl")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer\\impl")
public class KafkaConsumerRecordsImpl<K, V> extends VertxGenWrapper<io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V>> implements KafkaConsumerRecords<io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V>, K, V>{
    
    public KafkaConsumerRecordsImpl(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory recordAt(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaConsumerRecordImpl::new, this.getWrappedObject().recordAt(index)
    }

}
