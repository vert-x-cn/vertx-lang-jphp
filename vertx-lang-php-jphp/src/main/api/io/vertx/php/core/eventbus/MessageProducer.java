package io.vertx.php.core.eventbus;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.eventbus.Message;
@Name("MessageProducer")
@Namespace("io\\vertx\\php\\core\\eventbus")
public interface MessageProducer<S extends io.vertx.core.eventbus.MessageProducer<T>, T> extends IWrapper<S>{
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }
    
    @Signature
    default Memory writeQueueFull(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().writeQueueFull()
    }

    @Signature
    default Memory send(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageProducerImpl::new, this.getWrappedObject().send(message)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    default Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    default Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    default Memory deliveryOptions(Environment __env__, Memory... args) {
        this.getWrappedObject().deliveryOptions(options)
    }
    
    @Signature
    default Memory address(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().address()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
