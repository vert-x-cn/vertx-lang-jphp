package io.vertx.php.ext.consul.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.consul.Watch;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WatchImpl")
@Namespace("io\\vertx\\php\\ext\\consul\\impl")
public class WatchImpl<T> extends VertxGenWrapper<io.vertx.ext.consul.Watch<T>> implements Watch<io.vertx.ext.consul.Watch<T>, T>{
    
    public WatchImpl(Environment env, io.vertx.ext.consul.Watch<T> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory key(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.key(key, vertx)
    }

    @Signature
    public static Memory keyPrefix(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.keyPrefix(keyPrefix, vertx)
    }

    @Signature
    public static Memory services(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.services(vertx)
    }

    @Signature
    public static Memory service(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.service(service, vertx)
    }

    @Signature
    public static Memory events(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.events(event, vertx)
    }

    @Signature
    public static Memory nodes(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.nodes(vertx)
    }

    @Signature
    public Memory setHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().setHandler(handler)
    }

}
