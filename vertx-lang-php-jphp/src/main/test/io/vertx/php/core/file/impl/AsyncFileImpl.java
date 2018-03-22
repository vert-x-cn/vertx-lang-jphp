package io.vertx.php.core.file.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.file.AsyncFile;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AsyncFileImpl")
@Namespace("io\\vertx\\php\\core\\file\\impl")
public class AsyncFileImpl extends VertxGenWrapper<io.vertx.core.file.AsyncFile> implements AsyncFile<io.vertx.core.file.AsyncFile>{
    
    public AsyncFileImpl(Environment env, io.vertx.core.file.AsyncFile wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    public Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    public Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public Memory read(Environment __env__, Memory... args) {
        this.getWrappedObject().read(buffer, offset, position, length, handler)
    }

    @Signature
    public Memory flush(Environment __env__, Memory... args) {
        this.getWrappedObject().flush()
    }

    @Signature
    public Memory setReadPos(Environment __env__, Memory... args) {
        this.getWrappedObject().setReadPos(readPos)
    }

    @Signature
    public Memory setWritePos(Environment __env__, Memory... args) {
        this.getWrappedObject().setWritePos(writePos)
    }

    @Signature
    public Memory setReadBufferSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setReadBufferSize(readBufferSize)
    }

}
