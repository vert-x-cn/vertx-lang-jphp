package io.vertx.lang.jphp.converter;

import io.vertx.lang.jphp.function.Function4;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.env.Environment;

public class VertxGenVariable2Converter<A, B extends VertxGenVariable2Wrapper<A, V1, V2>, V1, V2> extends VertxGenVariable1Converter<A, B, V1> {
  public VertxGenVariable2Converter(Class<?> clazz, Function4<Environment, A, TypeConverter<V1>, TypeConverter<V2>, B> creator, TypeConverter<V1> converter1, TypeConverter<V2> converter2) {
    super(clazz, VertxGenVariable2Wrapper.class, (env, value, superConverter1) -> creator.apply(env, value, superConverter1, converter2), converter1);
  }

}
