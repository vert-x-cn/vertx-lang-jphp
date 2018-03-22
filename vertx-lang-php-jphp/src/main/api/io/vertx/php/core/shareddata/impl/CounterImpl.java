package io.vertx.php.core.shareddata.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.shareddata.Counter;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CounterImpl")
@Namespace("io\\vertx\\php\\core\\shareddata\\impl")
public class CounterImpl extends VertxGenWrapper<io.vertx.core.shareddata.Counter> implements Counter<io.vertx.core.shareddata.Counter>{
    
    public CounterImpl(Environment env, io.vertx.core.shareddata.Counter wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(resultHandler)
    }

    @Signature
    public void incrementAndGet(Environment __env__, Memory... args) {
        this.getWrappedObject().incrementAndGet(resultHandler)
    }

    @Signature
    public void getAndIncrement(Environment __env__, Memory... args) {
        this.getWrappedObject().getAndIncrement(resultHandler)
    }

    @Signature
    public void decrementAndGet(Environment __env__, Memory... args) {
        this.getWrappedObject().decrementAndGet(resultHandler)
    }

    @Signature
    public void addAndGet(Environment __env__, Memory... args) {
        this.getWrappedObject().addAndGet(value, resultHandler)
    }

    @Signature
    public void getAndAdd(Environment __env__, Memory... args) {
        this.getWrappedObject().getAndAdd(value, resultHandler)
    }

    @Signature
    public void compareAndSet(Environment __env__, Memory... args) {
        this.getWrappedObject().compareAndSet(expected, value, resultHandler)
    }

}
