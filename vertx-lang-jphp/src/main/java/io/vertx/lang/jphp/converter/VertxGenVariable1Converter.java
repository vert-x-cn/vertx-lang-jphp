package io.vertx.lang.jphp.converter;

import io.vertx.lang.jphp.function.Function3;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import php.runtime.env.Environment;

public class VertxGenVariable1Converter<A, B extends VertxGenVariable1Wrapper<A, V1>, V1> extends VertxGenVariable0Converter<A, B> {
    public VertxGenVariable1Converter(Class<?> clazz, Function3<Environment, A, TypeConverter<V1>, B> creator, TypeConverter<V1> converter) {
        this(clazz, VertxGenVariable1Wrapper.class, creator, converter);
    }
    VertxGenVariable1Converter(Class<?> clazz, Class<? extends BaseWrapper> wrapperClass, Function3<Environment, A, TypeConverter<V1>, B> creator, TypeConverter<V1> converter) {
        super(clazz, wrapperClass, (env, value) -> creator.apply(env, value, converter));
    }
}
