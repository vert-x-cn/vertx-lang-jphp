package io.vertx.php.ext.unit.report.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.report.TestResult;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestResultImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\report\\impl")
public class TestResultImpl extends VertxGenWrapper<io.vertx.ext.unit.report.TestResult> implements TestResult<io.vertx.ext.unit.report.TestResult>{
    
    public TestResultImpl(Environment env, io.vertx.ext.unit.report.TestResult wrappedObject){
        super(env, wrappedObject);
    }

}
