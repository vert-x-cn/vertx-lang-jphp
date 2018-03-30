package io.vertx.php.ext.unit.report;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("TestResult")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
@SuppressWarnings("ALL")
public class TestResult extends VertxGenVariable0Wrapper<io.vertx.ext.unit.report.TestResult>{
    
    private TestResult(Environment env, io.vertx.ext.unit.report.TestResult wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestResult __create(Environment env, io.vertx.ext.unit.report.TestResult wrappedObject){
        return new TestResult(env, wrappedObject);
    }

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

    @Signature
    public Memory beginTime(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().beginTime());
    }/*1*/

    @Signature
    public Memory durationTime(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().durationTime());
    }/*1*/

    @Signature
    public Memory succeeded(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().succeeded());
    }/*1*/

    @Signature
    public Memory failed(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().failed());
    }/*1*/

    @Signature
    public Memory failure(Environment __ENV__) {
        return Utils.<io.vertx.ext.unit.report.Failure, Failure>convReturnVertxGenVariable0(__ENV__, Failure.class, Failure::__create, this.getWrappedObject().failure());
    }/*1*/

}
