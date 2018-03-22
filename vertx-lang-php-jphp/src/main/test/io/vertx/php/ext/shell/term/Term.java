package io.vertx.php.ext.shell.term;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.shell.cli.Completion;
import io.vertx.php.ext.shell.term.SignalHandler;
import io.vertx.php.ext.shell.term.Tty;
import io.vertx.php.ext.shell.session.Session;
@Name("Term")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public interface Term<S extends io.vertx.ext.shell.term.Term> extends IWrapper<S>{
    
    @Signature
    default Memory type(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().type()
    }
    
    @Signature
    default Memory width(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().width()
    }
    
    @Signature
    default Memory height(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().height()
    }

    @Signature
    default Memory resizehandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resizehandler(handler)
    }

    @Signature
    default Memory stdinHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdinHandler(handler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }
    
    @Signature
    default Memory lastAccessedTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lastAccessedTime()
    }

    @Signature
    default Memory echo(Environment __env__, Memory... args) {
        this.getWrappedObject().echo(text)
    }

    @Signature
    default Memory setSession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TermImpl::new, this.getWrappedObject().setSession(session)
    }

    @Signature
    default Memory interruptHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().interruptHandler(handler)
    }

    @Signature
    default Memory suspendHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().suspendHandler(handler)
    }

    @Signature
    default void readline(Environment __env__, Memory... args) {
        this.getWrappedObject().readline(prompt, lineHandler)
    }

    @Signature
    default Memory closeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().closeHandler(handler)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
