package io.vertx.model;

import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.metrics.Measured;
import io.vertx.core.net.TCPSSLOptions;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/**
 * Represents the result of an action that may, or may not, have occurred yet.
 * <p>
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface TestApi<TV, TTT> /*extends Measured, WriteStream<Object>*/{
    //basic String, byte, Byte, char, Character, short, Short, int, Integer, long, Long, double, Double, float, Float, boolean, Boolean
    //json JsonArray, JsonObject
    //DataObject not abstract
    //Enum
    //Throwable
    //V
    //Object
    //VertxGen<T>,T is not null, VertxGen, <X>, VOID, basic, json, DaaObject, Enum
    //List<T>, Set<T>, T is basic, json, VertxGen, DataObject, Enum
    //Map<String, T>, T is basic, json, VertxGen
    //<V> Class<V>
    //Handler<T> T is Throwable, Void, basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>
    //Handler<AsyncResult<T>>Void, basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>
    //Function<F, S>
    //---------------F is Throwable, Void, basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>
    //---------------S is basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>


    //basic
    void testString(@Nullable String str);
    void testByte(byte i);
    void testByteBoxed(Byte i);
    void testChar(char i);
    void testCharacter(Character i);
    void testShortBoxed(Short i);
    void testShort(short i);
    void testIntegerBoxed(Integer i);
    void testInteger(int i);
    void testLong(long i);
    void testLongBoxed(Long i);
    void testDoubleBoxed(Double i);
    void testDouble(double i);
    void testFloatBoxed(Float i);
    void testFloat(float i);
    void testBooleanBoxed(Boolean i);
    void testBoolean(boolean i);

    //json
    void testJsonObject(JsonObject json);
    void testJsonArray(JsonArray json);

    //dataobject
    void testDataObject(HttpServerOptions options);

    //enum
    void testEnum(HttpVersion v);

    //throwable
    void testThrowable(Throwable t);

    //V
<V> void testVariableV(V o);//
     void testVariableTV(TV o);//

    //Object
    void testObject(Object o);//

    //VertxGen<T>,T is not null, VertxGen, <X>, VOID, basic, json, DaaObject, Enum

    //VertxGen<T>
    void testVertxGenV1(Future<TV> f);
    //VertxGen<X>
    <V>void testVertxGenV2(Future<V> f);
    //VertxGen<VertxGen>
    void testVertxGenBuffer(Future<Buffer> f);
    //VertxGen<Void>
    void testVertxGenVoid(Future<Void> f);
    //VertxGen<basic>
    void testVertxGenString(Future<String> f);
    void testVertxGenByte(Future<Byte> f);
    void testVertxGenCharacter(Future<Character> f);
    void testVertxGenShort(Future<Short> f);
    void testVertxGenInteger(Future<Integer> f);
    void testVertxGenLong(Future<Long> f);
    void testVertxGenDouble(Future<Double> f);
    void testVertxGenFloat(Future<Float> f);
    void testVertxGenBoolean(Future<Boolean> f);
    void testVertxGenJsonObject(Future<JsonObject> f);
    void testVertxGenJsonArray(Future<JsonArray> f);
    void testVertxGenDataObject(Future<HttpServerOptions> f);
    void testVertxGenEnum(Future<HttpVersion> f);


    //List<T>, Set<T>, T is basic, json, VertxGen, DataObject, Enum
    void testListString(List<String> l);
    void testListByte(List<Byte> l);
    void testListCharacter(List<Character> l);
    void testListShort(List<Short> l);
    void testListInteger(List<Integer> l);
    void testListLong(List<Long> l);
    void testListDouble(List<Double> l);
    void testListFloat(List<Float> l);
    void testListBoolean(List<Boolean> l);
    void testListJsonObject(List<JsonObject> l);
    void testListJsonArray(List<JsonArray> l);
    void testListVertxGen(List<Future> l);
    void testListVertxGen2(List<TestApi> list);
    void testListDataObject(List<HttpServerOptions> ls);
    void testListEnum(List<HttpVersion> l);

    void testSetString(Set<String> l);
    void testSetByte(Set<Byte> l);
    void testSetCharacter(Set<Character> l);
    void testSetShort(Set<Short> l);
    void testSetInteger(Set<Integer> l);
    void testSetLong(Set<Long> l);
    void testSetDouble(Set<Double> l);
    void testSetFloat(Set<Float> l);
    void testSetBoolean(Set<Boolean> l);
    void testSetJsonObject(Set<JsonObject> l);
    void testSetJsonArray(Set<JsonArray> l);
    void testSetVertxGen(Set<Future> l);
    void testSetVertxGen2(Set<TestApi> Set);
    void testSetDataObject(Set<HttpServerOptions> ls);
    void testSetEnum(Set<HttpVersion> l);



    //Map<String, T>, T is basic, json, VertxGen

    void testMapString(Map<String, String> map);
    void testMapByte(Map<String, Byte> map);
    void testMapCharacter(Map<String, Character> map);
    void testMapShort(Map<String, Short> map);
    void testMapInteger(Map<String, Integer> map);
    void testMapLong(Map<String, Long> map);
    void testMapDouble(Map<String, Double> map);
    void testMapFloat(Map<String, Float> map);
    void testMapBoolean(Map<String, Boolean> map);
    void testMapJsonObject(Map<String, JsonObject> map);
    void testMapJsonArray(Map<String, JsonArray> map);
    void testMapVertxGen(Map<String, Future> map);

    //<V> Class<V>
    <V>void testClassType(Class<V> clazz);

    //Handler<T> T is Throwable, Void, basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>
    void testHandlerThrowable(Handler<Throwable> h);
    void testHandlerVoid(Handler<Void> h);
    void testHandlerString(Handler<String> h);
    void testHandlerByte(Handler<Byte> h);
    void testHandlerCharacter(Handler<Character> h);
    void testHandlerShort(Handler<Short> h);
    void testHandlerInteger(Handler<Integer> h);
    void testHandlerLong(Handler<Long> h);
    void testHandlerDouble(Handler<Double> h);
    void testHandlerFloat(Handler<Float> h);
    void testHandlerBoolean(Handler<Boolean> h);
    void testHandlerJsonObject(Handler<JsonObject> h);
    void testHandlerJsonArray(Handler<JsonArray> h);
    void testHandlerDataObject(Handler<HttpServerOptions> h);
    void testHandlerEnum(Handler<HttpVersion> h);
    <V> void testHandlerVariable(Handler<V> h);
    void testHandlerObject(Handler<Object> h);
    void testHandler(Handler<Future> h);

    void testHandlerListString(Handler<List<String>> h);
    void testHandlerListByte(Handler<List<Byte>> h);
    void testHandlerListCharacter(Handler<List<Character>> h);
    void testHandlerListShort(Handler<List<Short>> h);
    void testHandlerListInteger(Handler<List<Integer>> h);
    void testHandlerListLong(Handler<List<Long>> h);
    void testHandlerListDouble(Handler<List<Double>> h);
    void testHandlerListFloat(Handler<List<Float>> h);
    void testHandlerListBoolean(Handler<List<Boolean>> h);
    void testHandlerListJsonObject(Handler<List<JsonObject>> h);
    void testHandlerListJsonArray(Handler<List<JsonArray>> h);
    void testHandlerListVertxGen(Handler<List<Future>> h);
    void testHandlerListVertxGen2(Handler<List<TestApi>> h);
    void testHandlerListHttpServerOptions(Handler<List<HttpServerOptions>> h);
    void testHandlerListHttpVersion(Handler<List<HttpVersion>> h);

    void testHandlerSetString(Handler<Set<String>> h);
    void testHandlerSetByte(Handler<Set<Byte>> h);
    void testHandlerSetCharacter(Handler<Set<Character>> h);
    void testHandlerSetShort(Handler<Set<Short>> h);
    void testHandlerSetInteger(Handler<Set<Integer>> h);
    void testHandlerSetLong(Handler<Set<Long>> h);
    void testHandlerSetDouble(Handler<Set<Double>> h);
    void testHandlerSetFloat(Handler<Set<Float>> h);
    void testHandlerSetBoolean(Handler<Set<Boolean>> h);
    void testHandlerSetJsonObject(Handler<Set<JsonObject>> h);
    void testHandlerSetJsonArray(Handler<Set<JsonArray>> h);
    void testHandlerSetVertxGen(Handler<Set<Future>> h);
    void testHandlerSetVertxGen2(Handler<Set<TestApi>> h);
    void testHandlerSetHttpServerOptions(Handler<Set<HttpServerOptions>> h);
    void testHandlerSetHttpVersion(Handler<Set<HttpVersion>> h);

    void testHandlerMapString(Handler<Map<String, String>> h);
    void testHandlerMapByte(Handler<Map<String, Byte>> h);
    void testHandlerMapCharacter(Handler<Map<String, Character>> h);
    void testHandlerMapShort(Handler<Map<String, Short>> h);
    void testHandlerMapInteger(Handler<Map<String, Integer>> h);
    void testHandlerMapLong(Handler<Map<String, Long>> h);
    void testHandlerMapDouble(Handler<Map<String, Double>> h);
    void testHandlerMapFloat(Handler<Map<String, Float>> h);
    void testHandlerMapBoolean(Handler<Map<String, Boolean>> h);
    void testHandlerMapJsonObject(Handler<Map<String, JsonObject>> h);
    void testHandlerMapJsonArray(Handler<Map<String, JsonArray>> h);

    //Handler<AsyncResult<T>>Void, basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>
    void testHandlerAsyncVoid(Handler<AsyncResult<Void>> h);
    void testHandlerAsyncString(Handler<AsyncResult<String>> h);
    void testHandlerAsyncByte(Handler<AsyncResult<Byte>> h);
    void testHandlerAsyncCharacter(Handler<AsyncResult<Character>> h);
    void testHandlerAsyncShort(Handler<AsyncResult<Short>> h);
    void testHandlerAsyncInteger(Handler<AsyncResult<Integer>> h);
    void testHandlerAsyncLong(Handler<AsyncResult<Long>> h);
    void testHandlerAsyncDouble(Handler<AsyncResult<Double>> h);
    void testHandlerAsyncFloat(Handler<AsyncResult<Float>> h);
    void testHandlerAsyncBoolean(Handler<AsyncResult<Boolean>> h);
    void testHandlerAsyncJsonObject(Handler<AsyncResult<JsonObject>> h);
    void testHandlerAsyncJsonArray(Handler<AsyncResult<JsonArray>> h);
    void testHandlerAsyncDataObject(Handler<AsyncResult<HttpServerOptions>> h);
    void testHandlerAsyncEnum(Handler<AsyncResult<HttpVersion>> h);
    <V> void testHandlerAsyncVariable(Handler<AsyncResult<V>> h);
    void testHandlerAsyncObject(Handler<AsyncResult<Object>> h);
    void testHandlerAsync(Handler<AsyncResult<Future>> h);

    void testHandlerAsyncListString(Handler<AsyncResult<List<String>>> h);
    void testHandlerAsyncListByte(Handler<AsyncResult<List<Byte>>> h);
    void testHandlerAsyncListCharacter(Handler<AsyncResult<List<Character>>> h);
    void testHandlerAsyncListShort(Handler<AsyncResult<List<Short>>> h);
    void testHandlerAsyncListInteger(Handler<AsyncResult<List<Integer>>> h);
    void testHandlerAsyncListLong(Handler<AsyncResult<List<Long>>> h);
    void testHandlerAsyncListDouble(Handler<AsyncResult<List<Double>>> h);
    void testHandlerAsyncListFloat(Handler<AsyncResult<List<Float>>> h);
    void testHandlerAsyncListBoolean(Handler<AsyncResult<List<Boolean>>> h);
    void testHandlerAsyncListJsonObject(Handler<AsyncResult<List<JsonObject>>> h);
    void testHandlerAsyncListJsonArray(Handler<AsyncResult<List<JsonArray>>> h);
    void testHandlerAsyncListVertxGen(Handler<AsyncResult<List<Future>>> h);
    void testHandlerAsyncListVertxGen2(Handler<AsyncResult<List<TestApi>>> h);
    void testHandlerAsyncListHttpServerOptions(Handler<AsyncResult<List<HttpServerOptions>>> h);
    void testHandlerAsyncListHttpVersion(Handler<AsyncResult<List<HttpVersion>>> h);

    void testHandlerAsyncSetString(Handler<AsyncResult<Set<String>>> h);
    void testHandlerAsyncSetByte(Handler<AsyncResult<Set<Byte>>> h);
    void testHandlerAsyncSetCharacter(Handler<AsyncResult<Set<Character>>> h);
    void testHandlerAsyncSetShort(Handler<AsyncResult<Set<Short>>> h);
    void testHandlerAsyncSetInteger(Handler<AsyncResult<Set<Integer>>> h);
    void testHandlerAsyncSetLong(Handler<AsyncResult<Set<Long>>> h);
    void testHandlerAsyncSetDouble(Handler<AsyncResult<Set<Double>>> h);
    void testHandlerAsyncSetFloat(Handler<AsyncResult<Set<Float>>> h);
    void testHandlerAsyncSetBoolean(Handler<AsyncResult<Set<Boolean>>> h);
    void testHandlerAsyncSetJsonObject(Handler<AsyncResult<Set<JsonObject>>> h);
    void testHandlerAsyncSetJsonArray(Handler<AsyncResult<Set<JsonArray>>> h);
    void testHandlerAsyncSetVertxGen(Handler<AsyncResult<Set<Future>>> h);
    void testHandlerAsyncSetVertxGen2(Handler<AsyncResult<Set<TestApi>>> h);
    void testHandlerAsyncSetHttpServerOptions(Handler<AsyncResult<Set<HttpServerOptions>>> h);
    void testHandlerAsyncSetHttpVersion(Handler<AsyncResult<Set<HttpVersion>>> h);

    void testHandlerAsyncMapString(Handler<AsyncResult<Map<String, String>>> h);
    void testHandlerAsyncMapByte(Handler<AsyncResult<Map<String, Byte>>> h);
    void testHandlerAsyncMapCharacter(Handler<AsyncResult<Map<String, Character>>> h);
    void testHandlerAsyncMapShort(Handler<AsyncResult<Map<String, Short>>> h);
    void testHandlerAsyncMapInteger(Handler<AsyncResult<Map<String, Integer>>> h);
    void testHandlerAsyncMapLong(Handler<AsyncResult<Map<String, Long>>> h);
    void testHandlerAsyncMapDouble(Handler<AsyncResult<Map<String, Double>>> h);
    void testHandlerAsyncMapFloat(Handler<AsyncResult<Map<String, Float>>> h);
    void testHandlerAsyncMapBoolean(Handler<AsyncResult<Map<String, Boolean>>> h);
    void testHandlerAsyncMapJsonObject(Handler<AsyncResult<Map<String, JsonObject>>> h);
    void testHandlerAsyncMapJsonArray(Handler<AsyncResult<Map<String, JsonArray>>> h);


    //Function<F, S>
    void testFunctionThrowableString(Function<Throwable, String> f);
    void testFunctionThrowableByte(Function<Throwable, Byte> f);
    void testFunctionThrowableCharacter(Function<Throwable, Character> f);
    void testFunctionThrowableShort(Function<Throwable, Short> f);
    void testFunctionThrowableInteger(Function<Throwable, Integer> f);
    void testFunctionThrowableLong(Function<Throwable, Long> f);
    void testFunctionThrowableDouble(Function<Throwable, Double> f);
    void testFunctionThrowableFloat(Function<Throwable, Float> f);
    void testFunctionThrowableBoolean(Function<Throwable, Boolean> f);
    void testFunctionThrowableJsonObject(Function<Throwable, JsonObject> f);
    void testFunctionThrowableJsonArray(Function<Throwable, JsonArray> f);
    void testFunctionThrowableHttpServerOptions(Function<Throwable, HttpServerOptions> f);
    void testFunctionThrowableHttpVersion(Function<Throwable, HttpVersion> f);
    <V>void testFunctionThrowableVVVV(Function<Throwable, V> f);
    void testFunctionThrowableVVVV2(Function<Throwable, TV> f);
    void testFunctionThrowableObject(Function<Throwable, Object> f);

    void testFunctionThrowableVertxGenVVVV1(Function<Throwable, Future<TV>> f);
    <V>void testFunctionThrowableVertxGenVVVVV2(Function<Throwable, Future<V>> f);
    void testFunctionThrowableVertxGenVertxGen(Function<Throwable, Future<Buffer>> f);
    void testFunctionThrowableVertxGenVoid(Function<Throwable, Future<Void>> f);
    void testFunctionThrowableVertxGenString(Function<Throwable, Future<String>> f);
    void testFunctionThrowableVertxGenByte(Function<Throwable, Future<Byte>> f);
    void testFunctionThrowableVertxGenCharacter(Function<Throwable, Future<Character>> f);
    void testFunctionThrowableVertxGenShort(Function<Throwable, Future<Short>> f);
    void testFunctionThrowableVertxGenInteger(Function<Throwable, Future<Integer>> f);
    void testFunctionThrowableVertxGenLong(Function<Throwable, Future<Long>> f);
    void testFunctionThrowableVertxGenDouble(Function<Throwable, Future<Double>> f);
    void testFunctionThrowableVertxGenFloat(Function<Throwable, Future<Float>> f);
    void testFunctionThrowableVertxGenBoolean(Function<Throwable, Future<Boolean>> f);
    void testFunctionThrowableVertxGenJsonObject(Function<Throwable, Future<JsonObject>> f);
    void testFunctionThrowableVertxGenJsonArray(Function<Throwable, Future<JsonArray>> f);
    void testFunctionThrowableVertxGenDataObject(Function<Throwable, Future<HttpServerOptions>> f);
    void testFunctionThrowableVertxGenEnum(Function<Throwable, Future<HttpVersion>> f);

    void testFunctionThrowableListString(Function<Throwable, List<String>> f);
    void testFunctionThrowableListByte(Function<Throwable, List<Byte>> f);
    void testFunctionThrowableListCharacter(Function<Throwable, List<Character>> f);
    void testFunctionThrowableListShort(Function<Throwable, List<Short>> f);
    void testFunctionThrowableListInteger(Function<Throwable, List<Integer>> f);
    void testFunctionThrowableListLong(Function<Throwable, List<Long>> f);
    void testFunctionThrowableListDouble(Function<Throwable, List<Double>> f);
    void testFunctionThrowableListFloat(Function<Throwable, List<Float>> f);
    void testFunctionThrowableListBoolean(Function<Throwable, List<Boolean>> f);
    void testFunctionThrowableListJsonObject(Function<Throwable, List<JsonObject>> f);
    void testFunctionThrowableListJsonArray(Function<Throwable, List<JsonArray>> f);
    void testFunctionThrowableListVertxGen(Function<Throwable, List<Future>> f);
    void testFunctionThrowableListVertxGen2(Function<Throwable, List<TestApi>> f);
    void testFunctionThrowableListDataObject(Function<Throwable, List<HttpServerOptions>> f);
    void testFunctionThrowableListEnum(Function<Throwable, List<HttpVersion>> f);

    void testFunctionThrowableSetString(Function<Throwable, Set<String>> f);
    void testFunctionThrowableSetByte(Function<Throwable, Set<Byte>> f);
    void testFunctionThrowableSetCharacter(Function<Throwable, Set<Character>> f);
    void testFunctionThrowableSetShort(Function<Throwable, Set<Short>> f);
    void testFunctionThrowableSetInteger(Function<Throwable, Set<Integer>> f);
    void testFunctionThrowableSetLong(Function<Throwable, Set<Long>> f);
    void testFunctionThrowableSetDouble(Function<Throwable, Set<Double>> f);
    void testFunctionThrowableSetFloat(Function<Throwable, Set<Float>> f);
    void testFunctionThrowableSetBoolean(Function<Throwable, Set<Boolean>> f);
    void testFunctionThrowableSetJsonObject(Function<Throwable, Set<JsonObject>> f);
    void testFunctionThrowableSetJsonArray(Function<Throwable, Set<JsonArray>> f);
    void testFunctionThrowableSetVertxGen(Function<Throwable, Set<Future>> f);
    void testFunctionThrowableSetVertxGen2(Function<Throwable, Set<TestApi>> f);
    void testFunctionThrowableSetDataObject(Function<Throwable, Set<HttpServerOptions>> f);
    void testFunctionThrowableSetEnum(Function<Throwable, Set<HttpVersion>> f);

    void testFunctionThrowableMapString(Function<Throwable, Map<String, String>> f);
    void testFunctionThrowableMapByte(Function<Throwable, Map<String, Byte>> f);
    void testFunctionThrowableMapCharacter(Function<Throwable, Map<String, Character>> f);
    void testFunctionThrowableMapShort(Function<Throwable, Map<String, Short>> f);
    void testFunctionThrowableMapInteger(Function<Throwable, Map<String, Integer>> f);
    void testFunctionThrowableMapLong(Function<Throwable, Map<String, Long>> f);
    void testFunctionThrowableMapDouble(Function<Throwable, Map<String, Double>> f);
    void testFunctionThrowableMapFloat(Function<Throwable, Map<String, Float>> f);
    void testFunctionThrowableMapBoolean(Function<Throwable, Map<String, Boolean>> f);
    void testFunctionThrowableMapJsonObject(Function<Throwable, Map<String, JsonObject>> f);
    void testFunctionThrowableMapJsonArray(Function<Throwable, Map<String, JsonArray>> f);
    
    //VOID
    void testFunctionVoidString(Function<Void, String> f);
    void testFunctionVoidByte(Function<Void, Byte> f);
    void testFunctionVoidCharacter(Function<Void, Character> f);
    void testFunctionVoidShort(Function<Void, Short> f);
    void testFunctionVoidInteger(Function<Void, Integer> f);
    void testFunctionVoidLong(Function<Void, Long> f);
    void testFunctionVoidDouble(Function<Void, Double> f);
    void testFunctionVoidFloat(Function<Void, Float> f);
    void testFunctionVoidBoolean(Function<Void, Boolean> f);
    void testFunctionVoidJsonObject(Function<Void, JsonObject> f);
    void testFunctionVoidJsonArray(Function<Void, JsonArray> f);
    void testFunctionVoidHttpServerOptions(Function<Void, HttpServerOptions> f);
    void testFunctionVoidHttpVersion(Function<Void, HttpVersion> f);
    <V>void testFunctionVoidVVVV(Function<Void, V> f);
    void testFunctionVoidVVVV2(Function<Void, TV> f);
    void testFunctionVoidObject(Function<Void, Object> f);

    void testFunctionVoidVertxGenVVVV1(Function<Void, Future<TV>> f);
    <V>void testFunctionVoidVertxGenVVVVV2(Function<Void, Future<V>> f);
    void testFunctionVoidVertxGenVertxGen(Function<Void, Future<Buffer>> f);
    void testFunctionVoidVertxGenVoid(Function<Void, Future<Void>> f);
    void testFunctionVoidVertxGenString(Function<Void, Future<String>> f);
    void testFunctionVoidVertxGenByte(Function<Void, Future<Byte>> f);
    void testFunctionVoidVertxGenCharacter(Function<Void, Future<Character>> f);
    void testFunctionVoidVertxGenShort(Function<Void, Future<Short>> f);
    void testFunctionVoidVertxGenInteger(Function<Void, Future<Integer>> f);
    void testFunctionVoidVertxGenLong(Function<Void, Future<Long>> f);
    void testFunctionVoidVertxGenDouble(Function<Void, Future<Double>> f);
    void testFunctionVoidVertxGenFloat(Function<Void, Future<Float>> f);
    void testFunctionVoidVertxGenBoolean(Function<Void, Future<Boolean>> f);
    void testFunctionVoidVertxGenJsonObject(Function<Void, Future<JsonObject>> f);
    void testFunctionVoidVertxGenJsonArray(Function<Void, Future<JsonArray>> f);
    void testFunctionVoidVertxGenDataObject(Function<Void, Future<HttpServerOptions>> f);
    void testFunctionVoidVertxGenEnum(Function<Void, Future<HttpVersion>> f);

    void testFunctionVoidListString(Function<Void, List<String>> f);
    void testFunctionVoidListByte(Function<Void, List<Byte>> f);
    void testFunctionVoidListCharacter(Function<Void, List<Character>> f);
    void testFunctionVoidListShort(Function<Void, List<Short>> f);
    void testFunctionVoidListInteger(Function<Void, List<Integer>> f);
    void testFunctionVoidListLong(Function<Void, List<Long>> f);
    void testFunctionVoidListDouble(Function<Void, List<Double>> f);
    void testFunctionVoidListFloat(Function<Void, List<Float>> f);
    void testFunctionVoidListBoolean(Function<Void, List<Boolean>> f);
    void testFunctionVoidListJsonObject(Function<Void, List<JsonObject>> f);
    void testFunctionVoidListJsonArray(Function<Void, List<JsonArray>> f);
    void testFunctionVoidListVertxGen(Function<Void, List<Future>> f);
    void testFunctionVoidListVertxGen2(Function<Void, List<TestApi>> f);
    void testFunctionVoidListDataObject(Function<Void, List<HttpServerOptions>> f);
    void testFunctionVoidListEnum(Function<Void, List<HttpVersion>> f);

    void testFunctionVoidSetString(Function<Void, Set<String>> f);
    void testFunctionVoidSetByte(Function<Void, Set<Byte>> f);
    void testFunctionVoidSetCharacter(Function<Void, Set<Character>> f);
    void testFunctionVoidSetShort(Function<Void, Set<Short>> f);
    void testFunctionVoidSetInteger(Function<Void, Set<Integer>> f);
    void testFunctionVoidSetLong(Function<Void, Set<Long>> f);
    void testFunctionVoidSetDouble(Function<Void, Set<Double>> f);
    void testFunctionVoidSetFloat(Function<Void, Set<Float>> f);
    void testFunctionVoidSetBoolean(Function<Void, Set<Boolean>> f);
    void testFunctionVoidSetJsonObject(Function<Void, Set<JsonObject>> f);
    void testFunctionVoidSetJsonArray(Function<Void, Set<JsonArray>> f);
    void testFunctionVoidSetVertxGen(Function<Void, Set<Future>> f);
    void testFunctionVoidSetVertxGen2(Function<Void, Set<TestApi>> f);
    void testFunctionVoidSetDataObject(Function<Void, Set<HttpServerOptions>> f);
    void testFunctionVoidSetEnum(Function<Void, Set<HttpVersion>> f);

    void testFunctionVoidMapString(Function<Void, Map<String, String>> f);
    void testFunctionVoidMapByte(Function<Void, Map<String, Byte>> f);
    void testFunctionVoidMapCharacter(Function<Void, Map<String, Character>> f);
    void testFunctionVoidMapShort(Function<Void, Map<String, Short>> f);
    void testFunctionVoidMapInteger(Function<Void, Map<String, Integer>> f);
    void testFunctionVoidMapLong(Function<Void, Map<String, Long>> f);
    void testFunctionVoidMapDouble(Function<Void, Map<String, Double>> f);
    void testFunctionVoidMapFloat(Function<Void, Map<String, Float>> f);
    void testFunctionVoidMapBoolean(Function<Void, Map<String, Boolean>> f);
    void testFunctionVoidMapJsonObject(Function<Void, Map<String, JsonObject>> f);
    void testFunctionVoidMapJsonArray(Function<Void, Map<String, JsonArray>> f);
    //STRING
    void testFunctionStringString(Function<String, String> f);
    void testFunctionStringByte(Function<String, Byte> f);
    void testFunctionStringCharacter(Function<String, Character> f);
    void testFunctionStringShort(Function<String, Short> f);
    void testFunctionStringInteger(Function<String, Integer> f);
    void testFunctionStringLong(Function<String, Long> f);
    void testFunctionStringDouble(Function<String, Double> f);
    void testFunctionStringFloat(Function<String, Float> f);
    void testFunctionStringBoolean(Function<String, Boolean> f);
    void testFunctionStringJsonObject(Function<String, JsonObject> f);
    void testFunctionStringJsonArray(Function<String, JsonArray> f);
    void testFunctionStringHttpServerOptions(Function<String, HttpServerOptions> f);
    void testFunctionStringHttpVersion(Function<String, HttpVersion> f);
    <V>void testFunctionStringVVVV(Function<String, V> f);
    void testFunctionStringVVVV2(Function<String, TV> f);
    void testFunctionStringObject(Function<String, Object> f);

    void testFunctionStringVertxGenVVVV1(Function<String, Future<TV>> f);
    <V>void testFunctionStringVertxGenVVVVV2(Function<String, Future<V>> f);
    void testFunctionStringVertxGenVertxGen(Function<String, Future<Buffer>> f);
    void testFunctionStringVertxGenVoid(Function<String, Future<Void>> f);
    void testFunctionStringVertxGenString(Function<String, Future<String>> f);
    void testFunctionStringVertxGenByte(Function<String, Future<Byte>> f);
    void testFunctionStringVertxGenCharacter(Function<String, Future<Character>> f);
    void testFunctionStringVertxGenShort(Function<String, Future<Short>> f);
    void testFunctionStringVertxGenInteger(Function<String, Future<Integer>> f);
    void testFunctionStringVertxGenLong(Function<String, Future<Long>> f);
    void testFunctionStringVertxGenDouble(Function<String, Future<Double>> f);
    void testFunctionStringVertxGenFloat(Function<String, Future<Float>> f);
    void testFunctionStringVertxGenBoolean(Function<String, Future<Boolean>> f);
    void testFunctionStringVertxGenJsonObject(Function<String, Future<JsonObject>> f);
    void testFunctionStringVertxGenJsonArray(Function<String, Future<JsonArray>> f);
    void testFunctionStringVertxGenDataObject(Function<String, Future<HttpServerOptions>> f);
    void testFunctionStringVertxGenEnum(Function<String, Future<HttpVersion>> f);

    void testFunctionStringListString(Function<String, List<String>> f);
    void testFunctionStringListByte(Function<String, List<Byte>> f);
    void testFunctionStringListCharacter(Function<String, List<Character>> f);
    void testFunctionStringListShort(Function<String, List<Short>> f);
    void testFunctionStringListInteger(Function<String, List<Integer>> f);
    void testFunctionStringListLong(Function<String, List<Long>> f);
    void testFunctionStringListDouble(Function<String, List<Double>> f);
    void testFunctionStringListFloat(Function<String, List<Float>> f);
    void testFunctionStringListBoolean(Function<String, List<Boolean>> f);
    void testFunctionStringListJsonObject(Function<String, List<JsonObject>> f);
    void testFunctionStringListJsonArray(Function<String, List<JsonArray>> f);
    void testFunctionStringListVertxGen(Function<String, List<Future>> f);
    void testFunctionStringListVertxGen2(Function<String, List<TestApi>> f);
    void testFunctionStringListDataObject(Function<String, List<HttpServerOptions>> f);
    void testFunctionStringListEnum(Function<String, List<HttpVersion>> f);

    void testFunctionStringSetString(Function<String, Set<String>> f);
    void testFunctionStringSetByte(Function<String, Set<Byte>> f);
    void testFunctionStringSetCharacter(Function<String, Set<Character>> f);
    void testFunctionStringSetShort(Function<String, Set<Short>> f);
    void testFunctionStringSetInteger(Function<String, Set<Integer>> f);
    void testFunctionStringSetLong(Function<String, Set<Long>> f);
    void testFunctionStringSetDouble(Function<String, Set<Double>> f);
    void testFunctionStringSetFloat(Function<String, Set<Float>> f);
    void testFunctionStringSetBoolean(Function<String, Set<Boolean>> f);
    void testFunctionStringSetJsonObject(Function<String, Set<JsonObject>> f);
    void testFunctionStringSetJsonArray(Function<String, Set<JsonArray>> f);
    void testFunctionStringSetVertxGen(Function<String, Set<Future>> f);
    void testFunctionStringSetVertxGen2(Function<String, Set<TestApi>> f);
    void testFunctionStringSetDataObject(Function<String, Set<HttpServerOptions>> f);
    void testFunctionStringSetEnum(Function<String, Set<HttpVersion>> f);

    void testFunctionStringMapString(Function<String, Map<String, String>> f);
    void testFunctionStringMapByte(Function<String, Map<String, Byte>> f);
    void testFunctionStringMapCharacter(Function<String, Map<String, Character>> f);
    void testFunctionStringMapShort(Function<String, Map<String, Short>> f);
    void testFunctionStringMapInteger(Function<String, Map<String, Integer>> f);
    void testFunctionStringMapLong(Function<String, Map<String, Long>> f);
    void testFunctionStringMapDouble(Function<String, Map<String, Double>> f);
    void testFunctionStringMapFloat(Function<String, Map<String, Float>> f);
    void testFunctionStringMapBoolean(Function<String, Map<String, Boolean>> f);
    void testFunctionStringMapJsonObject(Function<String, Map<String, JsonObject>> f);
    void testFunctionStringMapJsonArray(Function<String, Map<String, JsonArray>> f);
    //BYTE
    void testFunctionByteString(Function<Byte, String> f);
    void testFunctionByteByte(Function<Byte, Byte> f);
    void testFunctionByteCharacter(Function<Byte, Character> f);
    void testFunctionByteShort(Function<Byte, Short> f);
    void testFunctionByteInteger(Function<Byte, Integer> f);
    void testFunctionByteLong(Function<Byte, Long> f);
    void testFunctionByteDouble(Function<Byte, Double> f);
    void testFunctionByteFloat(Function<Byte, Float> f);
    void testFunctionByteBoolean(Function<Byte, Boolean> f);
    void testFunctionByteJsonObject(Function<Byte, JsonObject> f);
    void testFunctionByteJsonArray(Function<Byte, JsonArray> f);
    void testFunctionByteHttpServerOptions(Function<Byte, HttpServerOptions> f);
    void testFunctionByteHttpVersion(Function<Byte, HttpVersion> f);
    <V>void testFunctionByteVVVV(Function<Byte, V> f);
    void testFunctionByteVVVV2(Function<Byte, TV> f);
    void testFunctionByteObject(Function<Byte, Object> f);

    void testFunctionByteVertxGenVVVV1(Function<Byte, Future<TV>> f);
    <V>void testFunctionByteVertxGenVVVVV2(Function<Byte, Future<V>> f);
    void testFunctionByteVertxGenVertxGen(Function<Byte, Future<Buffer>> f);
    void testFunctionByteVertxGenVoid(Function<Byte, Future<Void>> f);
    void testFunctionByteVertxGenString(Function<Byte, Future<String>> f);
    void testFunctionByteVertxGenByte(Function<Byte, Future<Byte>> f);
    void testFunctionByteVertxGenCharacter(Function<Byte, Future<Character>> f);
    void testFunctionByteVertxGenShort(Function<Byte, Future<Short>> f);
    void testFunctionByteVertxGenInteger(Function<Byte, Future<Integer>> f);
    void testFunctionByteVertxGenLong(Function<Byte, Future<Long>> f);
    void testFunctionByteVertxGenDouble(Function<Byte, Future<Double>> f);
    void testFunctionByteVertxGenFloat(Function<Byte, Future<Float>> f);
    void testFunctionByteVertxGenBoolean(Function<Byte, Future<Boolean>> f);
    void testFunctionByteVertxGenJsonObject(Function<Byte, Future<JsonObject>> f);
    void testFunctionByteVertxGenJsonArray(Function<Byte, Future<JsonArray>> f);
    void testFunctionByteVertxGenDataObject(Function<Byte, Future<HttpServerOptions>> f);
    void testFunctionByteVertxGenEnum(Function<Byte, Future<HttpVersion>> f);

    void testFunctionByteListString(Function<Byte, List<String>> f);
    void testFunctionByteListByte(Function<Byte, List<Byte>> f);
    void testFunctionByteListCharacter(Function<Byte, List<Character>> f);
    void testFunctionByteListShort(Function<Byte, List<Short>> f);
    void testFunctionByteListInteger(Function<Byte, List<Integer>> f);
    void testFunctionByteListLong(Function<Byte, List<Long>> f);
    void testFunctionByteListDouble(Function<Byte, List<Double>> f);
    void testFunctionByteListFloat(Function<Byte, List<Float>> f);
    void testFunctionByteListBoolean(Function<Byte, List<Boolean>> f);
    void testFunctionByteListJsonObject(Function<Byte, List<JsonObject>> f);
    void testFunctionByteListJsonArray(Function<Byte, List<JsonArray>> f);
    void testFunctionByteListVertxGen(Function<Byte, List<Future>> f);
    void testFunctionByteListVertxGen2(Function<Byte, List<TestApi>> f);
    void testFunctionByteListDataObject(Function<Byte, List<HttpServerOptions>> f);
    void testFunctionByteListEnum(Function<Byte, List<HttpVersion>> f);

    void testFunctionByteSetString(Function<Byte, Set<String>> f);
    void testFunctionByteSetByte(Function<Byte, Set<Byte>> f);
    void testFunctionByteSetCharacter(Function<Byte, Set<Character>> f);
    void testFunctionByteSetShort(Function<Byte, Set<Short>> f);
    void testFunctionByteSetInteger(Function<Byte, Set<Integer>> f);
    void testFunctionByteSetLong(Function<Byte, Set<Long>> f);
    void testFunctionByteSetDouble(Function<Byte, Set<Double>> f);
    void testFunctionByteSetFloat(Function<Byte, Set<Float>> f);
    void testFunctionByteSetBoolean(Function<Byte, Set<Boolean>> f);
    void testFunctionByteSetJsonObject(Function<Byte, Set<JsonObject>> f);
    void testFunctionByteSetJsonArray(Function<Byte, Set<JsonArray>> f);
    void testFunctionByteSetVertxGen(Function<Byte, Set<Future>> f);
    void testFunctionByteSetVertxGen2(Function<Byte, Set<TestApi>> f);
    void testFunctionByteSetDataObject(Function<Byte, Set<HttpServerOptions>> f);
    void testFunctionByteSetEnum(Function<Byte, Set<HttpVersion>> f);

    void testFunctionByteMapString(Function<Byte, Map<String, String>> f);
    void testFunctionByteMapByte(Function<Byte, Map<String, Byte>> f);
    void testFunctionByteMapCharacter(Function<Byte, Map<String, Character>> f);
    void testFunctionByteMapShort(Function<Byte, Map<String, Short>> f);
    void testFunctionByteMapInteger(Function<Byte, Map<String, Integer>> f);
    void testFunctionByteMapLong(Function<Byte, Map<String, Long>> f);
    void testFunctionByteMapDouble(Function<Byte, Map<String, Double>> f);
    void testFunctionByteMapFloat(Function<Byte, Map<String, Float>> f);
    void testFunctionByteMapBoolean(Function<Byte, Map<String, Boolean>> f);
    void testFunctionByteMapJsonObject(Function<Byte, Map<String, JsonObject>> f);
    void testFunctionByteMapJsonArray(Function<Byte, Map<String, JsonArray>> f);
    //CHARACTER
    void testFunctionCharacterString(Function<Character, String> f);
    void testFunctionCharacterByte(Function<Character, Byte> f);
    void testFunctionCharacterCharacter(Function<Character, Character> f);
    void testFunctionCharacterShort(Function<Character, Short> f);
    void testFunctionCharacterInteger(Function<Character, Integer> f);
    void testFunctionCharacterLong(Function<Character, Long> f);
    void testFunctionCharacterDouble(Function<Character, Double> f);
    void testFunctionCharacterFloat(Function<Character, Float> f);
    void testFunctionCharacterBoolean(Function<Character, Boolean> f);
    void testFunctionCharacterJsonObject(Function<Character, JsonObject> f);
    void testFunctionCharacterJsonArray(Function<Character, JsonArray> f);
    void testFunctionCharacterHttpServerOptions(Function<Character, HttpServerOptions> f);
    void testFunctionCharacterHttpVersion(Function<Character, HttpVersion> f);
    <V>void testFunctionCharacterVVVV(Function<Character, V> f);
    void testFunctionCharacterVVVV2(Function<Character, TV> f);
    void testFunctionCharacterObject(Function<Character, Object> f);

    void testFunctionCharacterVertxGenVVVV1(Function<Character, Future<TV>> f);
    <V>void testFunctionCharacterVertxGenVVVVV2(Function<Character, Future<V>> f);
    void testFunctionCharacterVertxGenVertxGen(Function<Character, Future<Buffer>> f);
    void testFunctionCharacterVertxGenVoid(Function<Character, Future<Void>> f);
    void testFunctionCharacterVertxGenString(Function<Character, Future<String>> f);
    void testFunctionCharacterVertxGenByte(Function<Character, Future<Byte>> f);
    void testFunctionCharacterVertxGenCharacter(Function<Character, Future<Character>> f);
    void testFunctionCharacterVertxGenShort(Function<Character, Future<Short>> f);
    void testFunctionCharacterVertxGenInteger(Function<Character, Future<Integer>> f);
    void testFunctionCharacterVertxGenLong(Function<Character, Future<Long>> f);
    void testFunctionCharacterVertxGenDouble(Function<Character, Future<Double>> f);
    void testFunctionCharacterVertxGenFloat(Function<Character, Future<Float>> f);
    void testFunctionCharacterVertxGenBoolean(Function<Character, Future<Boolean>> f);
    void testFunctionCharacterVertxGenJsonObject(Function<Character, Future<JsonObject>> f);
    void testFunctionCharacterVertxGenJsonArray(Function<Character, Future<JsonArray>> f);
    void testFunctionCharacterVertxGenDataObject(Function<Character, Future<HttpServerOptions>> f);
    void testFunctionCharacterVertxGenEnum(Function<Character, Future<HttpVersion>> f);

    void testFunctionCharacterListString(Function<Character, List<String>> f);
    void testFunctionCharacterListByte(Function<Character, List<Byte>> f);
    void testFunctionCharacterListCharacter(Function<Character, List<Character>> f);
    void testFunctionCharacterListShort(Function<Character, List<Short>> f);
    void testFunctionCharacterListInteger(Function<Character, List<Integer>> f);
    void testFunctionCharacterListLong(Function<Character, List<Long>> f);
    void testFunctionCharacterListDouble(Function<Character, List<Double>> f);
    void testFunctionCharacterListFloat(Function<Character, List<Float>> f);
    void testFunctionCharacterListBoolean(Function<Character, List<Boolean>> f);
    void testFunctionCharacterListJsonObject(Function<Character, List<JsonObject>> f);
    void testFunctionCharacterListJsonArray(Function<Character, List<JsonArray>> f);
    void testFunctionCharacterListVertxGen(Function<Character, List<Future>> f);
    void testFunctionCharacterListVertxGen2(Function<Character, List<TestApi>> f);
    void testFunctionCharacterListDataObject(Function<Character, List<HttpServerOptions>> f);
    void testFunctionCharacterListEnum(Function<Character, List<HttpVersion>> f);

    void testFunctionCharacterSetString(Function<Character, Set<String>> f);
    void testFunctionCharacterSetByte(Function<Character, Set<Byte>> f);
    void testFunctionCharacterSetCharacter(Function<Character, Set<Character>> f);
    void testFunctionCharacterSetShort(Function<Character, Set<Short>> f);
    void testFunctionCharacterSetInteger(Function<Character, Set<Integer>> f);
    void testFunctionCharacterSetLong(Function<Character, Set<Long>> f);
    void testFunctionCharacterSetDouble(Function<Character, Set<Double>> f);
    void testFunctionCharacterSetFloat(Function<Character, Set<Float>> f);
    void testFunctionCharacterSetBoolean(Function<Character, Set<Boolean>> f);
    void testFunctionCharacterSetJsonObject(Function<Character, Set<JsonObject>> f);
    void testFunctionCharacterSetJsonArray(Function<Character, Set<JsonArray>> f);
    void testFunctionCharacterSetVertxGen(Function<Character, Set<Future>> f);
    void testFunctionCharacterSetVertxGen2(Function<Character, Set<TestApi>> f);
    void testFunctionCharacterSetDataObject(Function<Character, Set<HttpServerOptions>> f);
    void testFunctionCharacterSetEnum(Function<Character, Set<HttpVersion>> f);

    void testFunctionCharacterMapString(Function<Character, Map<String, String>> f);
    void testFunctionCharacterMapByte(Function<Character, Map<String, Byte>> f);
    void testFunctionCharacterMapCharacter(Function<Character, Map<String, Character>> f);
    void testFunctionCharacterMapShort(Function<Character, Map<String, Short>> f);
    void testFunctionCharacterMapInteger(Function<Character, Map<String, Integer>> f);
    void testFunctionCharacterMapLong(Function<Character, Map<String, Long>> f);
    void testFunctionCharacterMapDouble(Function<Character, Map<String, Double>> f);
    void testFunctionCharacterMapFloat(Function<Character, Map<String, Float>> f);
    void testFunctionCharacterMapBoolean(Function<Character, Map<String, Boolean>> f);
    void testFunctionCharacterMapJsonObject(Function<Character, Map<String, JsonObject>> f);
    void testFunctionCharacterMapJsonArray(Function<Character, Map<String, JsonArray>> f);
    //SHORT
    void testFunctionShortString(Function<Short, String> f);
    void testFunctionShortByte(Function<Short, Byte> f);
    void testFunctionShortCharacter(Function<Short, Character> f);
    void testFunctionShortShort(Function<Short, Short> f);
    void testFunctionShortInteger(Function<Short, Integer> f);
    void testFunctionShortLong(Function<Short, Long> f);
    void testFunctionShortDouble(Function<Short, Double> f);
    void testFunctionShortFloat(Function<Short, Float> f);
    void testFunctionShortBoolean(Function<Short, Boolean> f);
    void testFunctionShortJsonObject(Function<Short, JsonObject> f);
    void testFunctionShortJsonArray(Function<Short, JsonArray> f);
    void testFunctionShortHttpServerOptions(Function<Short, HttpServerOptions> f);
    void testFunctionShortHttpVersion(Function<Short, HttpVersion> f);
    <V>void testFunctionShortVVVV(Function<Short, V> f);
    void testFunctionShortVVVV2(Function<Short, TV> f);
    void testFunctionShortObject(Function<Short, Object> f);

    void testFunctionShortVertxGenVVVV1(Function<Short, Future<TV>> f);
    <V>void testFunctionShortVertxGenVVVVV2(Function<Short, Future<V>> f);
    void testFunctionShortVertxGenVertxGen(Function<Short, Future<Buffer>> f);
    void testFunctionShortVertxGenVoid(Function<Short, Future<Void>> f);
    void testFunctionShortVertxGenString(Function<Short, Future<String>> f);
    void testFunctionShortVertxGenByte(Function<Short, Future<Byte>> f);
    void testFunctionShortVertxGenCharacter(Function<Short, Future<Character>> f);
    void testFunctionShortVertxGenShort(Function<Short, Future<Short>> f);
    void testFunctionShortVertxGenInteger(Function<Short, Future<Integer>> f);
    void testFunctionShortVertxGenLong(Function<Short, Future<Long>> f);
    void testFunctionShortVertxGenDouble(Function<Short, Future<Double>> f);
    void testFunctionShortVertxGenFloat(Function<Short, Future<Float>> f);
    void testFunctionShortVertxGenBoolean(Function<Short, Future<Boolean>> f);
    void testFunctionShortVertxGenJsonObject(Function<Short, Future<JsonObject>> f);
    void testFunctionShortVertxGenJsonArray(Function<Short, Future<JsonArray>> f);
    void testFunctionShortVertxGenDataObject(Function<Short, Future<HttpServerOptions>> f);
    void testFunctionShortVertxGenEnum(Function<Short, Future<HttpVersion>> f);

    void testFunctionShortListString(Function<Short, List<String>> f);
    void testFunctionShortListByte(Function<Short, List<Byte>> f);
    void testFunctionShortListCharacter(Function<Short, List<Character>> f);
    void testFunctionShortListShort(Function<Short, List<Short>> f);
    void testFunctionShortListInteger(Function<Short, List<Integer>> f);
    void testFunctionShortListLong(Function<Short, List<Long>> f);
    void testFunctionShortListDouble(Function<Short, List<Double>> f);
    void testFunctionShortListFloat(Function<Short, List<Float>> f);
    void testFunctionShortListBoolean(Function<Short, List<Boolean>> f);
    void testFunctionShortListJsonObject(Function<Short, List<JsonObject>> f);
    void testFunctionShortListJsonArray(Function<Short, List<JsonArray>> f);
    void testFunctionShortListVertxGen(Function<Short, List<Future>> f);
    void testFunctionShortListVertxGen2(Function<Short, List<TestApi>> f);
    void testFunctionShortListDataObject(Function<Short, List<HttpServerOptions>> f);
    void testFunctionShortListEnum(Function<Short, List<HttpVersion>> f);

    void testFunctionShortSetString(Function<Short, Set<String>> f);
    void testFunctionShortSetByte(Function<Short, Set<Byte>> f);
    void testFunctionShortSetCharacter(Function<Short, Set<Character>> f);
    void testFunctionShortSetShort(Function<Short, Set<Short>> f);
    void testFunctionShortSetInteger(Function<Short, Set<Integer>> f);
    void testFunctionShortSetLong(Function<Short, Set<Long>> f);
    void testFunctionShortSetDouble(Function<Short, Set<Double>> f);
    void testFunctionShortSetFloat(Function<Short, Set<Float>> f);
    void testFunctionShortSetBoolean(Function<Short, Set<Boolean>> f);
    void testFunctionShortSetJsonObject(Function<Short, Set<JsonObject>> f);
    void testFunctionShortSetJsonArray(Function<Short, Set<JsonArray>> f);
    void testFunctionShortSetVertxGen(Function<Short, Set<Future>> f);
    void testFunctionShortSetVertxGen2(Function<Short, Set<TestApi>> f);
    void testFunctionShortSetDataObject(Function<Short, Set<HttpServerOptions>> f);
    void testFunctionShortSetEnum(Function<Short, Set<HttpVersion>> f);

    void testFunctionShortMapString(Function<Short, Map<String, String>> f);
    void testFunctionShortMapByte(Function<Short, Map<String, Byte>> f);
    void testFunctionShortMapCharacter(Function<Short, Map<String, Character>> f);
    void testFunctionShortMapShort(Function<Short, Map<String, Short>> f);
    void testFunctionShortMapInteger(Function<Short, Map<String, Integer>> f);
    void testFunctionShortMapLong(Function<Short, Map<String, Long>> f);
    void testFunctionShortMapDouble(Function<Short, Map<String, Double>> f);
    void testFunctionShortMapFloat(Function<Short, Map<String, Float>> f);
    void testFunctionShortMapBoolean(Function<Short, Map<String, Boolean>> f);
    void testFunctionShortMapJsonObject(Function<Short, Map<String, JsonObject>> f);
    void testFunctionShortMapJsonArray(Function<Short, Map<String, JsonArray>> f);
    //INTEGER
    void testFunctionIntegerString(Function<Integer, String> f);
    void testFunctionIntegerByte(Function<Integer, Byte> f);
    void testFunctionIntegerCharacter(Function<Integer, Character> f);
    void testFunctionIntegerShort(Function<Integer, Short> f);
    void testFunctionIntegerInteger(Function<Integer, Integer> f);
    void testFunctionIntegerLong(Function<Integer, Long> f);
    void testFunctionIntegerDouble(Function<Integer, Double> f);
    void testFunctionIntegerFloat(Function<Integer, Float> f);
    void testFunctionIntegerBoolean(Function<Integer, Boolean> f);
    void testFunctionIntegerJsonObject(Function<Integer, JsonObject> f);
    void testFunctionIntegerJsonArray(Function<Integer, JsonArray> f);
    void testFunctionIntegerHttpServerOptions(Function<Integer, HttpServerOptions> f);
    void testFunctionIntegerHttpVersion(Function<Integer, HttpVersion> f);
    <V>void testFunctionIntegerVVVV(Function<Integer, V> f);
    void testFunctionIntegerVVVV2(Function<Integer, TV> f);
    void testFunctionIntegerObject(Function<Integer, Object> f);

    void testFunctionIntegerVertxGenVVVV1(Function<Integer, Future<TV>> f);
    <V>void testFunctionIntegerVertxGenVVVVV2(Function<Integer, Future<V>> f);
    void testFunctionIntegerVertxGenVertxGen(Function<Integer, Future<Buffer>> f);
    void testFunctionIntegerVertxGenVoid(Function<Integer, Future<Void>> f);
    void testFunctionIntegerVertxGenString(Function<Integer, Future<String>> f);
    void testFunctionIntegerVertxGenByte(Function<Integer, Future<Byte>> f);
    void testFunctionIntegerVertxGenCharacter(Function<Integer, Future<Character>> f);
    void testFunctionIntegerVertxGenShort(Function<Integer, Future<Short>> f);
    void testFunctionIntegerVertxGenInteger(Function<Integer, Future<Integer>> f);
    void testFunctionIntegerVertxGenLong(Function<Integer, Future<Long>> f);
    void testFunctionIntegerVertxGenDouble(Function<Integer, Future<Double>> f);
    void testFunctionIntegerVertxGenFloat(Function<Integer, Future<Float>> f);
    void testFunctionIntegerVertxGenBoolean(Function<Integer, Future<Boolean>> f);
    void testFunctionIntegerVertxGenJsonObject(Function<Integer, Future<JsonObject>> f);
    void testFunctionIntegerVertxGenJsonArray(Function<Integer, Future<JsonArray>> f);
    void testFunctionIntegerVertxGenDataObject(Function<Integer, Future<HttpServerOptions>> f);
    void testFunctionIntegerVertxGenEnum(Function<Integer, Future<HttpVersion>> f);

    void testFunctionIntegerListString(Function<Integer, List<String>> f);
    void testFunctionIntegerListByte(Function<Integer, List<Byte>> f);
    void testFunctionIntegerListCharacter(Function<Integer, List<Character>> f);
    void testFunctionIntegerListShort(Function<Integer, List<Short>> f);
    void testFunctionIntegerListInteger(Function<Integer, List<Integer>> f);
    void testFunctionIntegerListLong(Function<Integer, List<Long>> f);
    void testFunctionIntegerListDouble(Function<Integer, List<Double>> f);
    void testFunctionIntegerListFloat(Function<Integer, List<Float>> f);
    void testFunctionIntegerListBoolean(Function<Integer, List<Boolean>> f);
    void testFunctionIntegerListJsonObject(Function<Integer, List<JsonObject>> f);
    void testFunctionIntegerListJsonArray(Function<Integer, List<JsonArray>> f);
    void testFunctionIntegerListVertxGen(Function<Integer, List<Future>> f);
    void testFunctionIntegerListVertxGen2(Function<Integer, List<TestApi>> f);
    void testFunctionIntegerListDataObject(Function<Integer, List<HttpServerOptions>> f);
    void testFunctionIntegerListEnum(Function<Integer, List<HttpVersion>> f);

    void testFunctionIntegerSetString(Function<Integer, Set<String>> f);
    void testFunctionIntegerSetByte(Function<Integer, Set<Byte>> f);
    void testFunctionIntegerSetCharacter(Function<Integer, Set<Character>> f);
    void testFunctionIntegerSetShort(Function<Integer, Set<Short>> f);
    void testFunctionIntegerSetInteger(Function<Integer, Set<Integer>> f);
    void testFunctionIntegerSetLong(Function<Integer, Set<Long>> f);
    void testFunctionIntegerSetDouble(Function<Integer, Set<Double>> f);
    void testFunctionIntegerSetFloat(Function<Integer, Set<Float>> f);
    void testFunctionIntegerSetBoolean(Function<Integer, Set<Boolean>> f);
    void testFunctionIntegerSetJsonObject(Function<Integer, Set<JsonObject>> f);
    void testFunctionIntegerSetJsonArray(Function<Integer, Set<JsonArray>> f);
    void testFunctionIntegerSetVertxGen(Function<Integer, Set<Future>> f);
    void testFunctionIntegerSetVertxGen2(Function<Integer, Set<TestApi>> f);
    void testFunctionIntegerSetDataObject(Function<Integer, Set<HttpServerOptions>> f);
    void testFunctionIntegerSetEnum(Function<Integer, Set<HttpVersion>> f);

    void testFunctionIntegerMapString(Function<Integer, Map<String, String>> f);
    void testFunctionIntegerMapByte(Function<Integer, Map<String, Byte>> f);
    void testFunctionIntegerMapCharacter(Function<Integer, Map<String, Character>> f);
    void testFunctionIntegerMapShort(Function<Integer, Map<String, Short>> f);
    void testFunctionIntegerMapInteger(Function<Integer, Map<String, Integer>> f);
    void testFunctionIntegerMapLong(Function<Integer, Map<String, Long>> f);
    void testFunctionIntegerMapDouble(Function<Integer, Map<String, Double>> f);
    void testFunctionIntegerMapFloat(Function<Integer, Map<String, Float>> f);
    void testFunctionIntegerMapBoolean(Function<Integer, Map<String, Boolean>> f);
    void testFunctionIntegerMapJsonObject(Function<Integer, Map<String, JsonObject>> f);
    void testFunctionIntegerMapJsonArray(Function<Integer, Map<String, JsonArray>> f);
    //LONG
    void testFunctionLongString(Function<Long, String> f);
    void testFunctionLongByte(Function<Long, Byte> f);
    void testFunctionLongCharacter(Function<Long, Character> f);
    void testFunctionLongShort(Function<Long, Short> f);
    void testFunctionLongInteger(Function<Long, Integer> f);
    void testFunctionLongLong(Function<Long, Long> f);
    void testFunctionLongDouble(Function<Long, Double> f);
    void testFunctionLongFloat(Function<Long, Float> f);
    void testFunctionLongBoolean(Function<Long, Boolean> f);
    void testFunctionLongJsonObject(Function<Long, JsonObject> f);
    void testFunctionLongJsonArray(Function<Long, JsonArray> f);
    void testFunctionLongHttpServerOptions(Function<Long, HttpServerOptions> f);
    void testFunctionLongHttpVersion(Function<Long, HttpVersion> f);
    <V>void testFunctionLongVVVV(Function<Long, V> f);
    void testFunctionLongVVVV2(Function<Long, TV> f);
    void testFunctionLongObject(Function<Long, Object> f);

    void testFunctionLongVertxGenVVVV1(Function<Long, Future<TV>> f);
    <V>void testFunctionLongVertxGenVVVVV2(Function<Long, Future<V>> f);
    void testFunctionLongVertxGenVertxGen(Function<Long, Future<Buffer>> f);
    void testFunctionLongVertxGenVoid(Function<Long, Future<Void>> f);
    void testFunctionLongVertxGenString(Function<Long, Future<String>> f);
    void testFunctionLongVertxGenByte(Function<Long, Future<Byte>> f);
    void testFunctionLongVertxGenCharacter(Function<Long, Future<Character>> f);
    void testFunctionLongVertxGenShort(Function<Long, Future<Short>> f);
    void testFunctionLongVertxGenInteger(Function<Long, Future<Integer>> f);
    void testFunctionLongVertxGenLong(Function<Long, Future<Long>> f);
    void testFunctionLongVertxGenDouble(Function<Long, Future<Double>> f);
    void testFunctionLongVertxGenFloat(Function<Long, Future<Float>> f);
    void testFunctionLongVertxGenBoolean(Function<Long, Future<Boolean>> f);
    void testFunctionLongVertxGenJsonObject(Function<Long, Future<JsonObject>> f);
    void testFunctionLongVertxGenJsonArray(Function<Long, Future<JsonArray>> f);
    void testFunctionLongVertxGenDataObject(Function<Long, Future<HttpServerOptions>> f);
    void testFunctionLongVertxGenEnum(Function<Long, Future<HttpVersion>> f);

    void testFunctionLongListString(Function<Long, List<String>> f);
    void testFunctionLongListByte(Function<Long, List<Byte>> f);
    void testFunctionLongListCharacter(Function<Long, List<Character>> f);
    void testFunctionLongListShort(Function<Long, List<Short>> f);
    void testFunctionLongListInteger(Function<Long, List<Integer>> f);
    void testFunctionLongListLong(Function<Long, List<Long>> f);
    void testFunctionLongListDouble(Function<Long, List<Double>> f);
    void testFunctionLongListFloat(Function<Long, List<Float>> f);
    void testFunctionLongListBoolean(Function<Long, List<Boolean>> f);
    void testFunctionLongListJsonObject(Function<Long, List<JsonObject>> f);
    void testFunctionLongListJsonArray(Function<Long, List<JsonArray>> f);
    void testFunctionLongListVertxGen(Function<Long, List<Future>> f);
    void testFunctionLongListVertxGen2(Function<Long, List<TestApi>> f);
    void testFunctionLongListDataObject(Function<Long, List<HttpServerOptions>> f);
    void testFunctionLongListEnum(Function<Long, List<HttpVersion>> f);

    void testFunctionLongSetString(Function<Long, Set<String>> f);
    void testFunctionLongSetByte(Function<Long, Set<Byte>> f);
    void testFunctionLongSetCharacter(Function<Long, Set<Character>> f);
    void testFunctionLongSetShort(Function<Long, Set<Short>> f);
    void testFunctionLongSetInteger(Function<Long, Set<Integer>> f);
    void testFunctionLongSetLong(Function<Long, Set<Long>> f);
    void testFunctionLongSetDouble(Function<Long, Set<Double>> f);
    void testFunctionLongSetFloat(Function<Long, Set<Float>> f);
    void testFunctionLongSetBoolean(Function<Long, Set<Boolean>> f);
    void testFunctionLongSetJsonObject(Function<Long, Set<JsonObject>> f);
    void testFunctionLongSetJsonArray(Function<Long, Set<JsonArray>> f);
    void testFunctionLongSetVertxGen(Function<Long, Set<Future>> f);
    void testFunctionLongSetVertxGen2(Function<Long, Set<TestApi>> f);
    void testFunctionLongSetDataObject(Function<Long, Set<HttpServerOptions>> f);
    void testFunctionLongSetEnum(Function<Long, Set<HttpVersion>> f);

    void testFunctionLongMapString(Function<Long, Map<String, String>> f);
    void testFunctionLongMapByte(Function<Long, Map<String, Byte>> f);
    void testFunctionLongMapCharacter(Function<Long, Map<String, Character>> f);
    void testFunctionLongMapShort(Function<Long, Map<String, Short>> f);
    void testFunctionLongMapInteger(Function<Long, Map<String, Integer>> f);
    void testFunctionLongMapLong(Function<Long, Map<String, Long>> f);
    void testFunctionLongMapDouble(Function<Long, Map<String, Double>> f);
    void testFunctionLongMapFloat(Function<Long, Map<String, Float>> f);
    void testFunctionLongMapBoolean(Function<Long, Map<String, Boolean>> f);
    void testFunctionLongMapJsonObject(Function<Long, Map<String, JsonObject>> f);
    void testFunctionLongMapJsonArray(Function<Long, Map<String, JsonArray>> f);
    //DOUBLE
    void testFunctionDoubleString(Function<Double, String> f);
    void testFunctionDoubleByte(Function<Double, Byte> f);
    void testFunctionDoubleCharacter(Function<Double, Character> f);
    void testFunctionDoubleShort(Function<Double, Short> f);
    void testFunctionDoubleInteger(Function<Double, Integer> f);
    void testFunctionDoubleLong(Function<Double, Long> f);
    void testFunctionDoubleDouble(Function<Double, Double> f);
    void testFunctionDoubleFloat(Function<Double, Float> f);
    void testFunctionDoubleBoolean(Function<Double, Boolean> f);
    void testFunctionDoubleJsonObject(Function<Double, JsonObject> f);
    void testFunctionDoubleJsonArray(Function<Double, JsonArray> f);
    void testFunctionDoubleHttpServerOptions(Function<Double, HttpServerOptions> f);
    void testFunctionDoubleHttpVersion(Function<Double, HttpVersion> f);
    <V>void testFunctionDoubleVVVV(Function<Double, V> f);
    void testFunctionDoubleVVVV2(Function<Double, TV> f);
    void testFunctionDoubleObject(Function<Double, Object> f);

    void testFunctionDoubleVertxGenVVVV1(Function<Double, Future<TV>> f);
    <V>void testFunctionDoubleVertxGenVVVVV2(Function<Double, Future<V>> f);
    void testFunctionDoubleVertxGenVertxGen(Function<Double, Future<Buffer>> f);
    void testFunctionDoubleVertxGenVoid(Function<Double, Future<Void>> f);
    void testFunctionDoubleVertxGenString(Function<Double, Future<String>> f);
    void testFunctionDoubleVertxGenByte(Function<Double, Future<Byte>> f);
    void testFunctionDoubleVertxGenCharacter(Function<Double, Future<Character>> f);
    void testFunctionDoubleVertxGenShort(Function<Double, Future<Short>> f);
    void testFunctionDoubleVertxGenInteger(Function<Double, Future<Integer>> f);
    void testFunctionDoubleVertxGenLong(Function<Double, Future<Long>> f);
    void testFunctionDoubleVertxGenDouble(Function<Double, Future<Double>> f);
    void testFunctionDoubleVertxGenFloat(Function<Double, Future<Float>> f);
    void testFunctionDoubleVertxGenBoolean(Function<Double, Future<Boolean>> f);
    void testFunctionDoubleVertxGenJsonObject(Function<Double, Future<JsonObject>> f);
    void testFunctionDoubleVertxGenJsonArray(Function<Double, Future<JsonArray>> f);
    void testFunctionDoubleVertxGenDataObject(Function<Double, Future<HttpServerOptions>> f);
    void testFunctionDoubleVertxGenEnum(Function<Double, Future<HttpVersion>> f);

    void testFunctionDoubleListString(Function<Double, List<String>> f);
    void testFunctionDoubleListByte(Function<Double, List<Byte>> f);
    void testFunctionDoubleListCharacter(Function<Double, List<Character>> f);
    void testFunctionDoubleListShort(Function<Double, List<Short>> f);
    void testFunctionDoubleListInteger(Function<Double, List<Integer>> f);
    void testFunctionDoubleListLong(Function<Double, List<Long>> f);
    void testFunctionDoubleListDouble(Function<Double, List<Double>> f);
    void testFunctionDoubleListFloat(Function<Double, List<Float>> f);
    void testFunctionDoubleListBoolean(Function<Double, List<Boolean>> f);
    void testFunctionDoubleListJsonObject(Function<Double, List<JsonObject>> f);
    void testFunctionDoubleListJsonArray(Function<Double, List<JsonArray>> f);
    void testFunctionDoubleListVertxGen(Function<Double, List<Future>> f);
    void testFunctionDoubleListVertxGen2(Function<Double, List<TestApi>> f);
    void testFunctionDoubleListDataObject(Function<Double, List<HttpServerOptions>> f);
    void testFunctionDoubleListEnum(Function<Double, List<HttpVersion>> f);

    void testFunctionDoubleSetString(Function<Double, Set<String>> f);
    void testFunctionDoubleSetByte(Function<Double, Set<Byte>> f);
    void testFunctionDoubleSetCharacter(Function<Double, Set<Character>> f);
    void testFunctionDoubleSetShort(Function<Double, Set<Short>> f);
    void testFunctionDoubleSetInteger(Function<Double, Set<Integer>> f);
    void testFunctionDoubleSetLong(Function<Double, Set<Long>> f);
    void testFunctionDoubleSetDouble(Function<Double, Set<Double>> f);
    void testFunctionDoubleSetFloat(Function<Double, Set<Float>> f);
    void testFunctionDoubleSetBoolean(Function<Double, Set<Boolean>> f);
    void testFunctionDoubleSetJsonObject(Function<Double, Set<JsonObject>> f);
    void testFunctionDoubleSetJsonArray(Function<Double, Set<JsonArray>> f);
    void testFunctionDoubleSetVertxGen(Function<Double, Set<Future>> f);
    void testFunctionDoubleSetVertxGen2(Function<Double, Set<TestApi>> f);
    void testFunctionDoubleSetDataObject(Function<Double, Set<HttpServerOptions>> f);
    void testFunctionDoubleSetEnum(Function<Double, Set<HttpVersion>> f);

    void testFunctionDoubleMapString(Function<Double, Map<String, String>> f);
    void testFunctionDoubleMapByte(Function<Double, Map<String, Byte>> f);
    void testFunctionDoubleMapCharacter(Function<Double, Map<String, Character>> f);
    void testFunctionDoubleMapShort(Function<Double, Map<String, Short>> f);
    void testFunctionDoubleMapInteger(Function<Double, Map<String, Integer>> f);
    void testFunctionDoubleMapLong(Function<Double, Map<String, Long>> f);
    void testFunctionDoubleMapDouble(Function<Double, Map<String, Double>> f);
    void testFunctionDoubleMapFloat(Function<Double, Map<String, Float>> f);
    void testFunctionDoubleMapBoolean(Function<Double, Map<String, Boolean>> f);
    void testFunctionDoubleMapJsonObject(Function<Double, Map<String, JsonObject>> f);
    void testFunctionDoubleMapJsonArray(Function<Double, Map<String, JsonArray>> f);
    //FLOAT
    void testFunctionFloatString(Function<Float, String> f);
    void testFunctionFloatByte(Function<Float, Byte> f);
    void testFunctionFloatCharacter(Function<Float, Character> f);
    void testFunctionFloatShort(Function<Float, Short> f);
    void testFunctionFloatInteger(Function<Float, Integer> f);
    void testFunctionFloatLong(Function<Float, Long> f);
    void testFunctionFloatDouble(Function<Float, Double> f);
    void testFunctionFloatFloat(Function<Float, Float> f);
    void testFunctionFloatBoolean(Function<Float, Boolean> f);
    void testFunctionFloatJsonObject(Function<Float, JsonObject> f);
    void testFunctionFloatJsonArray(Function<Float, JsonArray> f);
    void testFunctionFloatHttpServerOptions(Function<Float, HttpServerOptions> f);
    void testFunctionFloatHttpVersion(Function<Float, HttpVersion> f);
    <V>void testFunctionFloatVVVV(Function<Float, V> f);
    void testFunctionFloatVVVV2(Function<Float, TV> f);
    void testFunctionFloatObject(Function<Float, Object> f);

    void testFunctionFloatVertxGenVVVV1(Function<Float, Future<TV>> f);
    <V>void testFunctionFloatVertxGenVVVVV2(Function<Float, Future<V>> f);
    void testFunctionFloatVertxGenVertxGen(Function<Float, Future<Buffer>> f);
    void testFunctionFloatVertxGenVoid(Function<Float, Future<Void>> f);
    void testFunctionFloatVertxGenString(Function<Float, Future<String>> f);
    void testFunctionFloatVertxGenByte(Function<Float, Future<Byte>> f);
    void testFunctionFloatVertxGenCharacter(Function<Float, Future<Character>> f);
    void testFunctionFloatVertxGenShort(Function<Float, Future<Short>> f);
    void testFunctionFloatVertxGenInteger(Function<Float, Future<Integer>> f);
    void testFunctionFloatVertxGenLong(Function<Float, Future<Long>> f);
    void testFunctionFloatVertxGenDouble(Function<Float, Future<Double>> f);
    void testFunctionFloatVertxGenFloat(Function<Float, Future<Float>> f);
    void testFunctionFloatVertxGenBoolean(Function<Float, Future<Boolean>> f);
    void testFunctionFloatVertxGenJsonObject(Function<Float, Future<JsonObject>> f);
    void testFunctionFloatVertxGenJsonArray(Function<Float, Future<JsonArray>> f);
    void testFunctionFloatVertxGenDataObject(Function<Float, Future<HttpServerOptions>> f);
    void testFunctionFloatVertxGenEnum(Function<Float, Future<HttpVersion>> f);

    void testFunctionFloatListString(Function<Float, List<String>> f);
    void testFunctionFloatListByte(Function<Float, List<Byte>> f);
    void testFunctionFloatListCharacter(Function<Float, List<Character>> f);
    void testFunctionFloatListShort(Function<Float, List<Short>> f);
    void testFunctionFloatListInteger(Function<Float, List<Integer>> f);
    void testFunctionFloatListLong(Function<Float, List<Long>> f);
    void testFunctionFloatListDouble(Function<Float, List<Double>> f);
    void testFunctionFloatListFloat(Function<Float, List<Float>> f);
    void testFunctionFloatListBoolean(Function<Float, List<Boolean>> f);
    void testFunctionFloatListJsonObject(Function<Float, List<JsonObject>> f);
    void testFunctionFloatListJsonArray(Function<Float, List<JsonArray>> f);
    void testFunctionFloatListVertxGen(Function<Float, List<Future>> f);
    void testFunctionFloatListVertxGen2(Function<Float, List<TestApi>> f);
    void testFunctionFloatListDataObject(Function<Float, List<HttpServerOptions>> f);
    void testFunctionFloatListEnum(Function<Float, List<HttpVersion>> f);

    void testFunctionFloatSetString(Function<Float, Set<String>> f);
    void testFunctionFloatSetByte(Function<Float, Set<Byte>> f);
    void testFunctionFloatSetCharacter(Function<Float, Set<Character>> f);
    void testFunctionFloatSetShort(Function<Float, Set<Short>> f);
    void testFunctionFloatSetInteger(Function<Float, Set<Integer>> f);
    void testFunctionFloatSetLong(Function<Float, Set<Long>> f);
    void testFunctionFloatSetDouble(Function<Float, Set<Double>> f);
    void testFunctionFloatSetFloat(Function<Float, Set<Float>> f);
    void testFunctionFloatSetBoolean(Function<Float, Set<Boolean>> f);
    void testFunctionFloatSetJsonObject(Function<Float, Set<JsonObject>> f);
    void testFunctionFloatSetJsonArray(Function<Float, Set<JsonArray>> f);
    void testFunctionFloatSetVertxGen(Function<Float, Set<Future>> f);
    void testFunctionFloatSetVertxGen2(Function<Float, Set<TestApi>> f);
    void testFunctionFloatSetDataObject(Function<Float, Set<HttpServerOptions>> f);
    void testFunctionFloatSetEnum(Function<Float, Set<HttpVersion>> f);

    void testFunctionFloatMapString(Function<Float, Map<String, String>> f);
    void testFunctionFloatMapByte(Function<Float, Map<String, Byte>> f);
    void testFunctionFloatMapCharacter(Function<Float, Map<String, Character>> f);
    void testFunctionFloatMapShort(Function<Float, Map<String, Short>> f);
    void testFunctionFloatMapInteger(Function<Float, Map<String, Integer>> f);
    void testFunctionFloatMapLong(Function<Float, Map<String, Long>> f);
    void testFunctionFloatMapDouble(Function<Float, Map<String, Double>> f);
    void testFunctionFloatMapFloat(Function<Float, Map<String, Float>> f);
    void testFunctionFloatMapBoolean(Function<Float, Map<String, Boolean>> f);
    void testFunctionFloatMapJsonObject(Function<Float, Map<String, JsonObject>> f);
    void testFunctionFloatMapJsonArray(Function<Float, Map<String, JsonArray>> f);
    //BOOLEAN
    void testFunctionBooleanString(Function<Boolean, String> f);
    void testFunctionBooleanByte(Function<Boolean, Byte> f);
    void testFunctionBooleanCharacter(Function<Boolean, Character> f);
    void testFunctionBooleanShort(Function<Boolean, Short> f);
    void testFunctionBooleanInteger(Function<Boolean, Integer> f);
    void testFunctionBooleanLong(Function<Boolean, Long> f);
    void testFunctionBooleanDouble(Function<Boolean, Double> f);
    void testFunctionBooleanFloat(Function<Boolean, Float> f);
    void testFunctionBooleanBoolean(Function<Boolean, Boolean> f);
    void testFunctionBooleanJsonObject(Function<Boolean, JsonObject> f);
    void testFunctionBooleanJsonArray(Function<Boolean, JsonArray> f);
    void testFunctionBooleanHttpServerOptions(Function<Boolean, HttpServerOptions> f);
    void testFunctionBooleanHttpVersion(Function<Boolean, HttpVersion> f);
    <V>void testFunctionBooleanVVVV(Function<Boolean, V> f);
    void testFunctionBooleanVVVV2(Function<Boolean, TV> f);
    void testFunctionBooleanObject(Function<Boolean, Object> f);

    void testFunctionBooleanVertxGenVVVV1(Function<Boolean, Future<TV>> f);
    <V>void testFunctionBooleanVertxGenVVVVV2(Function<Boolean, Future<V>> f);
    void testFunctionBooleanVertxGenVertxGen(Function<Boolean, Future<Buffer>> f);
    void testFunctionBooleanVertxGenVoid(Function<Boolean, Future<Void>> f);
    void testFunctionBooleanVertxGenString(Function<Boolean, Future<String>> f);
    void testFunctionBooleanVertxGenByte(Function<Boolean, Future<Byte>> f);
    void testFunctionBooleanVertxGenCharacter(Function<Boolean, Future<Character>> f);
    void testFunctionBooleanVertxGenShort(Function<Boolean, Future<Short>> f);
    void testFunctionBooleanVertxGenInteger(Function<Boolean, Future<Integer>> f);
    void testFunctionBooleanVertxGenLong(Function<Boolean, Future<Long>> f);
    void testFunctionBooleanVertxGenDouble(Function<Boolean, Future<Double>> f);
    void testFunctionBooleanVertxGenFloat(Function<Boolean, Future<Float>> f);
    void testFunctionBooleanVertxGenBoolean(Function<Boolean, Future<Boolean>> f);
    void testFunctionBooleanVertxGenJsonObject(Function<Boolean, Future<JsonObject>> f);
    void testFunctionBooleanVertxGenJsonArray(Function<Boolean, Future<JsonArray>> f);
    void testFunctionBooleanVertxGenDataObject(Function<Boolean, Future<HttpServerOptions>> f);
    void testFunctionBooleanVertxGenEnum(Function<Boolean, Future<HttpVersion>> f);

    void testFunctionBooleanListString(Function<Boolean, List<String>> f);
    void testFunctionBooleanListByte(Function<Boolean, List<Byte>> f);
    void testFunctionBooleanListCharacter(Function<Boolean, List<Character>> f);
    void testFunctionBooleanListShort(Function<Boolean, List<Short>> f);
    void testFunctionBooleanListInteger(Function<Boolean, List<Integer>> f);
    void testFunctionBooleanListLong(Function<Boolean, List<Long>> f);
    void testFunctionBooleanListDouble(Function<Boolean, List<Double>> f);
    void testFunctionBooleanListFloat(Function<Boolean, List<Float>> f);
    void testFunctionBooleanListBoolean(Function<Boolean, List<Boolean>> f);
    void testFunctionBooleanListJsonObject(Function<Boolean, List<JsonObject>> f);
    void testFunctionBooleanListJsonArray(Function<Boolean, List<JsonArray>> f);
    void testFunctionBooleanListVertxGen(Function<Boolean, List<Future>> f);
    void testFunctionBooleanListVertxGen2(Function<Boolean, List<TestApi>> f);
    void testFunctionBooleanListDataObject(Function<Boolean, List<HttpServerOptions>> f);
    void testFunctionBooleanListEnum(Function<Boolean, List<HttpVersion>> f);

    void testFunctionBooleanSetString(Function<Boolean, Set<String>> f);
    void testFunctionBooleanSetByte(Function<Boolean, Set<Byte>> f);
    void testFunctionBooleanSetCharacter(Function<Boolean, Set<Character>> f);
    void testFunctionBooleanSetShort(Function<Boolean, Set<Short>> f);
    void testFunctionBooleanSetInteger(Function<Boolean, Set<Integer>> f);
    void testFunctionBooleanSetLong(Function<Boolean, Set<Long>> f);
    void testFunctionBooleanSetDouble(Function<Boolean, Set<Double>> f);
    void testFunctionBooleanSetFloat(Function<Boolean, Set<Float>> f);
    void testFunctionBooleanSetBoolean(Function<Boolean, Set<Boolean>> f);
    void testFunctionBooleanSetJsonObject(Function<Boolean, Set<JsonObject>> f);
    void testFunctionBooleanSetJsonArray(Function<Boolean, Set<JsonArray>> f);
    void testFunctionBooleanSetVertxGen(Function<Boolean, Set<Future>> f);
    void testFunctionBooleanSetVertxGen2(Function<Boolean, Set<TestApi>> f);
    void testFunctionBooleanSetDataObject(Function<Boolean, Set<HttpServerOptions>> f);
    void testFunctionBooleanSetEnum(Function<Boolean, Set<HttpVersion>> f);

    void testFunctionBooleanMapString(Function<Boolean, Map<String, String>> f);
    void testFunctionBooleanMapByte(Function<Boolean, Map<String, Byte>> f);
    void testFunctionBooleanMapCharacter(Function<Boolean, Map<String, Character>> f);
    void testFunctionBooleanMapShort(Function<Boolean, Map<String, Short>> f);
    void testFunctionBooleanMapInteger(Function<Boolean, Map<String, Integer>> f);
    void testFunctionBooleanMapLong(Function<Boolean, Map<String, Long>> f);
    void testFunctionBooleanMapDouble(Function<Boolean, Map<String, Double>> f);
    void testFunctionBooleanMapFloat(Function<Boolean, Map<String, Float>> f);
    void testFunctionBooleanMapBoolean(Function<Boolean, Map<String, Boolean>> f);
    void testFunctionBooleanMapJsonObject(Function<Boolean, Map<String, JsonObject>> f);
    void testFunctionBooleanMapJsonArray(Function<Boolean, Map<String, JsonArray>> f);
    //JSONOBJECT
    void testFunctionJsonObjectString(Function<JsonObject, String> f);
    void testFunctionJsonObjectByte(Function<JsonObject, Byte> f);
    void testFunctionJsonObjectCharacter(Function<JsonObject, Character> f);
    void testFunctionJsonObjectShort(Function<JsonObject, Short> f);
    void testFunctionJsonObjectInteger(Function<JsonObject, Integer> f);
    void testFunctionJsonObjectLong(Function<JsonObject, Long> f);
    void testFunctionJsonObjectDouble(Function<JsonObject, Double> f);
    void testFunctionJsonObjectFloat(Function<JsonObject, Float> f);
    void testFunctionJsonObjectBoolean(Function<JsonObject, Boolean> f);
    void testFunctionJsonObjectJsonObject(Function<JsonObject, JsonObject> f);
    void testFunctionJsonObjectJsonArray(Function<JsonObject, JsonArray> f);
    void testFunctionJsonObjectHttpServerOptions(Function<JsonObject, HttpServerOptions> f);
    void testFunctionJsonObjectHttpVersion(Function<JsonObject, HttpVersion> f);
    <V>void testFunctionJsonObjectVVVV(Function<JsonObject, V> f);
    void testFunctionJsonObjectVVVV2(Function<JsonObject, TV> f);
    void testFunctionJsonObjectObject(Function<JsonObject, Object> f);

    void testFunctionJsonObjectVertxGenVVVV1(Function<JsonObject, Future<TV>> f);
    <V>void testFunctionJsonObjectVertxGenVVVVV2(Function<JsonObject, Future<V>> f);
    void testFunctionJsonObjectVertxGenVertxGen(Function<JsonObject, Future<Buffer>> f);
    void testFunctionJsonObjectVertxGenVoid(Function<JsonObject, Future<Void>> f);
    void testFunctionJsonObjectVertxGenString(Function<JsonObject, Future<String>> f);
    void testFunctionJsonObjectVertxGenByte(Function<JsonObject, Future<Byte>> f);
    void testFunctionJsonObjectVertxGenCharacter(Function<JsonObject, Future<Character>> f);
    void testFunctionJsonObjectVertxGenShort(Function<JsonObject, Future<Short>> f);
    void testFunctionJsonObjectVertxGenInteger(Function<JsonObject, Future<Integer>> f);
    void testFunctionJsonObjectVertxGenLong(Function<JsonObject, Future<Long>> f);
    void testFunctionJsonObjectVertxGenDouble(Function<JsonObject, Future<Double>> f);
    void testFunctionJsonObjectVertxGenFloat(Function<JsonObject, Future<Float>> f);
    void testFunctionJsonObjectVertxGenBoolean(Function<JsonObject, Future<Boolean>> f);
    void testFunctionJsonObjectVertxGenJsonObject(Function<JsonObject, Future<JsonObject>> f);
    void testFunctionJsonObjectVertxGenJsonArray(Function<JsonObject, Future<JsonArray>> f);
    void testFunctionJsonObjectVertxGenDataObject(Function<JsonObject, Future<HttpServerOptions>> f);
    void testFunctionJsonObjectVertxGenEnum(Function<JsonObject, Future<HttpVersion>> f);

    void testFunctionJsonObjectListString(Function<JsonObject, List<String>> f);
    void testFunctionJsonObjectListByte(Function<JsonObject, List<Byte>> f);
    void testFunctionJsonObjectListCharacter(Function<JsonObject, List<Character>> f);
    void testFunctionJsonObjectListShort(Function<JsonObject, List<Short>> f);
    void testFunctionJsonObjectListInteger(Function<JsonObject, List<Integer>> f);
    void testFunctionJsonObjectListLong(Function<JsonObject, List<Long>> f);
    void testFunctionJsonObjectListDouble(Function<JsonObject, List<Double>> f);
    void testFunctionJsonObjectListFloat(Function<JsonObject, List<Float>> f);
    void testFunctionJsonObjectListBoolean(Function<JsonObject, List<Boolean>> f);
    void testFunctionJsonObjectListJsonObject(Function<JsonObject, List<JsonObject>> f);
    void testFunctionJsonObjectListJsonArray(Function<JsonObject, List<JsonArray>> f);
    void testFunctionJsonObjectListVertxGen(Function<JsonObject, List<Future>> f);
    void testFunctionJsonObjectListVertxGen2(Function<JsonObject, List<TestApi>> f);
    void testFunctionJsonObjectListDataObject(Function<JsonObject, List<HttpServerOptions>> f);
    void testFunctionJsonObjectListEnum(Function<JsonObject, List<HttpVersion>> f);

    void testFunctionJsonObjectSetString(Function<JsonObject, Set<String>> f);
    void testFunctionJsonObjectSetByte(Function<JsonObject, Set<Byte>> f);
    void testFunctionJsonObjectSetCharacter(Function<JsonObject, Set<Character>> f);
    void testFunctionJsonObjectSetShort(Function<JsonObject, Set<Short>> f);
    void testFunctionJsonObjectSetInteger(Function<JsonObject, Set<Integer>> f);
    void testFunctionJsonObjectSetLong(Function<JsonObject, Set<Long>> f);
    void testFunctionJsonObjectSetDouble(Function<JsonObject, Set<Double>> f);
    void testFunctionJsonObjectSetFloat(Function<JsonObject, Set<Float>> f);
    void testFunctionJsonObjectSetBoolean(Function<JsonObject, Set<Boolean>> f);
    void testFunctionJsonObjectSetJsonObject(Function<JsonObject, Set<JsonObject>> f);
    void testFunctionJsonObjectSetJsonArray(Function<JsonObject, Set<JsonArray>> f);
    void testFunctionJsonObjectSetVertxGen(Function<JsonObject, Set<Future>> f);
    void testFunctionJsonObjectSetVertxGen2(Function<JsonObject, Set<TestApi>> f);
    void testFunctionJsonObjectSetDataObject(Function<JsonObject, Set<HttpServerOptions>> f);
    void testFunctionJsonObjectSetEnum(Function<JsonObject, Set<HttpVersion>> f);

    void testFunctionJsonObjectMapString(Function<JsonObject, Map<String, String>> f);
    void testFunctionJsonObjectMapByte(Function<JsonObject, Map<String, Byte>> f);
    void testFunctionJsonObjectMapCharacter(Function<JsonObject, Map<String, Character>> f);
    void testFunctionJsonObjectMapShort(Function<JsonObject, Map<String, Short>> f);
    void testFunctionJsonObjectMapInteger(Function<JsonObject, Map<String, Integer>> f);
    void testFunctionJsonObjectMapLong(Function<JsonObject, Map<String, Long>> f);
    void testFunctionJsonObjectMapDouble(Function<JsonObject, Map<String, Double>> f);
    void testFunctionJsonObjectMapFloat(Function<JsonObject, Map<String, Float>> f);
    void testFunctionJsonObjectMapBoolean(Function<JsonObject, Map<String, Boolean>> f);
    void testFunctionJsonObjectMapJsonObject(Function<JsonObject, Map<String, JsonObject>> f);
    void testFunctionJsonObjectMapJsonArray(Function<JsonObject, Map<String, JsonArray>> f);
    //JSONARRAY
    void testFunctionJsonArrayString(Function<JsonArray, String> f);
    void testFunctionJsonArrayByte(Function<JsonArray, Byte> f);
    void testFunctionJsonArrayCharacter(Function<JsonArray, Character> f);
    void testFunctionJsonArrayShort(Function<JsonArray, Short> f);
    void testFunctionJsonArrayInteger(Function<JsonArray, Integer> f);
    void testFunctionJsonArrayLong(Function<JsonArray, Long> f);
    void testFunctionJsonArrayDouble(Function<JsonArray, Double> f);
    void testFunctionJsonArrayFloat(Function<JsonArray, Float> f);
    void testFunctionJsonArrayBoolean(Function<JsonArray, Boolean> f);
    void testFunctionJsonArrayJsonObject(Function<JsonArray, JsonObject> f);
    void testFunctionJsonArrayJsonArray(Function<JsonArray, JsonArray> f);
    void testFunctionJsonArrayHttpServerOptions(Function<JsonArray, HttpServerOptions> f);
    void testFunctionJsonArrayHttpVersion(Function<JsonArray, HttpVersion> f);
    <V>void testFunctionJsonArrayVVVV(Function<JsonArray, V> f);
    void testFunctionJsonArrayVVVV2(Function<JsonArray, TV> f);
    void testFunctionJsonArrayObject(Function<JsonArray, Object> f);

    void testFunctionJsonArrayVertxGenVVVV1(Function<JsonArray, Future<TV>> f);
    <V>void testFunctionJsonArrayVertxGenVVVVV2(Function<JsonArray, Future<V>> f);
    void testFunctionJsonArrayVertxGenVertxGen(Function<JsonArray, Future<Buffer>> f);
    void testFunctionJsonArrayVertxGenVoid(Function<JsonArray, Future<Void>> f);
    void testFunctionJsonArrayVertxGenString(Function<JsonArray, Future<String>> f);
    void testFunctionJsonArrayVertxGenByte(Function<JsonArray, Future<Byte>> f);
    void testFunctionJsonArrayVertxGenCharacter(Function<JsonArray, Future<Character>> f);
    void testFunctionJsonArrayVertxGenShort(Function<JsonArray, Future<Short>> f);
    void testFunctionJsonArrayVertxGenInteger(Function<JsonArray, Future<Integer>> f);
    void testFunctionJsonArrayVertxGenLong(Function<JsonArray, Future<Long>> f);
    void testFunctionJsonArrayVertxGenDouble(Function<JsonArray, Future<Double>> f);
    void testFunctionJsonArrayVertxGenFloat(Function<JsonArray, Future<Float>> f);
    void testFunctionJsonArrayVertxGenBoolean(Function<JsonArray, Future<Boolean>> f);
    void testFunctionJsonArrayVertxGenJsonObject(Function<JsonArray, Future<JsonObject>> f);
    void testFunctionJsonArrayVertxGenJsonArray(Function<JsonArray, Future<JsonArray>> f);
    void testFunctionJsonArrayVertxGenDataObject(Function<JsonArray, Future<HttpServerOptions>> f);
    void testFunctionJsonArrayVertxGenEnum(Function<JsonArray, Future<HttpVersion>> f);

    void testFunctionJsonArrayListString(Function<JsonArray, List<String>> f);
    void testFunctionJsonArrayListByte(Function<JsonArray, List<Byte>> f);
    void testFunctionJsonArrayListCharacter(Function<JsonArray, List<Character>> f);
    void testFunctionJsonArrayListShort(Function<JsonArray, List<Short>> f);
    void testFunctionJsonArrayListInteger(Function<JsonArray, List<Integer>> f);
    void testFunctionJsonArrayListLong(Function<JsonArray, List<Long>> f);
    void testFunctionJsonArrayListDouble(Function<JsonArray, List<Double>> f);
    void testFunctionJsonArrayListFloat(Function<JsonArray, List<Float>> f);
    void testFunctionJsonArrayListBoolean(Function<JsonArray, List<Boolean>> f);
    void testFunctionJsonArrayListJsonObject(Function<JsonArray, List<JsonObject>> f);
    void testFunctionJsonArrayListJsonArray(Function<JsonArray, List<JsonArray>> f);
    void testFunctionJsonArrayListVertxGen(Function<JsonArray, List<Future>> f);
    void testFunctionJsonArrayListVertxGen2(Function<JsonArray, List<TestApi>> f);
    void testFunctionJsonArrayListDataObject(Function<JsonArray, List<HttpServerOptions>> f);
    void testFunctionJsonArrayListEnum(Function<JsonArray, List<HttpVersion>> f);

    void testFunctionJsonArraySetString(Function<JsonArray, Set<String>> f);
    void testFunctionJsonArraySetByte(Function<JsonArray, Set<Byte>> f);
    void testFunctionJsonArraySetCharacter(Function<JsonArray, Set<Character>> f);
    void testFunctionJsonArraySetShort(Function<JsonArray, Set<Short>> f);
    void testFunctionJsonArraySetInteger(Function<JsonArray, Set<Integer>> f);
    void testFunctionJsonArraySetLong(Function<JsonArray, Set<Long>> f);
    void testFunctionJsonArraySetDouble(Function<JsonArray, Set<Double>> f);
    void testFunctionJsonArraySetFloat(Function<JsonArray, Set<Float>> f);
    void testFunctionJsonArraySetBoolean(Function<JsonArray, Set<Boolean>> f);
    void testFunctionJsonArraySetJsonObject(Function<JsonArray, Set<JsonObject>> f);
    void testFunctionJsonArraySetJsonArray(Function<JsonArray, Set<JsonArray>> f);
    void testFunctionJsonArraySetVertxGen(Function<JsonArray, Set<Future>> f);
    void testFunctionJsonArraySetVertxGen2(Function<JsonArray, Set<TestApi>> f);
    void testFunctionJsonArraySetDataObject(Function<JsonArray, Set<HttpServerOptions>> f);
    void testFunctionJsonArraySetEnum(Function<JsonArray, Set<HttpVersion>> f);

    void testFunctionJsonArrayMapString(Function<JsonArray, Map<String, String>> f);
    void testFunctionJsonArrayMapByte(Function<JsonArray, Map<String, Byte>> f);
    void testFunctionJsonArrayMapCharacter(Function<JsonArray, Map<String, Character>> f);
    void testFunctionJsonArrayMapShort(Function<JsonArray, Map<String, Short>> f);
    void testFunctionJsonArrayMapInteger(Function<JsonArray, Map<String, Integer>> f);
    void testFunctionJsonArrayMapLong(Function<JsonArray, Map<String, Long>> f);
    void testFunctionJsonArrayMapDouble(Function<JsonArray, Map<String, Double>> f);
    void testFunctionJsonArrayMapFloat(Function<JsonArray, Map<String, Float>> f);
    void testFunctionJsonArrayMapBoolean(Function<JsonArray, Map<String, Boolean>> f);
    void testFunctionJsonArrayMapJsonObject(Function<JsonArray, Map<String, JsonObject>> f);
    void testFunctionJsonArrayMapJsonArray(Function<JsonArray, Map<String, JsonArray>> f);
    //DATAOBJECT
    void testFunctionHttpServerOptionsString(Function<HttpServerOptions, String> f);
    void testFunctionHttpServerOptionsByte(Function<HttpServerOptions, Byte> f);
    void testFunctionHttpServerOptionsCharacter(Function<HttpServerOptions, Character> f);
    void testFunctionHttpServerOptionsShort(Function<HttpServerOptions, Short> f);
    void testFunctionHttpServerOptionsInteger(Function<HttpServerOptions, Integer> f);
    void testFunctionHttpServerOptionsLong(Function<HttpServerOptions, Long> f);
    void testFunctionHttpServerOptionsDouble(Function<HttpServerOptions, Double> f);
    void testFunctionHttpServerOptionsFloat(Function<HttpServerOptions, Float> f);
    void testFunctionHttpServerOptionsBoolean(Function<HttpServerOptions, Boolean> f);
    void testFunctionHttpServerOptionsJsonObject(Function<HttpServerOptions, JsonObject> f);
    void testFunctionHttpServerOptionsJsonArray(Function<HttpServerOptions, JsonArray> f);
    void testFunctionHttpServerOptionsHttpServerOptions(Function<HttpServerOptions, HttpServerOptions> f);
    void testFunctionHttpServerOptionsHttpVersion(Function<HttpServerOptions, HttpVersion> f);
    <V>void testFunctionHttpServerOptionsVVVV(Function<HttpServerOptions, V> f);
    void testFunctionHttpServerOptionsVVVV2(Function<HttpServerOptions, TV> f);
    void testFunctionHttpServerOptionsObject(Function<HttpServerOptions, Object> f);

    void testFunctionHttpServerOptionsVertxGenVVVV1(Function<HttpServerOptions, Future<TV>> f);
    <V>void testFunctionHttpServerOptionsVertxGenVVVVV2(Function<HttpServerOptions, Future<V>> f);
    void testFunctionHttpServerOptionsVertxGenVertxGen(Function<HttpServerOptions, Future<Buffer>> f);
    void testFunctionHttpServerOptionsVertxGenVoid(Function<HttpServerOptions, Future<Void>> f);
    void testFunctionHttpServerOptionsVertxGenString(Function<HttpServerOptions, Future<String>> f);
    void testFunctionHttpServerOptionsVertxGenByte(Function<HttpServerOptions, Future<Byte>> f);
    void testFunctionHttpServerOptionsVertxGenCharacter(Function<HttpServerOptions, Future<Character>> f);
    void testFunctionHttpServerOptionsVertxGenShort(Function<HttpServerOptions, Future<Short>> f);
    void testFunctionHttpServerOptionsVertxGenInteger(Function<HttpServerOptions, Future<Integer>> f);
    void testFunctionHttpServerOptionsVertxGenLong(Function<HttpServerOptions, Future<Long>> f);
    void testFunctionHttpServerOptionsVertxGenDouble(Function<HttpServerOptions, Future<Double>> f);
    void testFunctionHttpServerOptionsVertxGenFloat(Function<HttpServerOptions, Future<Float>> f);
    void testFunctionHttpServerOptionsVertxGenBoolean(Function<HttpServerOptions, Future<Boolean>> f);
    void testFunctionHttpServerOptionsVertxGenJsonObject(Function<HttpServerOptions, Future<JsonObject>> f);
    void testFunctionHttpServerOptionsVertxGenJsonArray(Function<HttpServerOptions, Future<JsonArray>> f);
    void testFunctionHttpServerOptionsVertxGenDataObject(Function<HttpServerOptions, Future<HttpServerOptions>> f);
    void testFunctionHttpServerOptionsVertxGenEnum(Function<HttpServerOptions, Future<HttpVersion>> f);

    void testFunctionHttpServerOptionsListString(Function<HttpServerOptions, List<String>> f);
    void testFunctionHttpServerOptionsListByte(Function<HttpServerOptions, List<Byte>> f);
    void testFunctionHttpServerOptionsListCharacter(Function<HttpServerOptions, List<Character>> f);
    void testFunctionHttpServerOptionsListShort(Function<HttpServerOptions, List<Short>> f);
    void testFunctionHttpServerOptionsListInteger(Function<HttpServerOptions, List<Integer>> f);
    void testFunctionHttpServerOptionsListLong(Function<HttpServerOptions, List<Long>> f);
    void testFunctionHttpServerOptionsListDouble(Function<HttpServerOptions, List<Double>> f);
    void testFunctionHttpServerOptionsListFloat(Function<HttpServerOptions, List<Float>> f);
    void testFunctionHttpServerOptionsListBoolean(Function<HttpServerOptions, List<Boolean>> f);
    void testFunctionHttpServerOptionsListJsonObject(Function<HttpServerOptions, List<JsonObject>> f);
    void testFunctionHttpServerOptionsListJsonArray(Function<HttpServerOptions, List<JsonArray>> f);
    void testFunctionHttpServerOptionsListVertxGen(Function<HttpServerOptions, List<Future>> f);
    void testFunctionHttpServerOptionsListVertxGen2(Function<HttpServerOptions, List<TestApi>> f);
    void testFunctionHttpServerOptionsListDataObject(Function<HttpServerOptions, List<HttpServerOptions>> f);
    void testFunctionHttpServerOptionsListEnum(Function<HttpServerOptions, List<HttpVersion>> f);

    void testFunctionHttpServerOptionsSetString(Function<HttpServerOptions, Set<String>> f);
    void testFunctionHttpServerOptionsSetByte(Function<HttpServerOptions, Set<Byte>> f);
    void testFunctionHttpServerOptionsSetCharacter(Function<HttpServerOptions, Set<Character>> f);
    void testFunctionHttpServerOptionsSetShort(Function<HttpServerOptions, Set<Short>> f);
    void testFunctionHttpServerOptionsSetInteger(Function<HttpServerOptions, Set<Integer>> f);
    void testFunctionHttpServerOptionsSetLong(Function<HttpServerOptions, Set<Long>> f);
    void testFunctionHttpServerOptionsSetDouble(Function<HttpServerOptions, Set<Double>> f);
    void testFunctionHttpServerOptionsSetFloat(Function<HttpServerOptions, Set<Float>> f);
    void testFunctionHttpServerOptionsSetBoolean(Function<HttpServerOptions, Set<Boolean>> f);
    void testFunctionHttpServerOptionsSetJsonObject(Function<HttpServerOptions, Set<JsonObject>> f);
    void testFunctionHttpServerOptionsSetJsonArray(Function<HttpServerOptions, Set<JsonArray>> f);
    void testFunctionHttpServerOptionsSetVertxGen(Function<HttpServerOptions, Set<Future>> f);
    void testFunctionHttpServerOptionsSetVertxGen2(Function<HttpServerOptions, Set<TestApi>> f);
    void testFunctionHttpServerOptionsSetDataObject(Function<HttpServerOptions, Set<HttpServerOptions>> f);
    void testFunctionHttpServerOptionsSetEnum(Function<HttpServerOptions, Set<HttpVersion>> f);

    void testFunctionHttpServerOptionsMapString(Function<HttpServerOptions, Map<String, String>> f);
    void testFunctionHttpServerOptionsMapByte(Function<HttpServerOptions, Map<String, Byte>> f);
    void testFunctionHttpServerOptionsMapCharacter(Function<HttpServerOptions, Map<String, Character>> f);
    void testFunctionHttpServerOptionsMapShort(Function<HttpServerOptions, Map<String, Short>> f);
    void testFunctionHttpServerOptionsMapInteger(Function<HttpServerOptions, Map<String, Integer>> f);
    void testFunctionHttpServerOptionsMapLong(Function<HttpServerOptions, Map<String, Long>> f);
    void testFunctionHttpServerOptionsMapDouble(Function<HttpServerOptions, Map<String, Double>> f);
    void testFunctionHttpServerOptionsMapFloat(Function<HttpServerOptions, Map<String, Float>> f);
    void testFunctionHttpServerOptionsMapBoolean(Function<HttpServerOptions, Map<String, Boolean>> f);
    void testFunctionHttpServerOptionsMapJsonObject(Function<HttpServerOptions, Map<String, JsonObject>> f);
    void testFunctionHttpServerOptionsMapJsonArray(Function<HttpServerOptions, Map<String, JsonArray>> f);
    //ENUM
    void testFunctionEnumString(Function<HttpVersion, String> f);
    void testFunctionEnumByte(Function<HttpVersion, Byte> f);
    void testFunctionEnumCharacter(Function<HttpVersion, Character> f);
    void testFunctionEnumShort(Function<HttpVersion, Short> f);
    void testFunctionEnumInteger(Function<HttpVersion, Integer> f);
    void testFunctionEnumLong(Function<HttpVersion, Long> f);
    void testFunctionEnumDouble(Function<HttpVersion, Double> f);
    void testFunctionEnumFloat(Function<HttpVersion, Float> f);
    void testFunctionEnumBoolean(Function<HttpVersion, Boolean> f);
    void testFunctionEnumJsonObject(Function<HttpVersion, JsonObject> f);
    void testFunctionEnumJsonArray(Function<HttpVersion, JsonArray> f);
    void testFunctionEnumHttpServerOptions(Function<HttpVersion, HttpServerOptions> f);
    void testFunctionEnumHttpVersion(Function<HttpVersion, HttpVersion> f);
    <V>void testFunctionEnumVVVV(Function<HttpVersion, V> f);
    void testFunctionEnumVVVV2(Function<HttpVersion, TV> f);
    void testFunctionEnumObject(Function<HttpVersion, Object> f);

    void testFunctionEnumVertxGenVVVV1(Function<HttpVersion, Future<TV>> f);
    <V>void testFunctionEnumVertxGenVVVVV2(Function<HttpVersion, Future<V>> f);
    void testFunctionEnumVertxGenVertxGen(Function<HttpVersion, Future<Buffer>> f);
    void testFunctionEnumVertxGenVoid(Function<HttpVersion, Future<Void>> f);
    void testFunctionEnumVertxGenString(Function<HttpVersion, Future<String>> f);
    void testFunctionEnumVertxGenByte(Function<HttpVersion, Future<Byte>> f);
    void testFunctionEnumVertxGenCharacter(Function<HttpVersion, Future<Character>> f);
    void testFunctionEnumVertxGenShort(Function<HttpVersion, Future<Short>> f);
    void testFunctionEnumVertxGenInteger(Function<HttpVersion, Future<Integer>> f);
    void testFunctionEnumVertxGenLong(Function<HttpVersion, Future<Long>> f);
    void testFunctionEnumVertxGenDouble(Function<HttpVersion, Future<Double>> f);
    void testFunctionEnumVertxGenFloat(Function<HttpVersion, Future<Float>> f);
    void testFunctionEnumVertxGenBoolean(Function<HttpVersion, Future<Boolean>> f);
    void testFunctionEnumVertxGenJsonObject(Function<HttpVersion, Future<JsonObject>> f);
    void testFunctionEnumVertxGenJsonArray(Function<HttpVersion, Future<JsonArray>> f);
    void testFunctionEnumVertxGenDataObject(Function<HttpVersion, Future<HttpServerOptions>> f);
    void testFunctionEnumVertxGenEnum(Function<HttpVersion, Future<HttpVersion>> f);

    void testFunctionEnumListString(Function<HttpVersion, List<String>> f);
    void testFunctionEnumListByte(Function<HttpVersion, List<Byte>> f);
    void testFunctionEnumListCharacter(Function<HttpVersion, List<Character>> f);
    void testFunctionEnumListShort(Function<HttpVersion, List<Short>> f);
    void testFunctionEnumListInteger(Function<HttpVersion, List<Integer>> f);
    void testFunctionEnumListLong(Function<HttpVersion, List<Long>> f);
    void testFunctionEnumListDouble(Function<HttpVersion, List<Double>> f);
    void testFunctionEnumListFloat(Function<HttpVersion, List<Float>> f);
    void testFunctionEnumListBoolean(Function<HttpVersion, List<Boolean>> f);
    void testFunctionEnumListJsonObject(Function<HttpVersion, List<JsonObject>> f);
    void testFunctionEnumListJsonArray(Function<HttpVersion, List<JsonArray>> f);
    void testFunctionEnumListVertxGen(Function<HttpVersion, List<Future>> f);
    void testFunctionEnumListVertxGen2(Function<HttpVersion, List<TestApi>> f);
    void testFunctionEnumListDataObject(Function<HttpVersion, List<HttpServerOptions>> f);
    void testFunctionEnumListEnum(Function<HttpVersion, List<HttpVersion>> f);

    void testFunctionEnumSetString(Function<HttpVersion, Set<String>> f);
    void testFunctionEnumSetByte(Function<HttpVersion, Set<Byte>> f);
    void testFunctionEnumSetCharacter(Function<HttpVersion, Set<Character>> f);
    void testFunctionEnumSetShort(Function<HttpVersion, Set<Short>> f);
    void testFunctionEnumSetInteger(Function<HttpVersion, Set<Integer>> f);
    void testFunctionEnumSetLong(Function<HttpVersion, Set<Long>> f);
    void testFunctionEnumSetDouble(Function<HttpVersion, Set<Double>> f);
    void testFunctionEnumSetFloat(Function<HttpVersion, Set<Float>> f);
    void testFunctionEnumSetBoolean(Function<HttpVersion, Set<Boolean>> f);
    void testFunctionEnumSetJsonObject(Function<HttpVersion, Set<JsonObject>> f);
    void testFunctionEnumSetJsonArray(Function<HttpVersion, Set<JsonArray>> f);
    void testFunctionEnumSetVertxGen(Function<HttpVersion, Set<Future>> f);
    void testFunctionEnumSetVertxGen2(Function<HttpVersion, Set<TestApi>> f);
    void testFunctionEnumSetDataObject(Function<HttpVersion, Set<HttpServerOptions>> f);
    void testFunctionEnumSetEnum(Function<HttpVersion, Set<HttpVersion>> f);

    void testFunctionEnumMapString(Function<HttpVersion, Map<String, String>> f);
    void testFunctionEnumMapByte(Function<HttpVersion, Map<String, Byte>> f);
    void testFunctionEnumMapCharacter(Function<HttpVersion, Map<String, Character>> f);
    void testFunctionEnumMapShort(Function<HttpVersion, Map<String, Short>> f);
    void testFunctionEnumMapInteger(Function<HttpVersion, Map<String, Integer>> f);
    void testFunctionEnumMapLong(Function<HttpVersion, Map<String, Long>> f);
    void testFunctionEnumMapDouble(Function<HttpVersion, Map<String, Double>> f);
    void testFunctionEnumMapFloat(Function<HttpVersion, Map<String, Float>> f);
    void testFunctionEnumMapBoolean(Function<HttpVersion, Map<String, Boolean>> f);
    void testFunctionEnumMapJsonObject(Function<HttpVersion, Map<String, JsonObject>> f);
    void testFunctionEnumMapJsonArray(Function<HttpVersion, Map<String, JsonArray>> f);
    //V
    <Variable>void testFunctionVariableString(Function<Variable, String> f);
    <Variable>void testFunctionVariableByte(Function<Variable, Byte> f);
    <Variable>void testFunctionVariableCharacter(Function<Variable, Character> f);
    <Variable>void testFunctionVariableShort(Function<Variable, Short> f);
    <Variable>void testFunctionVariableInteger(Function<Variable, Integer> f);
    <Variable>void testFunctionVariableLong(Function<Variable, Long> f);
    <Variable>void testFunctionVariableDouble(Function<Variable, Double> f);
    <Variable>void testFunctionVariableFloat(Function<Variable, Float> f);
    <Variable>void testFunctionVariableBoolean(Function<Variable, Boolean> f);
    <Variable>void testFunctionVariableJsonObject(Function<Variable, JsonObject> f);
    <Variable>void testFunctionVariableJsonArray(Function<Variable, JsonArray> f);
    <Variable>void testFunctionVariableHttpServerOptions(Function<Variable, HttpServerOptions> f);
    <Variable>void testFunctionVariableHttpVersion(Function<Variable, HttpVersion> f);
    <Variable, V>void testFunctionVariableVVVV(Function<Variable, V> f);
    <Variable>void testFunctionVariableVVVV2(Function<Variable, TV> f);
    <Variable>void testFunctionVariableObject(Function<Variable, Object> f);

    <Variable>void testFunctionVariableVertxGenVVVV1(Function<Variable, Future<TV>> f);
    <Variable,V>void testFunctionVariableVertxGenVVVVV2(Function<Variable, Future<V>> f);
    <Variable>void testFunctionVariableVertxGenVertxGen(Function<Variable, Future<Buffer>> f);
    <Variable>void testFunctionVariableVertxGenVoid(Function<Variable, Future<Void>> f);
    <Variable>void testFunctionVariableVertxGenString(Function<Variable, Future<String>> f);
    <Variable>void testFunctionVariableVertxGenByte(Function<Variable, Future<Byte>> f);
    <Variable>void testFunctionVariableVertxGenCharacter(Function<Variable, Future<Character>> f);
    <Variable>void testFunctionVariableVertxGenShort(Function<Variable, Future<Short>> f);
    <Variable>void testFunctionVariableVertxGenInteger(Function<Variable, Future<Integer>> f);
    <Variable>void testFunctionVariableVertxGenLong(Function<Variable, Future<Long>> f);
    <Variable>void testFunctionVariableVertxGenDouble(Function<Variable, Future<Double>> f);
    <Variable>void testFunctionVariableVertxGenFloat(Function<Variable, Future<Float>> f);
    <Variable>void testFunctionVariableVertxGenBoolean(Function<Variable, Future<Boolean>> f);
    <Variable>void testFunctionVariableVertxGenJsonObject(Function<Variable, Future<JsonObject>> f);
    <Variable>void testFunctionVariableVertxGenJsonArray(Function<Variable, Future<JsonArray>> f);
    <Variable>void testFunctionVariableVertxGenDataObject(Function<Variable, Future<HttpServerOptions>> f);
    <Variable>void testFunctionVariableVertxGenEnum(Function<Variable, Future<HttpVersion>> f);

    <Variable>void testFunctionVariableListString(Function<Variable, List<String>> f);
    <Variable>void testFunctionVariableListByte(Function<Variable, List<Byte>> f);
    <Variable>void testFunctionVariableListCharacter(Function<Variable, List<Character>> f);
    <Variable>void testFunctionVariableListShort(Function<Variable, List<Short>> f);
    <Variable>void testFunctionVariableListInteger(Function<Variable, List<Integer>> f);
    <Variable>void testFunctionVariableListLong(Function<Variable, List<Long>> f);
    <Variable>void testFunctionVariableListDouble(Function<Variable, List<Double>> f);
    <Variable>void testFunctionVariableListFloat(Function<Variable, List<Float>> f);
    <Variable>void testFunctionVariableListBoolean(Function<Variable, List<Boolean>> f);
    <Variable>void testFunctionVariableListJsonObject(Function<Variable, List<JsonObject>> f);
    <Variable>void testFunctionVariableListJsonArray(Function<Variable, List<JsonArray>> f);
    <Variable>void testFunctionVariableListVertxGen(Function<Variable, List<Future>> f);
    <Variable>void testFunctionVariableListVertxGen2(Function<Variable, List<TestApi>> f);
    <Variable>void testFunctionVariableListDataObject(Function<Variable, List<HttpServerOptions>> f);
    <Variable>void testFunctionVariableListEnum(Function<Variable, List<HttpVersion>> f);

    <Variable>void testFunctionVariableSetString(Function<Variable, Set<String>> f);
    <Variable>void testFunctionVariableSetByte(Function<Variable, Set<Byte>> f);
    <Variable>void testFunctionVariableSetCharacter(Function<Variable, Set<Character>> f);
    <Variable>void testFunctionVariableSetShort(Function<Variable, Set<Short>> f);
    <Variable>void testFunctionVariableSetInteger(Function<Variable, Set<Integer>> f);
    <Variable>void testFunctionVariableSetLong(Function<Variable, Set<Long>> f);
    <Variable>void testFunctionVariableSetDouble(Function<Variable, Set<Double>> f);
    <Variable>void testFunctionVariableSetFloat(Function<Variable, Set<Float>> f);
    <Variable>void testFunctionVariableSetBoolean(Function<Variable, Set<Boolean>> f);
    <Variable>void testFunctionVariableSetJsonObject(Function<Variable, Set<JsonObject>> f);
    <Variable>void testFunctionVariableSetJsonArray(Function<Variable, Set<JsonArray>> f);
    <Variable>void testFunctionVariableSetVertxGen(Function<Variable, Set<Future>> f);
    <Variable>void testFunctionVariableSetVertxGen2(Function<Variable, Set<TestApi>> f);
    <Variable>void testFunctionVariableSetDataObject(Function<Variable, Set<HttpServerOptions>> f);
    <Variable>void testFunctionVariableSetEnum(Function<Variable, Set<HttpVersion>> f);

    <Variable>void testFunctionVariableMapString(Function<Variable, Map<String, String>> f);
    <Variable>void testFunctionVariableMapByte(Function<Variable, Map<String, Byte>> f);
    <Variable>void testFunctionVariableMapCharacter(Function<Variable, Map<String, Character>> f);
    <Variable>void testFunctionVariableMapShort(Function<Variable, Map<String, Short>> f);
    <Variable>void testFunctionVariableMapInteger(Function<Variable, Map<String, Integer>> f);
    <Variable>void testFunctionVariableMapLong(Function<Variable, Map<String, Long>> f);
    <Variable>void testFunctionVariableMapDouble(Function<Variable, Map<String, Double>> f);
    <Variable>void testFunctionVariableMapFloat(Function<Variable, Map<String, Float>> f);
    <Variable>void testFunctionVariableMapBoolean(Function<Variable, Map<String, Boolean>> f);
    <Variable>void testFunctionVariableMapJsonObject(Function<Variable, Map<String, JsonObject>> f);
    <Variable>void testFunctionVariableMapJsonArray(Function<Variable, Map<String, JsonArray>> f);
    //OBJECT
    void testFunctionObjectString(Function<Object, String> f);
    void testFunctionObjectByte(Function<Object, Byte> f);
    void testFunctionObjectCharacter(Function<Object, Character> f);
    void testFunctionObjectShort(Function<Object, Short> f);
    void testFunctionObjectInteger(Function<Object, Integer> f);
    void testFunctionObjectLong(Function<Object, Long> f);
    void testFunctionObjectDouble(Function<Object, Double> f);
    void testFunctionObjectFloat(Function<Object, Float> f);
    void testFunctionObjectBoolean(Function<Object, Boolean> f);
    void testFunctionObjectJsonObject(Function<Object, JsonObject> f);
    void testFunctionObjectJsonArray(Function<Object, JsonArray> f);
    void testFunctionObjectHttpServerOptions(Function<Object, HttpServerOptions> f);
    void testFunctionObjectHttpVersion(Function<Object, HttpVersion> f);
    <V>void testFunctionObjectVVVV(Function<Object, V> f);
    void testFunctionObjectVVVV2(Function<Object, TV> f);
    void testFunctionObjectObject(Function<Object, Object> f);

    void testFunctionObjectVertxGenVVVV1(Function<Object, Future<TV>> f);
    <V>void testFunctionObjectVertxGenVVVVV2(Function<Object, Future<V>> f);
    void testFunctionObjectVertxGenVertxGen(Function<Object, Future<Buffer>> f);
    void testFunctionObjectVertxGenVoid(Function<Object, Future<Void>> f);
    void testFunctionObjectVertxGenString(Function<Object, Future<String>> f);
    void testFunctionObjectVertxGenByte(Function<Object, Future<Byte>> f);
    void testFunctionObjectVertxGenCharacter(Function<Object, Future<Character>> f);
    void testFunctionObjectVertxGenShort(Function<Object, Future<Short>> f);
    void testFunctionObjectVertxGenInteger(Function<Object, Future<Integer>> f);
    void testFunctionObjectVertxGenLong(Function<Object, Future<Long>> f);
    void testFunctionObjectVertxGenDouble(Function<Object, Future<Double>> f);
    void testFunctionObjectVertxGenFloat(Function<Object, Future<Float>> f);
    void testFunctionObjectVertxGenBoolean(Function<Object, Future<Boolean>> f);
    void testFunctionObjectVertxGenJsonObject(Function<Object, Future<JsonObject>> f);
    void testFunctionObjectVertxGenJsonArray(Function<Object, Future<JsonArray>> f);
    void testFunctionObjectVertxGenDataObject(Function<Object, Future<HttpServerOptions>> f);
    void testFunctionObjectVertxGenEnum(Function<Object, Future<HttpVersion>> f);

    void testFunctionObjectListString(Function<Object, List<String>> f);
    void testFunctionObjectListByte(Function<Object, List<Byte>> f);
    void testFunctionObjectListCharacter(Function<Object, List<Character>> f);
    void testFunctionObjectListShort(Function<Object, List<Short>> f);
    void testFunctionObjectListInteger(Function<Object, List<Integer>> f);
    void testFunctionObjectListLong(Function<Object, List<Long>> f);
    void testFunctionObjectListDouble(Function<Object, List<Double>> f);
    void testFunctionObjectListFloat(Function<Object, List<Float>> f);
    void testFunctionObjectListBoolean(Function<Object, List<Boolean>> f);
    void testFunctionObjectListJsonObject(Function<Object, List<JsonObject>> f);
    void testFunctionObjectListJsonArray(Function<Object, List<JsonArray>> f);
    void testFunctionObjectListVertxGen(Function<Object, List<Future>> f);
    void testFunctionObjectListVertxGen2(Function<Object, List<TestApi>> f);
    void testFunctionObjectListDataObject(Function<Object, List<HttpServerOptions>> f);
    void testFunctionObjectListEnum(Function<Object, List<HttpVersion>> f);

    void testFunctionObjectSetString(Function<Object, Set<String>> f);
    void testFunctionObjectSetByte(Function<Object, Set<Byte>> f);
    void testFunctionObjectSetCharacter(Function<Object, Set<Character>> f);
    void testFunctionObjectSetShort(Function<Object, Set<Short>> f);
    void testFunctionObjectSetInteger(Function<Object, Set<Integer>> f);
    void testFunctionObjectSetLong(Function<Object, Set<Long>> f);
    void testFunctionObjectSetDouble(Function<Object, Set<Double>> f);
    void testFunctionObjectSetFloat(Function<Object, Set<Float>> f);
    void testFunctionObjectSetBoolean(Function<Object, Set<Boolean>> f);
    void testFunctionObjectSetJsonObject(Function<Object, Set<JsonObject>> f);
    void testFunctionObjectSetJsonArray(Function<Object, Set<JsonArray>> f);
    void testFunctionObjectSetVertxGen(Function<Object, Set<Future>> f);
    void testFunctionObjectSetVertxGen2(Function<Object, Set<TestApi>> f);
    void testFunctionObjectSetDataObject(Function<Object, Set<HttpServerOptions>> f);
    void testFunctionObjectSetEnum(Function<Object, Set<HttpVersion>> f);

    void testFunctionObjectMapString(Function<Object, Map<String, String>> f);
    void testFunctionObjectMapByte(Function<Object, Map<String, Byte>> f);
    void testFunctionObjectMapCharacter(Function<Object, Map<String, Character>> f);
    void testFunctionObjectMapShort(Function<Object, Map<String, Short>> f);
    void testFunctionObjectMapInteger(Function<Object, Map<String, Integer>> f);
    void testFunctionObjectMapLong(Function<Object, Map<String, Long>> f);
    void testFunctionObjectMapDouble(Function<Object, Map<String, Double>> f);
    void testFunctionObjectMapFloat(Function<Object, Map<String, Float>> f);
    void testFunctionObjectMapBoolean(Function<Object, Map<String, Boolean>> f);
    void testFunctionObjectMapJsonObject(Function<Object, Map<String, JsonObject>> f);
    void testFunctionObjectMapJsonArray(Function<Object, Map<String, JsonArray>> f);
    //VERTXGEN<T>
//    void testFunctionThrowableString(Function<Throwable, String> f);
//    void testFunctionThrowableByte(Function<Throwable, Byte> f);
//    void testFunctionThrowableCharacter(Function<Throwable, Character> f);
//    void testFunctionThrowableShort(Function<Throwable, Short> f);
//    void testFunctionThrowableInteger(Function<Throwable, Integer> f);
//    void testFunctionThrowableLong(Function<Throwable, Long> f);
//    void testFunctionThrowableDouble(Function<Throwable, Double> f);
//    void testFunctionThrowableFloat(Function<Throwable, Float> f);
//    void testFunctionThrowableBoolean(Function<Throwable, Boolean> f);
//    void testFunctionThrowableJsonObject(Function<Throwable, JsonObject> f);
//    void testFunctionThrowableJsonArray(Function<Throwable, JsonArray> f);
//    void testFunctionThrowableHttpServerOptions(Function<Throwable, HttpServerOptions> f);
//    void testFunctionThrowableHttpVersion(Function<Throwable, HttpVersion> f);
//    <V>void testFunctionThrowableVVVV(Function<Throwable, V> f);
//    void testFunctionThrowableVVVV2(Function<Throwable, TV> f);
//    void testFunctionThrowableObject(Function<Throwable, Object> f);
//
//    void testFunctionThrowableVertxGenVVVV1(Function<Throwable, Future<TV>> f);
//    <V>void testFunctionThrowableVertxGenVVVVV2(Function<Throwable, Future<V>> f);
//    void testFunctionThrowableVertxGenVertxGen(Function<Throwable, Future<Buffer>> f);
//    void testFunctionThrowableVertxGenVoid(Function<Throwable, Future<Void>> f);
//    void testFunctionThrowableVertxGenString(Function<Throwable, Future<String>> f);
//    void testFunctionThrowableVertxGenByte(Function<Throwable, Future<Byte>> f);
//    void testFunctionThrowableVertxGenCharacter(Function<Throwable, Future<Character>> f);
//    void testFunctionThrowableVertxGenShort(Function<Throwable, Future<Short>> f);
//    void testFunctionThrowableVertxGenInteger(Function<Throwable, Future<Integer>> f);
//    void testFunctionThrowableVertxGenLong(Function<Throwable, Future<Long>> f);
//    void testFunctionThrowableVertxGenDouble(Function<Throwable, Future<Double>> f);
//    void testFunctionThrowableVertxGenFloat(Function<Throwable, Future<Float>> f);
//    void testFunctionThrowableVertxGenBoolean(Function<Throwable, Future<Boolean>> f);
//    void testFunctionThrowableVertxGenJsonObject(Function<Throwable, Future<JsonObject>> f);
//    void testFunctionThrowableVertxGenJsonArray(Function<Throwable, Future<JsonArray>> f);
//    void testFunctionThrowableVertxGenDataObject(Function<Throwable, Future<HttpServerOptions>> f);
//    void testFunctionThrowableVertxGenEnum(Function<Throwable, Future<HttpVersion>> f);
//
//    void testFunctionThrowableListString(Function<Throwable, List<String>> f);
//    void testFunctionThrowableListByte(Function<Throwable, List<Byte>> f);
//    void testFunctionThrowableListCharacter(Function<Throwable, List<Character>> f);
//    void testFunctionThrowableListShort(Function<Throwable, List<Short>> f);
//    void testFunctionThrowableListInteger(Function<Throwable, List<Integer>> f);
//    void testFunctionThrowableListLong(Function<Throwable, List<Long>> f);
//    void testFunctionThrowableListDouble(Function<Throwable, List<Double>> f);
//    void testFunctionThrowableListFloat(Function<Throwable, List<Float>> f);
//    void testFunctionThrowableListBoolean(Function<Throwable, List<Boolean>> f);
//    void testFunctionThrowableListJsonObject(Function<Throwable, List<JsonObject>> f);
//    void testFunctionThrowableListJsonArray(Function<Throwable, List<JsonArray>> f);
//    void testFunctionThrowableListVertxGen(Function<Throwable, List<Future>> f);
//    void testFunctionThrowableListVertxGen2(Function<Throwable, List<TestApi>> f);
//    void testFunctionThrowableListDataObject(Function<Throwable, List<HttpServerOptions>> f);
//    void testFunctionThrowableListEnum(Function<Throwable, List<HttpVersion>> f);
//
//    void testFunctionThrowableSetString(Function<Throwable, Set<String>> f);
//    void testFunctionThrowableSetByte(Function<Throwable, Set<Byte>> f);
//    void testFunctionThrowableSetCharacter(Function<Throwable, Set<Character>> f);
//    void testFunctionThrowableSetShort(Function<Throwable, Set<Short>> f);
//    void testFunctionThrowableSetInteger(Function<Throwable, Set<Integer>> f);
//    void testFunctionThrowableSetLong(Function<Throwable, Set<Long>> f);
//    void testFunctionThrowableSetDouble(Function<Throwable, Set<Double>> f);
//    void testFunctionThrowableSetFloat(Function<Throwable, Set<Float>> f);
//    void testFunctionThrowableSetBoolean(Function<Throwable, Set<Boolean>> f);
//    void testFunctionThrowableSetJsonObject(Function<Throwable, Set<JsonObject>> f);
//    void testFunctionThrowableSetJsonArray(Function<Throwable, Set<JsonArray>> f);
//    void testFunctionThrowableSetVertxGen(Function<Throwable, Set<Future>> f);
//    void testFunctionThrowableSetVertxGen2(Function<Throwable, Set<TestApi>> f);
//    void testFunctionThrowableSetDataObject(Function<Throwable, Set<HttpServerOptions>> f);
//    void testFunctionThrowableSetEnum(Function<Throwable, Set<HttpVersion>> f);
//
//    void testFunctionThrowableMapString(Function<Throwable, Map<String, String>> f);
//    void testFunctionThrowableMapByte(Function<Throwable, Map<String, Byte>> f);
//    void testFunctionThrowableMapCharacter(Function<Throwable, Map<String, Character>> f);
//    void testFunctionThrowableMapShort(Function<Throwable, Map<String, Short>> f);
//    void testFunctionThrowableMapInteger(Function<Throwable, Map<String, Integer>> f);
//    void testFunctionThrowableMapLong(Function<Throwable, Map<String, Long>> f);
//    void testFunctionThrowableMapDouble(Function<Throwable, Map<String, Double>> f);
//    void testFunctionThrowableMapFloat(Function<Throwable, Map<String, Float>> f);
//    void testFunctionThrowableMapBoolean(Function<Throwable, Map<String, Boolean>> f);
//    void testFunctionThrowableMapJsonObject(Function<Throwable, Map<String, JsonObject>> f);
//    void testFunctionThrowableMapJsonArray(Function<Throwable, Map<String, JsonArray>> f);
    //LIST<T>
    //SET<T>
    //MAP<String, T>
    
    //---------------F is Throwable, Void, basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>
    //---------------S is basic, json, DataObject, Enum, V, Object, VertxGen<T>,List<T>,Set<T>,Map<String, T>

//    @Override
//    TestApi exceptionHandler(Handler handler);
}