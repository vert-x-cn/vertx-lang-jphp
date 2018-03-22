package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.Cookie;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("CookieImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class CookieImpl extends VertxGenWrapper<io.vertx.ext.web.Cookie> implements Cookie<io.vertx.ext.web.Cookie>{
    
    public CookieImpl(Environment env, io.vertx.ext.web.Cookie wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory cookie(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieImpl::new, io.vertx.ext.web.Cookie.cookie(name, value)
    }

    @Signature
    public Memory setValue(Environment __env__, Memory... args) {
        this.getWrappedObject().setValue(value)
    }

    @Signature
    public Memory setDomain(Environment __env__, Memory... args) {
        this.getWrappedObject().setDomain(domain)
    }

    @Signature
    public Memory setPath(Environment __env__, Memory... args) {
        this.getWrappedObject().setPath(path)
    }

    @Signature
    public Memory setMaxAge(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxAge(maxAge)
    }

    @Signature
    public Memory setSecure(Environment __env__, Memory... args) {
        this.getWrappedObject().setSecure(secure)
    }

    @Signature
    public Memory setHttpOnly(Environment __env__, Memory... args) {
        this.getWrappedObject().setHttpOnly(httpOnly)
    }

    @Signature
    public void setChanged(Environment __env__, Memory... args) {
        this.getWrappedObject().setChanged(changed)
    }

}
