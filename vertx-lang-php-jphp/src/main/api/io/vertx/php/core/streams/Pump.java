package io.vertx.php.core.streams;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.streams.WriteStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Pump")
@Namespace("io\\vertx\\php\\core\\streams")
@SuppressWarnings("ALL")
public class Pump extends VertxGenVariable0Wrapper<io.vertx.core.streams.Pump>{
    
    private Pump(Environment env, io.vertx.core.streams.Pump wrappedObject){
        super(env, wrappedObject);
    }
    public static  Pump __create(Environment env, io.vertx.core.streams.Pump wrappedObject){
        return new Pump(env, wrappedObject);
    }

    @Signature
    public static Memory pump(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.streams.WriteStream.class, WriteStream.class, arg1)) {
            return Utils.<io.vertx.core.streams.Pump, Pump>convReturnVertxGenVariable0(__ENV__, Pump.class, Pump::__create, io.vertx.core.streams.Pump.pump(Utils.  <io.vertx.core.streams.ReadStream<Object>, ReadStream<Object>  , Object  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.streams.WriteStream<Object>, WriteStream<Object>  , Object  >convParamVertxGenVariable1(__ENV__, WriteStream.class, WriteStream::__create,  TypeConverter.UNKNOWN_TYPE, arg1)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory pump(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.streams.ReadStream.class, ReadStream.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.core.streams.WriteStream.class, WriteStream.class, arg1) && Utils.isNotNull(arg2) && Utils.isInteger(__ENV__, arg2)) {
            return Utils.<io.vertx.core.streams.Pump, Pump>convReturnVertxGenVariable0(__ENV__, Pump.class, Pump::__create, io.vertx.core.streams.Pump.pump(Utils.  <io.vertx.core.streams.ReadStream<Object>, ReadStream<Object>  , Object  >convParamVertxGenVariable1(__ENV__, ReadStream.class, ReadStream::__create,  TypeConverter.UNKNOWN_TYPE, arg0), Utils.  <io.vertx.core.streams.WriteStream<Object>, WriteStream<Object>  , Object  >convParamVertxGenVariable1(__ENV__, WriteStream.class, WriteStream::__create,  TypeConverter.UNKNOWN_TYPE, arg1), Utils.convParamInteger(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory setWriteQueueMaxSize(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isInteger(__ENV__, arg0)) {
            this.getWrappedObject().setWriteQueueMaxSize(Utils.convParamInteger(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory start(Environment __ENV__) {
        this.getWrappedObject().start();
        return toMemory();
    }/*1*/

    @Signature
    public Memory stop(Environment __ENV__) {
        this.getWrappedObject().stop();
        return toMemory();
    }/*1*/

    @Signature
    public Memory numberPumped(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().numberPumped());
    }/*1*/

}
