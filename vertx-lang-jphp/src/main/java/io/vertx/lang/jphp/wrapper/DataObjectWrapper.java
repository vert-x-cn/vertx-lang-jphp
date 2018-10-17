package io.vertx.lang.jphp.wrapper;

import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

public abstract class DataObjectWrapper<D> extends BaseWrapper<D> {
  public DataObjectWrapper(Environment __env__, D __wrappedObject) {
    super(__env__, __wrappedObject);
  }

  public DataObjectWrapper(Environment __env__, ClassEntity entity) {
    super(__env__, entity);
  }
}
