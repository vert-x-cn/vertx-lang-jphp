package io.vertx.php.ext.shell.system;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.system.Process;
import io.vertx.php.ext.shell.term.Tty;
import io.vertx.php.ext.shell.session.Session;
@Name("Job")
@Namespace("io\\vertx\\php\\ext\\shell\\system")
public interface Job<S extends io.vertx.ext.shell.system.Job> extends IWrapper<S>{
    
    @Signature
    default Memory id(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().id()
    }
    
    @Signature
    default Memory status(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().status()
    }
    
    @Signature
    default Memory lastStopped(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lastStopped()
    }
    
    @Signature
    default Memory line(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().line()
    }

    @Signature
    default Memory setTty(Environment __env__, Memory... args) {
        this.getWrappedObject().setTty(tty)
    }

    @Signature
    default Memory setSession(Environment __env__, Memory... args) {
        this.getWrappedObject().setSession(session)
    }

    @Signature
    default Memory statusUpdateHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().statusUpdateHandler(handler)
    }
    
    @Signature
    default Memory run(Environment __env__, Memory... args) {
        this.getWrappedObject().run()
    }
    
    @Signature
    default Memory interrupt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().interrupt()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().resume()
    }

    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JobImpl::new, this.getWrappedObject().resume()
    }
    
    @Signature
    default Memory toBackground(Environment __env__, Memory... args) {
        this.getWrappedObject().toBackground()
    }
    
    @Signature
    default Memory toForeground(Environment __env__, Memory... args) {
        this.getWrappedObject().toForeground()
    }
    
    @Signature
    default Memory suspend(Environment __env__, Memory... args) {
        this.getWrappedObject().suspend()
    }
    
    @Signature
    default void terminate(Environment __env__, Memory... args) {
        this.getWrappedObject().terminate()
    }
    
    @Signature
    default Memory process(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ProcessImpl::new, this.getWrappedObject().process()
    }

}
