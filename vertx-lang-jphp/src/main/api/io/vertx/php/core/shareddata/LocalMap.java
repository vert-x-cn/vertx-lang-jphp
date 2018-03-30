package io.vertx.php.core.shareddata;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("LocalMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
@SuppressWarnings("ALL")
public class LocalMap<K, V> extends VertxGenVariable2Wrapper<io.vertx.core.shareddata.LocalMap<K,V>,K,V>{
    
    private LocalMap(Environment env, io.vertx.core.shareddata.LocalMap<K,V> wrappedObject, TypeConverter<K> localMapVariableKConverter, TypeConverter<V> localMapVariableVConverter){
        super(env, wrappedObject, localMapVariableKConverter, localMapVariableVConverter);
    }
    public static <K, V> LocalMap<K, V> __create(Environment env, io.vertx.core.shareddata.LocalMap<K,V> wrappedObject, TypeConverter<K> localMapVariableKConverter, TypeConverter<V> localMapVariableVConverter){
        return new LocalMap<>(env, wrappedObject, localMapVariableKConverter, localMapVariableVConverter);
    }

    public static LocalMap<Object, Object> __create(Environment env, io.vertx.core.shareddata.LocalMap<Object, Object> wrappedObject) {
        return new LocalMap<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getLocalMapVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setLocalMapVariableKConverter(TypeConverter<K> localMapVariableKConverter) {
        this.setTypeConverter1(localMapVariableKConverter);
    }

    public TypeConverter<V> getLocalMapVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setLocalMapVariableVConverter(TypeConverter<V> localMapVariableVConverter) {
        this.setTypeConverter2(localMapVariableVConverter);
    }

    @Signature
    public Memory get(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            return getLocalMapVariableVConverter().convReturn(__ENV__, this.getWrappedObject().get(Utils.convParamObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory put(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getLocalMapVariableKConverter().accept(__ENV__, arg0) && getLocalMapVariableVConverter().accept(__ENV__, arg1)) {
            return getLocalMapVariableVConverter().convReturn(__ENV__, this.getWrappedObject().put(getLocalMapVariableKConverter().convParam(__ENV__, arg0), getLocalMapVariableVConverter().convParam(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory remove(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            return getLocalMapVariableVConverter().convReturn(__ENV__, this.getWrappedObject().remove(Utils.convParamObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void clear(Environment __ENV__) {
        this.getWrappedObject().clear();
    }/*1*/

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().size());
    }/*1*/

    @Signature
    public Memory isEmpty(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isEmpty());
    }/*1*/

    @Signature
    public Memory putIfAbsent(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getLocalMapVariableKConverter().accept(__ENV__, arg0) && getLocalMapVariableVConverter().accept(__ENV__, arg1)) {
            return getLocalMapVariableVConverter().convReturn(__ENV__, this.getWrappedObject().putIfAbsent(getLocalMapVariableKConverter().convParam(__ENV__, arg0), getLocalMapVariableVConverter().convParam(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory removeIfPresent(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getLocalMapVariableKConverter().accept(__ENV__, arg0) && getLocalMapVariableVConverter().accept(__ENV__, arg1)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().removeIfPresent(getLocalMapVariableKConverter().convParam(__ENV__, arg0), getLocalMapVariableVConverter().convParam(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory replaceIfPresent(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(getLocalMapVariableKConverter().accept(__ENV__, arg0) && getLocalMapVariableVConverter().accept(__ENV__, arg1) && getLocalMapVariableVConverter().accept(__ENV__, arg2)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().replaceIfPresent(getLocalMapVariableKConverter().convParam(__ENV__, arg0), getLocalMapVariableVConverter().convParam(__ENV__, arg1), getLocalMapVariableVConverter().convParam(__ENV__, arg2)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory replace(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getLocalMapVariableKConverter().accept(__ENV__, arg0) && getLocalMapVariableVConverter().accept(__ENV__, arg1)) {
            return getLocalMapVariableVConverter().convReturn(__ENV__, this.getWrappedObject().replace(getLocalMapVariableKConverter().convParam(__ENV__, arg0), getLocalMapVariableVConverter().convParam(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__) {
        this.getWrappedObject().close();
    }/*1*/

    @Signature
    public Memory containsKey(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().containsKey(Utils.convParamObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory containsValue(Environment __ENV__, Memory arg0) {
        if(Utils.isObject(__ENV__, arg0)) {
            return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().containsValue(Utils.convParamObject(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getOrDefault(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isObject(__ENV__, arg0) && getLocalMapVariableVConverter().accept(__ENV__, arg1)) {
            return getLocalMapVariableVConverter().convReturn(__ENV__, this.getWrappedObject().getOrDefault(Utils.convParamObject(__ENV__, arg0), getLocalMapVariableVConverter().convParam(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
