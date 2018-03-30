package io.vertx.php.ext.web.client;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpResponse")
@Namespace("io\\vertx\\php\\ext\\web\\client")
@SuppressWarnings("ALL")
public class HttpResponse<T> extends VertxGenVariable1Wrapper<io.vertx.ext.web.client.HttpResponse<T>,T>{
    
    private HttpResponse(Environment env, io.vertx.ext.web.client.HttpResponse<T> wrappedObject, TypeConverter<T> httpResponseVariableTConverter){
        super(env, wrappedObject, httpResponseVariableTConverter);
    }
    public static <T> HttpResponse<T> __create(Environment env, io.vertx.ext.web.client.HttpResponse<T> wrappedObject, TypeConverter<T> httpResponseVariableTConverter){
        return new HttpResponse<>(env, wrappedObject, httpResponseVariableTConverter);
    }

    public static HttpResponse<Object> __create(Environment env, io.vertx.ext.web.client.HttpResponse<Object> wrappedObject) {
        return new HttpResponse<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getHttpResponseVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setHttpResponseVariableTConverter(TypeConverter<T> httpResponseVariableTConverter) {
        this.setTypeConverter1(httpResponseVariableTConverter);
    }

    @Signature
    public Memory version(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().version());
    }/*1*/

    @Signature
    public Memory statusCode(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().statusCode());
    }/*1*/

    @Signature
    public Memory statusMessage(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().statusMessage());
    }/*1*/

    @Signature
    public Memory headers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().headers());
    }/*1*/

    @Signature
    public Memory getHeader(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getHeader(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory trailers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().trailers());
    }/*1*/

    @Signature
    public Memory getTrailer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getTrailer(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory cookies(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().cookies());
    }/*1*/

    @Signature
    public Memory body(Environment __ENV__) {
        return getHttpResponseVariableTConverter().convReturn(__ENV__, this.getWrappedObject().body());
    }/*1*/

    @Signature
    public Memory bodyAsBuffer(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().bodyAsBuffer());
    }/*1*/

    @Signature
    public Memory bodyAsString(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().bodyAsString());
    }/*4*/

    @Signature
    public Memory bodyAsString(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().bodyAsString(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bodyAsJsonObject(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().bodyAsJsonObject());
    }/*1*/

    @Signature
    public Memory bodyAsJsonArray(Environment __ENV__) {
        return Utils.convReturnJsonArray(__ENV__, this.getWrappedObject().bodyAsJsonArray());
    }/*1*/

    @Signature
    public Memory bodyAsJson(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isClassType(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().bodyAsJson(Utils.convParamClassType(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
