package io.vertx.php.ext.shell.session;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Session")
@Namespace("io\\vertx\\php\\ext\\shell\\session")
public interface Session<S extends io.vertx.ext.shell.session.Session> extends IWrapper<S>{
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, io.vertx.ext.shell.session.Session.create()
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, obj)
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

}
