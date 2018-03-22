package io.vertx.php.servicediscovery.types.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.types.EventBusService;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("EventBusServiceImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\types\\impl")
public class EventBusServiceImpl extends VertxGenWrapper<io.vertx.servicediscovery.types.EventBusService> implements EventBusService<io.vertx.servicediscovery.types.EventBusService>{
    
    public EventBusServiceImpl(Environment env, io.vertx.servicediscovery.types.EventBusService wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.EventBusService.createRecord(name, address, classname)
    }

    @Signature
    public static Memory getServiceProxy(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.EventBusService.getServiceProxy(discovery, filter, clientClass, resultHandler)
    }

    @Signature
    public static Memory getServiceProxyWithJsonFilter(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.EventBusService.getServiceProxyWithJsonFilter(discovery, filter, clientClass, resultHandler)
    }

}
