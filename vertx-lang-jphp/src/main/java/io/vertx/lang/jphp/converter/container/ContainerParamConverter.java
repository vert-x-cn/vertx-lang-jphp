package io.vertx.lang.jphp.converter.container;

import io.vertx.lang.jphp.converter.ParamConverter;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ReferenceMemory;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class ContainerParamConverter<T, E> implements ParamConverter<T> {
  private boolean map;
  ParamConverter<E> valueConverter;

  public ContainerParamConverter(boolean map, ParamConverter<E> valueConverter) {
    this.map = map;
    this.valueConverter = valueConverter;
  }

  @Override
  public boolean accept(Environment env, Memory value) {
    if (!(value instanceof ArrayMemory)) {
      return false;
    }
    ArrayMemory array = (ArrayMemory) value;
    for (ReferenceMemory referenceMemory : array) {
      Memory entry;
      if (map) {
        if (referenceMemory instanceof ArrayMapEntryMemory) {
          entry = referenceMemory;
        } else {
          return false;
        }
      } else {
        entry = referenceMemory.getValue();
      }
      if (map) {
        ArrayMapEntryMemory v = (ArrayMapEntryMemory) entry;
        if (!(v.getKey() instanceof String)) {
          return false;
        }
        entry = v.getValue();
      }
      if (!valueConverter.accept(env, entry)) {
        return false;
      }
    }
    return true;
  }

  public static <E> ParamConverter<List<E>> createListConverter(ParamConverter<E> valueConverter) {
    return new CollectionParamConverter<>(valueConverter, Collectors.toList());
  }

  public static <E> ParamConverter<Set<E>> createSetConverter(ParamConverter<E> valueConverter) {
    return new CollectionParamConverter<>(valueConverter, Collectors.toSet());
  }

  public static <E> ParamConverter<Map<String, E>> createMapConverter(ParamConverter<E> valueConverter) {
    return new MapParamConverter<>(valueConverter);
  }


}
