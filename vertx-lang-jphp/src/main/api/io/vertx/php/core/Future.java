package io.vertx.php.core;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Future")
@Namespace("io\\vertx\\php\\core")
@SuppressWarnings("ALL")
public class Future<T> extends VertxGenVariable1Wrapper<io.vertx.core.Future<T>,T>{
    
    private Future(Environment env, io.vertx.core.Future<T> wrappedObject, TypeConverter<T> futureVariableTConverter){
        super(env, wrappedObject, futureVariableTConverter);
    }
    public static <T> Future<T> __create(Environment env, io.vertx.core.Future<T> wrappedObject, TypeConverter<T> futureVariableTConverter){
        return new Future<>(env, wrappedObject, futureVariableTConverter);
    }

    public static Future<Object> __create(Environment env, io.vertx.core.Future<Object> wrappedObject) {
        return new Future<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getFutureVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setFutureVariableTConverter(TypeConverter<T> futureVariableTConverter) {
        this.setTypeConverter1(futureVariableTConverter);
    }

    @Signature
    public static Memory future(Environment __ENV__) {
        return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.core.Future.future());
    }/*4*/

    @Signature
    public static Memory future(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.core.Future.future(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory succeededFuture(Environment __ENV__) {
        return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.core.Future.succeededFuture());
    }/*4*/

    @Signature
    public static Memory succeededFuture(Environment __ENV__, Memory arg0) {
        if(Utils.isVariable(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.core.Future.succeededFuture(Utils.convParamVariable(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory failedFuture(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isThrowable(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.core.Future.failedFuture(Utils.convParamThrowable(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, io.vertx.core.Future.failedFuture(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isComplete(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isComplete());
    }/*1*/

    @Signature
    public Memory setHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().setHandler(Utils.convParamHandlerAsyncResult(__ENV__, getFutureVariableTConverter(), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void complete(Environment __ENV__) {
        this.getWrappedObject().complete();
    }/*4*/

    @Signature
    public void complete(Environment __ENV__, Memory arg0) {
        if(getFutureVariableTConverter().accept(__ENV__, arg0)) {
            this.getWrappedObject().complete(getFutureVariableTConverter().convParam(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void fail(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isThrowable(__ENV__, arg0)) {
            this.getWrappedObject().fail(Utils.convParamThrowable(__ENV__, arg0));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().fail(Utils.convParamString(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory tryComplete(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().tryComplete());
    }/*4*/

    @Signature
    public Memory tryComplete(Environment __ENV__, Memory arg0) {
        if(getFutureVariableTConverter().accept(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().tryComplete(getFutureVariableTConverter().convParam(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory tryFail(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isThrowable(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().tryFail(Utils.convParamThrowable(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().tryFail(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory result(Environment __ENV__) {
        return getFutureVariableTConverter().convReturn(__ENV__, this.getWrappedObject().result());
    }/*1*/

    @Signature
    public Memory cause(Environment __ENV__) {
        return Utils.convReturnThrowable(__ENV__, this.getWrappedObject().cause());
    }/*1*/

    @Signature
    public Memory succeeded(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().succeeded());
    }/*1*/

    @Signature
    public Memory failed(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().failed());
    }/*1*/

    @Signature
    public Memory compose(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().compose(Utils.convParamFunction(__ENV__, getFutureVariableTConverter(), VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory compose(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().compose(Utils.convParamHandler(__ENV__, getFutureVariableTConverter(), arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory map(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().map(Utils.convParamFunction(__ENV__, getFutureVariableTConverter(), TypeConverter.UNKNOWN_TYPE, arg0)));
        } else if(Utils.isVariable(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().map(Utils.convParamVariable(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory mapEmpty(Environment __ENV__) {
        return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().mapEmpty());
    }/*1*/

    @Signature
    public Memory completer(Environment __ENV__) {
        return Utils.convReturnHandlerAsyncResult(__ENV__, getFutureVariableTConverter(),this.getWrappedObject().completer());
    }/*1*/

    @Signature
    public Memory recover(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<T>, Future<T>, T>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, getFutureVariableTConverter(), this.getWrappedObject().recover(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<T>, Future<T>, T>create1(Future.class, Future::__create, getFutureVariableTConverter()), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory otherwise(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<T>, Future<T>, T>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, getFutureVariableTConverter(), this.getWrappedObject().otherwise(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, getFutureVariableTConverter(), arg0)));
        } else if(getFutureVariableTConverter().accept(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<T>, Future<T>, T>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, getFutureVariableTConverter(), this.getWrappedObject().otherwise(getFutureVariableTConverter().convParam(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory otherwiseEmpty(Environment __ENV__) {
        return Utils.<io.vertx.core.Future<T>, Future<T>, T>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, getFutureVariableTConverter(), this.getWrappedObject().otherwiseEmpty());
    }/*1*/

}
