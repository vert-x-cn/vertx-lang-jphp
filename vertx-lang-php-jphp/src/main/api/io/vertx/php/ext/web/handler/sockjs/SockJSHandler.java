package io.vertx.php.ext.web.handler.sockjs;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.Router;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.web.handler.sockjs.BridgeEvent;
import io.vertx.php.ext.web.handler.sockjs.SockJSSocket;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SockJSHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
@SuppressWarnings("ALL")
public class SockJSHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.sockjs.SockJSHandler>{
    
    private SockJSHandler(Environment env, io.vertx.ext.web.handler.sockjs.SockJSHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  SockJSHandler __create(Environment env, io.vertx.ext.web.handler.sockjs.SockJSHandler wrappedObject){
        return new SockJSHandler(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.sockjs.SockJSHandler, SockJSHandler>convReturnVertxGenVariable0(__ENV__, SockJSHandler.class, SockJSHandler::__create, io.vertx.ext.web.handler.sockjs.SockJSHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isDataObject(__ENV__, io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions.class, arg1)) {
            return Utils.<io.vertx.ext.web.handler.sockjs.SockJSHandler, SockJSHandler>convReturnVertxGenVariable0(__ENV__, SockJSHandler.class, SockJSHandler::__create, io.vertx.ext.web.handler.sockjs.SockJSHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamDataObject(__ENV__, io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static void installTestApplications(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.Router.class, Router.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1)) {
            io.vertx.ext.web.handler.sockjs.SockJSHandler.installTestApplications(Utils.  <io.vertx.ext.web.Router, Router  >convParamVertxGenVariable0(__ENV__, Router.class, Router::__create, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory socketHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().socketHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.handler.sockjs.SockJSSocket, SockJSSocket>create0(SockJSSocket.class, SockJSSocket::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory bridge(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.web.handler.sockjs.BridgeOptions.class, arg0)) {
            this.getWrappedObject().bridge(Utils.convParamDataObject(__ENV__, io.vertx.ext.web.handler.sockjs.BridgeOptions.class, arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory bridge(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.ext.web.handler.sockjs.BridgeOptions.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().bridge(Utils.convParamDataObject(__ENV__, io.vertx.ext.web.handler.sockjs.BridgeOptions.class, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.handler.sockjs.BridgeEvent, BridgeEvent>create0(BridgeEvent.class, BridgeEvent::__create), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
