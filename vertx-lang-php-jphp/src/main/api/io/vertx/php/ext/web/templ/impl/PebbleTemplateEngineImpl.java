package io.vertx.php.ext.web.templ.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.templ.PebbleTemplateEngine;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("PebbleTemplateEngineImpl")
@Namespace("io\\vertx\\php\\ext\\web\\templ\\impl")
public class PebbleTemplateEngineImpl extends VertxGenWrapper<io.vertx.ext.web.templ.PebbleTemplateEngine> implements PebbleTemplateEngine<io.vertx.ext.web.templ.PebbleTemplateEngine>{
    
    public PebbleTemplateEngineImpl(Environment env, io.vertx.ext.web.templ.PebbleTemplateEngine wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void render(Environment __env__, Memory... args) {
        this.getWrappedObject().render(context, templateFileName, handler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PebbleTemplateEngineImpl::new, io.vertx.ext.web.templ.PebbleTemplateEngine.create(vertx)
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
