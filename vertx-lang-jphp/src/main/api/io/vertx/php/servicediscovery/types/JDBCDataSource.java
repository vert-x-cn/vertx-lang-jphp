package io.vertx.php.servicediscovery.types;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.jdbc.JDBCClient;
import io.vertx.php.servicediscovery.Record;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("JDBCDataSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
@SuppressWarnings("ALL")
public class JDBCDataSource extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.types.JDBCDataSource>{
    
    private JDBCDataSource(Environment env, io.vertx.servicediscovery.types.JDBCDataSource wrappedObject){
        super(env, wrappedObject);
    }
    public static  JDBCDataSource __create(Environment env, io.vertx.servicediscovery.types.JDBCDataSource wrappedObject){
        return new JDBCDataSource(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.JDBCDataSource.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void getJDBCClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.jdbc.JDBCClient, JDBCClient>create0(JDBCClient.class, JDBCClient::__create), arg2));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.jdbc.JDBCClient, JDBCClient>create0(JDBCClient.class, JDBCClient::__create), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static void getJDBCClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.jdbc.JDBCClient, JDBCClient>create0(JDBCClient.class, JDBCClient::__create), arg3));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.jdbc.JDBCClient, JDBCClient>create0(JDBCClient.class, JDBCClient::__create), arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
