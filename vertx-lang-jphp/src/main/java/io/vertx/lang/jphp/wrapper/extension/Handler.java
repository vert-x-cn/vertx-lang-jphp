package io.vertx.lang.jphp.wrapper.extension;

import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import io.vertx.lang.jphp.wrapper.Variable1Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.env.Environment;

@Name("Handler")
@Namespace("io\\vertx\\php\\core")
public class Handler<E> extends BaseWrapper<io.vertx.core.Handler<E>> implements Variable1Wrapper<io.vertx.core.Handler<E>, E> {
  private TypeConverter<E> converter;

  public Handler(Environment __env__, io.vertx.core.Handler<E> __wrappedObject, TypeConverter<E> converter) {
    super(__env__, __wrappedObject);
    this.converter = converter;
  }

  @Override
  public TypeConverter<E> getTypeConverter1() {
    return converter;
  }

  public void handle(Environment __ENV__, Memory value) {
    this.getWrappedObject().handle(converter.convParam(__ENV__, value));
  }
}
