package io.vertx.lang.jphp;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.converter.MemoryConverter;
import io.vertx.lang.jphp.converter.VariableConverter;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.lang.StdClass;
import php.runtime.memory.*;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Utils {

    public static VariableConverter<?> UNKNOWN_TYPE = new MemoryConverter();

    public static boolean isNotNull(Memory memory) {
        return memory != null && memory == Memory.NULL;
    }

    public static boolean isString(Environment env, Memory memory) {
        return memory.isString();
    }

    public static String convParamString(Environment env, Memory memory) {
        return (memory == null || memory.isNull()) ? null : memory.toString();
    }

    public static Memory convReturnString(Environment env, String str) {
        return StringMemory.valueOf(str);
    }

    public static boolean isByte(Environment env, Memory memory) {
        return isLong(env, memory);
    }

    public static byte convParamByte(Environment env, Memory memory) {
        return (byte) memory.toLong();
    }

    public static Memory convReturnByte(Environment env, byte b) {
        return LongMemory.valueOf(b);
    }

    public static boolean isCharacter(Environment env, Memory memory) {
        return isLong(env, memory);
    }

    public static char convParamCharacter(Environment env, Memory memory) {
        return memory.toChar();
    }

    public static Memory convReturnCharacter(Environment env, char c) {
        return StringMemory.valueOf(c);
    }

    public static boolean isShort(Environment env, Memory memory) {
        return isLong(env, memory);
    }

    public static short convParamShort(Environment env, Memory memory) {
        return (short) convParamLong(env, memory);
    }

    public static Memory convReturnShort(Environment env, short s) {
        return LongMemory.valueOf(s);
    }

    public static boolean isInteger(Environment env, Memory memory) {
        return isLong(env, memory);
    }

    public static int convParamInteger(Environment env, Memory memory) {
        return memory.toInteger();
    }

    public static Memory convReturnInteger(Environment env, int i) {
        return LongMemory.valueOf(i);
    }

    public static boolean isLong(Environment env, Memory memory) {
        return memory instanceof LongMemory;
    }

    public static long convParamLong(Environment env, Memory memory) {
        return memory.toLong();
    }

    public static Memory convReturnLong(Environment env, long l) {
        return LongMemory.valueOf(l);
    }

    public static boolean isDouble(Environment env, Memory memory) {
        return memory instanceof DoubleMemory;
    }

    public static double convParamDouble(Environment env, Memory memory) {
        return memory.toDouble();
    }

    public static Memory convReturnDouble(Environment env, double d) {
        return DoubleMemory.valueOf(d);
    }

    public static boolean isFloat(Environment env, Memory memory) {
        return isDouble(env, memory);
    }

    public static float convParamFloat(Environment env, Memory memory) {
        return memory.toFloat();
    }

    public static Memory convReturnFloat(Environment env, float d) {
        return DoubleMemory.valueOf(d);
    }

    public static boolean isBoolean(Environment env, Memory memory) {
        return memory.getRealType() == Memory.Type.BOOL;
    }

    public static boolean convParamBoolean(Environment env, Memory memory) {
        return memory.toBoolean();
    }

    public static Memory convReturnBoolean(Environment env, boolean b) {
        return b ? Memory.TRUE : Memory.FALSE;
    }

    public static boolean isJsonObject(Environment env, Memory value) {
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

    public static JsonObject convParamJsonObject(Environment env, Memory memory) {
        return new JsonObject(JsonFunctions.json_encode(memory));
    }

    public static Memory convReturnJsonObject(Environment env, JsonObject json) {
        return JsonFunctions.json_decode(env, json.encode());
    }

    public static boolean isJsonArray(Environment env, Memory memory) {
        if (!memory.isArray()) {
            return false;
        }
        ArrayMemory array = memory.toValue(ArrayMemory.class);
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
            if (!isJsonArray(env, raw)) {
                return false;
            }
        }
        return true;
    }

    public static JsonArray convParamJsonArray(Environment env, Memory memory) {
        return new JsonArray(JsonFunctions.json_encode(memory));
    }

    public static Memory convReturnJsonArray(Environment env, JsonArray json) {
        return JsonFunctions.json_decode(env, json.encode());
    }

    public static <D> boolean isDataObject(Environment env, Class<D> clazz, Memory memory) {
        return isDataObjectObject(memory, clazz) || isJsonObject(env, memory);
    }

    private static <DATA> boolean isDataObjectObject(Memory memory, Class<DATA> clazz) {
        if (!memory.isObject()) {
            return false;
        }
        ObjectMemory obj = memory.toValue(ObjectMemory.class);
        if (!(obj.value instanceof DataObjectWrapper)) {
            return false;
        }
        DataObjectWrapper dataDataObjectWrapper = (DataObjectWrapper) obj.value;
        return clazz.isInstance(dataDataObjectWrapper.getWrappedObject());
    }

    @SuppressWarnings("unchecked")
    public static <DATA> DATA convParamDataObject(Environment env, Function<JsonObject, DATA> newInstance, Memory memory) {
        if (isJsonObject(env, memory)) {
            return newInstance.apply(new JsonObject(JsonFunctions.json_encode(memory)));
        } else {
            DataObjectWrapper<DATA> dataDataObjectWrapper = (DataObjectWrapper<DATA>) memory.toValue(ObjectMemory.class).value;
            return dataDataObjectWrapper.getWrappedObject();
        }
    }

    public static <DATA, B extends DataObjectWrapper<DATA>> Memory convReturnDataObject(Environment env, BiFunction<Environment, DATA, B> function, DATA data) {
        return function.apply(env, data).toMemory();
    }

    public static <E extends Enum<E>> boolean isEnum(Environment env, Class<E> clazz, Memory memory) {
        if (!isString(env, memory)) {
            return false;
        }
        try {
            Enum.valueOf(clazz, memory.toString());
            return true;
        } catch (Throwable throwable) {
            return false;
        }
    }

    public static <E extends Enum<E>> E convParamEnum(Class<E> clazz, Memory memory) {
        return Enum.valueOf(clazz, memory.toString());
    }

    public static <E extends Enum<E>> Memory convReturnEnum(E e) {
        return StringMemory.valueOf(e.name());
    }

    public static boolean isThrowable(Memory memory) {
        return memory.isObject() && memory.toValue(ObjectMemory.class).value instanceof Throwable;
    }

    public static Throwable convParamThrowable(Memory memory) {
        return (Throwable) memory.toValue(ObjectMemory.class).value;
    }

    public static Memory convReturnThrowable(Environment env, Throwable throwable) {
        return BaseThrowable.of(env, throwable).toMemory();
    }

    public static boolean isVariable(Memory memory) {
        //TODO
        return true;
    }

    public static Memory convParamVariable(Memory memory) {
        //TODO
        return memory;
    }
    public static Memory convReturnVariable(){
        return null;
    }

    public static boolean isObjectNotSupport() {
        return false;
    }

    public static <API> boolean isVertxGen(Class<API> clazz, Memory memory) {
        if (!memory.isObject()) {
            return false;
        }
        ObjectMemory obj = memory.toValue(ObjectMemory.class);
        if (!(obj.value instanceof VertxGenVariable0Wrapper)) {
            return false;
        }
        VertxGenVariable0Wrapper dataDataObjectWrapper = (VertxGenVariable0Wrapper) obj.value;
        return clazz.isInstance(dataDataObjectWrapper.getWrappedObject());
    }

    @SuppressWarnings("unchecked")
    public static <API> API convParamVertxGen(Class<API> clazz, Memory memory) {
        return ((VertxGenVariable0Wrapper<API>) memory.toValue(ObjectMemory.class).value).getWrappedObject();
    }

    public static <API, WRAPPER extends VertxGenVariable0Wrapper<API>> Memory convReturnVertxGen(Environment env, BiFunction<Environment, API, WRAPPER> wraper, API api) {
        return api == null ? Memory.NULL : wraper.apply(env, api).toMemory();
    }

    public static boolean isCollectionString(Memory memory) {
        if (!memory.isArray()) {
            return false;
        }
        ArrayMemory array = memory.toValue(ArrayMemory.class);
        for (ReferenceMemory reference : array) {
            if (!reference.getValue().isString()) {
                return false;
            }
        }
        return true;
    }

    public static List<String> convParamListString(Memory memory) {
        ArrayMemory array = memory.toValue(ArrayMemory.class);
        return array.stream().map(ReferenceMemory::toString).collect(Collectors.toList());
    }


//    public static boolean isVertxGen(Memory memory) {
//        return memory.isObject() && memory.toValue(ObjectMemory.class).value instanceof VertxGenWrapper;
//    }

    public static boolean isHandler(Memory memory) {
        return memory.isClosure();
    }

    public static boolean isFunction(Memory memory) {
        return memory.isClosure();
    }

    public static Memory convReturnOther(Environment env, Object obj) {
        return convReturnUnknown(env, obj);
    }

    public static Memory convReturnUnknown(Environment env, Object obj) {
        //TODO test
        return Memory.NULL;
    }

    public static <T> Handler<AsyncResult<T>> convParamHandlerAsyncResultVertxGenVariable0(Environment env, Memory memory){
        return asyncResult -> {
            Invoker invoker = memory.toInvoker(env);
            if (asyncResult.succeeded()) {
//                invoker.call()
            } else {

            }
        };
    }
}
