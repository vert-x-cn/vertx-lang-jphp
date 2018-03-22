package io.vertx.php.ext.bridge;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Future;
@Name("BaseBridgeEvent")
@Namespace("io\\vertx\\php\\ext\\bridge")
public interface BaseBridgeEvent<S extends io.vertx.ext.bridge.BaseBridgeEvent> extends IWrapper<S>{
    
    @Signature
    default Memory isComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isComplete()
    }

    @Signature
    default Memory setHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().setHandler(handler)
    }
    
    @Signature
    default void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete()
    }

    @Signature
    default void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete()
    }

    @Signature
    default void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail(cause)
    }
    
    @Signature
    default Memory tryComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tryComplete()
    }

    @Signature
    default Memory tryComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tryComplete()
    }

    @Signature
    default Memory tryFail(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tryFail(cause)
    }
    
    @Signature
    default Memory result(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().result()
    }
    
    @Signature
    default Memory cause(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cause()
    }
    
    @Signature
    default Memory succeeded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().succeeded()
    }
    
    @Signature
    default Memory failed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failed()
    }

    @Signature
    default Memory compose(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().compose(mapper)
    }

    @Signature
    default Memory map(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().map(mapper)
    }
    
    @Signature
    default Memory mapEmpty(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().mapEmpty()
    }
    
    @Signature
    default Memory completer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().completer()
    }

    @Signature
    default Memory recover(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().recover(mapper)
    }

    @Signature
    default Memory otherwise(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().otherwise(mapper)
    }
    
    @Signature
    default Memory otherwiseEmpty(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().otherwiseEmpty()
    }
    
    @Signature
    default Memory type(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().type()
    }
    
    @Signature
    default Memory getRawMessage(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawMessage()
    }

    @Signature
    default Memory setRawMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().setRawMessage(message)
    }

}
