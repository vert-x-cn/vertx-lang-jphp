package io.vertx.php.circuitbreaker;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;
@Name("CircuitBreaker")
@Namespace("io\\vertx\\php\\circuitbreaker")
public interface CircuitBreaker<S extends io.vertx.circuitbreaker.CircuitBreaker> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CircuitBreakerImpl::new, io.vertx.circuitbreaker.CircuitBreaker.create(name, vertx)
    }
    
    @Signature
    default Memory close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default Memory openHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().openHandler(handler)
    }

    @Signature
    default Memory halfOpenHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().halfOpenHandler(handler)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    default Memory executeWithFallback(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().executeWithFallback(command, fallback)
    }

    @Signature
    default void executeCommandWithFallback(Environment __env__, Memory... args) {
        this.getWrappedObject().executeCommandWithFallback(command, fallback, handler)
    }

    @Signature
    default Memory execute(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().execute(command)
    }

    @Signature
    default void executeCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().executeCommand(command, handler)
    }

    @Signature
    default Memory executeAndReport(Environment __env__, Memory... args) {
        this.getWrappedObject().executeAndReport(resultFuture, command)
    }

    @Signature
    default Memory executeAndReportWithFallback(Environment __env__, Memory... args) {
        this.getWrappedObject().executeAndReportWithFallback(resultFuture, command, fallback)
    }

    @Signature
    default Memory fallback(Environment __env__, Memory... args) {
        this.getWrappedObject().fallback(handler)
    }
    
    @Signature
    default Memory reset(Environment __env__, Memory... args) {
        this.getWrappedObject().reset()
    }
    
    @Signature
    default Memory open(Environment __env__, Memory... args) {
        this.getWrappedObject().open()
    }
    
    @Signature
    default Memory state(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().state()
    }
    
    @Signature
    default Memory failureCount(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failureCount()
    }
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }

}
