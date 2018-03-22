package io.vertx.php.core.impl;
import io.vertx.lang.jphp.Utils;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.Future;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FutureImpl")
@Namespace("io\\vertx\\php\\core\\impl")
public class FutureImpl<T> extends VertxGenWrapper<io.vertx.core.Future<T>> implements Future<io.vertx.core.Future<T>, T>{
    
    public FutureImpl(Environment env, io.vertx.core.Future<T> wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory future(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.core.Future.future()
    }

    @Signature
    public static Memory future(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.core.Future.future()
    }
    
    @Signature
    public static Memory succeededFuture(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.core.Future.succeededFuture()
    }

    @Signature
    public static Memory succeededFuture(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.core.Future.succeededFuture()
    }

    @Signature
    public static Memory failedFuture(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.core.Future.failedFuture(t)
    }

    @Signature
    public Memory setHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().setHandler(handler)
    }

    @Signature
    public void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete()
    }

    @Signature
    public void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail(cause)
    }

    @Signature
    public Memory tryComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tryComplete()
    }

    @Signature
    public Memory tryFail(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().tryFail(cause)
    }

    @Signature
    public Memory compose(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().compose(mapper)
    }

    @Signature
    public Memory map(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().map(mapper)
    }

    @Signature
    public Memory recover(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().recover(mapper)
    }

    @Signature
    public Memory otherwise(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().otherwise((T)null));
    }

}
