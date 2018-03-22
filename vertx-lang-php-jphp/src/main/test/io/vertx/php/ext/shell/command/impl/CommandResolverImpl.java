package io.vertx.php.ext.shell.command.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.command.CommandResolver;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandResolverImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\command\\impl")
public class CommandResolverImpl extends VertxGenWrapper<io.vertx.ext.shell.command.CommandResolver> implements CommandResolver<io.vertx.ext.shell.command.CommandResolver>{
    
    public CommandResolverImpl(Environment env, io.vertx.ext.shell.command.CommandResolver wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory baseCommands(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandResolverImpl::new, io.vertx.ext.shell.command.CommandResolver.baseCommands(vertx)
    }

    @Signature
    public Memory getCommand(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandImpl::new, this.getWrappedObject().getCommand(name)
    }

}
