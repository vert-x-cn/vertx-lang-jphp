package io.vertx.php.core.shareddata;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Counter")
@Namespace("io\\vertx\\php\\core\\shareddata")
@SuppressWarnings("ALL")
public class Counter extends VertxGenVariable0Wrapper<io.vertx.core.shareddata.Counter>{
    
    private Counter(Environment env, io.vertx.core.shareddata.Counter wrappedObject){
        super(env, wrappedObject);
    }
    public static  Counter __create(Environment env, io.vertx.core.shareddata.Counter wrappedObject){
        return new Counter(env, wrappedObject);
    }

    @Signature
    public void get(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().get(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void incrementAndGet(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().incrementAndGet(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getAndIncrement(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().getAndIncrement(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void decrementAndGet(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().decrementAndGet(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void addAndGet(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().addAndGet(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void getAndAdd(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isHandler(__ENV__, arg1)) {
            this.getWrappedObject().getAndAdd(Utils.convParamLong(__ENV__, arg0), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.LONG, arg1));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void compareAndSet(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1) && Utils.isNotNull(arg2) && Utils.isHandler(__ENV__, arg2)) {
            this.getWrappedObject().compareAndSet(Utils.convParamLong(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1), Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.BOOLEAN, arg2));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
