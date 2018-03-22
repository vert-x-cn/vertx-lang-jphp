package io.vertx.php.ext.shell.command.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.command.CommandRegistry;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandRegistryImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\command\\impl")
public class CommandRegistryImpl extends VertxGenWrapper<io.vertx.ext.shell.command.CommandRegistry> implements CommandRegistry<io.vertx.ext.shell.command.CommandRegistry>{
    
    public CommandRegistryImpl(Environment env, io.vertx.ext.shell.command.CommandRegistry wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory getCommand(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandImpl::new, this.getWrappedObject().getCommand(name)
    }

    @Signature
    public static Memory getShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandRegistryImpl::new, io.vertx.ext.shell.command.CommandRegistry.getShared(vertx)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandRegistryImpl::new, io.vertx.ext.shell.command.CommandRegistry.create(vertx)
    }

    @Signature
    public Memory registerCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCommand(command)
    }

    @Signature
    public Memory registerCommands(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCommands(commands)
    }

    @Signature
    public Memory unregisterCommand(Environment __env__, Memory... args) {
        this.getWrappedObject().unregisterCommand(commandName)
    }

}
