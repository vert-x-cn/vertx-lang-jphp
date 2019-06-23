package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import php.runtime.Memory;
import php.runtime.env.Environment;

import java.time.Instant;

@SuppressWarnings("unused")
public interface TypeConverter<T> extends ParamConverter<T>, ReturnConverter<T> {
  boolean accept(Environment env, Memory value);

  default T convParam(Environment env, Memory value) {
    return value == null || value.isNull() ? null : convParamNotNull(env, value);
  }

  T convParamNotNull(Environment env, Memory value);

  default Memory convReturn(Environment env, T value) {
    return value == null ? Memory.NULL : convReturnNotNull(env, value);
  }

  Memory convReturnNotNull(Environment env, T value);

  static <T> TypeConverter<T> createUnknownType() {
    return new DefaultTypeConverter<>(ParamConverter.createUnknownType(), ReturnConverter.createUnknownType());
  }
  TypeConverter<Object> UNKNOWN_TYPE = new DefaultTypeConverter<>(ParamConverter.UNKNOWN_TYPE, ReturnConverter.UNKNOWN_TYPE);

  TypeConverter<String> STRING = new DefaultTypeConverter<>(ParamConverter.STRING, ReturnConverter.STRING);

  TypeConverter<Byte> BYTE = new DefaultTypeConverter<>(ParamConverter.BYTE, ReturnConverter.BYTE);
  TypeConverter<Character> CHARACTER = new DefaultTypeConverter<>(ParamConverter.CHARACTER, ReturnConverter.CHARACTER);
  TypeConverter<Short> SHORT = new DefaultTypeConverter<>(ParamConverter.SHORT, ReturnConverter.SHORT);
  TypeConverter<Integer> INTEGER =new DefaultTypeConverter<>(ParamConverter.INTEGER, ReturnConverter.INTEGER);
  TypeConverter<Long> LONG = new DefaultTypeConverter<>(ParamConverter.LONG, ReturnConverter.LONG);
  TypeConverter<Double> DOUBLE = new DefaultTypeConverter<>(ParamConverter.DOUBLE, ReturnConverter.DOUBLE);
  TypeConverter<Float> FLOAT = new DefaultTypeConverter<>(ParamConverter.FLOAT, ReturnConverter.FLOAT);
  TypeConverter<Boolean> BOOLEAN =new DefaultTypeConverter<>(ParamConverter.BOOLEAN, ReturnConverter.BOOLEAN);
  TypeConverter<JsonObject> JSON_OBJECT = new DefaultTypeConverter<>(ParamConverter.JSON_OBJECT, ReturnConverter.JSON_OBJECT);
  TypeConverter<JsonArray> JSON_ARRAY = new DefaultTypeConverter<>(ParamConverter.JSON_ARRAY, ReturnConverter.JSON_ARRAY);

  TypeConverter<Throwable> THROWABLE = new DefaultTypeConverter<>(ParamConverter.THROWABLE, ReturnConverter.THROWABLE);
  TypeConverter<Void> VOID = new DefaultTypeConverter<>(ParamConverter.VOID, ReturnConverter.VOID);
  TypeConverter<Class<Object>> CLASS = new DefaultTypeConverter<>(ParamConverter.CLASS, ReturnConverter.CLASS);

  TypeConverter<Memory> MEMORY = new DefaultTypeConverter<>(ParamConverter.MEMORY, ReturnConverter.MEMORY);

  TypeConverter<Instant> INSTANT = new DefaultTypeConverter<>(ParamConverter.INSTANT, ReturnConverter.INSTANT);


  class DefaultTypeConverter<T> implements TypeConverter<T> {
    private ParamConverter<T> paramConverter;
    private ReturnConverter<T> returnConverter;
    public DefaultTypeConverter(ParamConverter<T> paramConverter, ReturnConverter<T> returnConverter){
      this.paramConverter = paramConverter;
      this.returnConverter = returnConverter;
    }

    @Override
    public boolean accept(Environment env, Memory value) {
      return paramConverter.accept(env, value);
    }

    @Override
    public T convParamNotNull(Environment env, Memory value) {
      return paramConverter.convParamNotNull(env, value);
    }

    @Override
    public Memory convReturnNotNull(Environment env, T value) {
      return returnConverter.convReturnNotNull(env, value);
    }
  }
}
