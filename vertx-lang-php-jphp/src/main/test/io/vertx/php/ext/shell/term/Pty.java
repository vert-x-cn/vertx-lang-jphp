package io.vertx.php.ext.shell.term;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.term.Tty;
@Name("Pty")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public interface Pty<S extends io.vertx.ext.shell.term.Pty> extends IWrapper<S>{
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PtyImpl::new, io.vertx.ext.shell.term.Pty.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PtyImpl::new, io.vertx.ext.shell.term.Pty.create()
    }

    @Signature
    default Memory stdoutHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdoutHandler(handler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    default Memory setSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setSize(width, height)
    }
    
    @Signature
    default Memory slave(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TtyImpl::new, this.getWrappedObject().slave()
    }

}
