package io.vertx.php.ext.unit.report;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("Failure")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
@SuppressWarnings("ALL")
public class Failure extends VertxGenVariable0Wrapper<io.vertx.ext.unit.report.Failure>{
    
    private Failure(Environment env, io.vertx.ext.unit.report.Failure wrappedObject){
        super(env, wrappedObject);
    }
    public static  Failure __create(Environment env, io.vertx.ext.unit.report.Failure wrappedObject){
        return new Failure(env, wrappedObject);
    }

    @Signature
    public Memory isError(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isError());
    }/*1*/

    @Signature
    public Memory message(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().message());
    }/*1*/

    @Signature
    public Memory stackTrace(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().stackTrace());
    }/*1*/

}
