package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.MultiMap;
@Name("HttpServerResponse")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpServerResponse<S extends io.vertx.core.http.HttpServerResponse> extends IWrapper<S>{
    
    @Signature
    default Memory writeQueueFull(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().writeQueueFull()
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
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
    default Memory getStatusCode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getStatusCode()
    }

    @Signature
    default Memory setStatusCode(Environment __env__, Memory... args) {
        this.getWrappedObject().setStatusCode(statusCode)
    }
    
    @Signature
    default Memory getStatusMessage(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getStatusMessage()
    }

    @Signature
    default Memory setStatusMessage(Environment __env__, Memory... args) {
        this.getWrappedObject().setStatusMessage(statusMessage)
    }

    @Signature
    default Memory setChunked(Environment __env__, Memory... args) {
        this.getWrappedObject().setChunked(chunked)
    }
    
    @Signature
    default Memory isChunked(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isChunked()
    }
    
    @Signature
    default Memory headers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().headers()
    }

    @Signature
    default Memory putHeader(Environment __env__, Memory... args) {
        this.getWrappedObject().putHeader(name, value)
    }
    
    @Signature
    default Memory trailers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().trailers()
    }

    @Signature
    default Memory putTrailer(Environment __env__, Memory... args) {
        this.getWrappedObject().putTrailer(name, value)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(handler)
    }
    
    @Signature
    default Memory writeContinue(Environment __env__, Memory... args) {
        this.getWrappedObject().writeContinue()
    }
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default Memory sendFile(Environment __env__, Memory... args) {
        this.getWrappedObject().sendFile(filename)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }
    
    @Signature
    default Memory ended(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().ended()
    }
    
    @Signature
    default Memory closed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().closed()
    }
    
    @Signature
    default Memory headWritten(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().headWritten()
    }

    @Signature
    default Memory headersEndHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().headersEndHandler(handler)
    }

    @Signature
    default Memory bodyEndHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().bodyEndHandler(handler)
    }
    
    @Signature
    default Memory bytesWritten(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bytesWritten()
    }
    
    @Signature
    default Memory streamId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().streamId()
    }

    @Signature
    default Memory push(Environment __env__, Memory... args) {
        this.getWrappedObject().push(method, path, handler)
    }
    
    @Signature
    default void reset(Environment __env__, Memory... args) {
        this.getWrappedObject().reset()
    }

    @Signature
    default void reset(Environment __env__, Memory... args) {
        this.getWrappedObject().reset()
    }

    @Signature
    default Memory writeCustomFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeCustomFrame(frame)
    }

}
