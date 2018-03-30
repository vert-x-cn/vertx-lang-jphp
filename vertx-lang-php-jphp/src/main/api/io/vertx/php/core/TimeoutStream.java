package io.vertx.php.core;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TimeoutStream")
@Namespace("io\\vertx\\php\\core")
@SuppressWarnings("ALL")
public class TimeoutStream extends VertxGenVariable0Wrapper<io.vertx.core.TimeoutStream>{
    
    private TimeoutStream(Environment env, io.vertx.core.TimeoutStream wrappedObject){
        super(env, wrappedObject);
    }
    public static  TimeoutStream __create(Environment env, io.vertx.core.TimeoutStream wrappedObject){
        return new TimeoutStream(env, wrappedObject);
    }

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
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, TypeConverter.LONG, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void cancel(Environment __ENV__) {
        this.getWrappedObject().cancel();
    }/*1*/

}
