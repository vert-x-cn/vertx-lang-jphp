package io.vertx.php.ext.shell;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.term.TermServer;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.Shell;
import io.vertx.php.ext.shell.command.CommandResolver;
import io.vertx.php.ext.shell.term.Term;
@Name("ShellServer")
@Namespace("io\\vertx\\php\\ext\\shell")
public interface ShellServer<S extends io.vertx.ext.shell.ShellServer> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellServerImpl::new, io.vertx.ext.shell.ShellServer.create(vertx)
    }

    @Signature
    default Memory registerCommandResolver(Environment __env__, Memory... args) {
        this.getWrappedObject().registerCommandResolver(resolver)
    }

    @Signature
    default Memory registerTermServer(Environment __env__, Memory... args) {
        this.getWrappedObject().registerTermServer(termServer)
    }
    
    @Signature
    default Memory createShell(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellImpl::new, this.getWrappedObject().createShell()
    }

    @Signature
    default Memory createShell(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellImpl::new, this.getWrappedObject().createShell()
    }
    
    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }

    @Signature
    default Memory listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen()
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
