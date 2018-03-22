package io.vertx.php.ext.shell.command;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.command.Command;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.core.cli.CLI;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.command.CommandProcess;
@Name("CommandBuilder")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public interface CommandBuilder<S extends io.vertx.ext.shell.command.CommandBuilder> extends IWrapper<S>{

    @Signature
    static Memory command(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandBuilderImpl::new, io.vertx.ext.shell.command.CommandBuilder.command(name)
    }

    @Signature
    default Memory processHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().processHandler(handler)
    }

    @Signature
    default Memory completionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().completionHandler(handler)
    }

    @Signature
    default Memory build(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandImpl::new, this.getWrappedObject().build(vertx)
    }

}
