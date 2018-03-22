package io.vertx.php.core.streams.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WriteStreamImpl")
@Namespace("io\\vertx\\php\\core\\streams\\impl")
public class WriteStreamImpl<T> extends VertxGenWrapper<io.vertx.core.streams.WriteStream<T>> implements WriteStream<io.vertx.core.streams.WriteStream<T>, T>{
    
    public WriteStreamImpl(Environment env, io.vertx.core.streams.WriteStream<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    public Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

}
