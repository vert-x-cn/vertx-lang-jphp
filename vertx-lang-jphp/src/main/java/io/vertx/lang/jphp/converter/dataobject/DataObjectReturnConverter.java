package io.vertx.lang.jphp.converter.dataobject;

import io.vertx.core.spi.json.JsonEncoder;
import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class DataObjectReturnConverter<T, J> implements ReturnConverter<T> {
  private final TypeConverter<J> converter;
  private final JsonEncoder<T, J> encoder;

  public DataObjectReturnConverter(JsonEncoder<T, J> encoder, TypeConverter<J> converter) {
    this.encoder = encoder;
    this.converter = converter;
  }

  @Override
  public Memory convReturnNotNull(Environment env, T value) {
    return converter.convReturn(env, encoder.encode(value));
  }

}
