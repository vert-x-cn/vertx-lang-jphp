package io.vertx.php.ext.shell.command.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.command.Command;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CommandImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\command\\impl")
public class CommandImpl extends VertxGenWrapper<io.vertx.ext.shell.command.Command> implements Command<io.vertx.ext.shell.command.Command>{
    
    public CommandImpl(Environment env, io.vertx.ext.shell.command.Command wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory createProcess(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ProcessImpl::new, this.getWrappedObject().createProcess()
    }

    @Signature
    public void complete(Environment __env__, Memory... args) {
        this.getWrappedObject().complete(completion)
    }

}
