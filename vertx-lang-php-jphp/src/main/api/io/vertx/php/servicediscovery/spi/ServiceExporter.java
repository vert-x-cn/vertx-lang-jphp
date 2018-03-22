package io.vertx.php.servicediscovery.spi;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;
import io.vertx.php.servicediscovery.spi.ServicePublisher;
@Name("ServiceExporter")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
public interface ServiceExporter<S extends io.vertx.servicediscovery.spi.ServiceExporter> extends IWrapper<S>{

    @Signature
    default void init(Environment __env__, Memory... args) {
        this.getWrappedObject().init(vertx, publisher, configuration, future)
    }

    @Signature
    default void onPublish(Environment __env__, Memory... args) {
        this.getWrappedObject().onPublish(record)
    }

    @Signature
    default void onUpdate(Environment __env__, Memory... args) {
        this.getWrappedObject().onUpdate(record)
    }

    @Signature
    default void onUnpublish(Environment __env__, Memory... args) {
        this.getWrappedObject().onUnpublish(id)
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(closeHandler)
    }

}
