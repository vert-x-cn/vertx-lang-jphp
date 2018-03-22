package io.vertx.php.core.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.WorkerExecutor;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WorkerExecutorImpl")
@Namespace("io\\vertx\\php\\core\\impl")
public class WorkerExecutorImpl extends VertxGenWrapper<io.vertx.core.WorkerExecutor> implements WorkerExecutor<io.vertx.core.WorkerExecutor>{
    
    public WorkerExecutorImpl(Environment env, io.vertx.core.WorkerExecutor wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void executeBlocking(Environment __env__, Memory... args) {
        this.getWrappedObject().executeBlocking(blockingCodeHandler, resultHandler)
    }

}
