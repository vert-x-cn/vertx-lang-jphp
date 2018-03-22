package io.vertx.php.rabbitmq.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.rabbitmq.RabbitMQClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RabbitMQClientImpl")
@Namespace("io\\vertx\\php\\rabbitmq\\impl")
public class RabbitMQClientImpl extends VertxGenWrapper<io.vertx.rabbitmq.RabbitMQClient> implements RabbitMQClient<io.vertx.rabbitmq.RabbitMQClient>{
    
    public RabbitMQClientImpl(Environment env, io.vertx.rabbitmq.RabbitMQClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RabbitMQClientImpl::new, io.vertx.rabbitmq.RabbitMQClient.create(vertx, config)
    }

    @Signature
    public void basicAck(Environment __env__, Memory... args) {
        this.getWrappedObject().basicAck(deliveryTag, multiple, resultHandler)
    }

    @Signature
    public void basicNack(Environment __env__, Memory... args) {
        this.getWrappedObject().basicNack(deliveryTag, multiple, requeue, resultHandler)
    }

    @Signature
    public void basicGet(Environment __env__, Memory... args) {
        this.getWrappedObject().basicGet(queue, autoAck, resultHandler)
    }

    @Signature
    public void basicConsume(Environment __env__, Memory... args) {
        this.getWrappedObject().basicConsume(queue, address, resultHandler)
    }

    @Signature
    public void basicPublish(Environment __env__, Memory... args) {
        this.getWrappedObject().basicPublish(exchange, routingKey, message, resultHandler)
    }

    @Signature
    public void confirmSelect(Environment __env__, Memory... args) {
        this.getWrappedObject().confirmSelect(resultHandler)
    }

    @Signature
    public void waitForConfirms(Environment __env__, Memory... args) {
        this.getWrappedObject().waitForConfirms(resultHandler)
    }

    @Signature
    public void basicQos(Environment __env__, Memory... args) {
        this.getWrappedObject().basicQos(prefetchCount, resultHandler)
    }

    @Signature
    public void exchangeDeclare(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeDeclare(exchange, type, durable, autoDelete, resultHandler)
    }

    @Signature
    public void exchangeDelete(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeDelete(exchange, resultHandler)
    }

    @Signature
    public void exchangeBind(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeBind(destination, source, routingKey, resultHandler)
    }

    @Signature
    public void exchangeUnbind(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeUnbind(destination, source, routingKey, resultHandler)
    }

    @Signature
    public void queueDeclareAuto(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDeclareAuto(resultHandler)
    }

    @Signature
    public void queueDeclare(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDeclare(queue, durable, exclusive, autoDelete, resultHandler)
    }

    @Signature
    public void queueDelete(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDelete(queue, resultHandler)
    }

    @Signature
    public void queueDeleteIf(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDeleteIf(queue, ifUnused, ifEmpty, resultHandler)
    }

    @Signature
    public void queueBind(Environment __env__, Memory... args) {
        this.getWrappedObject().queueBind(queue, exchange, routingKey, resultHandler)
    }

    @Signature
    public void messageCount(Environment __env__, Memory... args) {
        this.getWrappedObject().messageCount(queue, resultHandler)
    }

    @Signature
    public void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start(resultHandler)
    }

    @Signature
    public void stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop(resultHandler)
    }

}
