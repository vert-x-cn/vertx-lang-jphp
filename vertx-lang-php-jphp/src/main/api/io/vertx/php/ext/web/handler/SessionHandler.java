package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.web.sstore.SessionStore;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SessionHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class SessionHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.SessionHandler>{
    
    private SessionHandler(Environment env, io.vertx.ext.web.handler.SessionHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  SessionHandler __create(Environment env, io.vertx.ext.web.handler.SessionHandler wrappedObject){
        return new SessionHandler(env, wrappedObject);
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.sstore.SessionStore.class, SessionStore.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.SessionHandler, SessionHandler>convReturnVertxGenVariable0(__ENV__, SessionHandler.class, SessionHandler::__create, io.vertx.ext.web.handler.SessionHandler.create(Utils.  <io.vertx.ext.web.sstore.SessionStore, SessionStore  >convParamVertxGenVariable0(__ENV__, SessionStore.class, SessionStore::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setSessionTimeout(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            this.getWrappedObject().setSessionTimeout(Utils.convParamLong(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setNagHttps(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setNagHttps(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setCookieSecureFlag(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setCookieSecureFlag(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setCookieHttpOnlyFlag(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().setCookieHttpOnlyFlag(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setSessionCookieName(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setSessionCookieName(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setMinLength(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setMinLength(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
