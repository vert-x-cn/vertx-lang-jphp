package io.vertx.php.circuitbreaker;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.Vertx;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CircuitBreaker")
@Namespace("io\\vertx\\php\\circuitbreaker")
@SuppressWarnings("ALL")
public class CircuitBreaker extends VertxGenVariable0Wrapper<io.vertx.circuitbreaker.CircuitBreaker>{
    
    private CircuitBreaker(Environment env, io.vertx.circuitbreaker.CircuitBreaker wrappedObject){
        super(env, wrappedObject);
    }
    public static  CircuitBreaker __create(Environment env, io.vertx.circuitbreaker.CircuitBreaker wrappedObject){
        return new CircuitBreaker(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1)) {
            return Utils.<io.vertx.circuitbreaker.CircuitBreaker, CircuitBreaker>convReturnVertxGenVariable0(__ENV__, CircuitBreaker.class, CircuitBreaker::__create, io.vertx.circuitbreaker.CircuitBreaker.create(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg1) && Utils.isNotNull(arg2) && Utils.isDataObject(__ENV__, io.vertx.circuitbreaker.CircuitBreakerOptions.class, arg2)) {
            return Utils.<io.vertx.circuitbreaker.CircuitBreaker, CircuitBreaker>convReturnVertxGenVariable0(__ENV__, CircuitBreaker.class, CircuitBreaker::__create, io.vertx.circuitbreaker.CircuitBreaker.create(Utils.convParamString(__ENV__, arg0), Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg1), Utils.convParamDataObject(__ENV__, io.vertx.circuitbreaker.CircuitBreakerOptions.class, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory close(Environment __ENV__) {
        this.getWrappedObject().close();
        return toMemory();
    }/*1*/

    @Signature
    public Memory openHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().openHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory halfOpenHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().halfOpenHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory closeHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().closeHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory executeWithFallback(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().executeWithFallback(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void executeCommandWithFallback(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isFunction(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().executeCommandWithFallback(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.UNKNOWN_TYPE, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory execute(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().execute(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void executeCommand(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().executeCommand(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory executeAndReport(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().executeAndReport(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg1));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory executeAndReportWithFallback(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isFunction(__ENV__, arg2)) {
            this.getWrappedObject().executeAndReportWithFallback(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg1), Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.UNKNOWN_TYPE, arg2));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory fallback(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            this.getWrappedObject().fallback(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.UNKNOWN_TYPE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory reset(Environment __ENV__) {
        this.getWrappedObject().reset();
        return toMemory();
    }/*1*/

    @Signature
    public Memory open(Environment __ENV__) {
        this.getWrappedObject().open();
        return toMemory();
    }/*1*/

    @Signature
    public Memory state(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().state());
    }/*1*/

    @Signature
    public Memory failureCount(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().failureCount());
    }/*1*/

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

}
