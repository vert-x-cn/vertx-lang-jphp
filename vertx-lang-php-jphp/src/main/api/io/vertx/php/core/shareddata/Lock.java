package io.vertx.php.core.shareddata;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Lock")
@Namespace("io\\vertx\\php\\core\\shareddata")
public interface Lock<S extends io.vertx.core.shareddata.Lock> extends IWrapper<S>{
    
    @Signature
    default void release(Environment __env__, Memory... args) {
        this.getWrappedObject().release()
    }

}
