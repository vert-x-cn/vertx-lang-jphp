package io.vertx.php.ext.shell.term;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.Router;
import io.vertx.php.ext.shell.term.Term;
import io.vertx.php.ext.auth.AuthProvider;
@Name("TermServer")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public interface TermServer<S extends io.vertx.ext.shell.term.TermServer> extends IWrapper<S>{

    @Signature
    static Memory createSSHTermServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermServerImpl::new, io.vertx.ext.shell.term.TermServer.createSSHTermServer(vertx)
    }

    @Signature
    static Memory createTelnetTermServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermServerImpl::new, io.vertx.ext.shell.term.TermServer.createTelnetTermServer(vertx)
    }

    @Signature
    static Memory createHttpTermServer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermServerImpl::new, io.vertx.ext.shell.term.TermServer.createHttpTermServer(vertx)
    }

    @Signature
    default Memory termHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().termHandler(handler)
    }

    @Signature
    default Memory authProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().authProvider(provider)
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
    default Memory actualPort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().actualPort()
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
