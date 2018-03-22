package io.vertx.php.ext.web.templ;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.templ.TemplateEngine;
import io.vertx.php.ext.web.RoutingContext;
@Name("ThymeleafTemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ")
public interface ThymeleafTemplateEngine<S extends io.vertx.ext.web.templ.ThymeleafTemplateEngine> extends IWrapper<S>{

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
        return Utils.convReturnVertxGen(__env__, ThymeleafTemplateEngineImpl::new, io.vertx.ext.web.templ.ThymeleafTemplateEngine.create()
    }

    @Signature
    default Memory setMode(Environment __env__, Memory... args) {
        this.getWrappedObject().setMode(mode)
    }

}
