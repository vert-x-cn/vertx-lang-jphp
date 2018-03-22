package io.vertx.php.servicediscovery.spi;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("ServicePublisher")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
public interface ServicePublisher<S extends io.vertx.servicediscovery.spi.ServicePublisher> extends IWrapper<S>{

    @Signature
    default void publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(record, resultHandler)
    }

    @Signature
    default void unpublish(Environment __env__, Memory... args) {
        this.getWrappedObject().unpublish(id, resultHandler)
    }

    @Signature
    default void update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(record, resultHandler)
    }

}
