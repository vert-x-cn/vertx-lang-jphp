package io.vertx.php.ext.consul;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("WatchResult")
@Namespace("io\\vertx\\php\\ext\\consul")
public interface WatchResult<S extends io.vertx.ext.consul.WatchResult<T>, T> extends IWrapper<S>{
    
    @Signature
    default Memory prevResult(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().prevResult()
    }
    
    @Signature
    default Memory nextResult(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nextResult()
    }
    
    @Signature
    default Memory cause(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cause()
    }
    
    @Signature
    default Memory succeeded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().succeeded()
    }
    
    @Signature
    default Memory failed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failed()
    }

}
