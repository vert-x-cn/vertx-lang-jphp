package io.vertx.php.redis.sentinel;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("RedisSentinel")
@Namespace("io\\vertx\\php\\redis\\sentinel")
public interface RedisSentinel<S extends io.vertx.redis.sentinel.RedisSentinel> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RedisSentinelImpl::new, io.vertx.redis.sentinel.RedisSentinel.create(vertx, config)
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(handler)
    }

    @Signature
    default Memory masters(Environment __env__, Memory... args) {
        this.getWrappedObject().masters(handler)
    }

    @Signature
    default Memory master(Environment __env__, Memory... args) {
        this.getWrappedObject().master(name, handler)
    }

    @Signature
    default Memory slaves(Environment __env__, Memory... args) {
        this.getWrappedObject().slaves(name, handler)
    }

    @Signature
    default Memory sentinels(Environment __env__, Memory... args) {
        this.getWrappedObject().sentinels(name, handler)
    }

    @Signature
    default Memory getMasterAddrByName(Environment __env__, Memory... args) {
        this.getWrappedObject().getMasterAddrByName(name, handler)
    }

    @Signature
    default Memory reset(Environment __env__, Memory... args) {
        this.getWrappedObject().reset(pattern, handler)
    }

    @Signature
    default Memory failover(Environment __env__, Memory... args) {
        this.getWrappedObject().failover(name, handler)
    }

    @Signature
    default Memory ckquorum(Environment __env__, Memory... args) {
        this.getWrappedObject().ckquorum(name, handler)
    }

    @Signature
    default Memory flushConfig(Environment __env__, Memory... args) {
        this.getWrappedObject().flushConfig(handler)
    }

}
