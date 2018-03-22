package io.vertx.php.kafka.client.consumer.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecord;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaConsumerRecordImpl")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer\\impl")
public class KafkaConsumerRecordImpl<K, V> extends VertxGenWrapper<io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V>> implements KafkaConsumerRecord<io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V>, K, V>{
    
    public KafkaConsumerRecordImpl(Environment env, io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V> wrappedObject){
        super(env, wrappedObject);
    }

}
