package io.vertx.php.kafka.client.consumer;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("KafkaConsumerRecord")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
public interface KafkaConsumerRecord<S extends io.vertx.kafka.client.consumer.KafkaConsumerRecord<K,V>, K, V> extends IWrapper<S>{
    
    @Signature
    default Memory topic(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().topic()
    }
    
    @Signature
    default Memory partition(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().partition()
    }
    
    @Signature
    default Memory offset(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().offset()
    }
    
    @Signature
    default Memory timestamp(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().timestamp()
    }
    
    @Signature
    default Memory timestampType(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().timestampType()
    }
    
    @Signature
    default Memory checksum(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().checksum()
    }
    
    @Signature
    default Memory key(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().key()
    }
    
    @Signature
    default Memory value(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().value()
    }

}
