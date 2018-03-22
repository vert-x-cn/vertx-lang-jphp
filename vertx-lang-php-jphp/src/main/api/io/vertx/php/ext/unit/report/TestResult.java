package io.vertx.php.ext.unit.report;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.unit.report.Failure;
@Name("TestResult")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
public interface TestResult<S extends io.vertx.ext.unit.report.TestResult> extends IWrapper<S>{
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }
    
    @Signature
    default Memory beginTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().beginTime()
    }
    
    @Signature
    default Memory durationTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().durationTime()
    }
    
    @Signature
    default Memory succeeded(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().succeeded()
    }
    
    @Signature
    default Memory failed(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().failed()
    }
    
    @Signature
    default Memory failure(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FailureImpl::new, this.getWrappedObject().failure()
    }

}
