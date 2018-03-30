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
@Name("WriteStream")
@Namespace("io\\vertx\\php\\core\\streams")
@SuppressWarnings("ALL")
public class WriteStream<T> extends VertxGenVariable1Wrapper<io.vertx.core.streams.WriteStream<T>,T>{
    
    private WriteStream(Environment env, io.vertx.core.streams.WriteStream<T> wrappedObject, TypeConverter<T> writeStreamVariableTConverter){
        super(env, wrappedObject, writeStreamVariableTConverter);
    }
    public static <T> WriteStream<T> __create(Environment env, io.vertx.core.streams.WriteStream<T> wrappedObject, TypeConverter<T> writeStreamVariableTConverter){
        return new WriteStream<>(env, wrappedObject, writeStreamVariableTConverter);
    }

    public static WriteStream<Object> __create(Environment env, io.vertx.core.streams.WriteStream<Object> wrappedObject) {
        return new WriteStream<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getWriteStreamVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setWriteStreamVariableTConverter(TypeConverter<T> writeStreamVariableTConverter) {
        this.setTypeConverter1(writeStreamVariableTConverter);
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
    public Memory write(Environment __ENV__, Memory arg0) {
        if(getWriteStreamVariableTConverter().accept(__ENV__, arg0)) {
            this.getWrappedObject().write(getWriteStreamVariableTConverter().convParam(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void end(Environment __ENV__) {
        this.getWrappedObject().end();
    }/*4*/

    @Signature
    public void end(Environment __ENV__, Memory arg0) {
        if(getWriteStreamVariableTConverter().accept(__ENV__, arg0)) {
            this.getWrappedObject().end(getWriteStreamVariableTConverter().convParam(__ENV__, arg0));
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
    public Memory writeQueueFull(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().writeQueueFull());
    }/*1*/

    @Signature
    public Memory drainHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().drainHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
