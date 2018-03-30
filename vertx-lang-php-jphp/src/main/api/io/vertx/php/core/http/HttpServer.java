package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.http.HttpConnection;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.php.core.http.ServerWebSocket;
import io.vertx.php.core.metrics.Measured;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServer")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class HttpServer extends VertxGenVariable0Wrapper<io.vertx.core.http.HttpServer>{
    
    private HttpServer(Environment env, io.vertx.core.http.HttpServer wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpServer __create(Environment env, io.vertx.core.http.HttpServer wrappedObject){
        return new HttpServer(env, wrappedObject);
    }

    @Signature
    public Memory isMetricsEnabled(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMetricsEnabled());
    }/*1*/

    @Signature
    public Memory requestStream(Environment __ENV__) {
        return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.HttpServerRequest>, ReadStream<io.vertx.core.http.HttpServerRequest>, io.vertx.core.http.HttpServerRequest>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.HttpServerRequest, HttpServerRequest>create0(HttpServerRequest.class, HttpServerRequest::__create), this.getWrappedObject().requestStream());
    }/*1*/

    @Signature
    public Memory requestHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().requestHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpServerRequest, HttpServerRequest>create0(HttpServerRequest.class, HttpServerRequest::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory connectionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().connectionHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpConnection, HttpConnection>create0(HttpConnection.class, HttpConnection::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory websocketStream(Environment __ENV__) {
        return Utils.<io.vertx.core.streams.ReadStream<io.vertx.core.http.ServerWebSocket>, ReadStream<io.vertx.core.http.ServerWebSocket>, io.vertx.core.http.ServerWebSocket>convReturnVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create, VertxGenVariable0Converter.<io.vertx.core.http.ServerWebSocket, ServerWebSocket>create0(ServerWebSocket.class, ServerWebSocket::__create), this.getWrappedObject().websocketStream());
    }/*1*/

    @Signature
    public Memory websocketHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().websocketHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.ServerWebSocket, ServerWebSocket>create0(ServerWebSocket.class, ServerWebSocket::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory listen(Environment __ENV__) {
        this.getWrappedObject().listen();
        return toMemory();
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().listen(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpServer, HttpServer>create0(HttpServer.class, HttpServer::__create), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
            return toMemory();
        } else if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpServer, HttpServer>create0(HttpServer.class, HttpServer::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.HttpServer, HttpServer>create0(HttpServer.class, HttpServer::__create), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory actualPort(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().actualPort());
    }/*1*/

}
