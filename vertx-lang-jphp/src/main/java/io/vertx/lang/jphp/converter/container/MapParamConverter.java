package io.vertx.lang.jphp.converter.container;

import io.vertx.lang.jphp.converter.ParamConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.Map;
import java.util.stream.Collectors;

class MapParamConverter<E> extends ContainerParamConverter<Map<String, E>, E> {
  MapParamConverter(ParamConverter<E> valueConverter) {
    super(true, valueConverter);
  }

  @Override
  public Map<String, E> convParamNotNull(Environment env, Memory value) {
    return value.toValue(ArrayMemory.class).stream().map(m ->
      m instanceof ArrayMapEntryMemory ? (ArrayMapEntryMemory) m : m.getValue().toValue(ArrayMapEntryMemory.class)
    ).collect(Collectors.toMap(e -> e.getKey().toString(), e -> valueConverter.convParam(env, e.getValue())));
  }
}
