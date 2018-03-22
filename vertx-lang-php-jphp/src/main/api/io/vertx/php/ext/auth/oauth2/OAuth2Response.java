package io.vertx.php.ext.auth.oauth2;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.MultiMap;
@Name("OAuth2Response")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
public interface OAuth2Response<S extends io.vertx.ext.auth.oauth2.OAuth2Response> extends IWrapper<S>{
    
    @Signature
    default Memory statusCode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().statusCode()
    }
    
    @Signature
    default Memory headers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().headers()
    }

    @Signature
    default Memory getHeader(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHeader(name)
    }
    
    @Signature
    default Memory body(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().body()
    }
    
    @Signature
    default Memory jsonObject(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().jsonObject()
    }
    
    @Signature
    default Memory jsonArray(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().jsonArray()
    }

    @Signature
    default Memory is(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().is(contentType)
    }

}
