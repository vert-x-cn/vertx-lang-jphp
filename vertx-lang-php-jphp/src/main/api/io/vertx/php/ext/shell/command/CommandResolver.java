package io.vertx.php.ext.shell.command;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.command.Command;
import io.vertx.php.core.Vertx;
@Name("CommandResolver")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public interface CommandResolver<S extends io.vertx.ext.shell.command.CommandResolver> extends IWrapper<S>{

    @Signature
    static Memory baseCommands(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandResolverImpl::new, io.vertx.ext.shell.command.CommandResolver.baseCommands(vertx)
    }
    
    @Signature
    default Memory commands(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().commands()
    }

    @Signature
    default Memory getCommand(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandImpl::new, this.getWrappedObject().getCommand(name)
    }

}
