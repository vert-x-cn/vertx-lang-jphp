package io.vertx.php.ext.shell.command.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.command.CommandBuilder;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandBuilderImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\command\\impl")
public class CommandBuilderImpl extends VertxGenWrapper<io.vertx.ext.shell.command.CommandBuilder> implements CommandBuilder<io.vertx.ext.shell.command.CommandBuilder>{
    
    public CommandBuilderImpl(Environment env, io.vertx.ext.shell.command.CommandBuilder wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory command(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandBuilderImpl::new, io.vertx.ext.shell.command.CommandBuilder.command(name)
    }

    @Signature
    public Memory processHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().processHandler(handler)
    }

    @Signature
    public Memory completionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().completionHandler(handler)
    }

    @Signature
    public Memory build(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandImpl::new, this.getWrappedObject().build(vertx)
    }

}
