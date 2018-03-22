package io.vertx.php.core.shareddata.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.shareddata.LocalMap;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("LocalMapImpl")
@Namespace("io\\vertx\\php\\core\\shareddata\\impl")
public class LocalMapImpl<K, V> extends VertxGenWrapper<io.vertx.core.shareddata.LocalMap<K,V>> implements LocalMap<io.vertx.core.shareddata.LocalMap<K,V>, K, V>{
    
    public LocalMapImpl(Environment env, io.vertx.core.shareddata.LocalMap<K,V> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory get(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().get(key)
    }

    @Signature
    public Memory put(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().put(key, value)
    }

    @Signature
    public Memory remove(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().remove(key)
    }

    @Signature
    public Memory putIfAbsent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().putIfAbsent(key, value)
    }

    @Signature
    public Memory removeIfPresent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().removeIfPresent(key, value)
    }

    @Signature
    public Memory replaceIfPresent(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().replaceIfPresent(key, oldValue, newValue)
    }

    @Signature
    public Memory replace(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().replace(key, value)
    }

    @Signature
    public Memory containsKey(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().containsKey(key)
    }

    @Signature
    public Memory containsValue(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().containsValue(value)
    }

    @Signature
    public Memory getOrDefault(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getOrDefault(key, defaultValue)
    }

}
