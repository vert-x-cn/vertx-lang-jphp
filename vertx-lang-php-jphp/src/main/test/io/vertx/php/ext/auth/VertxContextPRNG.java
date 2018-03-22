package io.vertx.php.ext.auth;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("VertxContextPRNG")
@Namespace("io\\vertx\\php\\ext\\auth")
public interface VertxContextPRNG<S extends io.vertx.ext.auth.VertxContextPRNG> extends IWrapper<S>{
    
    @Signature
    static Memory current(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxContextPRNGImpl::new, io.vertx.ext.auth.VertxContextPRNG.current()
    }

    @Signature
    static Memory current(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxContextPRNGImpl::new, io.vertx.ext.auth.VertxContextPRNG.current()
    }

    @Signature
    default Memory nextString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nextString(length)
    }
    
    @Signature
    default Memory nextInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nextInt()
    }

    @Signature
    default Memory nextInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().nextInt()
    }

}
