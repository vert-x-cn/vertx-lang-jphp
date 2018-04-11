package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.StdClass;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;

public class DataObjectConverter<D, B extends DataObjectWrapper<D>> extends WrapperConverter<D, B> {
    public DataObjectConverter(Class<D> clazz) {
        super(clazz, DataObjectWrapper.class, null);
    }

    public Memory convReturnNotNull(Environment env, Function2<Environment, D, B> creator, D value) {
        return creator.apply(env, value).toMemory();
    }

    public static <D, B extends DataObjectWrapper<D>> DataObjectConverter<D, B> create(Class<D> clazz) {
        return new DataObjectConverter<>(clazz);
    }

//    @Override
//    public boolean accept(Environment env, Memory value) {
//        return value instanceof ArrayMemory
//                || (value instanceof ObjectMemory && ((ObjectMemory) value).value instanceof StdClass)
//                || super.accept(env, value);
//    }
//
//    @Override
//    public D convParamNotNull(Environment env, Memory value) {
//        if (value instanceof ArrayMemory || (value instanceof ObjectMemory && ((ObjectMemory) value).value instanceof StdClass)) {
//
//        }
//        return super.convParamNotNull(env, value);
//    }
}
