package io.vertx.php.ext.unit;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("TestCompletion")
@Namespace("io\\vertx\\php\\ext\\unit")
@SuppressWarnings("ALL")
public class TestCompletion extends VertxGenVariable0Wrapper<io.vertx.ext.unit.TestCompletion>{
    
    private TestCompletion(Environment env, io.vertx.ext.unit.TestCompletion wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestCompletion __create(Environment env, io.vertx.ext.unit.TestCompletion wrappedObject){
        return new TestCompletion(env, wrappedObject);
    }

    @Signature
    public void resolve(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg0)) {
            this.getWrappedObject().resolve(Utils.  <io.vertx.core.Future<Void>, Future<Void>  , Void  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.VOID, arg0));
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
            this.getWrappedObject().handler(Utils.convParamHandlerAsyncResult(__ENV__, TypeConverter.VOID, arg0));
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
