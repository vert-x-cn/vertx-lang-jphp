package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.http.HttpClientResponse;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.http.HttpConnection;
@Name("HttpClientRequest")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpClientRequest<S extends io.vertx.core.http.HttpClientRequest> extends IWrapper<S>{
    
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
    default Memory setFollowRedirects(Environment __env__, Memory... args) {
        this.getWrappedObject().setFollowRedirects(followRedirects)
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
    default Memory method(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().method()
    }
    
    @Signature
    default Memory getRawMethod(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRawMethod()
    }

    @Signature
    default Memory setRawMethod(Environment __env__, Memory... args) {
        this.getWrappedObject().setRawMethod(method)
    }
    
    @Signature
    default Memory absoluteURI(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().absoluteURI()
    }
    
    @Signature
    default Memory uri(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().uri()
    }
    
    @Signature
    default Memory path(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().path()
    }
    
    @Signature
    default Memory query(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().query()
    }

    @Signature
    default Memory setHost(Environment __env__, Memory... args) {
        this.getWrappedObject().setHost(host)
    }
    
    @Signature
    default Memory getHost(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHost()
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
    default Memory continueHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().continueHandler(handler)
    }
    
    @Signature
    default Memory sendHead(Environment __env__, Memory... args) {
        this.getWrappedObject().sendHead()
    }

    @Signature
    default Memory sendHead(Environment __env__, Memory... args) {
        this.getWrappedObject().sendHead()
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
    default Memory setTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setTimeout(timeoutMs)
    }

    @Signature
    default Memory pushHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().pushHandler(handler)
    }
    
    @Signature
    default Memory reset(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().reset()
    }

    @Signature
    default Memory reset(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().reset()
    }
    
    @Signature
    default Memory connection(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpConnectionImpl::new, this.getWrappedObject().connection()
    }

    @Signature
    default Memory connectionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().connectionHandler(handler)
    }

    @Signature
    default Memory writeCustomFrame(Environment __env__, Memory... args) {
        this.getWrappedObject().writeCustomFrame(frame)
    }
    
    @Signature
    default Memory streamId(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().streamId()
    }

}
