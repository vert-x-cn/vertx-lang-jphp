package io.vertx.lang.jphp.converter.api;

import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.function.Function4;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.env.Environment;

public class VertxGenVariable2ReturnConverter<SOURCE, V1, V2, WRAPPER extends VertxGenVariable2Wrapper<SOURCE, V1, V2>> extends VertxGenVariable0ReturnConverter<SOURCE, WRAPPER> {
  VertxGenVariable2ReturnConverter(Function4<Environment, SOURCE, TypeConverter<V1>, TypeConverter<V2>, WRAPPER> creator, TypeConverter<V1> converter1, TypeConverter<V2> converter2) {
    super((environment, source) -> creator.apply(environment, source, converter1, converter2));
  }
}
