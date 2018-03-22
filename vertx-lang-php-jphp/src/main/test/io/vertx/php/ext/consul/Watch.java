package io.vertx.php.ext.consul;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.consul.WatchResult;
@Name("Watch")
@Namespace("io\\vertx\\php\\ext\\consul")
public interface Watch<S extends io.vertx.ext.consul.Watch<T>, T> extends IWrapper<S>{

    @Signature
    static Memory key(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.key(key, vertx)
    }

    @Signature
    static Memory keyPrefix(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.keyPrefix(keyPrefix, vertx)
    }

    @Signature
    static Memory services(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.services(vertx)
    }

    @Signature
    static Memory service(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.service(service, vertx)
    }

    @Signature
    static Memory events(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.events(event, vertx)
    }

    @Signature
    static Memory nodes(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WatchImpl::new, io.vertx.ext.consul.Watch.nodes(vertx)
    }

    @Signature
    default Memory setHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().setHandler(handler)
    }
    
    @Signature
    default Memory start(Environment __env__, Memory... args) {
        this.getWrappedObject().start()
    }
    
    @Signature
    default void stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop()
    }

}
