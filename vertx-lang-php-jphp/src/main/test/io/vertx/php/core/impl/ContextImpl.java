package io.vertx.php.core.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.Context;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ContextImpl")
@Namespace("io\\vertx\\php\\core\\impl")
public class ContextImpl extends VertxGenWrapper<io.vertx.core.Context> implements Context<io.vertx.core.Context>{
    
    public ContextImpl(Environment env, io.vertx.core.Context wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory isOnWorkerThread(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.core.Context.isOnWorkerThread()
    }
    
    @Signature
    public static Memory isOnEventLoopThread(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.core.Context.isOnEventLoopThread()
    }
    
    @Signature
    public static Memory isOnVertxThread(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.core.Context.isOnVertxThread()
    }

    @Signature
    public void runOnContext(Environment __env__, Memory... args) {
        this.getWrappedObject().runOnContext(action)
    }

    @Signature
    public void executeBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().executeBlocking(blockingCodeHandler, resultHandler)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    public void put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, value)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
