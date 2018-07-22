package io.vertx.jphp.core;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.IDataObject;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.memory.StringMemory;

public abstract class BaseOptions extends io.vertx.core.BaseOptions implements IDataObject<io.vertx.core.BaseOptions> {

    public BaseOptions(JsonObject json) {
        super(json);
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
}
