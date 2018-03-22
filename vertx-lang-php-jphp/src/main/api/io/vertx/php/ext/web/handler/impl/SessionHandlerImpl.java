package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.SessionHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SessionHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class SessionHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.SessionHandler> implements SessionHandler<io.vertx.ext.web.handler.SessionHandler>{
    
    public SessionHandlerImpl(Environment env, io.vertx.ext.web.handler.SessionHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionHandlerImpl::new, io.vertx.ext.web.handler.SessionHandler.create(sessionStore)
    }

    @Signature
    public Memory setSessionTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().setSessionTimeout(timeout)
    }

    @Signature
    public Memory setNagHttps(Environment __env__, Memory... args) {
        this.getWrappedObject().setNagHttps(nag)
    }

    @Signature
    public Memory setCookieSecureFlag(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookieSecureFlag(secure)
    }

    @Signature
    public Memory setCookieHttpOnlyFlag(Environment __env__, Memory... args) {
        this.getWrappedObject().setCookieHttpOnlyFlag(httpOnly)
    }

    @Signature
    public Memory setSessionCookieName(Environment __env__, Memory... args) {
        this.getWrappedObject().setSessionCookieName(sessionCookieName)
    }

    @Signature
    public Memory setMinLength(Environment __env__, Memory... args) {
        this.getWrappedObject().setMinLength(minLength)
    }

}
