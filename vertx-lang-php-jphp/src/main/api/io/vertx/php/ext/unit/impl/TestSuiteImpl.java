package io.vertx.php.ext.unit.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.TestSuite;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestSuiteImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\impl")
public class TestSuiteImpl extends VertxGenWrapper<io.vertx.ext.unit.TestSuite> implements TestSuite<io.vertx.ext.unit.TestSuite>{
    
    public TestSuiteImpl(Environment env, io.vertx.ext.unit.TestSuite wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestSuiteImpl::new, io.vertx.ext.unit.TestSuite.create(name)
    }

    @Signature
    public Memory before(Environment __env__, Memory... args) {
        this.getWrappedObject().before(callback)
    }

    @Signature
    public Memory beforeEach(Environment __env__, Memory... args) {
        this.getWrappedObject().beforeEach(callback)
    }

    @Signature
    public Memory after(Environment __env__, Memory... args) {
        this.getWrappedObject().after(callback)
    }

    @Signature
    public Memory afterEach(Environment __env__, Memory... args) {
        this.getWrappedObject().afterEach(callback)
    }

    @Signature
    public Memory test(Environment __env__, Memory... args) {
        this.getWrappedObject().test(name, testCase)
    }

    @Signature
    public Memory run(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestCompletionImpl::new, this.getWrappedObject().run()
    }

}
