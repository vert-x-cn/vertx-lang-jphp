package io.vertx.php.ext.unit.report.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.report.TestCaseReport;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestCaseReportImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\report\\impl")
public class TestCaseReportImpl extends VertxGenWrapper<io.vertx.ext.unit.report.TestCaseReport> implements TestCaseReport<io.vertx.ext.unit.report.TestCaseReport>{
    
    public TestCaseReportImpl(Environment env, io.vertx.ext.unit.report.TestCaseReport wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(handler)
    }

}
