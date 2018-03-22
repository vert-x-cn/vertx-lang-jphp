package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.StompClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompClientImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class StompClientImpl extends VertxGenWrapper<io.vertx.ext.stomp.StompClient> implements StompClient<io.vertx.ext.stomp.StompClient>{
    
    public StompClientImpl(Environment env, io.vertx.ext.stomp.StompClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompClientImpl::new, io.vertx.ext.stomp.StompClient.create(vertx)
    }

    @Signature
    public Memory connect(Environment __env__, Memory... args) {
        this.getWrappedObject().connect(resultHandler)
    }

    @Signature
    public Memory receivedFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().receivedFrameHandler(handler)
    }

    @Signature
    public Memory writingFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().writingFrameHandler(handler)
    }

    @Signature
    public Memory errorFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().errorFrameHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
