package io.vertx.lang.php.util;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.SendContext;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;
import io.vertx.lang.php.Operations;
import io.vertx.lang.php.wrapper.JavaThrowable;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.ext.core.classes.WrapInvoker;
import php.runtime.invoke.Invoker;
import io.vertx.lang.php.BaseWrapper;
import php.runtime.lang.BaseException;
import php.runtime.memory.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Wrapper {

    @SuppressWarnings("unchecked")
    public static <T> T convParamApi(Memory memory) throws Exception {
        if (memory instanceof ObjectMemory) {
            return (T)((ObjectMemory) memory).value;
        } else {
            throw new Exception("cannot get api object from " + memory.getClass().getSimpleName());
        }
    }
    public static <T> T convParamApi(BaseWrapper<T> wrapper) {
        return wrapper.getWrappedObject();
    }
    public static <S, W extends BaseWrapper<S>> io.vertx.core.Handler<S> convParamApiHandler(Environment env, Memory invoker, BiFunction<Environment, S, W> function) {
        return convParamApiHandler(env, invoker.toInvoker(env), function);
    }

    public static <S, W extends BaseWrapper<S>> io.vertx.core.Handler<S> convParamApiHandler(Environment env, Invoker invoker, BiFunction<Environment, S, W> function) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                System.out.println("=====");
                W t = function.apply(env, event);
                invoker.call(t.toMemory());
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static io.vertx.core.Handler<Void> convParamVoidHandler(Environment env, Memory invoker) {
        return convParamVoidHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<Void> convParamVoidHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                invoker.call(Memory.NULL);
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static <T extends Enum> io.vertx.core.Handler<T> convParamEnumHandler(Environment env, Memory invoker) {
        return convParamEnumHandler(env, invoker.toInvoker(env));
    }

    public static <T extends Enum> io.vertx.core.Handler<T> convParamEnumHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                invoker.call(StringMemory.valueOf(event.name()));
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static io.vertx.core.Handler<Memory> convParamObjectHandler(Environment env, Memory invoker) {
        return convParamObjectHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<Memory> convParamObjectHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                invoker.call(event);
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static <T> io.vertx.core.Handler<T> convParamDataObjectHandler(Environment env, Memory invoker, Function<T, JsonObject> function) {
        return convParamDataObjectHandler(env, invoker.toInvoker(env), function);
    }

    public static <T> io.vertx.core.Handler<T> convParamDataObjectHandler(Environment env, Invoker invoker, Function<T, JsonObject> function) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                Memory json = JsonFunctions.json_decode(env, function.apply(event).encode());
                invoker.call(json);
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static <T> io.vertx.core.Handler<T> convParamPhpHandler(Environment env, Memory invoker) {
        return convParamPhpHandler(env, invoker.toInvoker(env));
    }

    public static <T> io.vertx.core.Handler<T> convParamPhpHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                invoker.call(Memory.wrap(env, event));
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static io.vertx.core.Handler<Throwable> convParamThrowableHandler(Environment env, Memory invoker) {
        return convParamThrowableHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<Throwable> convParamThrowableHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                invoker.call(new JavaThrowable(env, event).toMemory());
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }
    public static io.vertx.core.Handler<Memory> convParamHandler(Environment env, Memory invoker) {
        return convParamHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<Memory> convParamHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                invoker.call(event);
            } catch (Throwable throwable) {
                env.forwardThrow(throwable);
            }
        };
    }

    public static io.vertx.core.Handler<AsyncResult<Memory>> convParamMemoryAsyncHandler(Environment env, Memory invoker) {
        return convParamMemoryAsyncHandler(env, invoker.toInvoker(env));
    }
    public static io.vertx.core.Handler<AsyncResult<Memory>> convParamMemoryAsyncHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                callInvoker(env, invoker, event, result -> result);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }
    public static <S, W extends BaseWrapper<S>> io.vertx.core.Handler<AsyncResult<S>> convParamAsyncHandler(Environment env, Memory invoker, BiFunction<Environment, S, W> function) {
        return convParamAsyncHandler(env, invoker.toInvoker(env), function);
    }

    private static <E> void callInvoker(Environment env, Invoker invoker, AsyncResult<E> event, Function<E, Memory> resultMapper){
        try {
            if (event.succeeded()) {
                invoker.call(resultMapper.apply(event.result()), Memory.NULL);
            } else {
                invoker.call(Memory.NULL, JavaThrowable.of(env, event.cause()).toMemory());
            }
        } catch (Throwable throwable) {
            env.forwardThrow(throwable);
        }
    }

    public static <S, W extends BaseWrapper<S>> io.vertx.core.Handler<AsyncResult<S>> convParamAsyncHandler(Environment env, Invoker invoker, BiFunction<Environment, S, W> function) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                callInvoker(env, invoker, event, (result) -> (function.apply(env, result).toMemory()));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }
    public static io.vertx.core.Handler<AsyncResult<Void>> convParamAsyncVoidHandler(Environment env, Memory invoker) {
        return convParamAsyncVoidHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<AsyncResult<Void>> convParamAsyncVoidHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                callInvoker(env, invoker, event, result -> Memory.CONST_INT_1);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }
    public static io.vertx.core.Handler<AsyncResult<JsonArray>> convParamAsyncJsonArrayHandler(Environment env, Memory invoker) {
        return convParamAsyncJsonArrayHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<AsyncResult<JsonArray>> convParamAsyncJsonArrayHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                callInvoker(env, invoker, event, result -> JsonFunctions.json_decode(env, result.encode()));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }
    public static io.vertx.core.Handler<AsyncResult<List>> convParamAsyncListHandler(Environment env, Memory invoker) {
        return convParamAsyncListHandler(env, invoker.toInvoker(env));
    }

    public static io.vertx.core.Handler<AsyncResult<List>> convParamAsyncListHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                callInvoker(env, invoker, event, result -> {
                    ArrayMemory mem = ArrayMemory.createListed(result.size());
                    for (Object o : result) {
                        mem.add(Memory.wrap(env, o));
                    }
                    return mem;
                });
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }
    public static <T> io.vertx.core.Handler<AsyncResult<T>> convParamAsyncPrimitiveHandler(Environment env, Memory invoker) {
        return convParamAsyncPrimitiveHandler(env, invoker.toInvoker(env));
    }

    public static <T> io.vertx.core.Handler<AsyncResult<T>> convParamAsyncPrimitiveHandler(Environment env, Invoker invoker) {
        if (invoker == null) {
            throw new NullPointerException("invoker require!");
        }
        return event -> {
            try {
                callInvoker(env, invoker, event, result -> Memory.wrap(env, result));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        };
    }

    public static <S extends Future<Memory>, B extends BaseWrapper<S>, C extends Collection<Future>> C convParamFutureCollection(Collection<B> collection, Supplier<C> collectionFactory){
        return collection.stream().map(BaseWrapper::getWrappedObject).collect(Collectors.toCollection(collectionFactory));
    }
//    public static <S, W extends BaseWrapper<S>, C extends Collection<S>> C convParamCollection(Collection<W> collection, Supplier<C> collectionFactory){
//        return collection.stream().map(BaseWrapper::getWrappedObject).collect(Collectors.toCollection(collectionFactory));
//    }

    public static <S, C extends Collection<S>> C convParamCollection(Collection<Memory> collection, Supplier<C> collectionFactory, Function<JsonObject, S> function){
        return collection.stream().map(m -> convParamDataObject(m, function)).collect(Collectors.toCollection(collectionFactory));
    }

    public static <S> S convParamDataObject(Memory memory, Function<JsonObject, S> function){
        return function.apply(new JsonObject(JsonFunctions.json_encode(memory)));
    }

    public static <D, B> Function<D, B> convParamDataObjectPrimitive(Environment env, Function<D, JsonObject> dataObjectFunction, Function<String, B> primitiveFunction, Invoker invoker){
        return d -> {
            Memory json = JsonFunctions.json_decode(env, dataObjectFunction.apply(d).encode());
            try {
                Memory m = invoker.call(json);
                return primitiveFunction.apply(m.toString());
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }


    public static <T, B extends BaseWrapper<T>> Function<Memory, T> convParamFunction(Environment env, Class<B> clazz, Memory invoker){
        return convParamFunction(env, clazz, invoker.toInvoker(env));
    }
    public static <T, B extends BaseWrapper<T>> Function<Memory, T> convParamFunction(Environment env, Class<B> clazz, Invoker invoker){
        return memory -> {
            try {
                Memory result = invoker.call(memory);
                B b = Operations.convertApi(env, result, clazz);
                return b.getWrappedObject();
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }
    public static Function<Throwable, Memory> convParamThrowableMemoryFunction(Environment env, Memory invoker){
        return convParamThrowableMemoryFunction(env, invoker.toInvoker(env));
    }
    public static Function<Throwable, Memory> convParamThrowableMemoryFunction(Environment env, Invoker invoker){
        return t -> {
            try {
                return invoker.call(JavaThrowable.of(env, t).toMemory());
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }
    public static <T, B extends BaseWrapper<T>> Function<Throwable, T> convParamThrowableApiFunction(Environment env, Class<B> clazz, Memory invoker){
        return convParamThrowableApiFunction(env, clazz, invoker.toInvoker(env));
    }
    public static <T, B extends BaseWrapper<T>> Function<Throwable, T> convParamThrowableApiFunction(Environment env, Class<B> clazz, Invoker invoker){
        return t -> call(t, env, clazz, invoker);
    }
    private static <S, B extends BaseWrapper<S>> S call(Throwable t, Environment env, Class<B> clazz, Invoker invoker){
        try {
            Memory memory = invoker.call(JavaThrowable.of(env, t).toMemory());
            B b = Operations.convertApi(env, memory, clazz);
            return b.getWrappedObject();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
    public static <E, S extends Future<E>, B extends BaseWrapper<S>> Function<Throwable, Future<E>> convParamThrowableCompositeFutureFunction(Environment env, Class<B> clazz, Memory invoker){
        return convParamThrowableCompositeFutureFunction(env, clazz, invoker.toInvoker(env));
    }
    public static <E, S extends Future<E>, B extends BaseWrapper<S>> Function<Throwable, Future<E>> convParamThrowableCompositeFutureFunction(Environment env, Class<B> clazz, Invoker invoker){
        return t -> call(t, env, clazz, invoker);
    }

    public static <P, S extends Future<P>, B extends BaseWrapper<S>, FS extends Future<Memory>, F extends BaseWrapper<FS>> Function<P, Future<Memory>> convParamPrimitiveFutureFunction(Environment env, Function<P, Memory> primitiveFunction, Class<F> clazz, Invoker invoker){
        return p -> {
            try {
                Memory memory = invoker.call(primitiveFunction.apply(p));
                F f = Operations.convertApi(env, memory, clazz);
                return f.getWrappedObject();
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }
    public static <P> Function<P, Memory> convParamPrimitiveMemoryFunction(Environment env, Function<P, Memory> primitiveFunction, Invoker invoker){
        return p -> {
            try {
                return invoker.call(primitiveFunction.apply(p));
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }

    public static <S, B extends BaseWrapper<S>> Function<S, Memory> convParamApiObjectFunction(Environment env, BiFunction<Environment, S, B> function, Invoker invoker){
        return api -> {
            try{
                return invoker.call(function.apply(env, api).toMemory());
            } catch (Throwable throwable){
                throw new RuntimeException(throwable);
            }
        };
    }

    public static Function<Memory, Future<Memory>> convParamVFutureFunction(Environment env, Invoker invoker){
        return m -> {
            try {
                return convWrapperFuture(env, invoker.call(m));
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }
    private static <S, B extends BaseWrapper<S>> S convWrapperFuture(Environment env, Memory memory) throws Throwable {
        B  b = convParamApi(memory);
        return b.getWrappedObject();
    }

    public static <S, B extends BaseWrapper<S>> Function<S, Future<Memory>> convParamFutureFunction(Environment env, BiFunction<Environment, S, B> function, Invoker invoker){
        return s -> {
            try {
                return convWrapperFuture(env, invoker.call(function.apply(env, s).toMemory()));
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }

    public static <S1,S2, B1 extends BaseWrapper<S1>, B2 extends BaseWrapper<S2>> Function<S1, Future<S2>> convParamApiApiFunction(Environment env, BiFunction<Environment, S1, B1> function, Class<B2> clazz, Invoker invoker){
        return s -> {
            try {
                Future<Memory> f = convWrapperFuture(env, invoker.call(function.apply(env, s).toMemory()));
                Future<S2> future = Future.future();
                f.setHandler(res -> {
                    try {
                        if (res.succeeded()) {
                            B2 b = Operations.convertApi(env, res.result(), clazz);
                            future.complete(b.getWrappedObject());
                        } else {
                            future.fail(res.cause());
                        }
                    } catch (Throwable throwable) {
                        future.fail(throwable);
                    }
                });
                return future;
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        };
    }



    public static Memory convReturnHandler(Environment env, BaseWrapper obj, String name){
        ArrayMemory arr = new ArrayMemory();
        arr.add(obj.toMemory());
        arr.add(StringMemory.valueOf(name));
        return WrapInvoker.of(env, arr);
    }
    public static <P, B extends BaseWrapper<Future<Memory>>> B convReturnPrimitiveFuture(Environment env, Future<P> future, BiFunction<Environment, Future<Memory>, B> function, Function<P, Memory> fun){
        Future<Memory> f = Future.future();
        future.setHandler(event -> {
            if (event.succeeded()) {
                f.complete(fun.apply(event.result()));
            } else {
                f.fail(future.cause());
            }
        });
        return function.apply(env, f);
    }

    public static <S, B extends BaseWrapper<S>, B2> B2 convReturnFuture(Environment env, BiFunction<Environment, S, B> function, BiFunction<Environment, Future<Memory>, B2> function2, Future<S> future){
        Future<Memory> s = Future.future();
        future.setHandler(res -> {
            if (res.succeeded()) {
                s.complete(function.apply(env, future.result()).toMemory());
            } else {
                s.fail(future.cause());
            }
        });
        return function2.apply(env, s);
    }

    public static <S extends Future<Memory>, B extends BaseWrapper<S>> void handle(Environment env, B future, Memory result, BaseException cause){
        if (cause != null) {
            future.getWrappedObject().handle(io.vertx.core.Future.failedFuture(cause.getCause()));
        } else {
            future.getWrappedObject().handle(io.vertx.core.Future.succeededFuture(result));
        }
    }
    public static <P, S extends Future<P>, B extends BaseWrapper<S>> void handle(Environment env, B future, Class<B> clazz, Memory result, BaseException cause) {
        if (cause == null) {
            try{
                B b = Operations.convertApi(env, result, clazz);
                future.getWrappedObject().handle(b.getWrappedObject());
            } catch(Throwable throwable){
                throw new RuntimeException(clazz + " must handle itself or Exception");
            }
        } else {
            future.getWrappedObject().handle(io.vertx.core.Future.failedFuture(cause.getCause()));
        }
    }
//    public static <S extends Future<S>, B extends BaseWrapper<S>> void handleComposite(Environment env, B future, Class<B> clazz, Memory result, BaseException cause){
//        if (cause == null) {
//            try{
//                B b = Operations.convertApi(env, result, clazz);
//                future.getWrappedObject().handle(Future.succeededFuture(b.getWrappedObject()));
//            } catch(Throwable throwable){
//                throw new RuntimeException(clazz + " must handle itself or Exception");
//            }
//        } else {
//            future.getWrappedObject().handle(io.vertx.core.Future.failedFuture(cause.getCause()));
//        }
//    }

    public static <S extends Future<Memory>, B extends BaseWrapper<S>> void handle(Environment env, B future, Memory event) {
        if (event instanceof ObjectMemory && ((ObjectMemory) event).value instanceof BaseException) {
            BaseException cause = (BaseException) (((ObjectMemory)event).value);
            handle(env, future, null, cause);
        } else {
            handle(env, future, event, null);
        }
    }
    public static  <P, S extends Future<P>, B extends BaseWrapper<S>> void handle(Environment env, B future, Class<B> clazz, Memory event) {
        if (event instanceof ObjectMemory) {
            ObjectMemory obj = (ObjectMemory) event;
            if (obj.value instanceof BaseException) {
                BaseException cause = (BaseException) (((ObjectMemory)event).value);
                handle(env, future, clazz, null, cause);
            } else {
                handle(env, future, clazz, event, null);
            }
        } else {
            throw new RuntimeException(clazz + " must handle itself or Exception");
        }
    }

    public static <S, B extends BaseWrapper<S>, STREAM extends ReadStream<Memory>, BSTREAM extends BaseWrapper<STREAM>> ReadStream<S> convParamReadStream(Environment env, Class<B> clazz, BSTREAM stream){
        return new AbstractReadStream<S, Memory>(stream.getWrappedObject()) {
            @Override
            public ReadStream<S> handler(Handler<S> handler) {
                this.stream.handler(m -> {
                    try {
                        B b = Operations.convertApi(env, m, clazz);
                        handler.handle(b.getWrappedObject());
                    } catch (Throwable throwable) {
                        throw new RuntimeException(throwable);
                    }
                });
                return this;
            }
        };
    }

    public static <S, B extends BaseWrapper<S>> WriteStream<Memory> convWriteStream(Environment env, Class<B> clazz, WriteStream<S> stream){
        return new WriteStream<Memory>() {
            @Override
            public WriteStream<Memory> exceptionHandler(Handler<Throwable> handler) {
                stream.exceptionHandler(handler);
                return this;
            }

            @Override
            public WriteStream<Memory> write(Memory data) {
                try {
                    B b = Operations.convertApi(env, data, clazz);
                    stream.write(b.getWrappedObject());
                    return this;
                } catch (Throwable throwable) {
                    throw new RuntimeException(throwable);
                }
            }

            @Override
            public void end() {
                stream.end();
            }

            @Override
            public WriteStream<Memory> setWriteQueueMaxSize(int maxSize) {
                stream.setWriteQueueMaxSize(maxSize);
                return this;
            }

            @Override
            public boolean writeQueueFull() {
                return stream.writeQueueFull();
            }

            @Override
            public WriteStream<Memory> drainHandler(Handler<Void> handler) {
                stream.drainHandler(handler);
                return this;
            }
        };
    }
    public static <S, B extends BaseWrapper<S>> ReadStream<Memory> convReadStream(Environment env, BiFunction<Environment, S, B> function, ReadStream<S> stream){
        return new AbstractReadStream<Memory, S>(stream) {
            @Override
            public ReadStream<Memory> handler(Handler<Memory> handler) {
                this.stream.handler(res -> handler.handle(function.apply(env, res).toMemory()));
                return this;
            }
        };
    }

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private static Map<Invoker, Handler<SendContext>> map = new HashMap<>();
    public static <S extends SendContext<Memory>, B extends BaseWrapper<S>> Handler<SendContext> convParamSendContextHandler(Environment env, Memory invoker, BiFunction<Environment, SendContext, B> function){
        return convParamSendContextHandler(env, invoker.toInvoker(env), function);
    }
    @SuppressWarnings("unchecked")
    public static <S extends SendContext<Memory>, B extends BaseWrapper<S>> Handler<SendContext> convParamSendContextHandler(Environment env, Invoker invoker, BiFunction<Environment, SendContext, B> function){
        Handler<SendContext> handler = map.get(invoker);
        if (handler == null) {
            handler = context -> {
                B b = function.apply(env, context);
                try {
                    invoker.call(b.toMemory());
                } catch (Throwable throwable) {
                    env.forwardThrow(throwable);
                }
            };
        }
        return handler;
    }

    public static JsonObject convParamJsonObject(Environment env, Memory memory){
        return new JsonObject(JsonFunctions.json_encode(memory));
    }
    public static JsonArray convParamJsonArray(Environment env, Memory memory) {
        return new JsonArray(JsonFunctions.json_encode(memory));
    }
    public static Class<?> convParamClassType(Environment env, String className){
        return env.fetchClass(className).getNativeClass();
    }




    public static String unconverString(Memory memory) throws Throwable{
        if (memory instanceof StringMemory) {
            return memory.toString();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }
    public static boolean unconverBoolean(Memory memory) throws Throwable {
        if (!(memory instanceof FalseMemory || memory instanceof TrueMemory)) {
            throw new Exception("cannot get a boolean from " + memory.getClass().getSimpleName());
        } else {
            return memory instanceof TrueMemory;
        }
    }
    public static byte unconverByte(Memory memory) throws Throwable{
        if (memory instanceof LongMemory) {
            return (byte)memory.toLong();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }
    public static char unconverCharacter(Memory memory) throws Throwable{
        if (memory instanceof LongMemory) {
            return (char)memory.toLong();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }
    public static short unconverShort(Memory memory) throws Throwable{
        if (memory instanceof LongMemory) {
            return (short)memory.toLong();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }
    public static int unconverInteger(Memory memory) throws Throwable{
        if (memory instanceof LongMemory) {
            return memory.toInteger();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }
    public static long unconverLong(Memory memory) throws Throwable{
        if (memory instanceof LongMemory) {
            return memory.toLong();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }

    public static double unconverDouble(Memory memory) throws Throwable{
        if (memory instanceof DoubleMemory) {
            return memory.toDouble();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }
    public static float unconverFloat(Memory memory) throws Throwable{
        if (memory instanceof DoubleMemory) {
            return (float) memory.toDouble();
        }
        throw new Exception("cannot get a String from " + memory.getClass().getSimpleName());
    }






    public static abstract class AbstractReadStream<T, E> implements ReadStream<T> {
        ReadStream<E> stream;
        public AbstractReadStream(ReadStream<E> stream){
            this.stream = stream;
        }
        @Override
        public ReadStream<T> exceptionHandler(Handler<Throwable> handler) {
            stream.exceptionHandler(handler);
            return this;
        }

        @Override
        public ReadStream<T> pause() {
            stream.pause();
            return this;
        }

        @Override
        public ReadStream<T> resume() {
            stream.resume();
            return this;
        }

        @Override
        public ReadStream<T> endHandler(Handler<Void> endHandler) {
            stream.endHandler(endHandler);
            return this;
        }
    }
}
