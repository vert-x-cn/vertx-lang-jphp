package io.vertx.php.ext.unit;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.php.core.Future;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("Completion")
@Namespace("io\\vertx\\php\\ext\\unit")
@SuppressWarnings("ALL")
public class Completion<T> extends VertxGenVariable1Wrapper<io.vertx.ext.unit.Completion<T>,T>{
    
    private Completion(Environment env, io.vertx.ext.unit.Completion<T> wrappedObject, TypeConverter<T> completionVariableTConverter){
        super(env, wrappedObject, completionVariableTConverter);
    }
    public static <T> Completion<T> __create(Environment env, io.vertx.ext.unit.Completion<T> wrappedObject, TypeConverter<T> completionVariableTConverter){
        return new Completion<>(env, wrappedObject, completionVariableTConverter);
    }

    public static Completion<Object> __create(Environment env, io.vertx.ext.unit.Completion<Object> wrappedObject) {
        return new Completion<>(env, wrappedObject, TypeConverter.UNKNOWN_TYPE);
    }

    public TypeConverter<T> getCompletionVariableTConverter() {
        return this.getTypeConverter1();
    }

    public void setCompletionVariableTConverter(TypeConverter<T> completionVariableTConverter) {
        this.setTypeConverter1(completionVariableTConverter);
    }

    @Signature
    public void resolve(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().resolve(Utils.  <io.vertx.core.Future<T>, Future<T>  , T  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  getCompletionVariableTConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory isCompleted(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isCompleted());
    }/*1*/

    @Signature
    public Memory isSucceeded(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSucceeded());
    }/*1*/

    @Signature
    public Memory isFailed(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isFailed());
    }/*1*/

    @Signature
    public void handler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandlerAsyncResult(__ENV__, getCompletionVariableTConverter(), arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void await(Environment __ENV__) {
        this.getWrappedObject().await();
    }/*4*/

    @Signature
    public void await(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            this.getWrappedObject().await(Utils.convParamLong(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void awaitSuccess(Environment __ENV__) {
        this.getWrappedObject().awaitSuccess();
    }/*4*/

    @Signature
    public void awaitSuccess(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            this.getWrappedObject().awaitSuccess(Utils.convParamLong(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
