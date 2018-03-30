package io.vertx.php.servicediscovery.types;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.servicediscovery.Record;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import java.lang.Class;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("EventBusService")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
@SuppressWarnings("ALL")
public class EventBusService extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.types.EventBusService>{
    
    private EventBusService(Environment env, io.vertx.servicediscovery.types.EventBusService wrappedObject){
        super(env, wrappedObject);
    }
    public static  EventBusService __create(Environment env, io.vertx.servicediscovery.types.EventBusService wrappedObject){
        return new EventBusService(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.EventBusService.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isJsonObject(__ENV__, arg3)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.EventBusService.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamJsonObject(__ENV__, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory getServiceProxy(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isClassType(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.convReturnVariable(__ENV__, io.vertx.servicediscovery.types.EventBusService.getServiceProxy(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamClassType(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory getServiceProxyWithJsonFilter(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isClassType(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            return Utils.convReturnVariable(__ENV__, io.vertx.servicediscovery.types.EventBusService.getServiceProxyWithJsonFilter(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamClassType(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
