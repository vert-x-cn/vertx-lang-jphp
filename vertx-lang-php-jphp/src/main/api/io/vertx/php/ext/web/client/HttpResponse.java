package io.vertx.php.ext.web.client;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.MultiMap;
@Name("HttpResponse")
@Namespace("io\\vertx\\php\\ext\\web\\client")
public interface HttpResponse<S extends io.vertx.ext.web.client.HttpResponse<T>, T> extends IWrapper<S>{
    
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
    default Memory trailers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().trailers()
    }

    @Signature
    default Memory getTrailer(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getTrailer(trailerName)
    }
    
    @Signature
    default Memory cookies(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cookies()
    }
    
    @Signature
    default Memory body(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().body()
    }
    
    @Signature
    default Memory bodyAsBuffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().bodyAsBuffer()
    }
    
    @Signature
    default Memory bodyAsString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsString()
    }

    @Signature
    default Memory bodyAsString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsString()
    }
    
    @Signature
    default Memory bodyAsJsonObject(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsJsonObject()
    }
    
    @Signature
    default Memory bodyAsJsonArray(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsJsonArray()
    }

    @Signature
    default Memory bodyAsJson(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bodyAsJson(type)
    }

}
