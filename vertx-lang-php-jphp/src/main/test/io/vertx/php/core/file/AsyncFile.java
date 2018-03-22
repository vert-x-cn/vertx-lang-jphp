package io.vertx.php.core.file;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.streams.ReadStream;
@Name("AsyncFile")
@Namespace("io\\vertx\\php\\core\\file")
public interface AsyncFile<S extends io.vertx.core.file.AsyncFile> extends IWrapper<S>{
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }
    
    @Signature
    default Memory writeQueueFull(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().writeQueueFull()
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }
    
    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    default Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }

    @Signature
    default Memory drainHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().drainHandler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default Memory read(Environment __env__, Memory... args) {
        this.getWrappedObject().read(buffer, offset, position, length, handler)
    }
    
    @Signature
    default Memory flush(Environment __env__, Memory... args) {
        this.getWrappedObject().flush()
    }

    @Signature
    default Memory flush(Environment __env__, Memory... args) {
        this.getWrappedObject().flush()
    }

    @Signature
    default Memory setReadPos(Environment __env__, Memory... args) {
        this.getWrappedObject().setReadPos(readPos)
    }

    @Signature
    default Memory setWritePos(Environment __env__, Memory... args) {
        this.getWrappedObject().setWritePos(writePos)
    }

    @Signature
    default Memory setReadBufferSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setReadBufferSize(readBufferSize)
    }

}
