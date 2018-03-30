package io.vertx.php.ext.web;
import io.vertx.core.http.HttpMethod;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Route")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class Route extends VertxGenVariable0Wrapper<io.vertx.ext.web.Route>{
    
    private Route(Environment env, io.vertx.ext.web.Route wrappedObject){
        super(env, wrappedObject);
    }
    public static  Route __create(Environment env, io.vertx.ext.web.Route wrappedObject){
        return new Route(env, wrappedObject);
    }

    @Signature
    public Memory method(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0)) {
            this.getWrappedObject().method(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory path(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().path(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pathRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().pathRegex(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory produces(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().produces(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory consumes(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().consumes(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory order(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().order(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory last(Environment __ENV__) {
        this.getWrappedObject().last();
        return toMemory();
    }/*1*/

    @Signature
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.RoutingContext, RoutingContext>create0(RoutingContext.class, RoutingContext::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory blockingHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().blockingHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.RoutingContext, RoutingContext>create0(RoutingContext.class, RoutingContext::__create), arg0));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory blockingHandler(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1)) {
            this.getWrappedObject().blockingHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.RoutingContext, RoutingContext>create0(RoutingContext.class, RoutingContext::__create), arg0), Utils.convParamBoolean(__ENV__, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory failureHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().failureHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.RoutingContext, RoutingContext>create0(RoutingContext.class, RoutingContext::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__) {
        this.getWrappedObject().remove();
        return toMemory();
    }/*1*/

    @Signature
    public Memory disable(Environment __ENV__) {
        this.getWrappedObject().disable();
        return toMemory();
    }/*1*/

    @Signature
    public Memory enable(Environment __ENV__) {
        this.getWrappedObject().enable();
        return toMemory();
    }/*1*/

    @Signature
    public Memory useNormalisedPath(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().useNormalisedPath(Utils.convParamBoolean(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getPath(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().getPath());
    }/*1*/

    @Signature
    public Memory setRegexGroupsNames(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, TypeConverter.STRING, arg0)) {
            this.getWrappedObject().setRegexGroupsNames(Utils.convParamList(__ENV__, TypeConverter.STRING, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
