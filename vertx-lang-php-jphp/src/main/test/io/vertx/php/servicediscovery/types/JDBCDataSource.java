package io.vertx.php.servicediscovery.types;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.jdbc.JDBCClient;
import io.vertx.php.servicediscovery.ServiceDiscovery;
@Name("JDBCDataSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
public interface JDBCDataSource<S extends io.vertx.servicediscovery.types.JDBCDataSource> extends IWrapper<S>{

    @Signature
    static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.JDBCDataSource.createRecord(name, location, metadata)
    }

    @Signature
    static void getJDBCClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient(discovery, filter, resultHandler)
    }

}
