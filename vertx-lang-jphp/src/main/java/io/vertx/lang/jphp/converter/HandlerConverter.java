package io.vertx.lang.jphp.converter;

import io.vertx.core.Handler;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ObjectMemory;

public class HandlerConverter<E> implements TypeConverter<Handler<E>> {
  private TypeConverter<E> eventConverter;

  private HandlerConverter(TypeConverter<E> eventConverter) {
    this.eventConverter = eventConverter;
  }

  public static <E> HandlerConverter<E> create(TypeConverter<E> eventConverter) {
    return new HandlerConverter<>(eventConverter);
  }
  public static <E> AsyncResultHandlerConverter<E> createResult(TypeConverter<E> resultHandler) {
    return new AsyncResultHandlerConverter<>(resultHandler);
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

  @SuppressWarnings("unchecked")
  @Override
  public Handler<E> convParamNotNull(Environment env, Memory value) {
    if (value instanceof ObjectMemory) {
      ObjectMemory objectMemory = (ObjectMemory) value;
      if (objectMemory.value instanceof io.vertx.lang.jphp.Handler) {
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

  @Override
  public Memory convReturnNotNull(Environment env, Handler<E> handler) {
    if (handler instanceof io.vertx.lang.jphp.Handler) {
      return ((io.vertx.lang.jphp.Handler<E>) handler).toMemory();
    } else {
      return new io.vertx.lang.jphp.wrapper.extension.Handler<>(env, handler, eventConverter).toMemory();
    }
  }
}
