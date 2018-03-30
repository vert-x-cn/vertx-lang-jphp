package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.StringMemory;

public class EnumConverter<T extends Enum<T>> implements TypeConverter<T> {
    private Class<T> clazz;

    public EnumConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean accept(Environment env, Memory value) {
        return value.isString();
    }

    @Override
    public T convParamNotNull(Environment env, Memory value) {
        return Enum.valueOf(clazz, value.toString());
    }

    @Override
    public Memory convReturnNotNull(Environment env, T value) {
        return StringMemory.valueOf(value.name());
    }

    public static <T extends Enum<T>> TypeConverter<T> create(Class<T> clazz) {
        return new EnumConverter<>(clazz);
    }
}
