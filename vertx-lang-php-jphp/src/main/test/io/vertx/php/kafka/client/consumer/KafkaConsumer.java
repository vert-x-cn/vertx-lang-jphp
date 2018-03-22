package io.vertx.php.kafka.client.consumer;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecord;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.kafka.client.consumer.KafkaConsumerRecords;
@Name("KafkaConsumer")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer")
public interface KafkaConsumer<S extends io.vertx.kafka.client.consumer.KafkaConsumer<K,V>, K, V> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaConsumerImpl::new, io.vertx.kafka.client.consumer.KafkaConsumer.create(vertx, config)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }
    
    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }

    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    default Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(topic)
    }

    @Signature
    default Memory assign(Environment __env__, Memory... args) {
        this.getWrappedObject().assign(topicPartition)
    }

    @Signature
    default Memory assignment(Environment __env__, Memory... args) {
        this.getWrappedObject().assignment(handler)
    }
    
    @Signature
    default Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe()
    }

    @Signature
    default Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe()
    }

    @Signature
    default Memory subscription(Environment __env__, Memory... args) {
        this.getWrappedObject().subscription(handler)
    }

    @Signature
    default void paused(Environment __env__, Memory... args) {
        this.getWrappedObject().paused(handler)
    }

    @Signature
    default Memory partitionsRevokedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsRevokedHandler(handler)
    }

    @Signature
    default Memory partitionsAssignedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsAssignedHandler(handler)
    }

    @Signature
    default Memory seek(Environment __env__, Memory... args) {
        this.getWrappedObject().seek(topicPartition, offset)
    }

    @Signature
    default Memory seekToBeginning(Environment __env__, Memory... args) {
        this.getWrappedObject().seekToBeginning(topicPartition)
    }

    @Signature
    default Memory seekToEnd(Environment __env__, Memory... args) {
        this.getWrappedObject().seekToEnd(topicPartition)
    }
    
    @Signature
    default void commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit()
    }

    @Signature
    default void commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit()
    }

    @Signature
    default void committed(Environment __env__, Memory... args) {
        this.getWrappedObject().committed(topicPartition, handler)
    }

    @Signature
    default Memory partitionsFor(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsFor(topic, handler)
    }

    @Signature
    default Memory batchHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().batchHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void position(Environment __env__, Memory... args) {
        this.getWrappedObject().position(partition, handler)
    }

    @Signature
    default void offsetsForTimes(Environment __env__, Memory... args) {
        this.getWrappedObject().offsetsForTimes(topicPartition, timestamp, handler)
    }

    @Signature
    default void beginningOffsets(Environment __env__, Memory... args) {
        this.getWrappedObject().beginningOffsets(topicPartition, handler)
    }

    @Signature
    default void endOffsets(Environment __env__, Memory... args) {
        this.getWrappedObject().endOffsets(topicPartition, handler)
    }

    @Signature
    default Memory pollTimeout(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaConsumerImpl::new, this.getWrappedObject().pollTimeout(timeout)
    }

}
