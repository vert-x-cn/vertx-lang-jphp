package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.PhpGen;
import io.vertx.lang.jphp.wrapper.extension.BaseThrowable;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.StdClass;
import php.runtime.memory.*;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@SuppressWarnings("unused")
public interface TypeConverter<T> {
  boolean accept(Environment env, Memory value);

  default T convParam(Environment env, Memory value) {
    return value == null || value.isNull() ? null : convParamNotNull(env, value);
  }

  T convParamNotNull(Environment env, Memory value);

  default Memory convReturn(Environment env, T value) {
    return value == null ? Memory.NULL : convReturnNotNull(env, value);
  }

  Memory convReturnNotNull(Environment env, T value);

  TypeConverter<Object> UNKNOWN_TYPE = new TypeConverter<Object>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return true;
    }

    @Override
    public Object convParamNotNull(Environment env, Memory value) {
      if (value.isString()) {
        return value.toString();
      } else if (value instanceof LongMemory) {
        return value.toLong();
      } else if (value instanceof DoubleMemory) {
        return value.toDouble();
      } else if (value instanceof TrueMemory) {
        return true;
      } else if (value instanceof FalseMemory) {
        return false;
      } else if (value instanceof ReferenceMemory) {
        return convParam(env, ((ReferenceMemory) value).getValue());
      } else if (value instanceof ObjectMemory && ((ObjectMemory) value).value instanceof StdClass) {
        String str = JsonFunctions.json_encode(value);
        return str.charAt(0) == '{' ? new JsonObject(str) : new JsonArray(str);
      } else if (value instanceof ArrayMemory) {
        ArrayMemory array = (ArrayMemory) value;
        if (array.isMap()) {
          Map<Object, Object> map = new HashMap<>();
          array.forEach(referenceMemory -> {
            ArrayMapEntryMemory mapEntryMemory = (ArrayMapEntryMemory) referenceMemory;
            Object k = mapEntryMemory.getKey();
            Object key;
            if (k instanceof LongMemory) {
              key = ((LongMemory) k).toLong();
            } else {
              key = k.toString();
            }
            map.put(key, convParam(env, mapEntryMemory.getValue()));
          });
          return map;
        } else {
          List<Object> list = new ArrayList<>();
          array.forEach(referenceMemory ->
            list.add(convParam(env, referenceMemory.getValue()))
          );
          return list;
        }
      } else {
//                String str = JsonFunctions.json_encode(value);
//                return str.charAt(0) == '{' ? new JsonObject(str) : new JsonArray(str);
        return value;
      }
    }

    @Override
    public Memory convReturnNotNull(Environment env, Object value) {
      if (value instanceof String) {
        return StringMemory.valueOf((String) value);
      } else if (value instanceof Character) {
        return StringMemory.valueOf((Character) value);
      } else if (value instanceof Number) {
        if (value instanceof Double || value instanceof Float) {
          return DoubleMemory.valueOf(((Number) value).doubleValue());
        } else {
          return LongMemory.valueOf(((Number) value).longValue());
        }
      } else if (value instanceof JsonObject) {
        return JsonFunctions.json_decode(env, ((JsonObject) value).encode(), true);
      } else if (value instanceof JsonArray) {
        return JsonFunctions.json_decode(env, ((JsonArray) value).encode(), true);
      } else if (value instanceof Boolean) {
        return TrueMemory.valueOf((Boolean) value);
      } else if (value instanceof List) {
        ArrayMemory array = new ArrayMemory();
        ((List<?>) value).forEach(v -> array.add(convReturn(env, v)));
        return array;
      } else if (value instanceof Map) {
        ArrayMemory array = new ArrayMemory(true);
        ((Map<?, ?>) value).forEach((k, v) -> {
          Object key;
          if (k instanceof LongMemory) {
            key = k;
          } else if (k instanceof Number && !(k instanceof Double) && !(k instanceof Float)) {
            key = LongMemory.valueOf(((Number) k).longValue());
          } else {
            key = k.toString();
          }
          array.put(key, convReturn(env, v));
        });
        return array;
      } else if (value instanceof Memory) {
        return (Memory) value;
      }
      return null;
    }
  };

  TypeConverter<String> STRING = new TypeConverter<String>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value.isString();
    }

    @Override
    public String convParamNotNull(Environment env, Memory value) {
      return value.toString();
    }

    @Override
    public Memory convReturnNotNull(Environment env, String value) {
      return StringMemory.valueOf(value);
    }
  };

  class LongConverter<T extends Number> implements TypeConverter<T> {
    private Function<Long, T> function;

    LongConverter(Function<Long, T> function) {
      this.function = function;
    }

    @Override
    public boolean accept(Environment env, Memory value) {
      return value instanceof LongMemory;
    }

    @Override
    public T convParamNotNull(Environment env, Memory value) {
      return function.apply(value.toLong());
    }

    @Override
    public Memory convReturnNotNull(Environment env, T value) {
      return LongMemory.valueOf(value.longValue());
    }
  }

  class DoubleConverter<T extends Number> implements TypeConverter<T> {
    private Function<Double, T> function;

    DoubleConverter(Function<Double, T> function) {
      this.function = function;
    }

    @Override
    public boolean accept(Environment env, Memory value) {
      return value instanceof DoubleMemory;
    }

    @Override
    public T convParamNotNull(Environment env, Memory value) {
      return function.apply(value.toDouble());
    }

    @Override
    public Memory convReturnNotNull(Environment env, T value) {
      return DoubleMemory.valueOf(value.doubleValue());
    }
  }

  TypeConverter<Byte> BYTE = new LongConverter<>(Long::byteValue);
  TypeConverter<Character> CHARACTER = new TypeConverter<Character>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return STRING.accept(env, value) || LONG.accept(env, value);
    }

    @Override
    public Character convParamNotNull(Environment env, Memory value) {
      return value.toChar();
    }

    @Override
    public Memory convReturnNotNull(Environment env, Character value) {
      return StringMemory.valueOf(value);
    }
  };
  TypeConverter<Short> SHORT = new LongConverter<>(Long::shortValue);
  TypeConverter<Integer> INTEGER = new LongConverter<>(Long::intValue);
  TypeConverter<Long> LONG = new LongConverter<>(Long::longValue);
  TypeConverter<Double> DOUBLE = new DoubleConverter<>(Double::doubleValue);
  TypeConverter<Float> FLOAT = new DoubleConverter<>(Double::floatValue);
  TypeConverter<Boolean> BOOLEAN = new TypeConverter<Boolean>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value.getRealType() == Memory.Type.BOOL;
    }

    @Override
    public Boolean convParamNotNull(Environment env, Memory value) {
      return value == Memory.TRUE;
    }

    @Override
    public Memory convReturnNotNull(Environment env, Boolean value) {
      return TrueMemory.valueOf(value);
    }
  };
  TypeConverter<JsonObject> JSON_OBJECT = new TypeConverter<JsonObject>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      if (!value.isArray() && !value.isObject()) {
        return false;
      }
      if (value.isArray()) {
        ArrayMemory array = value.toValue(ArrayMemory.class);
        if (array.stream().anyMatch(r -> !(r instanceof ArrayMapEntryMemory))) {
          return false;
        }
      }
      if (value.isObject()) {
        ObjectMemory obj = value.toValue(ObjectMemory.class);
        return obj.value instanceof StdClass;
      }
      return true;
    }

    @Override
    public JsonObject convParamNotNull(Environment env, Memory value) {
      return new JsonObject(JsonFunctions.json_encode(value));
    }

    @Override
    public Memory convReturnNotNull(Environment env, JsonObject value) {
      return JsonFunctions.json_decode(env, value.encode());
    }
  };
  TypeConverter<JsonArray> JSON_ARRAY = new TypeConverter<JsonArray>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      if (!value.isArray()) {
        return false;
      }
      ArrayMemory array = value.toValue(ArrayMemory.class);
      for (ReferenceMemory reference : array) {
        Memory raw = reference.getValue();
        if (raw.isObject()) {
          ObjectMemory obj = raw.toValue(ObjectMemory.class);
          if (!(obj.value instanceof StdClass)) {
            return false;
          }
        } else if (raw.isArray()) {
          if (!accept(env, raw)) {
            return false;
          }
        } else if (!raw.isNumber() && !raw.isString() && raw.type != Memory.Type.BOOL && !raw.isNull()) {
          return false;
        }
      }
      return true;
    }

    @Override
    public JsonArray convParamNotNull(Environment env, Memory value) {
      return new JsonArray(JsonFunctions.json_encode(value));
    }

    @Override
    public Memory convReturnNotNull(Environment env, JsonArray value) {
      return JsonFunctions.json_decode(env, value.encode());
    }
  };

  TypeConverter<Throwable> THROWABLE = new TypeConverter<Throwable>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value.isObject() && value.toValue(ObjectMemory.class).value instanceof Throwable;
    }

    @Override
    public Throwable convParamNotNull(Environment env, Memory value) {
      return (Throwable) value.toValue(ObjectMemory.class).value;
    }

    @Override
    public Memory convReturnNotNull(Environment env, Throwable value) {
      return BaseThrowable.of(env, value).toMemory();
    }
  };
  TypeConverter<Void> VOID = new TypeConverter<Void>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value == null || value.isNull();
    }

    @Override
    public Void convParamNotNull(Environment env, Memory value) {
      return null;
    }

    @Override
    public Memory convReturnNotNull(Environment env, Void value) {
      return Memory.NULL;
    }
  };
  TypeConverter<Class<Object>> CLASS = new TypeConverter<Class<Object>>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      if (!value.isString()) {
        return false;
      }
      String name = value.toString();
      try {
        Class.forName(name);
        return true;
      } catch (Throwable throwable) {
        return env.fetchClass(name) != null;
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<Object> convParamNotNull(Environment env, Memory value) {
      String name = value.toString();
      Class<Object> c;
      try {
        c = (Class<Object>) Class.forName(name);
      } catch (Throwable throwable) {
        c = (Class<Object>) env.fetchClass(name).getNativeClass();
      }
      if (c != null) {
        PhpGen gen = c.getAnnotation(PhpGen.class);
        if (gen != null) {
          c = gen.value();
        }
      }
      return c;
    }

    @Override
    public Memory convReturnNotNull(Environment env, Class<Object> value) {
      return StringMemory.valueOf(value.getName());
    }
  };

  TypeConverter<Memory> MEMORY = new TypeConverter<Memory>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return true;
    }

    @Override
    public Memory convParamNotNull(Environment env, Memory value) {
      return value;
    }

    @Override
    public Memory convReturnNotNull(Environment env, Memory value) {
      return value;
    }
  };

}
