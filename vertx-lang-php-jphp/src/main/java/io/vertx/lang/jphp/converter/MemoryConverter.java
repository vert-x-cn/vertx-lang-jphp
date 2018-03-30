package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;

public class MemoryConverter implements VariableConverter<Memory> {
    @Override
    public boolean accept(Environment env, Memory memory) {
        return true;
    }

    @Override
    public Memory convParam(Environment env, Memory memory) {
        return memory;
    }

    @Override
    public Memory convReturn(Environment env, Memory memory) {
        return memory;
    }
}
