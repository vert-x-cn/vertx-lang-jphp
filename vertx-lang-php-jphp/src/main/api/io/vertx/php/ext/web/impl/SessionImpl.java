package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.Session;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SessionImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class SessionImpl extends VertxGenWrapper<io.vertx.ext.web.Session> implements Session<io.vertx.ext.web.Session>{
    
    public SessionImpl(Environment env, io.vertx.ext.web.Session wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(key, obj)
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

}
