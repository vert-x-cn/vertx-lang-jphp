package api.test;
import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.BiFunction;
import java.util.function.Predicate;


class TypeConverter<T> {

    Predicate<Memory> accept;
    BiFunction<Environment, T, Memory> wrap;
    BiFunction<Environment, Memory, T> unwrap;

    public TypeConverter(Predicate<Memory> accept, BiFunction<Environment, T, Memory> wrap, BiFunction<Environment, Memory, T> unwrap) {
        this.accept = accept;
        this.wrap = wrap;
        this.unwrap = unwrap;
    }

    public boolean accept(Memory obj) {
        return accept.test(obj);
    }

    public Memory wrap(Environment env, T obj) {
        return wrap(env, obj);
    }

    public T unwrap(Environment env, Memory obj) {
        return unwrap(env, obj);
    }

}
