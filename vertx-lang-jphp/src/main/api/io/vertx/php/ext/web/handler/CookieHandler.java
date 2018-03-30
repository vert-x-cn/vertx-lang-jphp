package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CookieHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class CookieHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.CookieHandler>{
    
    private CookieHandler(Environment env, io.vertx.ext.web.handler.CookieHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  CookieHandler __create(Environment env, io.vertx.ext.web.handler.CookieHandler wrappedObject){
        return new CookieHandler(env, wrappedObject);
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
        return Utils.<io.vertx.ext.web.handler.CookieHandler, CookieHandler>convReturnVertxGenVariable0(__ENV__, CookieHandler.class, CookieHandler::__create, io.vertx.ext.web.handler.CookieHandler.create());
    }/*1*/

}
