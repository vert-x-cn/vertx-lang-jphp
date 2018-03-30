package io.vertx.php.core.streams;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.streams.StreamBase;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ReadStream")
@Namespace("io\\vertx\\php\\core\\streams")
@SuppressWarnings("ALL")
public class ReadStream<T> extends VertxGenVariable1Wrapper<io.vertx.core.streams.ReadStream<T>,T>{
    
    private ReadStream(Environment env, io.vertx.core.streams.ReadStream<T> wrappedObject, TypeConverter<T> readStreamVariableTConverter){
        super(env, wrappedObject, readStreamVariableTConverter);
    }
    public static <T> ReadStream<T> __create(Environment env, io.vertx.core.streams.ReadStream<T> wrappedObject, TypeConverter<T> readStreamVariableTConverter){
        return new ReadStream<>(env, wrappedObject, readStreamVariableTConverter);
    }

    public static ReadStream<Object> __create(Environment env, io.vertx.core.streams.ReadStream<Object> wrappedObject) {
        return new ReadStream<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getReadStreamVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setReadStreamVariableTConverter(TypeConverter<T> readStreamVariableTConverter) {
        this.setTypeConverter1(readStreamVariableTConverter);
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
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, getReadStreamVariableTConverter(), arg0));
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

}
