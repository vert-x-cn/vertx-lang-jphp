package io.vertx.php.core.streams.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ReadStreamImpl")
@Namespace("io\\vertx\\php\\core\\streams\\impl")
public class ReadStreamImpl<T> extends VertxGenWrapper<io.vertx.core.streams.ReadStream<T>> implements ReadStream<io.vertx.core.streams.ReadStream<T>, T>{
    
    public ReadStreamImpl(Environment env, io.vertx.core.streams.ReadStream<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

}
