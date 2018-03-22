package io.vertx.php.core.eventbus;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.MultiMap;
@Name("Message")
@Namespace("io\\vertx\\php\\core\\eventbus")
public interface Message<S extends io.vertx.core.eventbus.Message<T>, T> extends IWrapper<S>{
    
    @Signature
    default Memory address(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().address()
    }
    
    @Signature
    default Memory headers(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, this.getWrappedObject().headers()
    }
    
    @Signature
    default Memory body(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().body()
    }
    
    @Signature
    default Memory replyAddress(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().replyAddress()
    }
    
    @Signature
    default Memory isSend(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSend()
    }

    @Signature
    default void reply(Environment __env__, Memory... args) {
        this.getWrappedObject().reply(message)
    }

    @Signature
    default void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail(failureCode, message)
    }

}
