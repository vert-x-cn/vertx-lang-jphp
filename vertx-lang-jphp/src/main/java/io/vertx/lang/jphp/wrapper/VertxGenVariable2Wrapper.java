package io.vertx.lang.jphp.wrapper;

import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.env.Environment;

public class VertxGenVariable2Wrapper<A, V1, V2> extends VertxGenVariable1Wrapper<A, V1> {
  private TypeConverter<V2> typeConverter2;

  public VertxGenVariable2Wrapper(Environment __env__, A __wrappedObject, TypeConverter<V1> typeConverter1, TypeConverter<V2> typeConverter2) {
    super(__env__, __wrappedObject, typeConverter1);
    this.typeConverter2 = typeConverter2;
  }

  public TypeConverter<V2> getTypeConverter2() {
    return typeConverter2;
  }

  public void setTypeConverter2(TypeConverter<V2> typeConverter1) {
    this.typeConverter2 = typeConverter1;
  }
}
