package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("FormLoginHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class FormLoginHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.FormLoginHandler>{
    
    private FormLoginHandler(Environment env, io.vertx.ext.web.handler.FormLoginHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  FormLoginHandler __create(Environment env, io.vertx.ext.web.handler.FormLoginHandler wrappedObject){
        return new FormLoginHandler(env, wrappedObject);
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0)) {
            return Utils.<io.vertx.ext.web.handler.FormLoginHandler, FormLoginHandler>convReturnVertxGenVariable0(__ENV__, FormLoginHandler.class, FormLoginHandler::__create, io.vertx.ext.web.handler.FormLoginHandler.create(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isString(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isString(__ENV__, arg3) && Utils.isNotNull(arg4) && Utils.isString(__ENV__, arg4)) {
            return Utils.<io.vertx.ext.web.handler.FormLoginHandler, FormLoginHandler>convReturnVertxGenVariable0(__ENV__, FormLoginHandler.class, FormLoginHandler::__create, io.vertx.ext.web.handler.FormLoginHandler.create(Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg0), Utils.convParamString(__ENV__, arg1), Utils.convParamString(__ENV__, arg2), Utils.convParamString(__ENV__, arg3), Utils.convParamString(__ENV__, arg4)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setUsernameParam(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setUsernameParam(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setPasswordParam(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setPasswordParam(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setReturnURLParam(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setReturnURLParam(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setDirectLoggedInOKURL(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().setDirectLoggedInOKURL(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
