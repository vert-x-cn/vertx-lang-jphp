package io.vertx.php.ext.web.handler.sockjs;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.handler.sockjs.SockJSSocket;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.Router;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.php.ext.web.handler.sockjs.BridgeEvent;
@Name("SockJSHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\sockjs")
public interface SockJSHandler<S extends io.vertx.ext.web.handler.sockjs.SockJSHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SockJSHandlerImpl::new, io.vertx.ext.web.handler.sockjs.SockJSHandler.create(vertx)
    }

    @Signature
    static void installTestApplications(Environment __env__, Memory... args) {
        io.vertx.ext.web.handler.sockjs.SockJSHandler.installTestApplications(router, vertx)
    }

    @Signature
    default Memory socketHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().socketHandler(handler)
    }

    @Signature
    default Memory bridge(Environment __env__, Memory... args) {
        this.getWrappedObject().bridge(bridgeOptions)
    }

}
