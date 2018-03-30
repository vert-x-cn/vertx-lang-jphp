package io.vertx.php.circuitbreaker;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HystrixMetricHandler")
@Namespace("io\\vertx\\php\\circuitbreaker")
@SuppressWarnings("ALL")
public class HystrixMetricHandler extends VertxGenVariable0Wrapper<io.vertx.circuitbreaker.HystrixMetricHandler>{
    
    private HystrixMetricHandler(Environment env, io.vertx.circuitbreaker.HystrixMetricHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  HystrixMetricHandler __create(Environment env, io.vertx.circuitbreaker.HystrixMetricHandler wrappedObject){
        return new HystrixMetricHandler(env, wrappedObject);
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
            return Utils.<io.vertx.circuitbreaker.HystrixMetricHandler, HystrixMetricHandler>convReturnVertxGenVariable0(__ENV__, HystrixMetricHandler.class, HystrixMetricHandler::__create, io.vertx.circuitbreaker.HystrixMetricHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isString(__ENV__, arg1)) {
            return Utils.<io.vertx.circuitbreaker.HystrixMetricHandler, HystrixMetricHandler>convReturnVertxGenVariable0(__ENV__, HystrixMetricHandler.class, HystrixMetricHandler::__create, io.vertx.circuitbreaker.HystrixMetricHandler.create(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.convParamString(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
