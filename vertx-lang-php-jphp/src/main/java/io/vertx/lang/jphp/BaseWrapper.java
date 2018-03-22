package io.vertx.lang.jphp;


import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;

public class BaseWrapper<API> implements IWrapper<API> {
    private final ArrayMemory __dynamicProperties__;
    private ClassEntity __class__;
    private final Environment __env__;
    private boolean __isFinalized;
    private API __wrappedObject;
    private Memory __instance;

    public BaseWrapper(Environment __env__, API __wrappedObject) {
        this.__env__ = __env__;
        this.__wrappedObject = __wrappedObject;
        this.__dynamicProperties__ = new ArrayMemory(true);
        this.__class__ = __env__.fetchClass(getClass());
        this.__instance = ObjectMemory.valueOf(this);
    }

    @Override
    public ClassEntity getReflection() {
        return __class__;
    }

    @Override
    public ArrayMemory getProperties() {
        return __dynamicProperties__;
    }

    @Override
    public Environment getEnvironment() {
        return __env__;
    }

    @Override
    public int getPointer() {
        return super.hashCode();
    }

    @Override
    public boolean isMock() {
        return __class__ == null;
    }

    @Override
    public void setAsMock() {
        __class__ = null;
    }

    @Override
    public boolean isFinalized() {
        return __isFinalized;
    }

    @Override
    public void doFinalize() {
        __isFinalized = true;
    }

    @Override
    public Memory toMemory() {
        return __instance;
    }

    @Override
    public API getWrappedObject() {
        return __wrappedObject;
    }
}
