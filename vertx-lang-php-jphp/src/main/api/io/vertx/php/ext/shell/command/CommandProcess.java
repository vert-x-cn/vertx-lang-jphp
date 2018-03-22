package io.vertx.php.ext.shell.command;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.cli.CommandLine;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.cli.CliToken;
import io.vertx.php.ext.shell.term.Tty;
import io.vertx.php.ext.shell.session.Session;
@Name("CommandProcess")
@Namespace("io\\vertx\\php\\ext\\shell\\command")
public interface CommandProcess<S extends io.vertx.ext.shell.command.CommandProcess> extends IWrapper<S>{
    
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
    default Memory vertx(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, VertxImpl::new, this.getWrappedObject().vertx()
    }
    
    @Signature
    default Memory argsTokens(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().argsTokens()
    }
    
    @Signature
    default Memory args(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().args()
    }
    
    @Signature
    default Memory commandLine(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CommandLineImpl::new, this.getWrappedObject().commandLine()
    }
    
    @Signature
    default Memory session(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().session()
    }
    
    @Signature
    default Memory isForeground(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isForeground()
    }

    @Signature
    default Memory stdinHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().stdinHandler(handler)
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
    default Memory resumeHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resumeHandler(handler)
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(handler)
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(data)
    }

    @Signature
    default Memory backgroundHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().backgroundHandler(handler)
    }

    @Signature
    default Memory foregroundHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().foregroundHandler(handler)
    }

    @Signature
    default Memory resizehandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resizehandler(handler)
    }
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }

}
