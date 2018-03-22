package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.templ.TemplateEngine;
import io.vertx.php.ext.web.RoutingContext;
@Name("TemplateHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface TemplateHandler<S extends io.vertx.ext.web.handler.TemplateHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    default Memory setIndexTemplate(Environment __env__, Memory... args) {
        this.getWrappedObject().setIndexTemplate(indexTemplate)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TemplateHandlerImpl::new, io.vertx.ext.web.handler.TemplateHandler.create(engine)
    }

}
