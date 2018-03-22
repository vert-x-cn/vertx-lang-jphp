package io.vertx.php.core;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Future;
@Name("CompositeFuture")
@Namespace("io\\vertx\\php\\core")
public interface CompositeFuture<S extends io.vertx.core.CompositeFuture> extends IWrapper<S>{
    
    @Signature
    default Memory isComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isComplete()
    }

    @Signature
    default Memory isComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isComplete()
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
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, this.getWrappedObject().result()
    }
    
    @Signature
    default Memory cause(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cause()
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
    default Memory succeeded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().succeeded()
    }
    
    @Signature
    default Memory failed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failed()
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
    static Memory all(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, io.vertx.core.CompositeFuture.all(futures)
    }

    @Signature
    static Memory any(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, io.vertx.core.CompositeFuture.any(futures)
    }

    @Signature
    static Memory join(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, io.vertx.core.CompositeFuture.join(futures)
    }

    @Signature
    default Memory setHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().setHandler(handler)
    }

    @Signature
    default Memory resultAt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().resultAt(index)
    }
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
    }

}
