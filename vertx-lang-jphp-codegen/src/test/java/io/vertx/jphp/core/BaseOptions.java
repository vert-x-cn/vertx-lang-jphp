package io.vertx.jphp.core;

import io.vertx.lang.jphp.IDataObjectWrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

public abstract class BaseOptions extends io.vertx.core.BaseOptions implements IDataObjectWrapper<io.vertx.core.BaseOptions> {
    private final ArrayMemory __dynamicProperties__;
    private ClassEntity __class__;
    private final Environment __env__;
    private boolean __isFinalized;
    private io.vertx.core.HttpOptions __wrappedObject;
    private Memory __instance;


    public BaseOptions(Environment __env__, ClassEntity entity) {
        this.__env__ = __env__;
        this.__class__ = entity;
        this.__dynamicProperties__ = new ArrayMemory(true);
    }

    @Override
    public String getString() {
        return getString(getEnvironment()).toString();
    }

    @Reflection.Signature(result = @Reflection.Arg(type = HintType.STRING))
    public abstract Memory getString(Environment env, Memory... args);

    @Override
    public void setString(String string) {
        this.setString(getEnvironment(), StringMemory.valueOf(string));
    }

    @Reflection.Signature(value = @Reflection.Arg(value = "string", type = HintType.STRING), result = @Reflection.Arg(type = HintType.VOID))
    public abstract Memory setString(Environment env, Memory... args);

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
