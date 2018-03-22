package io.vertx.php.ext.unit;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Future;
@Name("Completion")
@Namespace("io\\vertx\\php\\ext\\unit")
public interface Completion<S extends io.vertx.ext.unit.Completion<T>, T> extends IWrapper<S>{

    @Signature
    default void resolve(Environment __env__, Memory... args) {
        this.getWrappedObject().resolve(future)
    }
    
    @Signature
    default Memory isCompleted(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isCompleted()
    }
    
    @Signature
    default Memory isSucceeded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSucceeded()
    }
    
    @Signature
    default Memory isFailed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isFailed()
    }

    @Signature
    default void handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(completionHandler)
    }
    
    @Signature
    default void await(Environment __env__, Memory... args) {
        this.getWrappedObject().await()
    }

    @Signature
    default void await(Environment __env__, Memory... args) {
        this.getWrappedObject().await()
    }
    
    @Signature
    default void awaitSuccess(Environment __env__, Memory... args) {
        this.getWrappedObject().awaitSuccess()
    }

    @Signature
    default void awaitSuccess(Environment __env__, Memory... args) {
        this.getWrappedObject().awaitSuccess()
    }

}
