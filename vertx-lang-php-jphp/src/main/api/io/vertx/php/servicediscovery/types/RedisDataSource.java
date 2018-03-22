package io.vertx.php.servicediscovery.types;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.redis.RedisClient;
import io.vertx.php.servicediscovery.ServiceDiscovery;
@Name("RedisDataSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
public interface RedisDataSource<S extends io.vertx.servicediscovery.types.RedisDataSource> extends IWrapper<S>{

    @Signature
    static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.RedisDataSource.createRecord(name, location, metadata)
    }

    @Signature
    static void getRedisClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.RedisDataSource.getRedisClient(discovery, filter, resultHandler)
    }

}
