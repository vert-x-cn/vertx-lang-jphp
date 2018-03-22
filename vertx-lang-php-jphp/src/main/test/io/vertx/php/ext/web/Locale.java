package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Locale")
@Namespace("io\\vertx\\php\\ext\\web")
public interface Locale<S extends io.vertx.ext.web.Locale> extends IWrapper<S>{
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocaleImpl::new, io.vertx.ext.web.Locale.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocaleImpl::new, io.vertx.ext.web.Locale.create()
    }
    
    @Signature
    default Memory language(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().language()
    }
    
    @Signature
    default Memory country(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().country()
    }
    
    @Signature
    default Memory variant(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().variant()
    }

}
