package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import php.runtime.Memory;
import php.runtime.env.Environment;

public interface TypeConverter<T> extends ParamConverter<T>, ReturnConverter<T> {

  TypeConverter<Object> UNKNOWN_TYPE = create(ParamConverter.UNKNOWN_TYPE, ReturnConverter.UNKNOWN_TYPE);
  TypeConverter<String> STRING = create(ParamConverter.STRING, ReturnConverter.STRING);
  TypeConverter<Byte> BYTE = create(ParamConverter.BYTE, ReturnConverter.BYTE);
  TypeConverter<Character> CHARACTER = create(ParamConverter.CHARACTER, ReturnConverter.CHARACTER);
  TypeConverter<Short> SHORT = create(ParamConverter.SHORT, ReturnConverter.SHORT);
  TypeConverter<Integer> INTEGER = create(ParamConverter.INTEGER, ReturnConverter.INTEGER);
  TypeConverter<Long> LONG = create(ParamConverter.LONG, ReturnConverter.LONG);
  TypeConverter<Double> DOUBLE = create(ParamConverter.DOUBLE, ReturnConverter.DOUBLE);
  TypeConverter<Float> FLOAT = create(ParamConverter.FLOAT, ReturnConverter.FLOAT);
  TypeConverter<Boolean> BOOLEAN = create(ParamConverter.BOOLEAN, ReturnConverter.BOOLEAN);
  TypeConverter<JsonObject> JSON_OBJECT = create(ParamConverter.JSON_OBJECT, ReturnConverter.JSON_OBJECT);
  TypeConverter<JsonArray> JSON_ARRAY = create(ParamConverter.JSON_ARRAY, ReturnConverter.JSON_ARRAY);
  TypeConverter<Throwable> THROWABLE = create(ParamConverter.THROWABLE, ReturnConverter.THROWABLE);
  TypeConverter<Void> VOID = create(ParamConverter.VOID, ReturnConverter.VOID);
  TypeConverter<Class<Object>> CLASS = create(ParamConverter.CLASS, ReturnConverter.CLASS);
//  TypeConverter<Memory> MEMORY = create(ParamConverter.MEMORY, ReturnConverter.MEMORY);
//  TypeConverter<Instant> INSTANT = create(ParamConverter.INSTANT, ReturnConverter.INSTANT);


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
    return create(ParamConverter.createUnknownType(), ReturnConverter.createUnknownType());
  }

  static <T> TypeConverter<T> create(ParamConverter<T> paramConverter, ReturnConverter<T> returnConverter) {
    return new TypeConverter<T>() {
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

    };
  }
}
