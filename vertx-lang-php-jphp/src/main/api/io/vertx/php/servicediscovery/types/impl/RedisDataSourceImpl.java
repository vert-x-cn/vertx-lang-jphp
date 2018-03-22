package io.vertx.php.servicediscovery.types.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.types.RedisDataSource;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RedisDataSourceImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\types\\impl")
public class RedisDataSourceImpl extends VertxGenWrapper<io.vertx.servicediscovery.types.RedisDataSource> implements RedisDataSource<io.vertx.servicediscovery.types.RedisDataSource>{
    
    public RedisDataSourceImpl(Environment env, io.vertx.servicediscovery.types.RedisDataSource wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.RedisDataSource.createRecord(name, location, metadata)
    }

    @Signature
    public static void getRedisClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.RedisDataSource.getRedisClient(discovery, filter, resultHandler)
    }

}
