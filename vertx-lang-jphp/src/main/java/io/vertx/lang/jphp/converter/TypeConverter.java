package io.vertx.lang.jphp.converter;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.BaseThrowable;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.StdClass;
import php.runtime.memory.*;
import php.runtime.memory.support.ArrayMapEntryMemory;

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
            return value;
        }

        @Override
        public Memory convReturnNotNull(Environment env, Object value) {
            return Utils.convReturnObject(env, value);
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
            return LONG.accept(env, value);
        }

        @Override
        public Character convParamNotNull(Environment env, Memory value) {
            return (char) LONG.convParamNotNull(env, value).longValue();
        }

        @Override
        public Memory convReturnNotNull(Environment env, Character value) {
            return LongMemory.valueOf(value);
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
                if (array.stream().anyMatch(r -> !(r.getValue() instanceof ArrayMapEntryMemory))) {
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
                if (!raw.isNumber() && !raw.isString() && !(raw.type == Memory.Type.BOOL) && !raw.isNull()) {
                    return false;
                }
                if (raw.isObject()) {
                    ObjectMemory obj = raw.toValue(ObjectMemory.class);
                    if (!(obj.value instanceof StdClass)) {
                        return false;
                    }
                }
                if (!accept(env, raw)) {
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
            try{
                Class.forName(name);
                return true;
            } catch(Throwable throwable) {
                return env.fetchClass(name) != null;
            }
        }

        @Override
        public Class<Object> convParamNotNull(Environment env, Memory value) {
            String name = value.toString();
            try{
                return (Class<Object>) Class.forName(name);
            } catch(Throwable throwable) {
                return (Class<Object>) env.fetchClass(name).getNativeClass();
            }
        }

        @Override
        public Memory convReturnNotNull(Environment env, Class<Object> value) {
            return StringMemory.valueOf(value.getName());
        }
    };

}
