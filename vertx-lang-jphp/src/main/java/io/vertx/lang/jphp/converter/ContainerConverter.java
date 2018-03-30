package io.vertx.lang.jphp.converter;

import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ReferenceMemory;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public abstract class ContainerConverter<T, E> implements TypeConverter<T> {
    private boolean map;
    protected TypeConverter<E> valueConverter;

    public ContainerConverter(boolean map, TypeConverter<E> valueConverter) {
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
            Memory entry = referenceMemory.getValue();
            if (map && !(entry instanceof ArrayMapEntryMemory)) {
                return false;
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

    public static <E> CollectionConverter<List<E>, E> createListConverter(TypeConverter<E> converter) {
        return new CollectionConverter<>(false, ArrayList::new, converter, Collectors.toList());
    }

    public static <E> CollectionConverter<Set<E>, E> createSetConverter(TypeConverter<E> converter) {
        return new CollectionConverter<>(false, HashSet::new, converter, Collectors.toSet());
    }

    public static <E> MapConverter<E> createMapConverter(TypeConverter<E> converter) {
        return new MapConverter<>(converter);
    }
}
