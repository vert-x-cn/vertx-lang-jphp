package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.Locale;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("LocaleImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class LocaleImpl extends VertxGenWrapper<io.vertx.ext.web.Locale> implements Locale<io.vertx.ext.web.Locale>{
    
    public LocaleImpl(Environment env, io.vertx.ext.web.Locale wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocaleImpl::new, io.vertx.ext.web.Locale.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocaleImpl::new, io.vertx.ext.web.Locale.create()
    }

}
