package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Acknowledgement")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface Acknowledgement<S extends io.vertx.ext.stomp.Acknowledgement> extends IWrapper<S>{
    
    @Signature
    default Memory subscription(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().subscription()
    }
    
    @Signature
    default Memory frames(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().frames()
    }

}
