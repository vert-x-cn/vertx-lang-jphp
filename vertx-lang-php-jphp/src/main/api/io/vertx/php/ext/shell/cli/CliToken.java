package io.vertx.php.ext.shell.cli;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("CliToken")
@Namespace("io\\vertx\\php\\ext\\shell\\cli")
public interface CliToken<S extends io.vertx.ext.shell.cli.CliToken> extends IWrapper<S>{

    @Signature
    static Memory createText(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CliTokenImpl::new, io.vertx.ext.shell.cli.CliToken.createText(text)
    }

    @Signature
    static Memory createBlank(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CliTokenImpl::new, io.vertx.ext.shell.cli.CliToken.createBlank(blank)
    }
    
    @Signature
    default Memory value(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().value()
    }
    
    @Signature
    default Memory raw(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().raw()
    }
    
    @Signature
    default Memory isText(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isText()
    }
    
    @Signature
    default Memory isBlank(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isBlank()
    }

    @Signature
    static Memory tokenize(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.shell.cli.CliToken.tokenize(s)
    }

}
