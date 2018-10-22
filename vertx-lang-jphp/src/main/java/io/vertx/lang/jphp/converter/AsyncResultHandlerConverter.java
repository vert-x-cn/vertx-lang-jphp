package io.vertx.lang.jphp.converter;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;

public class AsyncResultHandlerConverter<E> implements TypeConverter<Handler<AsyncResult<E>>> {
  private TypeConverter<E> resultConverter;
  AsyncResultHandlerConverter(TypeConverter<E> resultConverter) {
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

  @Override
  public Memory convReturnNotNull(Environment env, Handler<AsyncResult<E>> handler) {
    Memory m = new io.vertx.lang.jphp.wrapper.extension.AsyncHandler<>(env, handler, resultConverter).toMemory();
    ArrayMemory re = new ArrayMemory();
    re.add(m);
    re.add("handle");
    return re;
  }
}
