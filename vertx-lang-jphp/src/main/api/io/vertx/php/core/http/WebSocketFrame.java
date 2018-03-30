package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("WebSocketFrame")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class WebSocketFrame extends VertxGenVariable0Wrapper<io.vertx.core.http.WebSocketFrame>{
    
    private WebSocketFrame(Environment env, io.vertx.core.http.WebSocketFrame wrappedObject){
        super(env, wrappedObject);
    }
    public static  WebSocketFrame __create(Environment env, io.vertx.core.http.WebSocketFrame wrappedObject){
        return new WebSocketFrame(env, wrappedObject);
    }

    @Signature
    public static Memory binaryFrame(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.WebSocketFrame, WebSocketFrame>convReturnVertxGenVariable0(__ENV__, WebSocketFrame.class, WebSocketFrame::__create, io.vertx.core.http.WebSocketFrame.binaryFrame(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0), Utils.convParamBoolean(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory textFrame(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.WebSocketFrame, WebSocketFrame>convReturnVertxGenVariable0(__ENV__, WebSocketFrame.class, WebSocketFrame::__create, io.vertx.core.http.WebSocketFrame.textFrame(Utils.convParamString(__ENV__, arg0), Utils.convParamBoolean(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory pingFrame(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            return Utils.<io.vertx.core.http.WebSocketFrame, WebSocketFrame>convReturnVertxGenVariable0(__ENV__, WebSocketFrame.class, WebSocketFrame::__create, io.vertx.core.http.WebSocketFrame.pingFrame(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory pongFrame(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0)) {
            return Utils.<io.vertx.core.http.WebSocketFrame, WebSocketFrame>convReturnVertxGenVariable0(__ENV__, WebSocketFrame.class, WebSocketFrame::__create, io.vertx.core.http.WebSocketFrame.pongFrame(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory continuationFrame(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.buffer.Buffer.class, Buffer.class, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            return Utils.<io.vertx.core.http.WebSocketFrame, WebSocketFrame>convReturnVertxGenVariable0(__ENV__, WebSocketFrame.class, WebSocketFrame::__create, io.vertx.core.http.WebSocketFrame.continuationFrame(Utils.  <io.vertx.core.buffer.Buffer, Buffer  >convParamVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, arg0), Utils.convParamBoolean(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isText(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isText());
    }/*1*/

    @Signature
    public Memory isBinary(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isBinary());
    }/*1*/

    @Signature
    public Memory isContinuation(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isContinuation());
    }/*1*/

    @Signature
    public Memory isClose(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isClose());
    }/*1*/

    @Signature
    public Memory textData(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().textData());
    }/*1*/

    @Signature
    public Memory binaryData(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().binaryData());
    }/*1*/

    @Signature
    public Memory isFinal(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isFinal());
    }/*1*/

    @Signature
    public Memory closeStatusCode(Environment __ENV__) {
        return Utils.convReturnShort(__ENV__, this.getWrappedObject().closeStatusCode());
    }/*1*/

    @Signature
    public Memory closeReason(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().closeReason());
    }/*1*/

}
