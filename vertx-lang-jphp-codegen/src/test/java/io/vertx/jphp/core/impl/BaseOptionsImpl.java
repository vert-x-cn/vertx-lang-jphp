package io.vertx.jphp.core.impl;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.IDataObject;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

public final class BaseOptionsImpl extends io.vertx.jphp.core.BaseOptions implements IDataObject<io.vertx.core.BaseOptions> {
    private final ArrayMemory __dynamicProperties__;
    private ClassEntity __class__;
    private final Environment __env__;
    private boolean __isFinalized;
    private io.vertx.core.BaseOptions __wrappedObject;
    private Memory __instance;

    public BaseOptionsImpl(Environment __env__, io.vertx.core.BaseOptions __wrappedObject) {
        this(__env__, (ClassEntity) null);
        this.__wrappedObject = __wrappedObject;
        this.__class__ = __env__.fetchClass(getClass());
    }

    public BaseOptionsImpl(Environment __env__, ClassEntity entity) {
        super(new JsonObject());
        this.__env__ = __env__;
        this.__class__ = entity;
        this.__dynamicProperties__ = new ArrayMemory(true);
    }

    @Override
    public String getString() {
        return getWrappedObject().getString();
    }

    @Override
    @Reflection.Signature(result = @Reflection.Arg(type = HintType.STRING))
    public Memory getString(Environment env, Memory... args) {
        return StringMemory.valueOf(getString());
    }

    @Override
    public void setString(String string) {
        this.getWrappedObject().setString(string);
    }

    @Override
    @Reflection.Signature(value = @Reflection.Arg(value = "string", type = HintType.STRING), result = @Reflection.Arg(type = HintType.VOID))
    public Memory setString(Environment env, Memory... args) {
        this.setString(args[0].toString());
        return Memory.NULL;
    }

    @Override
    public io.vertx.core.BaseOptions getWrappedObject() {
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
