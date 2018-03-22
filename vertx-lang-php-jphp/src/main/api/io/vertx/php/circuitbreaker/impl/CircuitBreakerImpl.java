package io.vertx.php.circuitbreaker.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.circuitbreaker.CircuitBreaker;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CircuitBreakerImpl")
@Namespace("io\\vertx\\php\\circuitbreaker\\impl")
public class CircuitBreakerImpl extends VertxGenWrapper<io.vertx.circuitbreaker.CircuitBreaker> implements CircuitBreaker<io.vertx.circuitbreaker.CircuitBreaker>{
    
    public CircuitBreakerImpl(Environment env, io.vertx.circuitbreaker.CircuitBreaker wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CircuitBreakerImpl::new, io.vertx.circuitbreaker.CircuitBreaker.create(name, vertx)
    }

    @Signature
    public Memory openHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().openHandler(handler)
    }

    @Signature
    public Memory halfOpenHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().halfOpenHandler(handler)
    }

    @Signature
    public Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    public Memory executeWithFallback(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().executeWithFallback(command, fallback)
    }

    @Signature
    public void executeCommandWithFallback(Environment __env__, Memory... args) {
        this.getWrappedObject().executeCommandWithFallback(command, fallback, handler)
    }

    @Signature
    public Memory execute(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().execute(command)
    }

    @Signature
    public void executeCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().executeCommand(command, handler)
    }

    @Signature
    public Memory executeAndReport(Environment __env__, Memory... args) {
        this.getWrappedObject().executeAndReport(resultFuture, command)
    }

    @Signature
    public Memory executeAndReportWithFallback(Environment __env__, Memory... args) {
        this.getWrappedObject().executeAndReportWithFallback(resultFuture, command, fallback)
    }

    @Signature
    public Memory fallback(Environment __env__, Memory... args) {
        this.getWrappedObject().fallback(handler)
    }

}
