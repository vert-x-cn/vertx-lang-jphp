package io.vertx.lang.jphp.converter.container;

import io.vertx.lang.jphp.converter.ReturnConverter;
import io.vertx.lang.jphp.function.Function2;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.LongMemory;

import java.util.Map;

public class MapReturnConverter<E> implements ReturnConverter<Map<String, E>> {

  private ReturnConverter<E> valueConverter;

  public MapReturnConverter(ReturnConverter<E> valueConverter) {
    this.valueConverter = valueConverter;
  }

  @Override
  public Memory convReturnNotNull(Environment env, Map<String, E> value) {
    return convMapReturnNotNull(env, value, valueConverter::convReturnNotNull);
  }

  public static <E> Memory convMapReturnNotNull(Environment env, Map<? extends Object, E> value, Function2<Environment, E, Memory> returnConverter) {
    ArrayMemory array = new ArrayMemory(true);
    value.forEach((k, v) -> {
      Object key;
      if (k instanceof LongMemory) {
        key = k;
      } else if (k instanceof Number && !(k instanceof Double) && !(k instanceof Float)) {
        key = LongMemory.valueOf(((Number) k).longValue());
      } else {
        key = k.toString();
      }
      array.put(key, returnConverter.apply(env, v));
    });
    return array;
  }
}
