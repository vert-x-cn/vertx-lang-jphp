package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.http.ServerWebSocket;
import io.vertx.php.core.net.NetServer;
import io.vertx.php.ext.stomp.ServerFrame;
import io.vertx.php.ext.stomp.StompServerHandler;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("StompServer")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class StompServer extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.StompServer>{
    
    private StompServer(Environment env, io.vertx.ext.stomp.StompServer wrappedObject){
        super(env, wrappedObject);
    }
    public static  StompServer __create(Environment env, io.vertx.ext.stomp.StompServer wrappedObject){
        return new StompServer(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.stomp.StompServer, StompServer>convReturnVertxGenVariable0(__ENV__, StompServer.class, StompServer::__create, io.vertx.ext.stomp.StompServer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.StompServerOptions.class, arg1)) {
            return Utils.<io.vertx.ext.stomp.StompServer, StompServer>convReturnVertxGenVariable0(__ENV__, StompServer.class, StompServer::__create, io.vertx.ext.stomp.StompServer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.StompServerOptions.class, arg1)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.net.NetServer.class, NetServer.class, arg1)) {
            return Utils.<io.vertx.ext.stomp.StompServer, StompServer>convReturnVertxGenVariable0(__ENV__, StompServer.class, StompServer::__create, io.vertx.ext.stomp.StompServer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.core.net.NetServer, NetServer  >convParamVertxGenVariable0(__ENV__, NetServer.class, NetServer::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.net.NetServer.class, NetServer.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.ext.stomp.StompServerOptions.class, arg2)) {
            return Utils.<io.vertx.ext.stomp.StompServer, StompServer>convReturnVertxGenVariable0(__ENV__, StompServer.class, StompServer::__create, io.vertx.ext.stomp.StompServer.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.core.net.NetServer, NetServer  >convParamVertxGenVariable0(__ENV__, NetServer.class, NetServer::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.ext.stomp.StompServerOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.stomp.StompServerHandler.class, StompServerHandler.class, arg0)) {
            this.getWrappedObject().handler(Utils.  <io.vertx.ext.stomp.StompServerHandler, StompServerHandler  >convParamVertxGenVariable0(__ENV__, StompServerHandler.class, StompServerHandler::__create, arg0));
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
            this.getWrappedObject().listen(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompServer, StompServer>create0(StompServer.class, StompServer::__create), arg0));
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
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompServer, StompServer>create0(StompServer.class, StompServer::__create), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory listen(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().listen(Utils.convParamInteger(__ENV__, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.StompServer, StompServer>create0(StompServer.class, StompServer::__create), arg2));
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
    public Memory isListening(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isListening());
    }/*1*/

    @Signature
    public Memory actualPort(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().actualPort());
    }/*1*/

    @Signature
    public Memory options(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.ext.stomp.StompServerOptions.class, StompServerOptions::new, this.getWrappedObject().options());
    }/*1*/

    @Signature
    public Memory vertx(Environment __ENV__) {
        return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, this.getWrappedObject().vertx());
    }/*1*/

    @Signature
    public Memory stompHandler(Environment __ENV__) {
        return Utils.<io.vertx.ext.stomp.StompServerHandler, StompServerHandler>convReturnVertxGenVariable0(__ENV__, StompServerHandler.class, StompServerHandler::__create, this.getWrappedObject().stompHandler());
    }/*1*/

    @Signature
    public Memory webSocketHandler(Environment __ENV__) {
        return Utils.convReturnHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.http.ServerWebSocket, ServerWebSocket>create0(ServerWebSocket.class, ServerWebSocket::__create),this.getWrappedObject().webSocketHandler());
    }/*1*/

    @Signature
    public Memory writingFrameHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().writingFrameHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.stomp.ServerFrame, ServerFrame>create0(ServerFrame.class, ServerFrame::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
