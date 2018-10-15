package io.vertx.jphp.core.impl;

import io.vertx.jphp.core.Options1;
import io.vertx.lang.jphp.BaseWrapper;
import io.vertx.lang.jphp.IDataObject;
import io.vertx.lang.jphp.IDataObjectWrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.*;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

@Name("Options1")
@Namespace("io\\vertx\\jphp\\core\\impl")
public final class VertxOptionsImpl extends BaseWrapper<io.vertx.core.Options1> implements Options1, IDataObjectWrapper<io.vertx.core.Options1> {
    public VertxOptionsImpl(Environment __env__, io.vertx.core.Options1 __wrappedObject) {
        super(__env__, __wrappedObject);
    }

    public VertxOptionsImpl(Environment __env__, ClassEntity entity) {
        super(__env__, entity);
    }

    @Override
    public String getString() {
        return getWrappedObject().getString();
    }

    @Override
    @Signature(result = @Arg(type = HintType.STRING))
    public Memory getString(Environment env, Memory... args) {
        return StringMemory.valueOf(getString());
    }

    @Override
    public void setString(String string) {
        this.getWrappedObject().setString(string);
    }

    @Override
    @Signature(value = @Arg(value = "string", type = HintType.STRING), result = @Arg(type = HintType.VOID))
    public Memory setString(Environment env, Memory... args) {
        this.setString(args[0].toString());
        return Memory.NULL;
    }
}
