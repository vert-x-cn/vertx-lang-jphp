package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.StdClass;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class DataObjectConverter<D, B extends DataObjectWrapper<D>> extends WrapperConverter<D, B> {
    private Function<JsonObject, D> function;

    public DataObjectConverter(Class<D> clazz, Function<JsonObject, D> function) {
        super(clazz, DataObjectWrapper.class, null);
        this.function = function;
    }

    public Memory convReturnNotNull(Environment env, Function2<Environment, D, B> creator, D value) {
        return creator.apply(env, value).toMemory();
    }

    public static <D, B extends DataObjectWrapper<D>> DataObjectConverter<D, B> create(Class<D> clazz, Function<JsonObject, D> function) {
        return new DataObjectConverter<>(clazz, function);
    }

    @Override
    public boolean accept(Environment env, Memory value) {
        return TypeConverter.JSON_OBJECT.accept(env, value) || super.accept(env, value);
    }

    @Override
    public D convParamNotNull(Environment env, Memory value) {
        if (value instanceof ArrayMemory || (value instanceof ObjectMemory && ((ObjectMemory) value).value instanceof StdClass)) {
            String json = JsonFunctions.json_encode(value);
            return function.apply(new JsonObject(json.equals("[]") ? "{}" : json));
        }
        return super.convParamNotNull(env, value);
    }
}
