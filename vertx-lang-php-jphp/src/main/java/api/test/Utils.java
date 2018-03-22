package api.test;
import io.vertx.lang.php.BaseWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.StringMemory;

import java.util.function.BiFunction;

public class Utils {
    public static TypeConverter<?> UNKNOWN_TYPE = new TypeConverter<>(Memory::isClosure, Utils::convReturnTypeUnknown, Utils::convParamTypeUnknown);

    public static TypeConverter<Number> NUMBER_TYPE = new TypeConverter<>(Memory::isNumber, Utils::convReturnLong, Utils::convParamLong);
    public static <T extends Enum<T>> TypeConverter<T> enumType(Class<T> clazz){
        return new TypeConverter<>(Memory::isString, (env, t) -> StringMemory.valueOf(t.toString()), (env, str) -> Enum.valueOf(clazz, str.toString()));
    }

    public static <S, T extends BaseWrapper<S>> BiFunction<Environment, Memory, S> newUnwrap(Class<S> clazz){
        return (env, memory) -> {
            if (memory instanceof ObjectMemory && clazz.isInstance(((ObjectMemory) memory).value)) {
                return (S) ((ObjectMemory) memory).value;
            }
            throw new RuntimeException("cannot unwrap a " + clazz.getSimpleName() + " from a " + memory.getClass().getSimpleName());
        };
    }

    public static TypeConverter<BaseWrapper<?>> WRAPPER_TYPE = new TypeConverter<>(Memory::isObject, Utils::convReturnTypeWrapper, Utils::convParamTypeWrapper);

    private static <T extends BaseWrapper> T convParamTypeWrapper(Environment environment, Memory memory) {
        if (memory instanceof ObjectMemory ) {
            return (T) ((ObjectMemory) memory).value;
        }
        throw new RuntimeException("cannot unwrap a subtype of BaseWrapper from instance of " + memory.getClass().getSimpleName());
    }

    private static <T extends BaseWrapper> Memory convReturnTypeWrapper(Environment environment, T t) {
        return t.toMemory();
    }


    public static <T> Memory convReturnTypeUnknown(Environment env, T value){
        return null;
    }
    public static <T> T convParamTypeUnknown(Environment env, Memory memory){
        return null;
    }

    public static Memory convReturnLong(Environment env, Number number){
        return null;
    }
    public static Number convParamLong(Environment env, Memory number){
        return null;
    }
}
