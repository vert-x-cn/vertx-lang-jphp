package io.vertx.lang.jphp.wrapper.extension;

import io.vertx.core.spi.json.JsonDecoder;
import io.vertx.core.spi.json.JsonEncoder;

import java.util.function.Function;

public class DataObjectJsonCodec {
  public static class DataObjectJsonDecoder<T, J> implements JsonDecoder<T, J> {
    private Function<J, T> function;

    public DataObjectJsonDecoder(Function<J, T> function) {
      this.function = function;
    }

    @Override
    public T decode(J json) throws IllegalArgumentException {
      return function.apply(json);
    }

    @Override
    public Class<T> getTargetClass() {
      return null;
    }
  }

  public static class DataObjectJsonEncoder<T, J> implements JsonEncoder<T, J> {
    private Function<T, J> function;

    public DataObjectJsonEncoder(Function<T, J> function) {
      this.function = function;
    }

    @Override
    public J encode(T json) throws IllegalArgumentException {
      return function.apply(json);
    }

    @Override
    public Class<T> getTargetClass() {
      return null;
    }
  }
}
