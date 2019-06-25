package io.vertx.lang.jphp.converter.handler;

import io.vertx.core.Handler;
import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;

public class HandlerReturnConverter<E> implements ReturnConverter<Handler<E>> {
  private TypeConverter<E> eventConverter;

  public HandlerReturnConverter(TypeConverter<E> eventConverter) {
    this.eventConverter = eventConverter;
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
