package io.vertx.php.ext.unit;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.unit.Async;
@Name("TestContext")
@Namespace("io\\vertx\\php\\ext\\unit")
public interface TestContext<S extends io.vertx.ext.unit.TestContext> extends IWrapper<S>{

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().put(key, value)
    }

    @Signature
    default Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

    @Signature
    default Memory assertNull(Environment __env__, Memory... args) {
        this.getWrappedObject().assertNull(expected)
    }

    @Signature
    default Memory assertNotNull(Environment __env__, Memory... args) {
        this.getWrappedObject().assertNotNull(expected)
    }

    @Signature
    default Memory assertTrue(Environment __env__, Memory... args) {
        this.getWrappedObject().assertTrue(condition)
    }

    @Signature
    default Memory assertFalse(Environment __env__, Memory... args) {
        this.getWrappedObject().assertFalse(condition)
    }

    @Signature
    default Memory assertEquals(Environment __env__, Memory... args) {
        this.getWrappedObject().assertEquals(expected, actual)
    }

    @Signature
    default Memory assertInRange(Environment __env__, Memory... args) {
        this.getWrappedObject().assertInRange(expected, actual, delta)
    }

    @Signature
    default Memory assertNotEquals(Environment __env__, Memory... args) {
        this.getWrappedObject().assertNotEquals(first, second)
    }

    @Signature
    default Memory verify(Environment __env__, Memory... args) {
        this.getWrappedObject().verify(block)
    }
    
    @Signature
    default void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail()
    }

    @Signature
    default void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail()
    }
    
    @Signature
    default Memory async(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncImpl::new, this.getWrappedObject().async()
    }

    @Signature
    default Memory async(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncImpl::new, this.getWrappedObject().async()
    }

    @Signature
    default Memory strictAsync(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncImpl::new, this.getWrappedObject().strictAsync(count)
    }
    
    @Signature
    default Memory asyncAssertSuccess(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().asyncAssertSuccess()
    }

    @Signature
    default Memory asyncAssertSuccess(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().asyncAssertSuccess()
    }
    
    @Signature
    default Memory asyncAssertFailure(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().asyncAssertFailure()
    }

    @Signature
    default Memory asyncAssertFailure(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().asyncAssertFailure()
    }
    
    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().exceptionHandler()
    }

}
