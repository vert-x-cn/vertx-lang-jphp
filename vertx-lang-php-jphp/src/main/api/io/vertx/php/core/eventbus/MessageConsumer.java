package io.vertx.php.core.eventbus;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.eventbus.Message;
@Name("MessageConsumer")
@Namespace("io\\vertx\\php\\core\\eventbus")
public interface MessageConsumer<S extends io.vertx.core.eventbus.MessageConsumer<T>, T> extends IWrapper<S>{

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
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }
    
    @Signature
    default Memory bodyStream(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ReadStreamImpl::new, this.getWrappedObject().bodyStream()
    }
    
    @Signature
    default Memory isRegistered(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isRegistered()
    }
    
    @Signature
    default Memory address(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().address()
    }

    @Signature
    default Memory setMaxBufferedMessages(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageConsumerImpl::new, this.getWrappedObject().setMaxBufferedMessages(maxBufferedMessages)
    }
    
    @Signature
    default Memory getMaxBufferedMessages(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMaxBufferedMessages()
    }

    @Signature
    default void completionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().completionHandler(completionHandler)
    }
    
    @Signature
    default void unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister()
    }

    @Signature
    default void unregister(Environment __env__, Memory... args) {
        this.getWrappedObject().unregister()
    }

}
