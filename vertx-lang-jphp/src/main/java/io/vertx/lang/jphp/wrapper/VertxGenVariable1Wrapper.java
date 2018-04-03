package io.vertx.lang.jphp.wrapper;

import io.vertx.lang.jphp.converter.TypeConverter;
import php.runtime.env.Environment;

public class VertxGenVariable1Wrapper<A, V1> extends VertxGenVariable0Wrapper<A> implements Variable1Wrapper<A, V1>{
    private TypeConverter<V1> typeConverter1;
    public VertxGenVariable1Wrapper(Environment __env__, A __wrappedObject, TypeConverter<V1> typeConverter1) {
        super(__env__, __wrappedObject);
        this.typeConverter1 = typeConverter1;
    }

    public TypeConverter<V1> getTypeConverter1() {
        return typeConverter1;
    }

    public void setTypeConverter1(TypeConverter<V1> typeConverter1) {
        this.typeConverter1 = typeConverter1;
    }
}
