package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VariableConverterAdapter<T> implements VariableConverter<T> {
    private Predicate<Memory> predicate;
    private BiFunction<Environment, Memory, T> convParam;
    private BiFunction<Environment, T, Memory> convReturn;

    public VariableConverterAdapter(Predicate<Memory> predicate, BiFunction<Environment, Memory, T> convParam, BiFunction<Environment, T, Memory> convReturn) {

    }

    @Override
    public boolean accept(Environment env, Memory memory) {
        return predicate.test(memory);
    }

    @Override
    public T convParam(Environment env, Memory memory) {
        return convParam.apply(env, memory);
    }

    @Override
    public Memory convReturn(Environment env, T o) {
        return convReturn.apply(env, o);
    }
}
