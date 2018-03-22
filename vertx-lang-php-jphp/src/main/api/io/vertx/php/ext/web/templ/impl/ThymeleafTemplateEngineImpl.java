package io.vertx.php.ext.web.templ.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.templ.ThymeleafTemplateEngine;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ThymeleafTemplateEngineImpl")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\impl")
public class ThymeleafTemplateEngineImpl extends VertxGenWrapper<io.vertx.ext.web.templ.ThymeleafTemplateEngine> implements ThymeleafTemplateEngine<io.vertx.ext.web.templ.ThymeleafTemplateEngine>{
    
    public ThymeleafTemplateEngineImpl(Environment env, io.vertx.ext.web.templ.ThymeleafTemplateEngine wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ThymeleafTemplateEngineImpl::new, io.vertx.ext.web.templ.ThymeleafTemplateEngine.create()
    }

    @Signature
    public Memory setMode(Environment __env__, Memory... args) {
        this.getWrappedObject().setMode(mode)
    }

}
