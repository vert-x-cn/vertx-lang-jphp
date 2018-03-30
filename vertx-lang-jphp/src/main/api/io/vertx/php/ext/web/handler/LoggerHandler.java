package io.vertx.php.ext.web.handler;
import io.vertx.ext.web.handler.LoggerFormat;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("LoggerHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class LoggerHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.LoggerHandler>{
    
    private LoggerHandler(Environment env, io.vertx.ext.web.handler.LoggerHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  LoggerHandler __create(Environment env, io.vertx.ext.web.handler.LoggerHandler wrappedObject){
        return new LoggerHandler(env, wrappedObject);
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
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler>convReturnVertxGenVariable0(__ENV__, LoggerHandler.class, LoggerHandler::__create, io.vertx.ext.web.handler.LoggerHandler.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, LoggerFormat.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler>convReturnVertxGenVariable0(__ENV__, LoggerHandler.class, LoggerHandler::__create, io.vertx.ext.web.handler.LoggerHandler.create(Utils.convParamEnum(__ENV__, LoggerFormat.class, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isEnum(__ENV__, LoggerFormat.class, arg1)) {
            return Utils.<io.vertx.ext.web.handler.LoggerHandler, LoggerHandler>convReturnVertxGenVariable0(__ENV__, LoggerHandler.class, LoggerHandler::__create, io.vertx.ext.web.handler.LoggerHandler.create(Utils.convParamBoolean(__ENV__, arg0), Utils.convParamEnum(__ENV__, LoggerFormat.class, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
