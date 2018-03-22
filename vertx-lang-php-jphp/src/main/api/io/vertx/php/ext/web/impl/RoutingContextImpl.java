package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.RoutingContext;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RoutingContextImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class RoutingContextImpl extends VertxGenWrapper<io.vertx.ext.web.RoutingContext> implements RoutingContext<io.vertx.ext.web.RoutingContext>{
    
    public RoutingContextImpl(Environment env, io.vertx.ext.web.RoutingContext wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void fail(Environment __env__, Memory... args) {
        this.getWrappedObject().fail(statusCode)
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, obj)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

    @Signature
    public Memory getCookie(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieImpl::new, this.getWrappedObject().getCookie(name)
    }

    @Signature
    public Memory addCookie(Environment __env__, Memory... args) {
        this.getWrappedObject().addCookie(cookie)
    }

    @Signature
    public Memory removeCookie(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieImpl::new, this.getWrappedObject().removeCookie(name)
    }

    @Signature
    public Memory getBodyAsString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getBodyAsString()
    }

    @Signature
    public Memory addHeadersEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().addHeadersEndHandler(handler)
    }

    @Signature
    public Memory removeHeadersEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().removeHeadersEndHandler(handlerID)
    }

    @Signature
    public Memory addBodyEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().addBodyEndHandler(handler)
    }

    @Signature
    public Memory removeBodyEndHandler(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().removeBodyEndHandler(handlerID)
    }

    @Signature
    public void setBody(Environment __env__, Memory... args) {
        this.getWrappedObject().setBody(body)
    }

    @Signature
    public void setSession(Environment __env__, Memory... args) {
        this.getWrappedObject().setSession(session)
    }

    @Signature
    public void setUser(Environment __env__, Memory... args) {
        this.getWrappedObject().setUser(user)
    }

    @Signature
    public void setAcceptableContentType(Environment __env__, Memory... args) {
        this.getWrappedObject().setAcceptableContentType(contentType)
    }

    @Signature
    public void reroute(Environment __env__, Memory... args) {
        this.getWrappedObject().reroute(path)
    }

    @Signature
    public Memory pathParam(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().pathParam(name)
    }

    @Signature
    public Memory queryParam(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().queryParam(query)
    }

}
