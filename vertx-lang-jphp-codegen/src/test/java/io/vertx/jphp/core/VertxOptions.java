package io.vertx.jphp.core;

import io.vertx.lang.jphp.IDataObject;
import io.vertx.lang.jphp.IWrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.*;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.memory.StringMemory;


@Name("VertxOptions")
@Namespace("io\\vertx\\jphp\\core")
public interface VertxOptions extends io.vertx.core.VertxOptions, IDataObject<io.vertx.core.VertxOptions> {
    @Override
    default String getString() {
        return getString(getEnvironment()).toString();
    }

    @Signature(result = @Arg(type = HintType.STRING))
    Memory getString(Environment env, Memory... args);

    @Override
    default void setString(String string) {
        this.setString(getEnvironment(), StringMemory.valueOf(string));
    }

    @Signature(value = @Arg(value = "string", type = HintType.STRING), result = @Arg(type = HintType.VOID))
    Memory setString(Environment env, Memory... args);
}
