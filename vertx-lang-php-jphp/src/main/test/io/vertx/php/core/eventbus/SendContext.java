package io.vertx.php.core.eventbus;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.eventbus.Message;
@Name("SendContext")
@Namespace("io\\vertx\\php\\core\\eventbus")
public interface SendContext<S extends io.vertx.core.eventbus.SendContext<T>, T> extends IWrapper<S>{
    
    @Signature
    default Memory message(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MessageImpl::new, this.getWrappedObject().message()
    }
    
    @Signature
    default void next(Environment __env__, Memory... args) {
        this.getWrappedObject().next()
    }
    
    @Signature
    default Memory send(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().send()
    }
    
    @Signature
    default Memory sentBody(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().sentBody()
    }

}
