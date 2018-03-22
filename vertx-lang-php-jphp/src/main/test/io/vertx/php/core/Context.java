package io.vertx.php.core;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;
@Name("Context")
@Namespace("io\\vertx\\php\\core")
public interface Context<S extends io.vertx.core.Context> extends IWrapper<S>{
    
    @Signature
    static Memory isOnWorkerThread(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.core.Context.isOnWorkerThread()
    }
    
    @Signature
    static Memory isOnEventLoopThread(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.core.Context.isOnEventLoopThread()
    }
    
    @Signature
    static Memory isOnVertxThread(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.core.Context.isOnVertxThread()
    }

    @Signature
    default void runOnContext(Environment __env__, Memory... args) {
        this.getWrappedObject().runOnContext(action)
    }

    @Signature
    default void executeBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().executeBlocking(blockingCodeHandler, resultHandler)
    }
    
    @Signature
    default Memory deploymentID(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().deploymentID()
    }
    
    @Signature
    default Memory config(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().config()
    }
    
    @Signature
    default Memory processArgs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().processArgs()
    }
    
    @Signature
    default Memory isEventLoopContext(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isEventLoopContext()
    }
    
    @Signature
    default Memory isWorkerContext(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isWorkerContext()
    }
    
    @Signature
    default Memory isMultiThreadedWorkerContext(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMultiThreadedWorkerContext()
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    default void put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, value)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }
    
    @Signature
    default Memory owner(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, this.getWrappedObject().owner()
    }
    
    @Signature
    default Memory getInstanceCount(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getInstanceCount()
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
