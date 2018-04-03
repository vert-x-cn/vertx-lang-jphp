package io.vertx.lang.jphp.wrapper;

import io.vertx.lang.jphp.converter.TypeConverter;

public interface Variable1Wrapper<W, V1> extends IMemory {
    TypeConverter<V1> getTypeConverter1();

    W getWrappedObject();
}
