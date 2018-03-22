package io.vertx.lang.php;

import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;

public class BaseWrapper<T> extends php.runtime.lang.BaseWrapper<T> {
    private Memory memory;
    public BaseWrapper(Environment env, T wrappedObject) {
        super(env, wrappedObject);
        this.memory = ObjectMemory.valueOf(this);
    }
    public BaseWrapper(Environment env, ClassEntity clazz){
        super(env, clazz);
    }
    public Memory toMemory(){
        return memory;
    }

    @Override
    public T getWrappedObject() {
        return super.getWrappedObject();
    }
}
