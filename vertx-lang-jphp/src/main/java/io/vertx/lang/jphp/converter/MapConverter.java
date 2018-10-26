package io.vertx.lang.jphp.converter;

import io.vertx.lang.jphp.function.Function2;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.LongMemory;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.Map;
import java.util.stream.Collectors;

public class MapConverter<E> extends ContainerConverter<Map<String, E>, E> {
  public MapConverter(TypeConverter<E> valueConverter) {
    super(true, valueConverter);
  }

  @Override
  public Map<String, E> convParamNotNull(Environment env, Memory value) {
//    return value.toValue(ArrayMemory.class).stream().map(ReferenceMemory::getValue).map(m -> m.toValue(ArrayMapEntryMemory.class)).collect(Collectors.toMap(e -> e.getKey().toString(), e -> valueConverter.convParam(env, e.getValue())));
    return value.toValue(ArrayMemory.class).stream().map(m ->
      m instanceof ArrayMapEntryMemory ? (ArrayMapEntryMemory) m : m.getValue().toValue(ArrayMapEntryMemory.class)
    ).collect(Collectors.toMap(e -> e.getKey().toString(), e -> valueConverter.convParam(env, e.getValue())));
  }

  @Override
  public Memory convReturnNotNull(Environment env, Map<String, E> value) {
    return convMapReturnNotNull(env, value, valueConverter::convReturnNotNull);
  }

  static <E> Memory convMapReturnNotNull(Environment env, Map<? extends Object, E> value, Function2<Environment, E, Memory> returnConverter) {
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
