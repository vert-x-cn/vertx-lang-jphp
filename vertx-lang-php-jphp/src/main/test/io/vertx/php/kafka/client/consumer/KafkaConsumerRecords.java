package io.vertx.php.kafka.client.consumer;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecord;
@Name("KafkaConsumerRecords")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
public interface KafkaConsumerRecords<S extends io.vertx.kafka.client.consumer.KafkaConsumerRecords<K,V>, K, V> extends IWrapper<S>{
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
    }
    
    @Signature
    default Memory isEmpty(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isEmpty()
    }

    @Signature
    default Memory recordAt(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaConsumerRecordImpl::new, this.getWrappedObject().recordAt(index)
    }

}
