package io.vertx.php.core.shareddata;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("SharedData")
@Namespace("io\\vertx\\php\\core\\shareddata")
@SuppressWarnings("ALL")
public class SharedData extends VertxGenVariable0Wrapper<io.vertx.core.shareddata.SharedData>{
    
    private SharedData(Environment env, io.vertx.core.shareddata.SharedData wrappedObject){
        super(env, wrappedObject);
    }
    public static  SharedData __create(Environment env, io.vertx.core.shareddata.SharedData wrappedObject){
        return new SharedData(env, wrappedObject);
    }

    @Signature
    public void getClusterWideMap(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getClusterWideMap(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.shareddata.AsyncMap<Object, Object>, AsyncMap<Object, Object>, Object, Object>create2(AsyncMap.class, AsyncMap::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getAsyncMap(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getAsyncMap(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.shareddata.AsyncMap<Object, Object>, AsyncMap<Object, Object>, Object, Object>create2(AsyncMap.class, AsyncMap::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getLock(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getLock(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.shareddata.Lock, Lock>create0(Lock.class, Lock::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getLockWithTimeout(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().getLockWithTimeout(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.shareddata.Lock, Lock>create0(Lock.class, Lock::__create), arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getCounter(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getCounter(Utils.convParamString(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, VertxGenVariable0Converter.<io.vertx.core.shareddata.Counter, Counter>create0(Counter.class, Counter::__create), arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory getLocalMap(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.core.shareddata.LocalMap<Object, Object>, LocalMap<Object, Object>, Object, Object>convReturnVertxGenVariable2(__ENV__, LocalMap.class, LocalMap::__create, TypeConverter.UNKNOWN_TYPE, TypeConverter.UNKNOWN_TYPE, this.getWrappedObject().getLocalMap(Utils.convParamString(__ENV__, arg0)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
