package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.StompServerConnection;
@Name("ServerFrame")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface ServerFrame<S extends io.vertx.ext.stomp.ServerFrame> extends IWrapper<S>{
    
    @Signature
    default Memory frame(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().frame()
    }
    
    @Signature
    default Memory connection(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, StompServerConnectionImpl::new, this.getWrappedObject().connection()
    }

}
