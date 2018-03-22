package io.vertx.php.kafka.client.consumer.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.kafka.client.consumer.KafkaConsumer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaConsumerImpl")
@Namespace("io\\vertx\\php\\kafka\\client\\consumer\\impl")
public class KafkaConsumerImpl<K, V> extends VertxGenWrapper<io.vertx.kafka.client.consumer.KafkaConsumer<K,V>> implements KafkaConsumer<io.vertx.kafka.client.consumer.KafkaConsumer<K,V>, K, V>{
    
    public KafkaConsumerImpl(Environment env, io.vertx.kafka.client.consumer.KafkaConsumer<K,V> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaConsumerImpl::new, io.vertx.kafka.client.consumer.KafkaConsumer.create(vertx, config)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }

    @Signature
    public Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory subscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().subscribe(topic)
    }

    @Signature
    public Memory assign(Environment __env__, Memory... args) {
        this.getWrappedObject().assign(topicPartition)
    }

    @Signature
    public Memory assignment(Environment __env__, Memory... args) {
        this.getWrappedObject().assignment(handler)
    }

    @Signature
    public Memory unsubscribe(Environment __env__, Memory... args) {
        this.getWrappedObject().unsubscribe()
    }

    @Signature
    public Memory subscription(Environment __env__, Memory... args) {
        this.getWrappedObject().subscription(handler)
    }

    @Signature
    public void paused(Environment __env__, Memory... args) {
        this.getWrappedObject().paused(handler)
    }

    @Signature
    public Memory partitionsRevokedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsRevokedHandler(handler)
    }

    @Signature
    public Memory partitionsAssignedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsAssignedHandler(handler)
    }

    @Signature
    public Memory seek(Environment __env__, Memory... args) {
        this.getWrappedObject().seek(topicPartition, offset)
    }

    @Signature
    public Memory seekToBeginning(Environment __env__, Memory... args) {
        this.getWrappedObject().seekToBeginning(topicPartition)
    }

    @Signature
    public Memory seekToEnd(Environment __env__, Memory... args) {
        this.getWrappedObject().seekToEnd(topicPartition)
    }

    @Signature
    public void commit(Environment __env__, Memory... args) {
        this.getWrappedObject().commit()
    }

    @Signature
    public void committed(Environment __env__, Memory... args) {
        this.getWrappedObject().committed(topicPartition, handler)
    }

    @Signature
    public Memory partitionsFor(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsFor(topic, handler)
    }

    @Signature
    public Memory batchHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().batchHandler(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public void position(Environment __env__, Memory... args) {
        this.getWrappedObject().position(partition, handler)
    }

    @Signature
    public void offsetsForTimes(Environment __env__, Memory... args) {
        this.getWrappedObject().offsetsForTimes(topicPartition, timestamp, handler)
    }

    @Signature
    public void beginningOffsets(Environment __env__, Memory... args) {
        this.getWrappedObject().beginningOffsets(topicPartition, handler)
    }

    @Signature
    public void endOffsets(Environment __env__, Memory... args) {
        this.getWrappedObject().endOffsets(topicPartition, handler)
    }

    @Signature
    public Memory pollTimeout(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaConsumerImpl::new, this.getWrappedObject().pollTimeout(timeout)
    }

}
