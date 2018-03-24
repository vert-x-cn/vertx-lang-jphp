package io.vertx.model;

import io.vertx.codegen.annotations.Nullable;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Future;
import io.vertx.core.Handler;
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

/**
 * Represents the result of an action that may, or may not, have occurred yet.
 * <p>
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface TestApi<TV> extends Measured, WriteStream<Object>{
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
    void testString(String str);
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
//    void testVoid(Void t);//not legal
<V> void testVariable(V o);//
    void testObject(Object o);//

    void testFutureString(Future<String> f);
    void testFutureV1(Future<TV> f);
    <V>void testFutureV2(Future<V> f);
//    void testFutureFuture(Future<Future<String>> f);

    void testListString(List<String> l);
    void testListByte(List<Byte> l);
    void testListCharacter(List<Character> l);
    void testListShort(List<Short> l);
    void testListInteger(List<Integer> l);
    void testListLong(List<Long> l);
    void testListDouble(List<Double> l);
    void testListFloat(List<Float> l);
    void testListBoolean(List<Boolean> l);
    void testListEnum(List<HttpVersion> l);
    void testListJsonObject(List<JsonObject> l);
    void testListJsonArray(List<JsonArray> l);
//    void testListThrowable(List<Throwable> l);//not legal
//    void testListVoid(List<Void> l);//not legal
//    void testListObject(List<Object> l);//not legal
//    <V>void testListVariable(List<V> l);//not legal
//    void testListList(List<List<String>>ll);//not legal
//    void testListSet(List<Set<String>>ll);//not legal
//    void testListMap(List<Map<String, String>>ll);//not legal
    void testListVertxGen(List<TestApi> list);
    void testListDataObject(List<HttpServerOptions> ls);
//    void testListHandler(List<Handler<String>> ls);

//    @Override
//    TestApi exceptionHandler(Handler handler);
}