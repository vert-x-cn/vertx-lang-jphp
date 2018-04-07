package io.vertx.php.ext.web.handler;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.web.handler.AuthHandler;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RedirectAuthHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class RedirectAuthHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.RedirectAuthHandler>{
    
    private RedirectAuthHandler(Environment env, io.vertx.ext.web.handler.RedirectAuthHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  RedirectAuthHandler __create(Environment env, io.vertx.ext.web.handler.RedirectAuthHandler wrappedObject){
        return new RedirectAuthHandler(env, wrappedObject);
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
    public Memory addAuthority(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().addAuthority(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory addAuthorities(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().addAuthorities(Utils.convParamSet(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void parseCredentials(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().parseCredentials(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.JSON_OBJECT, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void authorize(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.User.class, User.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().authorize(Utils.  <io.vertx.ext.auth.User, User  >convParamVertxGenVariable0(__ENV__, User.class, User::__create, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.AuthHandler, AuthHandler>convReturnVertxGenVariable0(__ENV__, AuthHandler.class, AuthHandler::__create, io.vertx.ext.web.handler.RedirectAuthHandler.create(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.handler.AuthHandler, AuthHandler>convReturnVertxGenVariable0(__ENV__, AuthHandler.class, AuthHandler::__create, io.vertx.ext.web.handler.RedirectAuthHandler.create(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2)) {
            return Utils.<io.vertx.ext.web.handler.AuthHandler, AuthHandler>convReturnVertxGenVariable0(__ENV__, AuthHandler.class, AuthHandler::__create, io.vertx.ext.web.handler.RedirectAuthHandler.create(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}