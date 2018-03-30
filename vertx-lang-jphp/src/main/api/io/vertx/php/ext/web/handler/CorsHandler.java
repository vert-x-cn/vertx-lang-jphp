package io.vertx.php.ext.web.handler;
import io.vertx.core.http.HttpMethod;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("CorsHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class CorsHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.CorsHandler>{
    
    private CorsHandler(Environment env, io.vertx.ext.web.handler.CorsHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  CorsHandler __create(Environment env, io.vertx.ext.web.handler.CorsHandler wrappedObject){
        return new CorsHandler(env, wrappedObject);
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
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.handler.CorsHandler, CorsHandler>convReturnVertxGenVariable0(__ENV__, CorsHandler.class, CorsHandler::__create, io.vertx.ext.web.handler.CorsHandler.create(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory allowedMethod(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0)) {
            this.getWrappedObject().allowedMethod(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory allowedHeader(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().allowedHeader(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory allowedHeaders(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().allowedHeaders(Utils.convParamSet(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exposedHeader(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().exposedHeader(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exposedHeaders(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isSet(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().exposedHeaders(Utils.convParamSet(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory allowCredentials(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().allowCredentials(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory maxAgeSeconds(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().maxAgeSeconds(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
