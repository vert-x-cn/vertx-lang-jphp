package io.vertx.php.servicediscovery.types;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.mongo.MongoClient;
import io.vertx.php.servicediscovery.ServiceDiscovery;
@Name("MongoDataSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
public interface MongoDataSource<S extends io.vertx.servicediscovery.types.MongoDataSource> extends IWrapper<S>{

    @Signature
    static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.MongoDataSource.createRecord(name, location, metadata)
    }

    @Signature
    static void getMongoClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.MongoDataSource.getMongoClient(discovery, filter, resultHandler)
    }

}
