package io.vertx.php.ext.unit.report.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.report.TestSuiteReport;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestSuiteReportImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\report\\impl")
public class TestSuiteReportImpl extends VertxGenWrapper<io.vertx.ext.unit.report.TestSuiteReport> implements TestSuiteReport<io.vertx.ext.unit.report.TestSuiteReport>{
    
    public TestSuiteReportImpl(Environment env, io.vertx.ext.unit.report.TestSuiteReport wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

}
