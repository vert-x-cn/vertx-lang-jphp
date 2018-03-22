package io.vertx.php.kafka.client.producer.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.kafka.client.producer.KafkaProducer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("KafkaProducerImpl")
@Namespace("io\\vertx\\php\\kafka\\client\\producer\\impl")
public class KafkaProducerImpl<K, V> extends VertxGenWrapper<io.vertx.kafka.client.producer.KafkaProducer<K,V>> implements KafkaProducer<io.vertx.kafka.client.producer.KafkaProducer<K,V>, K, V>{
    
    public KafkaProducerImpl(Environment env, io.vertx.kafka.client.producer.KafkaProducer<K,V> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaProducerImpl::new, io.vertx.kafka.client.producer.KafkaProducer.createShared(vertx, name, config)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, KafkaProducerImpl::new, io.vertx.kafka.client.producer.KafkaProducer.create(vertx, config)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(kafkaProducerRecord)
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(i)
    }

    @Signature
    public Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    public Memory partitionsFor(Environment __env__, Memory... args) {
        this.getWrappedObject().partitionsFor(topic, handler)
    }

    @Signature
    public Memory flush(Environment __env__, Memory... args) {
        this.getWrappedObject().flush(completionHandler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
