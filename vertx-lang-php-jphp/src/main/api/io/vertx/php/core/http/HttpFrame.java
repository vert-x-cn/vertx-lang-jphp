package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
@Name("HttpFrame")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpFrame<S extends io.vertx.core.http.HttpFrame> extends IWrapper<S>{
    
    @Signature
    default Memory type(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().type()
    }
    
    @Signature
    default Memory flags(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().flags()
    }
    
    @Signature
    default Memory payload(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().payload()
    }

}
