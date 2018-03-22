package io.vertx.php.ext.unit;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.unit.TestContext;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.unit.TestCompletion;
@Name("TestSuite")
@Namespace("io\\vertx\\php\\ext\\unit")
public interface TestSuite<S extends io.vertx.ext.unit.TestSuite> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestSuiteImpl::new, io.vertx.ext.unit.TestSuite.create(name)
    }

    @Signature
    default Memory before(Environment __env__, Memory... args) {
        this.getWrappedObject().before(callback)
    }

    @Signature
    default Memory beforeEach(Environment __env__, Memory... args) {
        this.getWrappedObject().beforeEach(callback)
    }

    @Signature
    default Memory after(Environment __env__, Memory... args) {
        this.getWrappedObject().after(callback)
    }

    @Signature
    default Memory afterEach(Environment __env__, Memory... args) {
        this.getWrappedObject().afterEach(callback)
    }

    @Signature
    default Memory test(Environment __env__, Memory... args) {
        this.getWrappedObject().test(name, testCase)
    }
    
    @Signature
    default Memory run(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestCompletionImpl::new, this.getWrappedObject().run()
    }

    @Signature
    default Memory run(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestCompletionImpl::new, this.getWrappedObject().run()
    }

}
