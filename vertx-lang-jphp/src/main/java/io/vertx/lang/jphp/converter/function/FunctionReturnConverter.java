package io.vertx.lang.jphp.converter.function;

import io.vertx.lang.jphp.converter.ReturnConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.Function;

public class FunctionReturnConverter<T, R> implements ReturnConverter<Function<T, R>> {
  @Override
  public Memory convReturnNotNull(Environment env, Function<T, R> value) {
    throw new RuntimeException("Unsupported function return");
  }
}
