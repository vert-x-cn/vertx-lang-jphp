package io.vertx.php.config.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.config.ConfigRetriever;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ConfigRetrieverImpl")
@Namespace("io\\vertx\\php\\config\\impl")
public class ConfigRetrieverImpl extends VertxGenWrapper<io.vertx.config.ConfigRetriever> implements ConfigRetriever<io.vertx.config.ConfigRetriever>{
    
    public ConfigRetrieverImpl(Environment env, io.vertx.config.ConfigRetriever wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ConfigRetrieverImpl::new, io.vertx.config.ConfigRetriever.create(vertx)
    }

    @Signature
    public static Memory getConfigAsFuture(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, FutureImpl::new, io.vertx.config.ConfigRetriever.getConfigAsFuture(retriever)
    }

    @Signature
    public void getConfig(Environment __env__, Memory... args) {
        this.getWrappedObject().getConfig(completionHandler)
    }

    @Signature
    public void listen(Environment __env__, Memory... args) {
        this.getWrappedObject().listen(listener)
    }

}
