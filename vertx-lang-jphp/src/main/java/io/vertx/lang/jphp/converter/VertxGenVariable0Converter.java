package io.vertx.lang.jphp.converter;

import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.function.Function3;
import io.vertx.lang.jphp.function.Function4;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.env.Environment;

public class VertxGenVariable0Converter<A, B extends VertxGenVariable0Wrapper<A>> extends WrapperConverter<A, B> {
  public VertxGenVariable0Converter(Class<?> clazz, Function2<Environment, A, B> creator) {
    this(clazz, VertxGenVariable0Wrapper.class, creator);
  }

  protected VertxGenVariable0Converter(Class<?> clazz, Class<? extends BaseWrapper> wrapperClass, Function2<Environment, A, B> creator) {
    super(clazz, wrapperClass, creator);
  }

  public static <A, B extends VertxGenVariable0Wrapper<A>> VertxGenVariable0Converter<A, B> create0(Class<?> clazz, Function2<Environment, A, B> creator) {
    return new VertxGenVariable0Converter<>(clazz, creator);
  }

  public static <A, B extends VertxGenVariable1Wrapper<A, V1>, V1> VertxGenVariable1Converter<A, B, V1> create1(Class<?> clazz, Function3<Environment, A, TypeConverter<V1>, B> creator, TypeConverter<V1> converter) {
    return new VertxGenVariable1Converter<>(clazz, creator, converter);
  }

  public static <A, B extends VertxGenVariable2Wrapper<A, V1, V2>, V1, V2> VertxGenVariable2Converter<A, B, V1, V2> create2(Class<?> clazz, Function4<Environment, A, TypeConverter<V1>, TypeConverter<V2>, B> creator, TypeConverter<V1> converter1, TypeConverter<V2> converter2) {
    return new VertxGenVariable2Converter<>(clazz, creator, converter1, converter2);
  }
}
