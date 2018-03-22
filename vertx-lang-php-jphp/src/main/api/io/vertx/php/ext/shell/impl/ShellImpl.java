package io.vertx.php.ext.shell.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.Shell;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ShellImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\impl")
public class ShellImpl extends VertxGenWrapper<io.vertx.ext.shell.Shell> implements Shell<io.vertx.ext.shell.Shell>{
    
    public ShellImpl(Environment env, io.vertx.ext.shell.Shell wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory createJob(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().createJob(line)
    }

}
