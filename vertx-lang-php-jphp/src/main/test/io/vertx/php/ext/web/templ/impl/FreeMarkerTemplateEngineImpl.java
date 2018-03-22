package io.vertx.php.ext.web.templ.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.templ.FreeMarkerTemplateEngine;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FreeMarkerTemplateEngineImpl")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\impl")
public class FreeMarkerTemplateEngineImpl extends VertxGenWrapper<io.vertx.ext.web.templ.FreeMarkerTemplateEngine> implements FreeMarkerTemplateEngine<io.vertx.ext.web.templ.FreeMarkerTemplateEngine>{
    
    public FreeMarkerTemplateEngineImpl(Environment env, io.vertx.ext.web.templ.FreeMarkerTemplateEngine wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FreeMarkerTemplateEngineImpl::new, io.vertx.ext.web.templ.FreeMarkerTemplateEngine.create()
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
