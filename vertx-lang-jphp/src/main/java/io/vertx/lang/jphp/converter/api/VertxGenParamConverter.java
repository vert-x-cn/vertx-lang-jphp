package io.vertx.lang.jphp.converter.api;

import io.vertx.lang.jphp.converter.ParamConverter;
import io.vertx.lang.jphp.wrapper.BaseWrapper;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.ext.java.JavaObject;
import php.runtime.memory.ObjectMemory;

public class VertxGenParamConverter<SOURCE, WRAPPER extends VertxGenVariable0Wrapper<SOURCE>> implements ParamConverter<SOURCE> {
  private Class<?> clazz;
  public VertxGenParamConverter(Class<?> clazz) {
    this.clazz = clazz;
  }
  @Override
  public boolean accept(Environment env, Memory value) {
    if (!(value instanceof ObjectMemory)) {
      return false;
    }
    ObjectMemory objectMemory = (ObjectMemory) value;
    Object wrapperObject = objectMemory.value;
    Object obj;
    if (wrapperObject instanceof BaseWrapper) {
      obj = ((BaseWrapper) wrapperObject).getWrappedObject();
    } else if (wrapperObject instanceof JavaObject) {
      obj = ((JavaObject) wrapperObject).getObject();
    } else {
      obj = wrapperObject;
    }
    return clazz.isInstance(obj);
  }

  @Override
  public SOURCE convParamNotNull(Environment env, Memory value) {
    ObjectMemory objectMemory = (ObjectMemory) value;
    //noinspection unchecked
    WRAPPER wrapper = (WRAPPER) objectMemory.value;
    return wrapper.getWrappedObject();
  }
}
