package io.vertx.lang.jphp.converter.handler;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;

public class AsyncResultHandlerReturnConverter<E> implements ReturnConverter<Handler<AsyncResult<E>>> {
  private TypeConverter<E> resultConverter;

  public AsyncResultHandlerReturnConverter(TypeConverter<E> resultConverter) {
    this.resultConverter = resultConverter;
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
