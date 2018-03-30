package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpClientRequest;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.php.core.net.NetSocket;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpClientResponse")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class HttpClientResponse extends VertxGenVariable0Wrapper<io.vertx.core.http.HttpClientResponse>{
    
    private HttpClientResponse(Environment env, io.vertx.core.http.HttpClientResponse wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpClientResponse __create(Environment env, io.vertx.core.http.HttpClientResponse wrappedObject){
        return new HttpClientResponse(env, wrappedObject);
    }

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

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
    public Memory getTrailer(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getTrailer(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory trailers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().trailers());
    }/*1*/

    @Signature
    public Memory cookies(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().cookies());
    }/*1*/

    @Signature
    public Memory bodyHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().bodyHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory customFrameHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().customFrameHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpFrame, HttpFrame>create0(HttpFrame.class, HttpFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory netSocket(Environment __ENV__) {
        return Utils.<io.vertx.core.net.NetSocket, NetSocket>convReturnVertxGenVariable0(__ENV__, NetSocket.class, NetSocket::__create, this.getWrappedObject().netSocket());
    }/*1*/

    @Signature
    public Memory request(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpClientRequest, HttpClientRequest>convReturnVertxGenVariable0(__ENV__, HttpClientRequest.class, HttpClientRequest::__create, this.getWrappedObject().request());
    }/*1*/

}
