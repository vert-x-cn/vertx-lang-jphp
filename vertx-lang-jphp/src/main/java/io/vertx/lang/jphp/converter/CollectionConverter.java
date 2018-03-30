package io.vertx.lang.jphp.converter;

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
    private Supplier<C> supplier;
    private Collector<T, ?, C> collector;

    public CollectionConverter(boolean map, Supplier<C> supplier, TypeConverter<T> valueConverter, Collector<T, ?, C> collector) {
        super(map, valueConverter);
        this.collector = collector;
    }

    @Override
    public C convParamNotNull(Environment env, Memory value) {
        return value.toValue(ArrayMemory.class).stream().map(ReferenceMemory::getValue).map(e -> valueConverter.convParam(env, e)).collect(collector);
    }

    @Override
    public Memory convReturnNotNull(Environment env, C value) {
        return null;
    }
}
