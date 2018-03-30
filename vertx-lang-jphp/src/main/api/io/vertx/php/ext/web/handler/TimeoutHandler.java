package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("TimeoutHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class TimeoutHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.TimeoutHandler>{
    
    private TimeoutHandler(Environment env, io.vertx.ext.web.handler.TimeoutHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  TimeoutHandler __create(Environment env, io.vertx.ext.web.handler.TimeoutHandler wrappedObject){
        return new TimeoutHandler(env, wrappedObject);
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
        return Utils.<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler>convReturnVertxGenVariable0(__ENV__, TimeoutHandler.class, TimeoutHandler::__create, io.vertx.ext.web.handler.TimeoutHandler.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler>convReturnVertxGenVariable0(__ENV__, TimeoutHandler.class, TimeoutHandler::__create, io.vertx.ext.web.handler.TimeoutHandler.create(Utils.convParamLong(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isInteger(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.handler.TimeoutHandler, TimeoutHandler>convReturnVertxGenVariable0(__ENV__, TimeoutHandler.class, TimeoutHandler::__create, io.vertx.ext.web.handler.TimeoutHandler.create(Utils.convParamLong(__ENV__, arg0), Utils.convParamInteger(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
