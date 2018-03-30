package io.vertx.php.ext.web;
import io.vertx.core.http.HttpMethod;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.core.http.HttpServerRequest;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Router")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class Router extends VertxGenVariable0Wrapper<io.vertx.ext.web.Router>{
    
    private Router(Environment env, io.vertx.ext.web.Router wrappedObject){
        super(env, wrappedObject);
    }
    public static  Router __create(Environment env, io.vertx.ext.web.Router wrappedObject){
        return new Router(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.http.HttpServerRequest.class, HttpServerRequest.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.core.http.HttpServerRequest, HttpServerRequest  >convParamVertxGenVariable0(__ENV__, HttpServerRequest.class, HttpServerRequest::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory router(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.web.Router, Router>convReturnVertxGenVariable0(__ENV__, Router.class, Router::__create, io.vertx.ext.web.Router.router(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void accept(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.http.HttpServerRequest.class, HttpServerRequest.class, arg0)) {
            this.getWrappedObject().accept(Utils.  <io.vertx.core.http.HttpServerRequest, HttpServerRequest  >convParamVertxGenVariable0(__ENV__, HttpServerRequest.class, HttpServerRequest::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory route(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().route());
    }/*4*/

    @Signature
    public Memory route(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().route(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory route(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().route(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory routeWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().routeWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory routeWithRegex(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isEnum(__ENV__, HttpMethod.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().routeWithRegex(Utils.convParamEnum(__ENV__, HttpMethod.class, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().get());
    }/*4*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().getWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory head(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().head());
    }/*4*/

    @Signature
    public Memory head(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().head(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory headWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().headWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory options(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().options());
    }/*4*/

    @Signature
    public Memory options(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().options(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory optionsWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().optionsWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().put());
    }/*4*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory putWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().putWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory post(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().post());
    }/*4*/

    @Signature
    public Memory post(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().post(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory postWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().postWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory delete(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().delete());
    }/*4*/

    @Signature
    public Memory delete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().delete(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory deleteWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().deleteWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory trace(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().trace());
    }/*4*/

    @Signature
    public Memory trace(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().trace(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory traceWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().traceWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory connect(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().connect());
    }/*4*/

    @Signature
    public Memory connect(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().connect(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory connectWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().connectWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory patch(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().patch());
    }/*4*/

    @Signature
    public Memory patch(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().patch(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory patchWithRegex(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.Route, Route>convReturnVertxGenVariable0(__ENV__, Route.class, Route::__create, this.getWrappedObject().patchWithRegex(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getRoutes(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.web.Route, Route>create0(Route.class, Route::__create),this.getWrappedObject().getRoutes());
    }/*1*/

    @Signature
    public Memory clear(Environment __ENV__) {
        this.getWrappedObject().clear();
        return toMemory();
    }/*1*/

    @Signature
    public Memory mountSubRouter(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.web.Router.class, Router.class, arg1)) {
            this.getWrappedObject().mountSubRouter(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.ext.web.Router, Router  >convParamVertxGenVariable0(__ENV__, Router.class, Router::__create, arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void handleContext(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0)) {
            this.getWrappedObject().handleContext(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void handleFailure(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0)) {
            this.getWrappedObject().handleFailure(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
