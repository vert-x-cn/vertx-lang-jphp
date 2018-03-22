package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.TemplateHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TemplateHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class TemplateHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.TemplateHandler> implements TemplateHandler<io.vertx.ext.web.handler.TemplateHandler>{
    
    public TemplateHandlerImpl(Environment env, io.vertx.ext.web.handler.TemplateHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }

    @Signature
    public Memory setIndexTemplate(Environment __env__, Memory... args) {
        this.getWrappedObject().setIndexTemplate(indexTemplate)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, TemplateHandlerImpl::new, io.vertx.ext.web.handler.TemplateHandler.create(engine)
    }

}
