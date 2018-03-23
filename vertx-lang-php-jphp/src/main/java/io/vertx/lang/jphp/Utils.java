package io.vertx.lang.jphp;

import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.StdClass;
import php.runtime.memory.*;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Utils {
    public static boolean isNotNull(Memory memory) {
        return memory != null && memory == Memory.NULL;
    }

    public static boolean isString(Memory memory) {
        return memory.isString();
    }

    public static String convParamString(Memory memory) {
        return (memory == null || memory.isNull()) ? null : memory.toString();
    }

    public static Memory convReturnString(String str) {
        return StringMemory.valueOf(str);
    }

    public static boolean isChar(Memory memory) {
        return isLong(memory);
    }

    public static boolean isCharacter(Memory memory) {
        return isLong(memory);
    }

    public static char convParamChar(Memory memory) {
        return memory.toChar();
    }

    public static Character convParamCharacter(Memory memory) {
        return convParamChar(memory);
    }

    public static Memory convReturnChar(char c) {
        return StringMemory.valueOf(c);
    }

    public static Memory convReturnCharacter(Character c) {
        return convReturnChar(c);
    }

    public static boolean isShort(Memory memory) {
        return isLong(memory);
    }

    public static short convParamShort(Memory memory){
        return (short)convParamLong(memory);
    }
    public static Memory convReturnShort(short s){
        return LongMemory.valueOf(s);
    }

    public static boolean isInt(Memory memory) {
        return isLong(memory);
    }

    public static boolean isInteger(Memory memory) {
        return isLong(memory);
    }

    public static int convParamInt(Memory memory){
        return memory.toInteger();
    }
    public static Integer convParamInteger(Memory memory){
        return convParamInt(memory);
    }
    public static Memory convReturnInt(int i){
        return LongMemory.valueOf(i);
    }
    public static Memory convReturnInteger(Integer i){
        return convReturnInteger(i);
    }

    public static boolean isLong(Memory memory) {
//        return memory.isNumber();
        return memory instanceof LongMemory;
    }
    public static long convParamLong(Memory memory){
        return memory.toLong();
    }
    public static Memory convReturnLong(long l){
        return LongMemory.valueOf(l);
    }

    public static boolean isDouble(Memory memory) {
//        return memory.isNumber();
        return memory instanceof DoubleMemory;
    }
    public static double convParamDouble(Memory memory){
        return memory.toDouble();
    }
    public static Memory convReturnDouble(double d){
        return DoubleMemory.valueOf(d);
    }

    public static boolean isFloat(Memory memory) {
        return isDouble(memory);
    }
    public static float convParamFloat(Memory memory){
        return memory.toFloat();
    }
    public static Memory convReturnFloat(float d){
        return DoubleMemory.valueOf(d);
    }

    public static boolean isBoolean(Memory memory) {
        return memory.getRealType() == Memory.Type.BOOL;
    }
    public static boolean convParamBoolean(Memory memory){
        return memory.toBoolean();
    }
    public static Memory convReturnBoolean(boolean b){
        return b ? Memory.TRUE : Memory.FALSE;
    }

    public static <E extends Enum<E>> boolean isEnum(Class<E> clazz, Memory memory) {
        if (!isString(memory)) {
            return false;
        }
        try {
            Enum.valueOf(clazz, memory.toString());
            return true;
        } catch (Throwable throwable) {
            return false;
        }
    }

    public static boolean isJsonObject(Memory memory) {
        if (!memory.isArray() && !memory.isObject()) {
            return false;
        }
        if (memory.isArray()) {
            ArrayMemory array = memory.toValue(ArrayMemory.class);
            if (array.stream().anyMatch(r -> !(r.getValue() instanceof ArrayMapEntryMemory))) {
                return false;
            }
        }
        if (memory.isObject()) {
            ObjectMemory obj = memory.toValue(ObjectMemory.class);
            if (!(obj.value instanceof StdClass)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isJsonArray(Memory memory) {
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
            if (!isJsonArray(raw)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isThrowable(Memory memory) {
        return memory.isObject() && memory.toValue(ObjectMemory.class).value instanceof RuntimeException;
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

    public static List<String> convListString(Memory memory) {
        ArrayMemory array = memory.toValue(ArrayMemory.class);
        return array.stream().map(it -> it.toString()).collect(Collectors.toList());
    }

    public static <API, WRAPPER extends VertxGenWrapper<API>> Memory convReturnVertxGen(Environment env, BiFunction<Environment, API, WRAPPER> wraper, API api) {
        return api == null ? Memory.NULL : wraper.apply(env, api).toMemory();
    }

    public static Memory convReturnOther(Environment env, Object obj) {
        return convReturnUnknown(env, obj);
    }

    public static Memory convReturnUnknown(Environment env, Object obj) {
        //TODO test
        return Memory.NULL;
    }
}
