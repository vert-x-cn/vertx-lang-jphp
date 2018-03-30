package io.vertx.php.core.shareddata;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AsyncMap")
@Namespace("io\\vertx\\php\\core\\shareddata")
@SuppressWarnings("ALL")
public class AsyncMap<K, V> extends VertxGenVariable2Wrapper<io.vertx.core.shareddata.AsyncMap<K,V>,K,V>{
    
    private AsyncMap(Environment env, io.vertx.core.shareddata.AsyncMap<K,V> wrappedObject, TypeConverter<K> asyncMapVariableKConverter, TypeConverter<V> asyncMapVariableVConverter){
        super(env, wrappedObject, asyncMapVariableKConverter, asyncMapVariableVConverter);
    }
    public static <K, V> AsyncMap<K, V> __create(Environment env, io.vertx.core.shareddata.AsyncMap<K,V> wrappedObject, TypeConverter<K> asyncMapVariableKConverter, TypeConverter<V> asyncMapVariableVConverter){
        return new AsyncMap<>(env, wrappedObject, asyncMapVariableKConverter, asyncMapVariableVConverter);
    }

    public static AsyncMap<Object, Object> __create(Environment env, io.vertx.core.shareddata.AsyncMap<Object, Object> wrappedObject) {
        return new AsyncMap<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<K> getAsyncMapVariableKConverter() {
        return this.getTypeConverter1();
    }

    public void setAsyncMapVariableKConverter(TypeConverter<K> asyncMapVariableKConverter) {
        this.setTypeConverter1(asyncMapVariableKConverter);
    }

    public TypeConverter<V> getAsyncMapVariableVConverter() {
        return this.getTypeConverter2();
    }

    public void setAsyncMapVariableVConverter(TypeConverter<V> asyncMapVariableVConverter) {
        this.setTypeConverter2(asyncMapVariableVConverter);
    }

    @Signature
    public void get(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().get(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, getAsyncMapVariableVConverter(), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void put(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().put(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void put(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().put(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void putIfAbsent(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().putIfAbsent(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, getAsyncMapVariableVConverter(), arg2));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public void putIfAbsent(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isLong(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().putIfAbsent(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), Utils.convParamLong(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, getAsyncMapVariableVConverter(), arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void remove(Environment __ENV__, Memory arg0, Memory arg1) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().remove(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, getAsyncMapVariableVConverter(), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void removeIfPresent(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().removeIfPresent(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void replace(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().replace(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, getAsyncMapVariableVConverter(), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void replaceIfPresent(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(getAsyncMapVariableKConverter().accept(__ENV__, arg0) && getAsyncMapVariableVConverter().accept(__ENV__, arg1) && getAsyncMapVariableVConverter().accept(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isHandler(__ENV__, arg3)) {
            this.getWrappedObject().replaceIfPresent(getAsyncMapVariableKConverter().convParam(__ENV__, arg0), getAsyncMapVariableVConverter().convParam(__ENV__, arg1), getAsyncMapVariableVConverter().convParam(__ENV__, arg2), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void clear(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().clear(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void size(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().size(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.INTEGER, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
