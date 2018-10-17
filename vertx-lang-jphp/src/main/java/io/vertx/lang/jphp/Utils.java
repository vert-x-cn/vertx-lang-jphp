package io.vertx.lang.jphp;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.converter.*;
import io.vertx.lang.jphp.function.Function2;
import io.vertx.lang.jphp.function.Function3;
import io.vertx.lang.jphp.function.Function4;
import io.vertx.lang.jphp.wrapper.*;
import io.vertx.lang.jphp.wrapper.extension.AsyncHandler;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.StdClass;
import php.runtime.memory.*;
import php.runtime.memory.support.ArrayMapEntryMemory;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

@SuppressWarnings({"unused"})
public class Utils {

  public static boolean isNotNull(Memory value) {
    return value != null && value.isNotNull();
  }

  /**
   * {@link StringMemory}
   */
  public static boolean isString(Environment env, Memory value) {
    return TypeConverter.STRING.accept(env, value);
  }

  public static String convParamString(Environment env, Memory value) {
    return TypeConverter.STRING.convParam(env, value);
  }

  public static Memory convReturnString(Environment env, String value) {
    return TypeConverter.STRING.convReturn(env, value);
  }

  /**
   * {@link LongMemory}
   */
  public static boolean isByte(Environment env, Memory value) {
    return TypeConverter.BYTE.accept(env, value);
  }

  public static byte convParamByte(Environment env, Memory value) {
    return TypeConverter.BYTE.convParam(env, value);
  }

  public static Memory convReturnByte(Environment env, byte value) {
    return TypeConverter.BYTE.convReturn(env, value);
  }

  /**
   * {@link StringMemory} or {@link LongMemory}
   */
  @SuppressWarnings("unused")
  public static boolean isCharacter(Environment env, Memory value) {
    return TypeConverter.CHARACTER.accept(env, value);
  }

  @SuppressWarnings("unused")
  public static Character convParamCharacter(Environment env, Memory value) {
    return TypeConverter.CHARACTER.convParam(env, value);
  }

  @SuppressWarnings("unused")
  public static Memory convReturnCharacter(Environment env, Character value) {
    return TypeConverter.CHARACTER.convReturn(env, value);
  }

  /**
   * {@link LongMemory}
   */
  public static boolean isShort(Environment env, Memory value) {
    return TypeConverter.SHORT.accept(env, value);
  }

  public static Short convParamShort(Environment env, Memory value) {
    return TypeConverter.SHORT.convParam(env, value);
  }

  public static Memory convReturnShort(Environment env, Short value) {
    return TypeConverter.SHORT.convReturn(env, value);
  }

  /**
   * {@link LongMemory}
   */
  public static boolean isInteger(Environment env, Memory value) {
    return TypeConverter.INTEGER.accept(env, value);
  }

  public static Integer convParamInteger(Environment env, Memory value) {
    return TypeConverter.INTEGER.convParam(env, value);
  }

  public static Memory convReturnInteger(Environment env, Integer value) {
    return TypeConverter.INTEGER.convReturn(env, value);
  }

  /**
   * {@link LongMemory}
   */
  public static boolean isLong(Environment env, Memory value) {
    return TypeConverter.LONG.accept(env, value);
  }

  public static Long convParamLong(Environment env, Memory value) {
    return TypeConverter.LONG.convParam(env, value);
  }

  public static Memory convReturnLong(Environment env, Long value) {
    return TypeConverter.LONG.convReturn(env, value);
  }

  /**
   * {@link DoubleMemory}
   */
  public static boolean isDouble(Environment env, Memory value) {
    return TypeConverter.DOUBLE.accept(env, value);
  }

  public static Double convParamDouble(Environment env, Memory value) {
    return TypeConverter.DOUBLE.convParam(env, value);
  }

  public static Memory convReturnDouble(Environment env, Double value) {
    return TypeConverter.DOUBLE.convReturn(env, value);
  }

  /**
   * {@link DoubleMemory}
   */
  public static boolean isFloat(Environment env, Memory value) {
    return TypeConverter.FLOAT.accept(env, value);
  }

  public static Float convParamFloat(Environment env, Memory value) {
    return TypeConverter.FLOAT.convParam(env, value);
  }

  public static Memory convReturnFloat(Environment env, Float value) {
    return TypeConverter.FLOAT.convReturn(env, value);
  }

  /**
   * {@link TrueMemory} or {@link FalseMemory}
   */
  public static boolean isBoolean(Environment env, Memory value) {
    return TypeConverter.BOOLEAN.accept(env, value);
  }

  public static Boolean convParamBoolean(Environment env, Memory value) {
    return TypeConverter.BOOLEAN.convParam(env, value);
  }

  public static Memory convReturnBoolean(Environment env, Boolean value) {
    return TypeConverter.BOOLEAN.convReturn(env, value);
  }

  /**
   * {@link ObjectMemory}<{@link StdClass}>
   * {@link ArrayMemory}<{@link ArrayMapEntryMemory}>
   */
  public static boolean isJsonObject(Environment env, Memory value) {
    return TypeConverter.JSON_OBJECT.accept(env, value);
  }

  public static JsonObject convParamJsonObject(Environment env, Memory value) {
    return TypeConverter.JSON_OBJECT.convParam(env, value);
  }

  public static Memory convReturnJsonObject(Environment env, JsonObject value) {
    return TypeConverter.JSON_OBJECT.convReturn(env, value);
  }

  /**
   * {@link ArrayMemory}
   */
  public static boolean isJsonArray(Environment env, Memory value) {
    return TypeConverter.JSON_ARRAY.accept(env, value);
  }

  public static JsonArray convParamJsonArray(Environment env, Memory value) {
    return TypeConverter.JSON_ARRAY.convParam(env, value);
  }

  public static Memory convReturnJsonArray(Environment env, JsonArray value) {
    return TypeConverter.JSON_ARRAY.convReturn(env, value);
  }

  /**
   * {@link StringMemory}
   */
  public static <E extends Enum<E>> boolean isEnum(Environment env, Class<E> clazz, Memory value) {
    return EnumConverter.create(clazz).accept(env, value);
  }

  public static <E extends Enum<E>> E convParamEnum(Environment env, Class<E> clazz, Memory value) {
    return EnumConverter.create(clazz).convParam(env, value);
  }

  @SuppressWarnings("unused")
  public static <E extends Enum<E>> Memory convReturnEnum(Environment env, E value) {
    return StringMemory.valueOf(value.name());
  }

  /**
   * {@link ObjectMemory}<DATA_OBJECT>
   */
  public static <D, B extends DataObjectWrapper<D>> boolean isDataObject(Environment env, Class<D> clazz, Function<JsonObject, D> function, Function2<Environment, D, B> creator, Memory value) {
    return DataObjectConverter.create(clazz, function, creator).accept(env, value);
  }

  public static <D, B extends DataObjectWrapper<D>> D convParamDataObject(Environment env, Class<D> clazz, Function<JsonObject, D> function, Function2<Environment, D, B> creator, Memory value) {
    return DataObjectConverter.create(clazz, function, creator).convParam(env, value);
  }

  public static <D, B extends DataObjectWrapper<D>> Memory convReturnDataObject(Environment env, Class<D> clazz, Function2<Environment, D, B> creator, Function<JsonObject, D> function, D value) {
    return DataObjectConverter.<D, B>create(clazz, function, creator).convReturnNotNull(env, value);
  }

  /**
   * {@link ObjectMemory}<{@link Throwable}>
   */
  public static boolean isThrowable(Environment env, Memory value) {
    return TypeConverter.THROWABLE.accept(env, value);
  }

  public static Throwable convParamThrowable(Environment env, Memory value) {
    return TypeConverter.THROWABLE.convParam(env, value);
  }

  public static Memory convReturnThrowable(Environment env, Throwable value) {
    return TypeConverter.THROWABLE.convReturn(env, value);
  }

  /**
   * {@link Memory}
   * {@link StringMemory}
   * {@link ObjectMemory}<API>
   * {@link ObjectMemory}<DATA_OBJECT>
   * {@link ArrayMemory}
   * {@link DoubleMemory}
   * {@link LongMemory}
   * {@link TrueMemory}
   * {@link FalseMemory}
   */
  public static boolean isVariable(Environment env, Memory value) {
    return TypeConverter.UNKNOWN_TYPE.accept(env, value);
  }

  public static Object convParamVariable(Environment env, Memory value) {
    return TypeConverter.UNKNOWN_TYPE.convParam(env, value);
  }

  public static <T> Memory convReturnVariable(Environment env, T value) {
    return convReturnObject(env, value);
  }

  /**
   * {@link Memory}
   * {@link StringMemory}
   * {@link ObjectMemory}<API>
   * {@link ObjectMemory}<DATA_OBJECT>
   * {@link ArrayMemory}
   * {@link DoubleMemory}
   * {@link LongMemory}
   * {@link TrueMemory}
   * {@link FalseMemory}
   */
  public static boolean isObject(Environment env, Memory value) {
    return TypeConverter.UNKNOWN_TYPE.accept(env, value);
  }

  public static Object convParamObject(Environment env, Memory value) {
    return TypeConverter.UNKNOWN_TYPE.convParam(env, value);
  }

  public static Memory convReturnObject(Environment env, Object value) {
    return TypeConverter.UNKNOWN_TYPE.convReturn(env, value);
  }

  /**
   * {@link ObjectMemory}<API>
   */
  public static boolean isVertxGen(Class<?> clazz, Class<? extends BaseWrapper> wClazz, Memory value) {
    return WrapperConverter.accept(clazz, wClazz, value);
  }

  public static <A, B extends VertxGenVariable0Wrapper<A>> A convParamVertxGenVariable0(Environment env, Class<?> clazz, Function2<Environment, A, B> creator, Memory value) {
    return VertxGenVariable0Converter.create0(clazz, creator).convParam(env, value);
  }

  public static <A, B extends VertxGenVariable0Wrapper<A>> Memory convReturnVertxGenVariable0(Environment env, Class<?> clazz, Function2<Environment, A, B> creator, A value) {
    return VertxGenVariable0Converter.create0(clazz, creator).convReturn(env, value);
  }

  public static <A, B extends VertxGenVariable1Wrapper<A, V1>, V1> A convParamVertxGenVariable1(Environment env, Class<?> clazz, Function3<Environment, A, TypeConverter<V1>, B> creator, TypeConverter<V1> converter, Memory value) {
    return new VertxGenVariable1Converter<>(clazz, creator, converter).convParam(env, value);
  }

  @SuppressWarnings("unused")
  public static <A, B extends Variable1Wrapper<A, V1>, V1> Memory convReturnVertxGenVariable1(Environment env, Class<?> clazz, Function3<Environment, A, TypeConverter<V1>, B> function, TypeConverter<V1> converter, A value) {
    return function.apply(env, value, converter).toMemory();
  }

  public static <A, B extends VertxGenVariable2Wrapper<A, V1, V2>, V1, V2> A convParamVertxGenVariable2(Environment env, Class<?> clazz, Function4<Environment, A, TypeConverter<V1>, TypeConverter<V2>, B> creator, TypeConverter<V1> converter1, TypeConverter<V2> converter2, Memory value) {
    return VertxGenVariable0Converter.create2(clazz, creator, converter1, converter2).convParam(env, value);
  }

  public static <A, B extends VertxGenVariable2Wrapper<A, V1, V2>, V1, V2> Memory convReturnVertxGenVariable2(Environment env, Class<?> clazz, Function4<Environment, A, TypeConverter<V1>, TypeConverter<V2>, B> creator, TypeConverter<V1> converter1, TypeConverter<V2> converter2, A value) {
    return VertxGenVariable0Converter.create2(clazz, creator, converter1, converter2).convReturn(env, value);
  }

  /**
   * {@link ArrayMemory}
   */
  public static <T> boolean isList(Environment env, TypeConverter<T> converter, Memory value) {
    return ContainerConverter.createListConverter(converter).accept(env, value);
  }

  public static <T> List<T> convParamList(Environment env, TypeConverter<T> converter, Memory value) {
    return ContainerConverter.createListConverter(converter).convParam(env, value);
  }

  public static <T> Memory convReturnList(Environment env, TypeConverter<T> converter, List<T> value) {
    return ContainerConverter.createListConverter(converter).convReturn(env, value);
  }

  /**
   * {@link ArrayMemory}
   */
  public static <T> boolean isSet(Environment env, TypeConverter<T> converter, Memory value) {
    return ContainerConverter.createSetConverter(converter).accept(env, value);
  }

  public static <T> Set<T> convParamSet(Environment env, TypeConverter<T> converter, Memory value) {
    return ContainerConverter.createSetConverter(converter).convParam(env, value);
  }

  public static <T> Memory convReturnSet(Environment env, TypeConverter<T> converter, Set<T> value) {
    return ContainerConverter.createSetConverter(converter).convReturn(env, value);
  }

  /**
   * {@link ArrayMemory}<{@link ArrayMapEntryMemory}>
   */
  public static <T> boolean isMap(Environment env, TypeConverter<T> converter, Memory value) {
    return ContainerConverter.createMapConverter(converter).accept(env, value);
  }

  public static <T> Map<String, T> convParamMap(Environment env, TypeConverter<T> converter, Memory value) {
    return ContainerConverter.createMapConverter(converter).convParam(env, value);
  }

  public static <T> Memory convReturnMap(Environment env, TypeConverter<T> converter, Map<String, T> value) {
    return ContainerConverter.createMapConverter(converter).convReturn(env, value);
  }

  public static boolean isClassType(Environment env, Memory value) {
    return TypeConverter.CLASS.accept(env, value);
  }

  public static Class<Object> convParamClassType(Environment env, Memory value) {
    return TypeConverter.CLASS.convParam(env, value);
  }

  /**
   * {@link php.runtime.invoke.Invoker}
   */
  public static boolean isHandler(Environment env, Memory value) {
    if (value instanceof ObjectMemory) {
      ObjectMemory objectMemory = (ObjectMemory) value;
      if (objectMemory.value instanceof io.vertx.lang.jphp.Handler) {
        return true;
      }
    }
    return value.toInvoker(env) != null;
  }

  @SuppressWarnings("unchecked")
  public static <S> Handler<S> convParamHandler(Environment env, TypeConverter<S> converter, Memory value) {
    if (value instanceof ObjectMemory) {
      ObjectMemory objectMemory = (ObjectMemory) value;
      if (objectMemory.value instanceof io.vertx.lang.jphp.Handler) {
        return (Handler<S>) objectMemory.value;
      }
    }
    return (event) -> {
      try {
        value.toInvoker(env).call(converter.convReturn(env, event));
      } catch (Throwable throwable) {
        env.forwardThrow(throwable);
      }
    };
  }

  public static <S> Memory convReturnHandler(Environment env, TypeConverter<S> converter, Handler<S> handler) {
    if (handler instanceof io.vertx.lang.jphp.Handler) {
      return ((io.vertx.lang.jphp.Handler<S>) handler).toMemory();
    } else {
      return new io.vertx.lang.jphp.wrapper.extension.Handler<>(env, handler, converter).toMemory();
    }
  }

  /**
   * {@link php.runtime.invoke.Invoker}
   */
  public static boolean isHandlerAsyncResult(Environment env, Memory value) {
    return value.toInvoker(env) != null;
  }

  public static <S> Handler<AsyncResult<S>> convParamHandlerAsyncResult(Environment env, TypeConverter<S> converter, Memory value) {
    return (event) -> {
      try {
        Memory result;
        Memory cause;
        if (event.succeeded()) {
          result = converter.convReturn(env, event.result());
          cause = Memory.NULL;
        } else {
          result = Memory.NULL;
          cause = TypeConverter.THROWABLE.convReturn(env, event.cause());
        }
        value.toInvoker(env).call(result, cause);
      } catch (Throwable throwable) {
        throwable.printStackTrace();
      }
    };
  }

  public static <S> Memory convReturnHandlerAsyncResult(Environment env, TypeConverter<S> converter, Handler<AsyncResult<S>> handler) {
    Memory m = new AsyncHandler<>(env, handler, converter).toMemory();
    ArrayMemory re = new ArrayMemory();
    re.add(m);
    re.add("handle");
    return re;
  }

  /**
   * {@link php.runtime.invoke.Invoker}
   */
  public static boolean isFunction(Environment env, Memory value) {
    return value.toInvoker(env) != null;
  }

  public static <I, O> Function<I, O> convParamFunction(Environment env, TypeConverter<I> converterIn, TypeConverter<O> converterOut, Memory value) {
    return (in) -> {
      try {
        Memory memory = value.toInvoker(env).call(converterIn.convReturn(env, in));
        return converterOut.convParam(env, memory);
      } catch (Throwable throwable) {
        throw new RuntimeException(throwable);
      }
    };
  }
}

