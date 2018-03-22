package io.vertx.php.ext.unit.report;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Failure")
@Namespace("io\\vertx\\php\\ext\\unit\\report")
public interface Failure<S extends io.vertx.ext.unit.report.Failure> extends IWrapper<S>{
    
    @Signature
    default Memory isError(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isError()
    }
    
    @Signature
    default Memory message(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().message()
    }
    
    @Signature
    default Memory stackTrace(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().stackTrace()
    }

}
