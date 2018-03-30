package io.vertx.php.servicediscovery.types;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.http.HttpClient;
import io.vertx.php.ext.web.client.WebClient;
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
@Name("HttpEndpoint")
@Namespace("io\\vertx\\php\\servicediscovery\\types")
@SuppressWarnings("ALL")
public class HttpEndpoint extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.types.HttpEndpoint>{
    
    private HttpEndpoint(Environment env, io.vertx.servicediscovery.types.HttpEndpoint wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpEndpoint __create(Environment env, io.vertx.servicediscovery.types.HttpEndpoint wrappedObject){
        return new HttpEndpoint(env, wrappedObject);
    }

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.HttpEndpoint.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.HttpEndpoint.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamString(__ENV__, arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isJsonObject(__ENV__, arg4)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.HttpEndpoint.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamInteger(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamJsonObject(__ENV__, arg4)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createRecord(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isInteger(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isString(__ENV__, arg4) && Utils.isNotNull(arg5) && Utils.isJsonObject(__ENV__, arg5)) {
            return Utils.convReturnDataObject(__ENV__, io.vertx.servicediscovery.Record.class, Record::new, io.vertx.servicediscovery.types.HttpEndpoint.createRecord(Utils.convParamString(__ENV__, arg0), Utils.convParamBoolean(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamInteger(__ENV__, arg3), Utils.convParamString(__ENV__, arg4), Utils.convParamJsonObject(__ENV__, arg5)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void getClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClient, HttpClient>create0(HttpClient.class, HttpClient::__create), arg2));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClient, HttpClient>create0(HttpClient.class, HttpClient::__create), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static void getClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClient, HttpClient>create0(HttpClient.class, HttpClient::__create), arg3));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpClient, HttpClient>create0(HttpClient.class, HttpClient::__create), arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void getWebClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getWebClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.WebClient, WebClient>create0(WebClient.class, WebClient::__create), arg2));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getWebClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.WebClient, WebClient>create0(WebClient.class, WebClient::__create), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static void getWebClient(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isJsonObject(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getWebClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamJsonObject(__ENV__, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.WebClient, WebClient>create0(WebClient.class, WebClient::__create), arg3));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.servicediscovery.ServiceDiscovery.class, ServiceDiscovery.class, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            io.vertx.servicediscovery.types.HttpEndpoint.getWebClient(Utils.  <io.vertx.servicediscovery.ServiceDiscovery, ServiceDiscovery  >convParamVertxGenVariable0(__ENV__, ServiceDiscovery.class, ServiceDiscovery::__create, arg0), Utils.convParamFunction(__ENV__, DataObjectConverter.create(io.vertx.servicediscovery.Record.class), TypeConverter.BOOLEAN, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.WebClient, WebClient>create0(WebClient.class, WebClient::__create), arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
