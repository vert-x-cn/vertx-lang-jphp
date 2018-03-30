package io.vertx.php.ext.bridge;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.bridge.BridgeEventType;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import java.util.function.Function;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("BaseBridgeEvent")
@Namespace("io\\vertx\\php\\ext\\bridge")
@SuppressWarnings("ALL")
public class BaseBridgeEvent extends VertxGenVariable0Wrapper<io.vertx.ext.bridge.BaseBridgeEvent>{
    
    private BaseBridgeEvent(Environment env, io.vertx.ext.bridge.BaseBridgeEvent wrappedObject){
        super(env, wrappedObject);
    }
    public static  BaseBridgeEvent __create(Environment env, io.vertx.ext.bridge.BaseBridgeEvent wrappedObject){
        return new BaseBridgeEvent(env, wrappedObject);
    }

    @Signature
    public Memory isComplete(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isComplete());
    }/*1*/

    @Signature
    public Memory setHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().setHandler(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg0));
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
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            this.getWrappedObject().complete(Utils.convParamBoolean(__ENV__, arg0));
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
        if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().tryComplete(Utils.convParamBoolean(__ENV__, arg0)));
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
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().result());
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
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().compose(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public Memory compose(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg1)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().compose(Utils.convParamHandler(__ENV__, TypeConverter.BOOLEAN, arg0), Utils.  <io.vertx.core.Future<Object>, Future<Object>  , Object  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory map(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Object>, Future<Object>, Object>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().map(Utils.convParamFunction(__ENV__, TypeConverter.BOOLEAN, TypeConverter.UNKNOWN_TYPE, arg0)));
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
        return Utils.convReturnHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN,this.getWrappedObject().completer());
    }/*1*/

    @Signature
    public Memory recover(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.BOOLEAN, this.getWrappedObject().recover(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, VertxGenVariable0Converter.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>create1(Future.class, Future::__create, TypeConverter.BOOLEAN), arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory otherwise(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isFunction(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.BOOLEAN, this.getWrappedObject().otherwise(Utils.convParamFunction(__ENV__, TypeConverter.THROWABLE, TypeConverter.BOOLEAN, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isBoolean(__ENV__, arg0)) {
            return Utils.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.BOOLEAN, this.getWrappedObject().otherwise(Utils.convParamBoolean(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory otherwiseEmpty(Environment __ENV__) {
        return Utils.<io.vertx.core.Future<Boolean>, Future<Boolean>, Boolean>convReturnVertxGenVariable1(__ENV__, Future.class, Future::__create, TypeConverter.BOOLEAN, this.getWrappedObject().otherwiseEmpty());
    }/*1*/

    @Signature
    public Memory type(Environment __ENV__) {
        return Utils.convReturnEnum(__ENV__, this.getWrappedObject().type());
    }/*1*/

    @Signature
    public Memory getRawMessage(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().getRawMessage());
    }/*1*/

    @Signature
    public Memory setRawMessage(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isJsonObject(__ENV__, arg0)) {
            this.getWrappedObject().setRawMessage(Utils.convParamJsonObject(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
