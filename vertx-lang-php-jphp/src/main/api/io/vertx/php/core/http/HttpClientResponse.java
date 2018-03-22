package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.http.HttpClientRequest;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.net.NetSocket;
@Name("HttpClientResponse")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpClientResponse<S extends io.vertx.core.http.HttpClientResponse> extends IWrapper<S>{
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
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
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }
    
    @Signature
    default Memory version(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().version()
    }
    
    @Signature
    default Memory statusCode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().statusCode()
    }
    
    @Signature
    default Memory statusMessage(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().statusMessage()
    }
    
    @Signature
    default Memory headers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().headers()
    }

    @Signature
    default Memory getHeader(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHeader(headerName)
    }

    @Signature
    default Memory getTrailer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getTrailer(trailerName)
    }
    
    @Signature
    default Memory trailers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().trailers()
    }
    
    @Signature
    default Memory cookies(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cookies()
    }

    @Signature
    default Memory bodyHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().bodyHandler(bodyHandler)
    }

    @Signature
    default Memory customFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().customFrameHandler(handler)
    }
    
    @Signature
    default Memory netSocket(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetSocketImpl::new, this.getWrappedObject().netSocket()
    }
    
    @Signature
    default Memory request(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpClientRequestImpl::new, this.getWrappedObject().request()
    }

}
