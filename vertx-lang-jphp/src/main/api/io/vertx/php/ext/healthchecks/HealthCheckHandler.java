package io.vertx.php.ext.healthchecks;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("HealthCheckHandler")
@Namespace("io\\vertx\\php\\ext\\healthchecks")
@SuppressWarnings("ALL")
public class HealthCheckHandler extends VertxGenVariable0Wrapper<io.vertx.ext.healthchecks.HealthCheckHandler>{
    
    private HealthCheckHandler(Environment env, io.vertx.ext.healthchecks.HealthCheckHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  HealthCheckHandler __create(Environment env, io.vertx.ext.healthchecks.HealthCheckHandler wrappedObject){
        return new HealthCheckHandler(env, wrappedObject);
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0)) {
            return Utils.<io.vertx.ext.healthchecks.HealthCheckHandler, HealthCheckHandler>convReturnVertxGenVariable0(__ENV__, HealthCheckHandler.class, HealthCheckHandler::__create, io.vertx.ext.healthchecks.HealthCheckHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg1)) {
            return Utils.<io.vertx.ext.healthchecks.HealthCheckHandler, HealthCheckHandler>convReturnVertxGenVariable0(__ENV__, HealthCheckHandler.class, HealthCheckHandler::__create, io.vertx.ext.healthchecks.HealthCheckHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory createWithHealthChecks(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.healthchecks.HealthChecks.class, HealthChecks.class, arg0)) {
            return Utils.<io.vertx.ext.healthchecks.HealthCheckHandler, HealthCheckHandler>convReturnVertxGenVariable0(__ENV__, HealthCheckHandler.class, HealthCheckHandler::__create, io.vertx.ext.healthchecks.HealthCheckHandler.createWithHealthChecks(Utils.  <io.vertx.ext.healthchecks.HealthChecks, HealthChecks  >convParamVertxGenVariable0(__ENV__, HealthChecks.class, HealthChecks::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory createWithHealthChecks(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.healthchecks.HealthChecks.class, HealthChecks.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.ext.auth.AuthProvider.class, AuthProvider.class, arg1)) {
            return Utils.<io.vertx.ext.healthchecks.HealthCheckHandler, HealthCheckHandler>convReturnVertxGenVariable0(__ENV__, HealthCheckHandler.class, HealthCheckHandler::__create, io.vertx.ext.healthchecks.HealthCheckHandler.createWithHealthChecks(Utils.  <io.vertx.ext.healthchecks.HealthChecks, HealthChecks  >convParamVertxGenVariable0(__ENV__, HealthChecks.class, HealthChecks::__create, arg0), Utils.  <io.vertx.ext.auth.AuthProvider, AuthProvider  >convParamVertxGenVariable0(__ENV__, AuthProvider.class, AuthProvider::__create, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory register(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().register(Utils.convParamString(__ENV__, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.ext.healthchecks.Status>, Future<io.vertx.ext.healthchecks.Status>, io.vertx.ext.healthchecks.Status>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.ext.healthchecks.Status.class)), arg1));
            return toMemory();
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory register(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().register(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.ext.healthchecks.Status>, Future<io.vertx.ext.healthchecks.Status>, io.vertx.ext.healthchecks.Status>create1(Future.class, Future::__create, DataObjectConverter.create(io.vertx.ext.healthchecks.Status.class)), arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory unregister(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().unregister(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
