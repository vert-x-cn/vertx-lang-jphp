package io.vertx.php.servicediscovery;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("ServiceReference")
@Namespace("io\\vertx\\php\\servicediscovery")
public interface ServiceReference<S extends io.vertx.servicediscovery.ServiceReference> extends IWrapper<S>{
    
    @Signature
    default Memory record(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().record()
    }
    
    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get()
    }

    @Signature
    default Memory getAs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getAs(x)
    }

    @Signature
    default Memory cachedAs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cachedAs(x)
    }
    
    @Signature
    default Memory cached(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cached()
    }
    
    @Signature
    default void release(Environment __env__, Memory... args) {
        this.getWrappedObject().release()
    }

    @Signature
    default Memory isHolding(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isHolding(object)
    }

}
