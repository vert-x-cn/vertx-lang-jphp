package io.vertx.php.core.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.CompositeFuture;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CompositeFutureImpl")
@Namespace("io\\vertx\\php\\core\\impl")
public class CompositeFutureImpl extends VertxGenWrapper<io.vertx.core.CompositeFuture> implements CompositeFuture<io.vertx.core.CompositeFuture>{
    
    public CompositeFutureImpl(Environment env, io.vertx.core.CompositeFuture wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory isComplete(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isComplete()
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
    public Memory cause(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cause()
    }

    @Signature
    public Memory succeeded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().succeeded()
    }

    @Signature
    public Memory failed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failed()
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
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().otherwise(mapper)
    }

    @Signature
    public static Memory all(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, io.vertx.core.CompositeFuture.all(futures)
    }

    @Signature
    public static Memory any(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, io.vertx.core.CompositeFuture.any(futures)
    }

    @Signature
    public static Memory join(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CompositeFutureImpl::new, io.vertx.core.CompositeFuture.join(futures)
    }

    @Signature
    public Memory setHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().setHandler(handler)
    }

    @Signature
    public Memory resultAt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().resultAt(index)
    }

}
