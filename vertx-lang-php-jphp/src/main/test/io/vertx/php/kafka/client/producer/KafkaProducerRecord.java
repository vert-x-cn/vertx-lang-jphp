package io.vertx.php.kafka.client.producer;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("KafkaProducerRecord")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
public interface KafkaProducerRecord<S extends io.vertx.kafka.client.producer.KafkaProducerRecord<K,V>, K, V> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaProducerRecordImpl::new, io.vertx.kafka.client.producer.KafkaProducerRecord.create(topic, value)
    }
    
    @Signature
    default Memory topic(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().topic()
    }
    
    @Signature
    default Memory key(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().key()
    }
    
    @Signature
    default Memory value(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().value()
    }
    
    @Signature
    default Memory timestamp(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().timestamp()
    }
    
    @Signature
    default Memory partition(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().partition()
    }

}
