package io.vertx.lang.jphp.converter.dataobject;

import io.vertx.core.spi.json.JsonDecoder;
import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class DataObjectParamConverter<T, J> implements ParamConverter<T> {
  private final TypeConverter<J> converter;
  private final JsonDecoder<T, J> decoder;

  public DataObjectParamConverter(JsonDecoder<T, J> decoder, TypeConverter<J> converter) {
    this.decoder = decoder;
    this.converter = converter;
  }

  @Override
  public boolean accept(Environment env, Memory value) {
    return TypeConverter.JSON_OBJECT.accept(env, value);
  }

  @Override
  public T convParamNotNull(Environment env, Memory value) {
    return decoder.decode(converter.convParam(env, value));
  }
}
