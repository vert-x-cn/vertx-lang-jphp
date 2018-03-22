package io.vertx.php.ext.unit.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.TestContext;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TestContextImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\impl")
public class TestContextImpl extends VertxGenWrapper<io.vertx.ext.unit.TestContext> implements TestContext<io.vertx.ext.unit.TestContext>{
    
    public TestContextImpl(Environment env, io.vertx.ext.unit.TestContext wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().put(key, value)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

    @Signature
    public Memory assertNull(Environment __env__, Memory... args) {
        this.getWrappedObject().assertNull(expected)
    }

    @Signature
    public Memory assertNotNull(Environment __env__, Memory... args) {
        this.getWrappedObject().assertNotNull(expected)
    }

    @Signature
    public Memory assertTrue(Environment __env__, Memory... args) {
        this.getWrappedObject().assertTrue(condition)
    }

    @Signature
    public Memory assertFalse(Environment __env__, Memory... args) {
        this.getWrappedObject().assertFalse(condition)
    }

    @Signature
    public Memory assertEquals(Environment __env__, Memory... args) {
        this.getWrappedObject().assertEquals(expected, actual)
    }

    @Signature
    public Memory assertInRange(Environment __env__, Memory... args) {
        this.getWrappedObject().assertInRange(expected, actual, delta)
    }

    @Signature
    public Memory assertNotEquals(Environment __env__, Memory... args) {
        this.getWrappedObject().assertNotEquals(first, second)
    }

    @Signature
    public Memory verify(Environment __env__, Memory... args) {
        this.getWrappedObject().verify(block)
    }

    @Signature
    public void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail()
    }

    @Signature
    public Memory async(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncImpl::new, this.getWrappedObject().async()
    }

    @Signature
    public Memory strictAsync(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncImpl::new, this.getWrappedObject().strictAsync(count)
    }

    @Signature
    public Memory asyncAssertSuccess(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().asyncAssertSuccess()
    }

    @Signature
    public Memory asyncAssertFailure(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().asyncAssertFailure()
    }

}
