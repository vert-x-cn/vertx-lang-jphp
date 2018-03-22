package io.vertx.php.ext.unit.report;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.unit.report.TestResult;
@Name("TestCaseReport")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
public interface TestCaseReport<S extends io.vertx.ext.unit.report.TestCaseReport> extends IWrapper<S>{
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(handler)
    }

}
