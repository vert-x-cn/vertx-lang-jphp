package io.vertx.php.kafka.client.producer;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.Vertx;
import io.vertx.php.kafka.client.producer.KafkaProducerRecord;
@Name("KafkaProducer")
@Namespace("io\\vertx\\php\\kafka\\client\\producer")
public interface KafkaProducer<S extends io.vertx.kafka.client.producer.KafkaProducer<K,V>, K, V> extends IWrapper<S>{

    @Signature
    static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaProducerImpl::new, io.vertx.kafka.client.producer.KafkaProducer.createShared(vertx, name, config)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaProducerImpl::new, io.vertx.kafka.client.producer.KafkaProducer.create(vertx, config)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(kafkaProducerRecord)
    }
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(i)
    }
    
    @Signature
    default Memory writeQueueFull(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().writeQueueFull()
    }

    @Signature
    default Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    default Memory partitionsFor(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsFor(topic, handler)
    }

    @Signature
    default Memory flush(Environment __env__, Memory... args) {
        this.getWrappedObject().flush(completionHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
