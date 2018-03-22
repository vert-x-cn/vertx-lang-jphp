package io.vertx.php.ext.shell.command;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.core.cli.CLI;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.system.Process;
@Name("Command")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public interface Command<S extends io.vertx.ext.shell.command.Command> extends IWrapper<S>{
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }
    
    @Signature
    default Memory cli(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CLIImpl::new, this.getWrappedObject().cli()
    }
    
    @Signature
    default Memory createProcess(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ProcessImpl::new, this.getWrappedObject().createProcess()
    }

    @Signature
    default Memory createProcess(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ProcessImpl::new, this.getWrappedObject().createProcess()
    }

    @Signature
    default void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete(completion)
    }

}
