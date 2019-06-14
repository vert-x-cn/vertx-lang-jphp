package io.vertx.lang.jphp.converter;

import io.vertx.core.spi.json.JsonCodec;
import io.vertx.core.spi.json.JsonDecoder;
import io.vertx.core.spi.json.JsonEncoder;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class DataObjectConverter<T, J> implements TypeConverter<T> {
  private final TypeConverter<J> converter;
  private final JsonDecoder<T, J> decoder;
  private final JsonEncoder<T, J> encoder;

  public DataObjectConverter(JsonDecoder<T, J> decoder, JsonEncoder<T, J> encoder, TypeConverter<J> converter) {
    this.decoder = decoder;
    this.encoder = encoder;
    this.converter = converter;
  }

  public static <A, T> void xx(Environment env, Memory value, TypeConverter<T> converter, JsonCodec<A, T> codec) {
    A a = codec.decode(converter.convParam(env, value));
  }

  @Override
  public boolean accept(Environment env, Memory value) {
    return TypeConverter.JSON_OBJECT.accept(env, value);
  }

  @Override
  public T convParamNotNull(Environment env, Memory value) {
    return decoder.decode(converter.convParam(env, value));
  }

  @Override
  public Memory convReturnNotNull(Environment env, T value) {
    return converter.convReturn(env, encoder.encode(value));
  }
}
