package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.HttpConnection;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.php.core.http.HttpServerFileUpload;
import io.vertx.php.core.http.HttpServerResponse;
import io.vertx.php.core.http.ServerWebSocket;
import io.vertx.php.core.net.NetSocket;
import io.vertx.php.core.net.SocketAddress;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServerRequest")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class HttpServerRequest extends VertxGenVariable0Wrapper<io.vertx.core.http.HttpServerRequest>{
    
    private HttpServerRequest(Environment env, io.vertx.core.http.HttpServerRequest wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpServerRequest __create(Environment env, io.vertx.core.http.HttpServerRequest wrappedObject){
        return new HttpServerRequest(env, wrappedObject);
    }

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
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
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
    public Memory method(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().method());
    }/*1*/

    @Signature
    public Memory rawMethod(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().rawMethod());
    }/*1*/

    @Signature
    public Memory isSSL(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSSL());
    }/*1*/

    @Signature
    public Memory scheme(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().scheme());
    }/*1*/

    @Signature
    public Memory uri(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().uri());
    }/*1*/

    @Signature
    public Memory path(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().path());
    }/*1*/

    @Signature
    public Memory query(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().query());
    }/*1*/

    @Signature
    public Memory host(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().host());
    }/*1*/

    @Signature
    public Memory bytesRead(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().bytesRead());
    }/*1*/

    @Signature
    public Memory response(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpServerResponse, HttpServerResponse>convReturnVertxGenVariable0(__ENV__, HttpServerResponse.class, HttpServerResponse::__create, this.getWrappedObject().response());
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
    public Memory params(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().params());
    }/*1*/

    @Signature
    public Memory getParam(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getParam(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remoteAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().remoteAddress());
    }/*1*/

    @Signature
    public Memory localAddress(Environment __ENV__) {
        return Utils.<io.vertx.core.net.SocketAddress, SocketAddress>convReturnVertxGenVariable0(__ENV__, SocketAddress.class, SocketAddress::__create, this.getWrappedObject().localAddress());
    }/*1*/

    @Signature
    public Memory absoluteURI(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().absoluteURI());
    }/*1*/

    @Signature
    public Memory bodyHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().bodyHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
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
    public Memory setExpectMultipart(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setExpectMultipart(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isExpectMultipart(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isExpectMultipart());
    }/*1*/

    @Signature
    public Memory uploadHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().uploadHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload>create0(HttpServerFileUpload.class, HttpServerFileUpload::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory formAttributes(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().formAttributes());
    }/*1*/

    @Signature
    public Memory getFormAttribute(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnString(__ENV__, this.getWrappedObject().getFormAttribute(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory upgrade(Environment __ENV__) {
        return Utils.<io.vertx.core.http.ServerWebSocket, ServerWebSocket>convReturnVertxGenVariable0(__ENV__, ServerWebSocket.class, ServerWebSocket::__create, this.getWrappedObject().upgrade());
    }/*1*/

    @Signature
    public Memory isEnded(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isEnded());
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
    public Memory connection(Environment __ENV__) {
        return Utils.<io.vertx.core.http.HttpConnection, HttpConnection>convReturnVertxGenVariable0(__ENV__, HttpConnection.class, HttpConnection::__create, this.getWrappedObject().connection());
    }/*1*/

}
