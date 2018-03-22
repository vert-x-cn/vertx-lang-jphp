package io.vertx.php.core.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.MultiMap;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MultiMapImpl")
@Namespace("io\\vertx\\php\\core\\impl")
public class MultiMapImpl extends VertxGenWrapper<io.vertx.core.MultiMap> implements MultiMap<io.vertx.core.MultiMap>{
    
    public MultiMapImpl(Environment env, io.vertx.core.MultiMap wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory caseInsensitiveMultiMap(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, MultiMapImpl::new, io.vertx.core.MultiMap.caseInsensitiveMultiMap()
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(name)
    }

    @Signature
    public Memory getAll(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getAll(name)
    }

    @Signature
    public Memory contains(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().contains(name)
    }

    @Signature
    public Memory add(Environment __env__, Memory... args) {
        this.getWrappedObject().add(name, value)
    }

    @Signature
    public Memory addAll(Environment __env__, Memory... args) {
        this.getWrappedObject().addAll(map)
    }

    @Signature
    public Memory set(Environment __env__, Memory... args) {
        this.getWrappedObject().set(name, value)
    }

    @Signature
    public Memory setAll(Environment __env__, Memory... args) {
        this.getWrappedObject().setAll(map)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove(name)
    }

}
