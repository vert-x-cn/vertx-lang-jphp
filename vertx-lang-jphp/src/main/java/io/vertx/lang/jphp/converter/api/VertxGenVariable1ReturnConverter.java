package io.vertx.lang.jphp.converter.api;

import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.function.Function3;
import io.vertx.lang.jphp.wrapper.VertxGenVariable1Wrapper;
import php.runtime.env.Environment;

public class VertxGenVariable1ReturnConverter<SOURCE, V1, WRAPPER extends VertxGenVariable1Wrapper<SOURCE, V1>> extends VertxGenVariable0ReturnConverter<SOURCE, WRAPPER>{
//  VertxGenVariable1Converter() {
//    this(creator, converter);
//  }
//  VertxGenVariable1ReturnConverter(Function2<Environment, SOURCE, WRAPPER> creator) {
//    super((env, value) -> creator.apply(env, value));
//  }

  VertxGenVariable1ReturnConverter(Function3<Environment, SOURCE, TypeConverter<V1>, WRAPPER> creator, TypeConverter<V1> converter){
    super(((environment, source) -> creator.apply(environment, source, converter)));
  }

}
