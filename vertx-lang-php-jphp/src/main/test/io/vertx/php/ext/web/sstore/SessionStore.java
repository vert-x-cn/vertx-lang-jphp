package io.vertx.php.ext.web.sstore;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.Session;
@Name("SessionStore")
@Namespace("io\\vertx\\php\\ext\\web\\sstore")
public interface SessionStore<S extends io.vertx.ext.web.sstore.SessionStore> extends IWrapper<S>{
    
    @Signature
    default Memory retryTimeout(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().retryTimeout()
    }

    @Signature
    default Memory createSession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().createSession(timeout)
    }

    @Signature
    default void get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(id, resultHandler)
    }

    @Signature
    default void delete(Environment __env__, Memory... args) {
        this.getWrappedObject().delete(id, resultHandler)
    }

    @Signature
    default void put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(session, resultHandler)
    }

    @Signature
    default void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear(resultHandler)
    }

    @Signature
    default void size(Environment __env__, Memory... args) {
        this.getWrappedObject().size(resultHandler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
