package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.Router;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RouterImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class RouterImpl extends VertxGenWrapper<io.vertx.ext.web.Router> implements Router<io.vertx.ext.web.Router>{
    
    public RouterImpl(Environment env, io.vertx.ext.web.Router wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory router(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouterImpl::new, io.vertx.ext.web.Router.router(vertx)
    }

    @Signature
    public void accept(Environment __env__, Memory... args) {
        this.getWrappedObject().accept(request)
    }

    @Signature
    public Memory route(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().route()
    }

    @Signature
    public Memory routeWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().routeWithRegex(regex)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().get()
    }

    @Signature
    public Memory getWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().getWithRegex(regex)
    }

    @Signature
    public Memory head(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().head()
    }

    @Signature
    public Memory headWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().headWithRegex(regex)
    }

    @Signature
    public Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().options()
    }

    @Signature
    public Memory optionsWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().optionsWithRegex(regex)
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().put()
    }

    @Signature
    public Memory putWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().putWithRegex(regex)
    }

    @Signature
    public Memory post(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().post()
    }

    @Signature
    public Memory postWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().postWithRegex(regex)
    }

    @Signature
    public Memory delete(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().delete()
    }

    @Signature
    public Memory deleteWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().deleteWithRegex(regex)
    }

    @Signature
    public Memory trace(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().trace()
    }

    @Signature
    public Memory traceWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().traceWithRegex(regex)
    }

    @Signature
    public Memory connect(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().connect()
    }

    @Signature
    public Memory connectWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().connectWithRegex(regex)
    }

    @Signature
    public Memory patch(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().patch()
    }

    @Signature
    public Memory patchWithRegex(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RouteImpl::new, this.getWrappedObject().patchWithRegex(regex)
    }

    @Signature
    public Memory mountSubRouter(Environment __env__, Memory... args) {
        this.getWrappedObject().mountSubRouter(mountPoint, subRouter)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(exceptionHandler)
    }

    @Signature
    public void handleContext(Environment __env__, Memory... args) {
        this.getWrappedObject().handleContext(context)
    }

    @Signature
    public void handleFailure(Environment __env__, Memory... args) {
        this.getWrappedObject().handleFailure(context)
    }

}
