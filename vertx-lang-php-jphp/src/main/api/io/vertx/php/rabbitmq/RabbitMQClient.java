package io.vertx.php.rabbitmq;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("RabbitMQClient")
@Namespace("io\\vertx\\php\\rabbitmq")
public interface RabbitMQClient<S extends io.vertx.rabbitmq.RabbitMQClient> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RabbitMQClientImpl::new, io.vertx.rabbitmq.RabbitMQClient.create(vertx, config)
    }

    @Signature
    default void basicAck(Environment __env__, Memory... args) {
        this.getWrappedObject().basicAck(deliveryTag, multiple, resultHandler)
    }

    @Signature
    default void basicNack(Environment __env__, Memory... args) {
        this.getWrappedObject().basicNack(deliveryTag, multiple, requeue, resultHandler)
    }

    @Signature
    default void basicGet(Environment __env__, Memory... args) {
        this.getWrappedObject().basicGet(queue, autoAck, resultHandler)
    }

    @Signature
    default void basicConsume(Environment __env__, Memory... args) {
        this.getWrappedObject().basicConsume(queue, address, resultHandler)
    }

    @Signature
    default void basicPublish(Environment __env__, Memory... args) {
        this.getWrappedObject().basicPublish(exchange, routingKey, message, resultHandler)
    }

    @Signature
    default void confirmSelect(Environment __env__, Memory... args) {
        this.getWrappedObject().confirmSelect(resultHandler)
    }

    @Signature
    default void waitForConfirms(Environment __env__, Memory... args) {
        this.getWrappedObject().waitForConfirms(resultHandler)
    }

    @Signature
    default void basicQos(Environment __env__, Memory... args) {
        this.getWrappedObject().basicQos(prefetchCount, resultHandler)
    }

    @Signature
    default void exchangeDeclare(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeDeclare(exchange, type, durable, autoDelete, resultHandler)
    }

    @Signature
    default void exchangeDelete(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeDelete(exchange, resultHandler)
    }

    @Signature
    default void exchangeBind(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeBind(destination, source, routingKey, resultHandler)
    }

    @Signature
    default void exchangeUnbind(Environment __env__, Memory... args) {
        this.getWrappedObject().exchangeUnbind(destination, source, routingKey, resultHandler)
    }

    @Signature
    default void queueDeclareAuto(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDeclareAuto(resultHandler)
    }

    @Signature
    default void queueDeclare(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDeclare(queue, durable, exclusive, autoDelete, resultHandler)
    }

    @Signature
    default void queueDelete(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDelete(queue, resultHandler)
    }

    @Signature
    default void queueDeleteIf(Environment __env__, Memory... args) {
        this.getWrappedObject().queueDeleteIf(queue, ifUnused, ifEmpty, resultHandler)
    }

    @Signature
    default void queueBind(Environment __env__, Memory... args) {
        this.getWrappedObject().queueBind(queue, exchange, routingKey, resultHandler)
    }

    @Signature
    default void messageCount(Environment __env__, Memory... args) {
        this.getWrappedObject().messageCount(queue, resultHandler)
    }

    @Signature
    default void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start(resultHandler)
    }

    @Signature
    default void stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop(resultHandler)
    }
    
    @Signature
    default Memory isConnected(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isConnected()
    }
    
    @Signature
    default Memory isOpenChannel(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isOpenChannel()
    }

}
