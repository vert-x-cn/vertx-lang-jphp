package io.vertx.lang.jphp.converter;

import io.vertx.lang.jphp.function.Function2;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ReferenceMemory;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionConverter<C extends Collection<T>, T> extends ContainerConverter<C, T> {
  private Collector<T, ?, C> collector;

  CollectionConverter(boolean map, TypeConverter<T> valueConverter, Collector<T, ?, C> collector) {
    super(map, valueConverter);
    this.collector = collector;
  }

  @Override
  public C convParamNotNull(Environment env, Memory value) {
    return value.toValue(ArrayMemory.class).stream().map(ReferenceMemory::getValue).map(e -> valueConverter.convParam(env, e)).collect(collector);
  }

  @Override
  public Memory convReturnNotNull(Environment env, C value) {
    return convCollectionReturnNotNull(env, value, valueConverter::convReturn);
  }

  static <C extends Collection<T>, T> Memory convCollectionReturnNotNull(Environment env, C value, Function2<Environment, T, Memory> returnConverter) {
    ArrayMemory result = new ArrayMemory();
    value.forEach(v -> result.add(returnConverter.apply(env, v)));
    return result;
  }
}
