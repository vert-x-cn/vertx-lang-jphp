package io.vertx.php.ext.shell.term;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.handler.sockjs.SockJSSocket;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.shell.term.Term;
@Name("SockJSTermHandler")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
public interface SockJSTermHandler<S extends io.vertx.ext.shell.term.SockJSTermHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SockJSTermHandlerImpl::new, io.vertx.ext.shell.term.SockJSTermHandler.create(vertx, charset)
    }

    @Signature
    default Memory termHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().termHandler(handler)
    }

}
