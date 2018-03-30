package io.vertx.php.core;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Context")
@Namespace("io\\vertx\\php\\core")
@SuppressWarnings("ALL")
public class Context extends VertxGenVariable0Wrapper<io.vertx.core.Context>{
    
    private Context(Environment env, io.vertx.core.Context wrappedObject){
        super(env, wrappedObject);
    }
    public static  Context __create(Environment env, io.vertx.core.Context wrappedObject){
        return new Context(env, wrappedObject);
    }

    @Signature
    public static Memory isOnWorkerThread(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, io.vertx.core.Context.isOnWorkerThread());
    }/*1*/

    @Signature
    public static Memory isOnEventLoopThread(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, io.vertx.core.Context.isOnEventLoopThread());
    }/*1*/

    @Signature
    public static Memory isOnVertxThread(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, io.vertx.core.Context.isOnVertxThread());
    }/*1*/

    @Signature
    public void runOnContext(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().runOnContext(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void executeBlocking(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().executeBlocking(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg1));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void executeBlocking(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isBoolean(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().executeBlocking(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.Future<Object>, Future<Object>, Object>create1(Future.class, Future::__create, TypeConverter.UNKNOWN_TYPE), arg0), Utils.convParamBoolean(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.UNKNOWN_TYPE, arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory deploymentID(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().deploymentID());
    }/*1*/

    @Signature
    public Memory config(Environment __ENV__) {
        return Utils.convReturnJsonObject(__ENV__, this.getWrappedObject().config());
    }/*1*/

    @Signature
    public Memory processArgs(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, TypeConverter.STRING,this.getWrappedObject().processArgs());
    }/*1*/

    @Signature
    public Memory isEventLoopContext(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isEventLoopContext());
    }/*1*/

    @Signature
    public Memory isWorkerContext(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isWorkerContext());
    }/*1*/

    @Signature
    public Memory isMultiThreadedWorkerContext(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isMultiThreadedWorkerContext());
    }/*1*/

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnVariable(__ENV__, this.getWrappedObject().get(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isObject(__ENV__, arg1)) {
            this.getWrappedObject().put(Utils.convParamString(__ENV__, arg0), Utils.convParamObject(__ENV__, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().remove(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory owner(Environment __ENV__) {
        return Utils.<io.vertx.core.Vertx, Vertx>convReturnVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, this.getWrappedObject().owner());
    }/*1*/

    @Signature
    public Memory getInstanceCount(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().getInstanceCount());
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

}
