package io.vertx.php.ext.shell.command;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.command.Command;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.command.CommandResolver;
@Name("CommandRegistry")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public interface CommandRegistry<S extends io.vertx.ext.shell.command.CommandRegistry> extends IWrapper<S>{
    
    @Signature
    default Memory commands(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().commands()
    }

    @Signature
    default Memory getCommand(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandImpl::new, this.getWrappedObject().getCommand(name)
    }

    @Signature
    static Memory getShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandRegistryImpl::new, io.vertx.ext.shell.command.CommandRegistry.getShared(vertx)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandRegistryImpl::new, io.vertx.ext.shell.command.CommandRegistry.create(vertx)
    }

    @Signature
    default Memory registerCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCommand(command)
    }

    @Signature
    default Memory registerCommands(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCommands(commands)
    }

    @Signature
    default Memory unregisterCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().unregisterCommand(commandName)
    }

}
