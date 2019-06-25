package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;

public class EnumParamConverter<E extends Enum<E>> implements ParamConverter<E> {
  private Class<E> clazz;
  public EnumParamConverter(Class<E> clazz) {
    this.clazz = clazz;
  }
  @Override
  public boolean accept(Environment env, Memory value) {
    return value.isString();
  }

  @Override
  public E convParamNotNull(Environment env, Memory value) {
    return Enum.valueOf(clazz, value.toString());
  }
}
