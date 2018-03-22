package io.vertx.php.servicediscovery.spi;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.Future;
import io.vertx.php.servicediscovery.spi.ServicePublisher;
@Name("ServiceImporter")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
public interface ServiceImporter<S extends io.vertx.servicediscovery.spi.ServiceImporter> extends IWrapper<S>{

    @Signature
    default void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start(vertx, publisher, configuration, future)
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(closeHandler)
    }

}
