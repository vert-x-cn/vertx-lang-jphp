package io.vertx.php.servicediscovery.types;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.servicediscovery.ServiceDiscovery;
@Name("EventBusService")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
public interface EventBusService<S extends io.vertx.servicediscovery.types.EventBusService> extends IWrapper<S>{

    @Signature
    static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.EventBusService.createRecord(name, address, classname)
    }

    @Signature
    static Memory getServiceProxy(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.EventBusService.getServiceProxy(discovery, filter, clientClass, resultHandler)
    }

    @Signature
    static Memory getServiceProxyWithJsonFilter(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.EventBusService.getServiceProxyWithJsonFilter(discovery, filter, clientClass, resultHandler)
    }

}
