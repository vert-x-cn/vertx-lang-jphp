package io.vertx.lang.jphp.converter.handler;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class AsyncResultHandlerParamConverter<E> implements ParamConverter<Handler<AsyncResult<E>>> {
  private ReturnConverter<E> resultConverter;
  public AsyncResultHandlerParamConverter(ReturnConverter<E> resultConverter) {
    this.resultConverter = resultConverter;
  }

  @Override
  public boolean accept(Environment env, Memory value) {
    return value.toInvoker(env) != null;
  }
  @Override
  public Handler<AsyncResult<E>> convParamNotNull(Environment env, Memory value) {
    return (event) -> {
      try {
        Memory result;
        Memory cause;
        if (event.succeeded()) {
          result = resultConverter.convReturn(env, event.result());
          cause = Memory.NULL;
        } else {
          result = Memory.NULL;
          cause = TypeConverter.THROWABLE.convReturn(env, event.cause());
        }
        value.toInvoker(env).call(result, cause);
      } catch (Throwable throwable) {
        throwable.printStackTrace();
      }
    };
  }
}
