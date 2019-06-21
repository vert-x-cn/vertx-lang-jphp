package io.vertx.lang.jphp.converter.dataobject;

import io.vertx.core.spi.json.JsonEncoder;
import io.vertx.lang.jphp.converter.ReturnConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class DataObjectReturnConverter<T, J> implements ReturnConverter<T> {
  private final ReturnConverter<J> converter;
  private final JsonEncoder<T, J> encoder;

  public DataObjectReturnConverter(JsonEncoder<T, J> encoder, ReturnConverter<J> converter) {
    this.encoder = encoder;
    this.converter = converter;
  }

  @Override
  public Memory convReturnNotNull(Environment env, T value) {
    return converter.convReturn(env, encoder.encode(value));
  }

}
