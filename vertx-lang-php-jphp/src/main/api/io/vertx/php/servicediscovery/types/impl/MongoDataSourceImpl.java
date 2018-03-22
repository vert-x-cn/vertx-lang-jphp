package io.vertx.php.servicediscovery.types.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.types.MongoDataSource;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MongoDataSourceImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\types\\impl")
public class MongoDataSourceImpl extends VertxGenWrapper<io.vertx.servicediscovery.types.MongoDataSource> implements MongoDataSource<io.vertx.servicediscovery.types.MongoDataSource>{
    
    public MongoDataSourceImpl(Environment env, io.vertx.servicediscovery.types.MongoDataSource wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.MongoDataSource.createRecord(name, location, metadata)
    }

    @Signature
    public static void getMongoClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.MongoDataSource.getMongoClient(discovery, filter, resultHandler)
    }

}
