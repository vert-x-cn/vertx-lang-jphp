package io.vertx.php.core;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CompositeFuture")
@Namespace("io\\vertx\\php\\core")
@SuppressWarnings("ALL")
public class CompositeFuture extends VertxGenVariable0Wrapper<io.vertx.core.CompositeFuture>{
    
    private CompositeFuture(Environment env, io.vertx.core.CompositeFuture wrappedObject){
        super(env, wrappedObject);
    }
    public static  CompositeFuture __create(Environment env, io.vertx.core.CompositeFuture wrappedObject){
        return new CompositeFuture(env, wrappedObject);
    }

    @Signature
    public Memory isComplete(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isComplete());
    }/*4*/

    @Signature
    public Memory isComplete(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isComplete(Utils.convParamInteger(__ENV__, arg0)));
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.CompositeFuture.class, CompositeFuture.class, arg0)) {
            this.getWrappedObject().complete(Utils.  <io.vertx.core.CompositeFuture, CompositeFuture  >convParamVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, arg0));
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
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.CompositeFuture.class, CompositeFuture.class, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().tryComplete(Utils.  <io.vertx.core.CompositeFuture, CompositeFuture  >convParamVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, arg0)));
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
        return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, this.getWrappedObject().result());
    }/*1*/

    @Signature
    public Memory cause(Environment __ENV__) {
        return Utils.convReturnThrowable(__ENV__, this.getWrappedObject().cause());
    }/*4*/

    @Signature
    public Memory cause(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnThrowable(__ENV__, this.getWrappedObject().cause(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory succeeded(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().succeeded());
    }/*4*/

    @Signature
    public Memory succeeded(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().succeeded(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory failed(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().failed());
    }/*4*/

    @Signature
    public Memory failed(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().failed(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory compose(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().compose(Utils.convParamFunction(__ENV__, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory compose(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().compose(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory map(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().map(Utils.convParamFunction(__ENV__, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), TypeConverter.UNKNOWN_TYPE, arg0)));
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
        return Utils.convReturnHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create),this.getWrappedObject().completer());
    }/*1*/

    @Signature
    public Memory recover(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<io.vertx.core.CompositeFuture>, Future<io.vertx.core.CompositeFuture>, io.vertx.core.CompositeFuture>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), this.getWrappedObject().recover(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<io.vertx.core.CompositeFuture>, Future<io.vertx.core.CompositeFuture>, io.vertx.core.CompositeFuture>create1(Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create)), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory otherwise(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<io.vertx.core.CompositeFuture>, Future<io.vertx.core.CompositeFuture>, io.vertx.core.CompositeFuture>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), this.getWrappedObject().otherwise(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.CompositeFuture.class, CompositeFuture.class, arg0)) {
            return Utils.<io.vertx.core.Future<io.vertx.core.CompositeFuture>, Future<io.vertx.core.CompositeFuture>, io.vertx.core.CompositeFuture>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), this.getWrappedObject().otherwise(Utils.  <io.vertx.core.CompositeFuture, CompositeFuture  >convParamVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory otherwiseEmpty(Environment __ENV__) {
        return Utils.<io.vertx.core.Future<io.vertx.core.CompositeFuture>, Future<io.vertx.core.CompositeFuture>, io.vertx.core.CompositeFuture>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), this.getWrappedObject().otherwiseEmpty());
    }/*1*/

    @Signature
    public static Memory all(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.all(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory all(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.all(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory all(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.all(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory all(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.all(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory all(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3) && Utils.isNotNull(arg4) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg4)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.all(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg4)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory all(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3) && Utils.isNotNull(arg4) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg4) && Utils.isNotNull(arg5) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg5)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.all(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg4), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg5)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory any(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.any(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory any(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.any(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory any(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.any(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory any(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.any(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory any(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3) && Utils.isNotNull(arg4) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg4)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.any(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg4)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory any(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3) && Utils.isNotNull(arg4) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg4) && Utils.isNotNull(arg5) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg5)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.any(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg4), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg5)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory join(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.join(Utils.convParamList(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future, Future>create0(Future.class, Future::__create), arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory join(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.join(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory join(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.join(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory join(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.join(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory join(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3) && Utils.isNotNull(arg4) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg4)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.join(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg4)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory join(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3, Memory arg4, Memory arg5) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1) && Utils.isNotNull(arg2) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3) && Utils.isNotNull(arg4) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg4) && Utils.isNotNull(arg5) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg5)) {
            return Utils.<io.vertx.core.CompositeFuture, CompositeFuture>convReturnVertxGenVariable0(__ENV__, CompositeFuture.class, CompositeFuture::__create, io.vertx.core.CompositeFuture.join(Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg2), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg3), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg4), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg5)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().setHandler(Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.CompositeFuture, CompositeFuture>create0(CompositeFuture.class, CompositeFuture::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory resultAt(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().resultAt(Utils.convParamInteger(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().size());
    }/*1*/

}
