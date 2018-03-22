package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.Route;
import io.vertx.php.core.http.HttpServerRequest;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.web.RoutingContext;
@Name("Router")
@Namespace("io\\vertx\\php\\ext\\web")
public interface Router<S extends io.vertx.ext.web.Router> extends IWrapper<S>{

    @Signature
    static Memory router(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouterImpl::new, io.vertx.ext.web.Router.router(vertx)
    }

    @Signature
    default void accept(Environment __env__, Memory... args) {
        this.getWrappedObject().accept(request)
    }
    
    @Signature
    default Memory route(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().route()
    }

    @Signature
    default Memory route(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().route()
    }

    @Signature
    default Memory routeWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().routeWithRegex(regex)
    }
    
    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().get()
    }

    @Signature
    default Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().get()
    }

    @Signature
    default Memory getWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().getWithRegex(regex)
    }
    
    @Signature
    default Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().head()
    }

    @Signature
    default Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().head()
    }

    @Signature
    default Memory headWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().headWithRegex(regex)
    }
    
    @Signature
    default Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().options()
    }

    @Signature
    default Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().options()
    }

    @Signature
    default Memory optionsWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().optionsWithRegex(regex)
    }
    
    @Signature
    default Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().put()
    }

    @Signature
    default Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().put()
    }

    @Signature
    default Memory putWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().putWithRegex(regex)
    }
    
    @Signature
    default Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().post()
    }

    @Signature
    default Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().post()
    }

    @Signature
    default Memory postWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().postWithRegex(regex)
    }
    
    @Signature
    default Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().delete()
    }

    @Signature
    default Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().delete()
    }

    @Signature
    default Memory deleteWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().deleteWithRegex(regex)
    }
    
    @Signature
    default Memory trace(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().trace()
    }

    @Signature
    default Memory trace(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().trace()
    }

    @Signature
    default Memory traceWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().traceWithRegex(regex)
    }
    
    @Signature
    default Memory connect(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().connect()
    }

    @Signature
    default Memory connect(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().connect()
    }

    @Signature
    default Memory connectWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().connectWithRegex(regex)
    }
    
    @Signature
    default Memory patch(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().patch()
    }

    @Signature
    default Memory patch(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().patch()
    }

    @Signature
    default Memory patchWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().patchWithRegex(regex)
    }
    
    @Signature
    default Memory getRoutes(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getRoutes()
    }
    
    @Signature
    default Memory clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear()
    }

    @Signature
    default Memory mountSubRouter(Environment __env__, Memory... args) {
        this.getWrappedObject().mountSubRouter(mountPoint, subRouter)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(exceptionHandler)
    }

    @Signature
    default void handleContext(Environment __env__, Memory... args) {
        this.getWrappedObject().handleContext(context)
    }

    @Signature
    default void handleFailure(Environment __env__, Memory... args) {
        this.getWrappedObject().handleFailure(context)
    }

}
