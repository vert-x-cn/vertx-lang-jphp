package io.vertx.php.ext.web.templ.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.templ.JadeTemplateEngine;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JadeTemplateEngineImpl")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\impl")
public class JadeTemplateEngineImpl extends VertxGenWrapper<io.vertx.ext.web.templ.JadeTemplateEngine> implements JadeTemplateEngine<io.vertx.ext.web.templ.JadeTemplateEngine>{
    
    public JadeTemplateEngineImpl(Environment env, io.vertx.ext.web.templ.JadeTemplateEngine wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JadeTemplateEngineImpl::new, io.vertx.ext.web.templ.JadeTemplateEngine.create()
    }

    @Signature
    public Memory setExtension(Environment __env__, Memory... args) {
        this.getWrappedObject().setExtension(extension)
    }

    @Signature
    public Memory setMaxCacheSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setMaxCacheSize(maxCacheSize)
    }

}
