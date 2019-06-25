package io.vertx.lang.jphp.converter.handler;

import io.vertx.core.Handler;
import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.converter.ReturnConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ObjectMemory;

public class HandlerParamConverter<E> implements ParamConverter<Handler<E>> {
  private ReturnConverter<E> eventConverter;

  public HandlerParamConverter(ReturnConverter<E> eventConverter) {
    this.eventConverter = eventConverter;
  }

  @Override
  public boolean accept(Environment env, Memory value) {
    if (value instanceof ObjectMemory) {
      ObjectMemory objectMemory = (ObjectMemory) value;
      if (objectMemory.value instanceof io.vertx.lang.jphp.Handler) {
        return true;
      }
    }
    return value.toInvoker(env) != null;
  }

  @Override
  public Handler<E> convParamNotNull(Environment env, Memory value) {
    if (value instanceof ObjectMemory) {
      ObjectMemory objectMemory = (ObjectMemory) value;
      if (objectMemory.value instanceof io.vertx.lang.jphp.Handler) {
        //noinspection unchecked
        return (Handler<E>) objectMemory.value;
      }
    }
    return (event) -> {
      try {
        value.toInvoker(env).call(eventConverter.convReturn(env, event));
      } catch (Throwable throwable) {
        env.forwardThrow(throwable);
      }
    };
  }
}
