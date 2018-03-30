package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.MultiMap;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.SocketAddress;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ServerWebSocket")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class ServerWebSocket extends VertxGenVariable0Wrapper<io.vertx.core.http.ServerWebSocket>{
    
    private ServerWebSocket(Environment env, io.vertx.core.http.ServerWebSocket wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServerWebSocket __create(Environment env, io.vertx.core.http.ServerWebSocket wrappedObject){
        return new ServerWebSocket(env, wrappedObject);
    }

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*4*/

    @Signature
    public void end(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().end(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeQueueFull(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().writeQueueFull());
    }/*1*/

    @Signature
    public Memory binaryHandlerID(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().binaryHandlerID());
    }/*1*/

    @Signature
    public Memory textHandlerID(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().textHandlerID());
    }/*1*/

    @Signature
    public Memory subProtocol(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().subProtocol());
    }/*1*/

    @Signature
    public Memory writeTextMessage(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().writeTextMessage(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writePing(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().writePing(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writePong(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().writePong(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory textMessageHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().textMessageHandler(Utils.convParamHandler(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory binaryMessageHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().binaryMessageHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pongHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().pongHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
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
        if(Utils.isNotNull(arg0) && Utils.isShort(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamShort(__ENV__, arg0));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void close(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isShort(__ENV__, arg0) && Utils.isString(__ENV__, arg1)) {
            this.getWrappedObject().close(Utils.convParamShort(__ENV__, arg0), Utils.convParamString(__ENV__, arg1));
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
    public Memory isSsl(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSsl());
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
    public Memory write(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().write(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setWriteQueueMaxSize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setWriteQueueMaxSize(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory drainHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().drainHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeFrame(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.http.WebSocketFrame.class, WebSocketFrame.class, arg0)) {
            this.getWrappedObject().writeFrame(Utils.  <io.vertx.core.http.WebSocketFrame, WebSocketFrame  >convParamVertxGenVariable0(__ENV__, WebSocketFrame.class, WebSocketFrame::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeFinalTextFrame(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().writeFinalTextFrame(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeFinalBinaryFrame(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().writeFinalBinaryFrame(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory writeBinaryMessage(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            this.getWrappedObject().writeBinaryMessage(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory frameHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().frameHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.WebSocketFrame, WebSocketFrame>create0(WebSocketFrame.class, WebSocketFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
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
    public Memory headers(Environment __ENV__) {
        return Utils.<io.vertx.core.MultiMap, MultiMap>convReturnVertxGenVariable0(__ENV__, MultiMap.class, MultiMap::__create, this.getWrappedObject().headers());
    }/*1*/

    @Signature
    public void accept(Environment __ENV__) {
        this.getWrappedObject().accept();
    }/*1*/

    @Signature
    public void reject(Environment __ENV__) {
        this.getWrappedObject().reject();
    }/*4*/

    @Signature
    public void reject(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().reject(Utils.convParamInteger(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
