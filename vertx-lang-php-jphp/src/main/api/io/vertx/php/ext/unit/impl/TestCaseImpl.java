package io.vertx.php.ext.unit.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.TestCase;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestCaseImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\impl")
public class TestCaseImpl extends VertxGenWrapper<io.vertx.ext.unit.TestCase> implements TestCase<io.vertx.ext.unit.TestCase>{
    
    public TestCaseImpl(Environment env, io.vertx.ext.unit.TestCase wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestCaseImpl::new, io.vertx.ext.unit.TestCase.create(name, testCase)
    }

}
