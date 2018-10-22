package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.Function;

public class FunctionConverter<T, R> implements TypeConverter<Function<T, R>> {
  private TypeConverter<T> converterT;
  private TypeConverter<R> converterR;

  private FunctionConverter(TypeConverter<T> converterT, TypeConverter<R> converterR) {
    this.converterR = converterR;
    this.converterT = converterT;
  }

  public static <T, R> FunctionConverter<T, R> create(TypeConverter<T> converterT, TypeConverter<R> converterR) {
    return new FunctionConverter<>(converterT, converterR);
  }

  @Override
  public boolean accept(Environment env, Memory value) {
    return value.toInvoker(env) != null;
  }

  @Override
  public Function<T, R> convParamNotNull(Environment env, Memory value) {
    return (in) -> {
      try {
        Memory memory = value.toInvoker(env).call(converterT.convReturn(env, in));
        return converterR.convParam(env, memory);
      } catch (Throwable throwable) {
        throw new RuntimeException(throwable);
      }
    };
  }

  @Override
  public Memory convReturnNotNull(Environment env, Function<T, R> value) {
    throw new RuntimeException("Unsupported function return");
  }
}
