package io.vertx.php.ext.shell;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.ShellServer;
import io.vertx.php.core.Vertx;
@Name("ShellService")
@Namespace("io\\vertx\\php\\ext\\shell")
public interface ShellService<S extends io.vertx.ext.shell.ShellService> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellServiceImpl::new, io.vertx.ext.shell.ShellService.create(vertx)
    }
    
    @Signature
    default void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start()
    }

    @Signature
    default void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start()
    }
    
    @Signature
    default Memory server(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ShellServerImpl::new, this.getWrappedObject().server()
    }
    
    @Signature
    default void stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop()
    }

    @Signature
    default void stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop()
    }

}
