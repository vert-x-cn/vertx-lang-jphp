package io.vertx.php.servicediscovery.types;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import io.vertx.php.core.eventbus.MessageConsumer;
@Name("MessageSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
public interface MessageSource<S extends io.vertx.servicediscovery.types.MessageSource> extends IWrapper<S>{

    @Signature
    static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.MessageSource.createRecord(name, address)
    }

    @Signature
    static void getConsumer(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.MessageSource.getConsumer(discovery, filter, resultHandler)
    }

}
