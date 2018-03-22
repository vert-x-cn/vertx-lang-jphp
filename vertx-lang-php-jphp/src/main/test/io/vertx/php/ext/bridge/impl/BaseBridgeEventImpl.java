package io.vertx.php.ext.bridge.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.bridge.BaseBridgeEvent;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("BaseBridgeEventImpl")
@Namespace("io\\vertx\\php\\ext\\bridge\\impl")
public class BaseBridgeEventImpl extends VertxGenWrapper<io.vertx.ext.bridge.BaseBridgeEvent> implements BaseBridgeEvent<io.vertx.ext.bridge.BaseBridgeEvent>{
    
    public BaseBridgeEventImpl(Environment env, io.vertx.ext.bridge.BaseBridgeEvent wrappedObject){
        super(env, wrappedObject);
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
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, this.getWrappedObject().otherwise(mapper)
    }

    @Signature
    public Memory setRawMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().setRawMessage(message)
    }

}
