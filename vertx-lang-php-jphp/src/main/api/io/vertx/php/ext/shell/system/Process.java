package io.vertx.php.ext.shell.system;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.term.Tty;
import io.vertx.php.ext.shell.session.Session;
@Name("Process")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
public interface Process<S extends io.vertx.ext.shell.system.Process> extends IWrapper<S>{
    
    @Signature
    default Memory status(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().status()
    }
    
    @Signature
    default Memory exitCode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().exitCode()
    }

    @Signature
    default Memory setTty(Environment __env__, Memory... args) {
        this.getWrappedObject().setTty(tty)
    }
    
    @Signature
    default Memory getTty(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TtyImpl::new, this.getWrappedObject().getTty()
    }

    @Signature
    default Memory setSession(Environment __env__, Memory... args) {
        this.getWrappedObject().setSession(session)
    }
    
    @Signature
    default Memory getSession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().getSession()
    }

    @Signature
    default Memory terminatedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().terminatedHandler(handler)
    }
    
    @Signature
    default void run(Environment __env__, Memory... args) {
        this.getWrappedObject().run()
    }

    @Signature
    default void run(Environment __env__, Memory... args) {
        this.getWrappedObject().run()
    }
    
    @Signature
    default Memory interrupt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().interrupt()
    }

    @Signature
    default Memory interrupt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().interrupt()
    }
    
    @Signature
    default void resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default void resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }
    
    @Signature
    default void suspend(Environment __env__, Memory... args) {
        this.getWrappedObject().suspend()
    }

    @Signature
    default void suspend(Environment __env__, Memory... args) {
        this.getWrappedObject().suspend()
    }
    
    @Signature
    default void terminate(Environment __env__, Memory... args) {
        this.getWrappedObject().terminate()
    }

    @Signature
    default void terminate(Environment __env__, Memory... args) {
        this.getWrappedObject().terminate()
    }
    
    @Signature
    default void toBackground(Environment __env__, Memory... args) {
        this.getWrappedObject().toBackground()
    }

    @Signature
    default void toBackground(Environment __env__, Memory... args) {
        this.getWrappedObject().toBackground()
    }
    
    @Signature
    default void toForeground(Environment __env__, Memory... args) {
        this.getWrappedObject().toForeground()
    }

    @Signature
    default void toForeground(Environment __env__, Memory... args) {
        this.getWrappedObject().toForeground()
    }

}
