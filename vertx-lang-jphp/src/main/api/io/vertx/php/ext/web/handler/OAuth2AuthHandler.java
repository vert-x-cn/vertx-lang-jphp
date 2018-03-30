package io.vertx.php.ext.web.handler;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.auth.oauth2.OAuth2Auth;
import io.vertx.php.ext.web.Route;
import io.vertx.php.ext.web.RoutingContext;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("OAuth2AuthHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class OAuth2AuthHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.OAuth2AuthHandler>{
    
    private OAuth2AuthHandler(Environment env, io.vertx.ext.web.handler.OAuth2AuthHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  OAuth2AuthHandler __create(Environment env, io.vertx.ext.web.handler.OAuth2AuthHandler wrappedObject){
        return new OAuth2AuthHandler(env, wrappedObject);
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.oauth2.OAuth2Auth.class, OAuth2Auth.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.OAuth2AuthHandler, OAuth2AuthHandler>convReturnVertxGenVariable0(__ENV__, OAuth2AuthHandler.class, OAuth2AuthHandler::__create, io.vertx.ext.web.handler.OAuth2AuthHandler.create(Utils.  <io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth  >convParamVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.oauth2.OAuth2Auth.class, OAuth2Auth.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.handler.OAuth2AuthHandler, OAuth2AuthHandler>convReturnVertxGenVariable0(__ENV__, OAuth2AuthHandler.class, OAuth2AuthHandler::__create, io.vertx.ext.web.handler.OAuth2AuthHandler.create(Utils.  <io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth  >convParamVertxGenVariable0(__ENV__, OAuth2Auth.class, OAuth2Auth::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory extraParams(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            this.getWrappedObject().extraParams(Utils.convParamJsonObject(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setupCallback(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.Route.class, Route.class, arg0)) {
            this.getWrappedObject().setupCallback(Utils.  <io.vertx.ext.web.Route, Route  >convParamVertxGenVariable0(__ENV__, Route.class, Route::__create, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
