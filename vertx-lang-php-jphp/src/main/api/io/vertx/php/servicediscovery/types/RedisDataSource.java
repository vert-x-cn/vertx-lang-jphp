package io.vertx.php.servicediscovery.types;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.redis.RedisClient;
import io.vertx.php.servicediscovery.Record;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RedisDataSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
@SuppressWarnings("ALL")
public class RedisDataSource extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.types.RedisDataSource>{
    
    private RedisDataSource(Environment env, io.vertx.servicediscovery.types.RedisDataSource wrappedObject){
        super(env, wrappedObject);
    }
    public static  RedisDataSource __create(Environment env, io.vertx.servicediscovery.types.RedisDataSource wrappedObject){
        return new RedisDataSource(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.RedisDataSource.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void getRedisClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.RedisDataSource.getRedisClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.redis.RedisClient, RedisClient>create0(RedisClient.class, RedisClient::__create), arg2));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.RedisDataSource.getRedisClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.redis.RedisClient, RedisClient>create0(RedisClient.class, RedisClient::__create), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static void getRedisClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.RedisDataSource.getRedisClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.redis.RedisClient, RedisClient>create0(RedisClient.class, RedisClient::__create), arg3));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.RedisDataSource.getRedisClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.redis.RedisClient, RedisClient>create0(RedisClient.class, RedisClient::__create), arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
