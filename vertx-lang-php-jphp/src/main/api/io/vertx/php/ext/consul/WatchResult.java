package io.vertx.php.ext.consul;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WatchResult")
@Namespace("io\\vertx\\php\\ext\\consul")
@SuppressWarnings("ALL")
public class WatchResult<T> extends VertxGenVariable1Wrapper<io.vertx.ext.consul.WatchResult<T>,T>{
    
    private WatchResult(Environment env, io.vertx.ext.consul.WatchResult<T> wrappedObject, TypeConverter<T> watchResultVariableTConverter){
        super(env, wrappedObject, watchResultVariableTConverter);
    }
    public static <T> WatchResult<T> __create(Environment env, io.vertx.ext.consul.WatchResult<T> wrappedObject, TypeConverter<T> watchResultVariableTConverter){
        return new WatchResult<>(env, wrappedObject, watchResultVariableTConverter);
    }

    public static WatchResult<Object> __create(Environment env, io.vertx.ext.consul.WatchResult<Object> wrappedObject) {
        return new WatchResult<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getWatchResultVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setWatchResultVariableTConverter(TypeConverter<T> watchResultVariableTConverter) {
        this.setTypeConverter1(watchResultVariableTConverter);
    }

    @Signature
    public Memory prevResult(Environment __ENV__) {
        return getWatchResultVariableTConverter().convReturn(__ENV__, this.getWrappedObject().prevResult());
    }/*1*/

    @Signature
    public Memory nextResult(Environment __ENV__) {
        return getWatchResultVariableTConverter().convReturn(__ENV__, this.getWrappedObject().nextResult());
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

}
