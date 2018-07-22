package io.vertx.lang.jphp;

import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

public class BaseWrapper<W> implements IWrapper<W> {
    private final ArrayMemory __dynamicProperties__;
    private ClassEntity __class__;
    private final Environment __env__;
    private boolean __isFinalized;
    private W __wrappedObject;
    private Memory __instance;

    public BaseWrapper(Environment __env__, W __wrappedObject) {
        this(__env__, (ClassEntity) null);
        this.__wrappedObject = __wrappedObject;
        this.__class__ = __env__.fetchClass(getClass());
    }

    public BaseWrapper(Environment __env__, ClassEntity entity) {
        this.__env__ = __env__;
        this.__class__ = entity;
        this.__dynamicProperties__ = new ArrayMemory(true);
    }

    @Override
    public W getWrappedObject() {
        return __wrappedObject;
    }

    @Override
    public Memory toMemory() {
        return __instance == null ? __instance = ObjectMemory.valueOf(this) : __instance;
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

    @Reflection.Signature
    public Memory __toString() {
        return StringMemory.valueOf(toString());
    }
}
