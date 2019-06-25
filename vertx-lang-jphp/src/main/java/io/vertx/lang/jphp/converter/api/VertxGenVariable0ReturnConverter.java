package io.vertx.lang.jphp.converter.api;

import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.function.Function3;
import io.vertx.lang.jphp.function.Function4;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable2Wrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class VertxGenVariable0ReturnConverter<SOURCE, WRAPPER extends VertxGenVariable0Wrapper<SOURCE>> implements ReturnConverter<SOURCE> {
  private Function2<Environment, SOURCE, WRAPPER> creator;

  protected VertxGenVariable0ReturnConverter(Function2<Environment, SOURCE, WRAPPER> creator) {
    this.creator = creator;
  }

  @Override
  public Memory convReturnNotNull(Environment env, SOURCE value) {
    return this.creator.apply(env, value).toMemory();
  }

  public static <SOURCE, WRAPPER extends VertxGenVariable0Wrapper<SOURCE>> ReturnConverter<SOURCE> create0(Function2<Environment, SOURCE, WRAPPER> creator) {
    return new VertxGenVariable0ReturnConverter<>(creator);
  }

  public static <SOURCE, WRAPPER extends VertxGenVariable1Wrapper<SOURCE, V1>, V1> ReturnConverter<SOURCE> create1(Function3<Environment, SOURCE, TypeConverter<V1>, WRAPPER> creator, TypeConverter<V1> converter) {
    return new VertxGenVariable1ReturnConverter<>(creator, converter);
  }

  public static <SOURCE, WRAPPER extends VertxGenVariable2Wrapper<SOURCE, V1, V2>, V1, V2> ReturnConverter<SOURCE> create2(Function4<Environment, SOURCE, TypeConverter<V1>, TypeConverter<V2>, WRAPPER> creator, TypeConverter<V1> converter1, TypeConverter<V2> converter2) {
    return new VertxGenVariable2ReturnConverter<>(creator, converter1, converter2);
  }
}
