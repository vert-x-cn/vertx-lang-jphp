package io.vertx.php.ext.unit.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.Completion;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CompletionImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\impl")
public class CompletionImpl<T> extends VertxGenWrapper<io.vertx.ext.unit.Completion<T>> implements Completion<io.vertx.ext.unit.Completion<T>, T>{
    
    public CompletionImpl(Environment env, io.vertx.ext.unit.Completion<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void resolve(Environment __env__, Memory... args) {
        this.getWrappedObject().resolve(future)
    }

    @Signature
    public void handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(completionHandler)
    }

    @Signature
    public void await(Environment __env__, Memory... args) {
        this.getWrappedObject().await()
    }

    @Signature
    public void awaitSuccess(Environment __env__, Memory... args) {
        this.getWrappedObject().awaitSuccess()
    }

}
