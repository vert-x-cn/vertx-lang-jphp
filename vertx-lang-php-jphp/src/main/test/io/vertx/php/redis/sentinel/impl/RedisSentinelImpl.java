package io.vertx.php.redis.sentinel.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.redis.sentinel.RedisSentinel;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RedisSentinelImpl")
@Namespace("io\\vertx\\php\\redis\\sentinel\\impl")
public class RedisSentinelImpl extends VertxGenWrapper<io.vertx.redis.sentinel.RedisSentinel> implements RedisSentinel<io.vertx.redis.sentinel.RedisSentinel>{
    
    public RedisSentinelImpl(Environment env, io.vertx.redis.sentinel.RedisSentinel wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RedisSentinelImpl::new, io.vertx.redis.sentinel.RedisSentinel.create(vertx, config)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(handler)
    }

    @Signature
    public Memory masters(Environment __env__, Memory... args) {
        this.getWrappedObject().masters(handler)
    }

    @Signature
    public Memory master(Environment __env__, Memory... args) {
        this.getWrappedObject().master(name, handler)
    }

    @Signature
    public Memory slaves(Environment __env__, Memory... args) {
        this.getWrappedObject().slaves(name, handler)
    }

    @Signature
    public Memory sentinels(Environment __env__, Memory... args) {
        this.getWrappedObject().sentinels(name, handler)
    }

    @Signature
    public Memory getMasterAddrByName(Environment __env__, Memory... args) {
        this.getWrappedObject().getMasterAddrByName(name, handler)
    }

    @Signature
    public Memory reset(Environment __env__, Memory... args) {
        this.getWrappedObject().reset(pattern, handler)
    }

    @Signature
    public Memory failover(Environment __env__, Memory... args) {
        this.getWrappedObject().failover(name, handler)
    }

    @Signature
    public Memory ckquorum(Environment __env__, Memory... args) {
        this.getWrappedObject().ckquorum(name, handler)
    }

    @Signature
    public Memory flushConfig(Environment __env__, Memory... args) {
        this.getWrappedObject().flushConfig(handler)
    }

}
