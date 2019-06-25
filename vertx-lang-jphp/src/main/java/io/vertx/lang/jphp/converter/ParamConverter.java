package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.IWrapper;
import io.vertx.lang.jphp.wrapper.PhpGen;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.ext.java.JavaObject;
import php.runtime.lang.StdClass;
import php.runtime.memory.*;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.time.Instant;
import java.util.function.Function;

public interface ParamConverter<T> {
  boolean accept(Environment env, Memory value);

  default T convParam(Environment env, Memory value) {
    return value == null || value.isNull() ? null : convParamNotNull(env, value);
  }

  T convParamNotNull(Environment env, Memory value);

  static boolean isNull(Memory value) {
    return value == null || value.isNull();
  }

  static boolean isNotNull(Memory value) {
    return value != null && value.isNotNull();
  }

  ParamConverter<String> STRING = new ParamConverter<String>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value.isString();
    }

    @Override
    public String convParamNotNull(Environment env, Memory value) {
      return value.toString();
    }
  };

  ParamConverter<Byte> BYTE = new LongConverter<>(Long::byteValue) ;
  ParamConverter<Character> CHARACTER = new ParamConverter<Character>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return STRING.accept(env, value) || LONG.accept(env, value);
    }

    @Override
    public Character convParamNotNull(Environment env, Memory value) {
      return value.toChar();
    }
  };
  ParamConverter<Short> SHORT = new LongConverter<>(Long::shortValue);
  ParamConverter<Integer> INTEGER = new LongConverter<>(Long::intValue);
  ParamConverter<Long> LONG = new LongConverter<>(Long::longValue);
  ParamConverter<Double> DOUBLE = new DoubleConverter<>(Double::doubleValue);
  ParamConverter<Float> FLOAT = new DoubleConverter<>(Double::floatValue);
  ParamConverter<Boolean> BOOLEAN = new ParamConverter<Boolean>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value.getRealType() == Memory.Type.BOOL;
    }

    @Override
    public Boolean convParamNotNull(Environment env, Memory value) {
      return value == Memory.TRUE;
    }
  };
  ParamConverter<JsonObject> JSON_OBJECT = new ParamConverter<JsonObject>() {
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
  };
  ParamConverter<JsonArray> JSON_ARRAY = new ParamConverter<JsonArray>() {
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
  };
  ParamConverter<Throwable> THROWABLE = new ParamConverter<Throwable>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value.isObject() && value.toValue(ObjectMemory.class).value instanceof Throwable;
    }

    @Override
    public Throwable convParamNotNull(Environment env, Memory value) {
      return (Throwable) value.toValue(ObjectMemory.class).value;
    }
  };
  ParamConverter<Void> VOID = new ParamConverter<Void>() {
    @Override
    public boolean accept(Environment env, Memory value) {
      return value == null || value.isNull();
    }

    @Override
    public Void convParamNotNull(Environment env, Memory value) {
      return null;
    }
  };
  ParamConverter<Class<Object>> CLASS = new ParamConverter<Class<Object>>() {
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
  };
//  ParamConverter<Memory> MEMORY = new ParamConverter<Memory>() {
//    @Override
//    public boolean accept(Environment env, Memory value) {
//      return true;
//    }
//
//    @Override
//    public Memory convParamNotNull(Environment env, Memory value) {
//      return value;
//    }
//  };
//  ParamConverter<Instant> INSTANT = new ParamConverter<Instant>() {
//    @Override
//    public boolean accept(Environment env, Memory value) {
//      return value.isNumber();
//    }
//
//    @Override
//    public Instant convParamNotNull(Environment env, Memory value) {
//      return Instant.ofEpochMilli(value.toLong());
//    }
//  };

  ParamConverter<Object> UNKNOWN_TYPE = new ParamConverter<Object>() {
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
      } else if (value instanceof ArrayMemory) {
        ArrayMemory array = (ArrayMemory) value;
        String str = JsonFunctions.json_encode(value);
        if (array.isMap()) {
          return str.charAt(0) == '{' ? new JsonObject(str) : new JsonArray(str);
        } else {
          return new JsonArray(str);
        }
      } else if (value instanceof ObjectMemory) {
        ObjectMemory obj = (ObjectMemory) value;
        if (obj.value instanceof StdClass) {
          String str = JsonFunctions.json_encode(value);
          return new JsonObject(str);
        } else if (obj.value instanceof IWrapper) {
          return ((IWrapper) obj.value).getWrappedObject();
        } else if (obj.value instanceof JavaObject){
          return ((JavaObject) obj.value).getObject();
        } else {
          return obj.value;
        }
      } else {
        throw new UnsupportedOperationException("unsupported type:" + value.getClass() + ", " + value);
      }
    }
  };

  static <T> ParamConverter<T> createUnknownType() {
    return new ParamConverter<T>() {
      @Override
      public boolean accept(Environment env, Memory value) {
        return true;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T convParamNotNull(Environment env, Memory value) {
        return (T) UNKNOWN_TYPE.convParamNotNull(env, value);
      }
    };
  }








  class LongConverter<T extends Number> implements ParamConverter<T> {
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

  }

  class DoubleConverter<T extends Number> implements ParamConverter<T> {
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
  }
}
