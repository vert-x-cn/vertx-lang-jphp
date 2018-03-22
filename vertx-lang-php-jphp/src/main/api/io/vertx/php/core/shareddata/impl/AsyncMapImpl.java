package io.vertx.php.core.shareddata.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.shareddata.AsyncMap;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AsyncMapImpl")
@Namespace("io\\vertx\\php\\core\\shareddata\\impl")
public class AsyncMapImpl<K, V> extends VertxGenWrapper<io.vertx.core.shareddata.AsyncMap<K,V>> implements AsyncMap<io.vertx.core.shareddata.AsyncMap<K,V>, K, V>{
    
    public AsyncMapImpl(Environment env, io.vertx.core.shareddata.AsyncMap<K,V> wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(k, resultHandler)
    }

    @Signature
    public void put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(k, v, completionHandler)
    }

    @Signature
    public void putIfAbsent(Environment __env__, Memory... args) {
        this.getWrappedObject().putIfAbsent(k, v, completionHandler)
    }

    @Signature
    public void remove(Environment __env__, Memory... args) {
        this.getWrappedObject().remove(k, resultHandler)
    }

    @Signature
    public void removeIfPresent(Environment __env__, Memory... args) {
        this.getWrappedObject().removeIfPresent(k, v, resultHandler)
    }

    @Signature
    public void replace(Environment __env__, Memory... args) {
        this.getWrappedObject().replace(k, v, resultHandler)
    }

    @Signature
    public void replaceIfPresent(Environment __env__, Memory... args) {
        this.getWrappedObject().replaceIfPresent(k, oldValue, newValue, resultHandler)
    }

    @Signature
    public void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear(resultHandler)
    }

    @Signature
    public void size(Environment __env__, Memory... args) {
        this.getWrappedObject().size(resultHandler)
    }

}
