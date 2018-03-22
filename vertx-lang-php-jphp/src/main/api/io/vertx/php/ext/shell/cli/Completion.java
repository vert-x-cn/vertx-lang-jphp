package io.vertx.php.ext.shell.cli;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.session.Session;
@Name("Completion")
@Namespace("io\\vertx\\php\\ext\\shell\\cli")
public interface Completion<S extends io.vertx.ext.shell.cli.Completion> extends IWrapper<S>{
    
    @Signature
    default Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, this.getWrappedObject().vertx()
    }
    
    @Signature
    default Memory session(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().session()
    }
    
    @Signature
    default Memory rawLine(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().rawLine()
    }
    
    @Signature
    default Memory lineTokens(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lineTokens()
    }

    @Signature
    default void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete(candidates)
    }

}
