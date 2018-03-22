package io.vertx.php.ext.web.templ;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.ext.web.RoutingContext;
@Name("TemplateEngine")
@Namespace("io\\vertx\\php\\ext\\web\\templ")
public interface TemplateEngine<S extends io.vertx.ext.web.templ.TemplateEngine> extends IWrapper<S>{

    @Signature
    default void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }
    
    @Signature
    default Memory isCachingEnabled(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isCachingEnabled()
    }

}
