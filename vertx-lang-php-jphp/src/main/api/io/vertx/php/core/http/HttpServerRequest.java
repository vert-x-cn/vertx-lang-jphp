package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.http.ServerWebSocket;
import io.vertx.php.core.http.HttpServerFileUpload;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.php.core.http.HttpServerResponse;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.http.HttpConnection;
import io.vertx.php.core.net.SocketAddress;
import io.vertx.php.core.net.NetSocket;
@Name("HttpServerRequest")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpServerRequest<S extends io.vertx.core.http.HttpServerRequest> extends IWrapper<S>{

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
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
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
    default Memory method(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().method()
    }
    
    @Signature
    default Memory rawMethod(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().rawMethod()
    }
    
    @Signature
    default Memory isSSL(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSSL()
    }
    
    @Signature
    default Memory scheme(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().scheme()
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
    default Memory host(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().host()
    }
    
    @Signature
    default Memory response(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpServerResponseImpl::new, this.getWrappedObject().response()
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
    default Memory params(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().params()
    }

    @Signature
    default Memory getParam(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getParam(paramName)
    }
    
    @Signature
    default Memory remoteAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().remoteAddress()
    }
    
    @Signature
    default Memory localAddress(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SocketAddressImpl::new, this.getWrappedObject().localAddress()
    }
    
    @Signature
    default Memory absoluteURI(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().absoluteURI()
    }

    @Signature
    default Memory bodyHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().bodyHandler(bodyHandler)
    }
    
    @Signature
    default Memory netSocket(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, NetSocketImpl::new, this.getWrappedObject().netSocket()
    }

    @Signature
    default Memory setExpectMultipart(Environment __env__, Memory... args) {
        this.getWrappedObject().setExpectMultipart(expect)
    }
    
    @Signature
    default Memory isExpectMultipart(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isExpectMultipart()
    }

    @Signature
    default Memory uploadHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().uploadHandler(uploadHandler)
    }
    
    @Signature
    default Memory formAttributes(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().formAttributes()
    }

    @Signature
    default Memory getFormAttribute(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getFormAttribute(attributeName)
    }
    
    @Signature
    default Memory upgrade(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServerWebSocketImpl::new, this.getWrappedObject().upgrade()
    }
    
    @Signature
    default Memory isEnded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isEnded()
    }

    @Signature
    default Memory customFrameHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().customFrameHandler(handler)
    }
    
    @Signature
    default Memory connection(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, HttpConnectionImpl::new, this.getWrappedObject().connection()
    }

}
