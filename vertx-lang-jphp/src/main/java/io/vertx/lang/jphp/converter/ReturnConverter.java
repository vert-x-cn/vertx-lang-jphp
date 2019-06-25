package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.converter.container.CollectionReturnConverter;
import io.vertx.lang.jphp.converter.container.MapReturnConverter;
import io.vertx.lang.jphp.wrapper.extension.BaseThrowable;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.ext.java.JavaObject;
import php.runtime.memory.*;

import java.time.Instant;
import java.util.Collection;
import java.util.Map;

public interface ReturnConverter<T> {
  default Memory convReturn(Environment env, T value) {
    return value == null ? Memory.NULL : convReturnNotNull(env, value);
  }

  Memory convReturnNotNull(Environment env, T value);

  ReturnConverter<String> STRING = (env, value) -> StringMemory.valueOf(value);

  ReturnConverter<Byte> BYTE = (env, value) -> LongMemory.valueOf(value.longValue());
  ReturnConverter<Character> CHARACTER = (env, value) -> StringMemory.valueOf(value);
  ReturnConverter<Short> SHORT = (env, value) -> LongMemory.valueOf(value.longValue());
  ReturnConverter<Integer> INTEGER = (env, value) -> LongMemory.valueOf(value.longValue());
  ReturnConverter<Long> LONG = (env, value) -> LongMemory.valueOf(value.longValue());
  ReturnConverter<Double> DOUBLE = (env, value) -> DoubleMemory.valueOf(value.doubleValue());
  ReturnConverter<Float> FLOAT = (env, value) -> DoubleMemory.valueOf(value.doubleValue());
  ReturnConverter<Boolean> BOOLEAN = (env, value) -> TrueMemory.valueOf(value);
  ReturnConverter<JsonObject> JSON_OBJECT = (env, value) -> JsonFunctions.json_decode(env, value.encode(), true);
  ReturnConverter<JsonArray> JSON_ARRAY = (env, value) -> JsonFunctions.json_decode(env, value.encode(), true);
  ReturnConverter<Throwable> THROWABLE = (env, value) -> BaseThrowable.of(env, value).toMemory();
  ReturnConverter<Void> VOID = (env, value) -> Memory.NULL;
  ReturnConverter<Class<Object>> CLASS = (env, value) -> StringMemory.valueOf(value.getName());
  ReturnConverter<Enum> ENUM = (env, value) -> StringMemory.valueOf(value.name());
  static <E extends Enum> ReturnConverter<E> createEnumReturnConverter() {
    //noinspection unchecked
    return (ReturnConverter<E>)ENUM;
  }
//  ReturnConverter<Memory> MEMORY = (env, value) -> value;
//  ReturnConverter<Instant> INSTANT = (env, value) -> LongMemory.valueOf(value.toEpochMilli());
  ReturnConverter<Object> UNKNOWN_TYPE = new ReturnConverter<Object>() {
    @Override
    public Memory convReturnNotNull(Environment env, Object value) {
      if (value instanceof String) {
        return STRING.convReturnNotNull(env, (String) value);
      } else if (value instanceof Character) {
        return CHARACTER.convReturnNotNull(env, (Character) value);
      } else if (value instanceof Number) {
        if (value instanceof Double || value instanceof Float) {
          return DOUBLE.convReturnNotNull(env, ((Number) value).doubleValue());
        } else {
          return LONG.convReturnNotNull(env, ((Number) value).longValue());
        }
      } else if (value instanceof JsonObject) {
        return JSON_OBJECT.convReturnNotNull(env, ((JsonObject) value));
      } else if (value instanceof JsonArray) {
        return JSON_ARRAY.convReturnNotNull(env, ((JsonArray) value));
      } else if (value instanceof Boolean) {
        return BOOLEAN.convReturnNotNull(env, (Boolean) value);
      } else if (value instanceof Collection) {
        return CollectionReturnConverter.convCollectionReturnNotNull(env, (Collection<?>) value, this::convReturnNotNull);
      } else if (value instanceof Map) {
        return MapReturnConverter.convMapReturnNotNull(env, (Map<?, ?>) value, this::convReturnNotNull);
      } else if (value instanceof Memory) {
        return (Memory) value;
      } else if (value instanceof Throwable) {
        return THROWABLE.convReturnNotNull(env, (Throwable) value);
      } else if (value instanceof Enum) {
        return ENUM.convReturnNotNull(env, (Enum) value);
      } else if (value instanceof Void) {
        return VOID.convReturnNotNull(env, (Void) value);
      } else if (value instanceof Class) {
        //noinspection unchecked
        return CLASS.convReturnNotNull(env, (Class) value);
      }
      return ObjectMemory.valueOf(JavaObject.of(env, value));
    }
  };

  static <T> ReturnConverter<T> createUnknownType() {
    return (env, value) -> UNKNOWN_TYPE.convReturnNotNull(env, value);
  }
}
