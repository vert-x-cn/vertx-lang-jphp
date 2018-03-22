package io.vertx.php.ext.web.templ;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.templ.TemplateEngine;
import io.vertx.php.ext.web.RoutingContext;
@Name("JadeTemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ")
public interface JadeTemplateEngine<S extends io.vertx.ext.web.templ.JadeTemplateEngine> extends IWrapper<S>{

    @Signature
    default void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }
    
    @Signature
    default Memory isCachingEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isCachingEnabled()
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JadeTemplateEngineImpl::new, io.vertx.ext.web.templ.JadeTemplateEngine.create()
    }

    @Signature
    default Memory setExtension(Environment __env__, Memory... args) {
        this.getWrappedObject().setExtension(extension)
    }

    @Signature
    default Memory setMaxCacheSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxCacheSize(maxCacheSize)
    }

}
