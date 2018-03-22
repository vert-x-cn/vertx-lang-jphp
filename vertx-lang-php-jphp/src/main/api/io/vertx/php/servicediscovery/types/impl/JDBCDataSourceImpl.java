package io.vertx.php.servicediscovery.types.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.types.JDBCDataSource;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JDBCDataSourceImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\types\\impl")
public class JDBCDataSourceImpl extends VertxGenWrapper<io.vertx.servicediscovery.types.JDBCDataSource> implements JDBCDataSource<io.vertx.servicediscovery.types.JDBCDataSource>{
    
    public JDBCDataSourceImpl(Environment env, io.vertx.servicediscovery.types.JDBCDataSource wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.servicediscovery.types.JDBCDataSource.createRecord(name, location, metadata)
    }

    @Signature
    public static void getJDBCClient(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient(discovery, filter, resultHandler)
    }

}
