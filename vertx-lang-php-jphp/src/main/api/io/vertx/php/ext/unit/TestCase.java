package io.vertx.php.ext.unit;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.unit.TestContext;
@Name("TestCase")
@Namespace("io\\vertx\\php\\ext\\unit")
public interface TestCase<S extends io.vertx.ext.unit.TestCase> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TestCaseImpl::new, io.vertx.ext.unit.TestCase.create(name, testCase)
    }

}
