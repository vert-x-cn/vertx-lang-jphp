package io.vertx.lang.jphp.converter.container;

import io.vertx.lang.jphp.converter.ParamConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ReferenceMemory;

import java.util.Collection;
import java.util.stream.Collector;

class CollectionParamConverter<C extends Collection<T>, T> extends ContainerParamConverter<C, T>{
  private Collector<T, ?, C> collector;
  CollectionParamConverter(ParamConverter<T> valueConverter, Collector<T, ?, C> collector) {
    super(false, valueConverter);
    this.collector = collector;
  }

  @Override
  public C convParamNotNull(Environment env, Memory value) {
    return value.toValue(ArrayMemory.class).stream().map(ReferenceMemory::getValue).map(e -> valueConverter.convParam(env, e)).collect(collector);
  }
}
