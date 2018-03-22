package io.vertx.php.ext.web.templ.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.templ.TemplateEngine;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("TemplateEngineImpl")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\impl")
public class TemplateEngineImpl extends VertxGenWrapper<io.vertx.ext.web.templ.TemplateEngine> implements TemplateEngine<io.vertx.ext.web.templ.TemplateEngine>{
    
    public TemplateEngineImpl(Environment env, io.vertx.ext.web.templ.TemplateEngine wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }

}
