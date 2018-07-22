package io.vertx.jphp.core;

import io.vertx.lang.jphp.BaseWrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

public class FinalOptions extends BaseWrapper<io.vertx.core.FinalOptions> {
    public FinalOptions(Environment __env__, io.vertx.core.FinalOptions __wrappedObject) {
        super(__env__, __wrappedObject);
    }

    public FinalOptions(Environment __env__, ClassEntity entity) {
        super(__env__, entity);
    }

    @Reflection.Signature(result = @Reflection.Arg(type = HintType.STRING))
    public Memory getString(Environment env, Memory... args) {
        return StringMemory.valueOf(getWrappedObject().getString());
    }

    @Reflection.Signature(value = @Reflection.Arg(value = "string", type = HintType.STRING), result = @Reflection.Arg(type = HintType.VOID))
    public Memory setString(Environment env, Memory... args) {
        getWrappedObject().setString(args[0].toString());
        return Memory.NULL;
    }
}
