package io.vertx.php.ext.shell.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.ShellService;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ShellServiceImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\impl")
public class ShellServiceImpl extends VertxGenWrapper<io.vertx.ext.shell.ShellService> implements ShellService<io.vertx.ext.shell.ShellService>{
    
    public ShellServiceImpl(Environment env, io.vertx.ext.shell.ShellService wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellServiceImpl::new, io.vertx.ext.shell.ShellService.create(vertx)
    }

    @Signature
    public void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start()
    }

    @Signature
    public void stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop()
    }

}
