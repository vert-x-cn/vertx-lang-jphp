package io.vertx.lang.jphp.converter.container;

import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.function.Function2;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;

import java.util.Collection;

public class CollectionReturnConverter<C extends Collection<E>, E> implements ReturnConverter<C> {
  private ReturnConverter<E> valueConverter;
  private CollectionReturnConverter(ReturnConverter<E> valueConverter){
    this.valueConverter = valueConverter;
  }
  @Override
  public Memory convReturnNotNull(Environment env, C value) {
    return convCollectionReturnNotNull(env, value, valueConverter::convReturn);
  }

  public static <C extends Collection<T>, T> Memory convCollectionReturnNotNull(Environment env, C value, Function2<Environment, T, Memory> returnConverter) {
    ArrayMemory result = new ArrayMemory();
    value.forEach(v -> result.add(returnConverter.apply(env, v)));
    return result;
  }
  public static <C extends Collection<E>, E> ReturnConverter<C> createCollectionConverter(ReturnConverter<E> converter) {
    return new CollectionReturnConverter<>(converter);
  }
}
