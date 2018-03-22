package io.vertx.php.ext.shell.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.shell.ShellServer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ShellServerImpl")
@Namespace("io\\vertx\\php\\ext\\shell\\impl")
public class ShellServerImpl extends VertxGenWrapper<io.vertx.ext.shell.ShellServer> implements ShellServer<io.vertx.ext.shell.ShellServer>{
    
    public ShellServerImpl(Environment env, io.vertx.ext.shell.ShellServer wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellServerImpl::new, io.vertx.ext.shell.ShellServer.create(vertx)
    }

    @Signature
    public Memory registerCommandResolver(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCommandResolver(resolver)
    }

    @Signature
    public Memory registerTermServer(Environment __env__, Memory... args) {
        this.getWrappedObject().registerTermServer(termServer)
    }

    @Signature
    public Memory createShell(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellImpl::new, this.getWrappedObject().createShell()
    }

    @Signature
    public Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
