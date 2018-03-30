package io.vertx.php.ext.unit.report;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.ext.unit.report.TestCaseReport;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestSuiteReport")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
@SuppressWarnings("ALL")
public class TestSuiteReport extends VertxGenVariable0Wrapper<io.vertx.ext.unit.report.TestSuiteReport>{
    
    private TestSuiteReport(Environment env, io.vertx.ext.unit.report.TestSuiteReport wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestSuiteReport __create(Environment env, io.vertx.ext.unit.report.TestSuiteReport wrappedObject){
        return new TestSuiteReport(env, wrappedObject);
    }

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

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
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.report.TestCaseReport, TestCaseReport>create0(TestCaseReport.class, TestCaseReport::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
