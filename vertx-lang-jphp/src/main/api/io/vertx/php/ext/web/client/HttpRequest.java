package io.vertx.php.ext.web.client;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.ext.web.codec.BodyCodec;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("HttpRequest")
@Namespace("io\\vertx\\php\\ext\\web\\client")
@SuppressWarnings("ALL")
public class HttpRequest<T> extends VertxGenVariable1Wrapper<io.vertx.ext.web.client.HttpRequest<T>,T>{
    
    private HttpRequest(Environment env, io.vertx.ext.web.client.HttpRequest<T> wrappedObject, TypeConverter<T> httpRequestVariableTConverter){
        super(env, wrappedObject, httpRequestVariableTConverter);
    }
    public static <T> HttpRequest<T> __create(Environment env, io.vertx.ext.web.client.HttpRequest<T> wrappedObject, TypeConverter<T> httpRequestVariableTConverter){
        return new HttpRequest<>(env, wrappedObject, httpRequestVariableTConverter);
    }

    public static HttpRequest<Object> __create(Environment env, io.vertx.ext.web.client.HttpRequest<Object> wrappedObject) {
        return new HttpRequest<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getHttpRequestVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setHttpRequestVariableTConverter(TypeConverter<T> httpRequestVariableTConverter) {
        this.setTypeConverter1(httpRequestVariableTConverter);
    }

    @Signature
    public Memory method(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0)) {
            this.getWrappedObject().method(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory port(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().port(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory as(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.codec.BodyCodec.class, BodyCodec.class, arg0)) {
            return Utils.<io.vertx.ext.web.client.HttpRequest<Object>, HttpRequest<Object>, Object>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().as(Utils.  <io.vertx.ext.web.codec.BodyCodec<Object>, BodyCodec<Object>  , Object  >convParamVertxGenVariable1(__ENV__, BodyCodec.class, BodyCodec::__create,  TypeConverter.UNKNOWN_TYPE, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory host(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().host(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory virtualHost(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().virtualHost(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory uri(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().uri(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory putHeader(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().putHeader(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory headers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().headers());
    }/*1*/

    @Signature
    public Memory ssl(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().ssl(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory timeout(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            this.getWrappedObject().timeout(Utils.convParamLong(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addQueryParam(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().addQueryParam(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setQueryParam(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().setQueryParam(Utils.convParamString(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory followRedirects(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().followRedirects(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory queryParams(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().queryParams());
    }/*1*/

    @Signature
    public Memory copy(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.client.HttpRequest<T>, HttpRequest<T>, T>convReturnVertxGenVariable1(__ENV__, HttpRequest.class, HttpRequest::__create, getHttpRequestVariableTConverter(), this.getWrappedObject().copy());
    }/*1*/

    @Signature
    public void sendStream(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sendStream(Utils.  <io.vertx.core.streams.ReadStream<io.vertx.core.buffer.Buffer>, ReadStream<io.vertx.core.buffer.Buffer>  , io.vertx.core.buffer.Buffer  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.HttpResponse<T>, HttpResponse<T>, T>create1(HttpResponse.class, HttpResponse::__create, getHttpRequestVariableTConverter()), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void sendBuffer(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sendBuffer(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.HttpResponse<T>, HttpResponse<T>, T>create1(HttpResponse.class, HttpResponse::__create, getHttpRequestVariableTConverter()), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void sendJsonObject(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sendJsonObject(Utils.convParamJsonObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.HttpResponse<T>, HttpResponse<T>, T>create1(HttpResponse.class, HttpResponse::__create, getHttpRequestVariableTConverter()), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void sendJson(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sendJson(Utils.convParamObject(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.HttpResponse<T>, HttpResponse<T>, T>create1(HttpResponse.class, HttpResponse::__create, getHttpRequestVariableTConverter()), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void sendForm(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.MultiMap.class, MultiMap.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().sendForm(Utils.  <io.vertx.core.MultiMap, MultiMap  >convParamVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.HttpResponse<T>, HttpResponse<T>, T>create1(HttpResponse.class, HttpResponse::__create, getHttpRequestVariableTConverter()), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void send(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().send(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.client.HttpResponse<T>, HttpResponse<T>, T>create1(HttpResponse.class, HttpResponse::__create, getHttpRequestVariableTConverter()), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
