package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;

public interface VariableConverter<T> {
    boolean accept(Environment env, Memory memory);

    T convParam(Environment env, Memory memory);

    Memory convReturn(Environment env, T object);

//    VariableConverter<Memory> UNKNOWN_TYPE = new MemoryConverter();
}
