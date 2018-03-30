package io.vertx.php.servicediscovery.types;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.eventbus.MessageConsumer;
import io.vertx.php.servicediscovery.Record;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MessageSource")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
@SuppressWarnings("ALL")
public class MessageSource extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.types.MessageSource>{
    
    private MessageSource(Environment env, io.vertx.servicediscovery.types.MessageSource wrappedObject){
        super(env, wrappedObject);
    }
    public static  MessageSource __create(Environment env, io.vertx.servicediscovery.types.MessageSource wrappedObject){
        return new MessageSource(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.MessageSource.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.MessageSource.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isJsonObject(__ENV__, arg3)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.MessageSource.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamJsonObject(__ENV__, arg3)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void getConsumer(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.MessageSource.getConsumer(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>create1(MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE), arg2));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.MessageSource.getConsumer(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.eventbus.MessageConsumer<Object>, MessageConsumer<Object>, Object>create1(MessageConsumer.class, MessageConsumer::__create, TypeConverter.UNKNOWN_TYPE), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
