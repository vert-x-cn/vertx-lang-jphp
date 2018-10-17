package io.vertx.lang.jphp;

import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.IMemory;
import php.runtime.Memory;
import php.runtime.env.Environment;

public interface Handler<E> extends io.vertx.core.Handler<E>, IMemory {
  TypeConverter<E> get__handlerConverter__();

  Environment get__env__();

  default void handle(E event) {
    Environment env = get__env__();
    handle(env, get__handlerConverter__().convReturn(env, event));
  }

  void handle(Environment env, Memory value);
}
