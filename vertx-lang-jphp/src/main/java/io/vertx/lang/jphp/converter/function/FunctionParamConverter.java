package io.vertx.lang.jphp.converter.function;

import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.converter.ReturnConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

import java.util.function.Function;

public class FunctionParamConverter<T, R> implements ParamConverter<Function<T, R>> {
  private ReturnConverter<T> converterT;
  private ParamConverter<R> converterR;
  public FunctionParamConverter(ReturnConverter<T> converterT, ParamConverter<R> converterR) {
    this.converterT = converterT;
    this.converterR = converterR;
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
}
