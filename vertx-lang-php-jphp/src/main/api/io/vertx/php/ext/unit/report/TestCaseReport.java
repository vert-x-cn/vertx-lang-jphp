package io.vertx.php.ext.unit.report;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.unit.report.TestResult;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestCaseReport")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
@SuppressWarnings("ALL")
public class TestCaseReport extends VertxGenVariable0Wrapper<io.vertx.ext.unit.report.TestCaseReport>{
    
    private TestCaseReport(Environment env, io.vertx.ext.unit.report.TestCaseReport wrappedObject){
        super(env, wrappedObject);
    }
    public static  TestCaseReport __create(Environment env, io.vertx.ext.unit.report.TestCaseReport wrappedObject){
        return new TestCaseReport(env, wrappedObject);
    }

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.ext.unit.report.TestResult, TestResult>create0(TestResult.class, TestResult::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
