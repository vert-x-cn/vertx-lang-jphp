package io.vertx.php.kafka.client.producer.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.kafka.client.producer.KafkaProducerRecord;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaProducerRecordImpl")
@Namespace("io\\vertx\\php\\kafka\\client\\producer\\impl")
public class KafkaProducerRecordImpl<K, V> extends VertxGenWrapper<io.vertx.kafka.client.producer.KafkaProducerRecord<K,V>> implements KafkaProducerRecord<io.vertx.kafka.client.producer.KafkaProducerRecord<K,V>, K, V>{
    
    public KafkaProducerRecordImpl(Environment env, io.vertx.kafka.client.producer.KafkaProducerRecord<K,V> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaProducerRecordImpl::new, io.vertx.kafka.client.producer.KafkaProducerRecord.create(topic, value)
    }

}
