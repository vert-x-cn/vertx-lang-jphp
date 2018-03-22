package io.vertx.lang.php;

import php.runtime.Memory;
import php.runtime.env.CompileScope;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.support.MemoryOperation;

public class Operations {
//    static FutureOperation futureOperation;

    @SuppressWarnings("unchecked")
    public static <T extends BaseWrapper> T convertApi(Environment env, Memory memory, Class<T> clazz) throws Throwable {
        return (T)MemoryOperation.get(clazz, null).convert(env, null, memory);
//        return futureOperation.convert(env, null, memory);
    }

    public static void registerOperations(CompileScope compileScope) {
//        futureOperation = new FutureOperation();
        new BaseWrapperOperation();
    }

//    public static class FutureOperation extends BaseOperation<Future> {
//        @Override
//        public Class<?>[] getOperationClasses() {
//            return new Class[]{Future.class};
//        }
//
//        @Override
//        public Future convert(Environment env, TraceInfo trace, Memory future) throws Throwable {
//            if (future instanceof ObjectMemory && ((ObjectMemory) future).value instanceof Future) {
//                return (Future) ((ObjectMemory) future).value;
//            }
//            return null;
//        }
//
//        @Override
//        public Memory unconvert(Environment env, TraceInfo trace, Future future) throws Throwable {
//            return future.toMemory();
//        }
//    }
    public static class BaseWrapperOperation extends BaseOperation<BaseWrapper> {
        @Override
        public Class<?>[] getOperationClasses() {
            return new Class[]{BaseWrapper.class};
        }

        @Override
        public BaseWrapper convert(Environment env, TraceInfo trace, Memory future) throws Throwable {
            if (future instanceof ObjectMemory && ((ObjectMemory) future).value instanceof BaseWrapper) {
                return (BaseWrapper) ((ObjectMemory) future).value;
            }
            return null;
        }

        @Override
        public Memory unconvert(Environment env, TraceInfo trace, BaseWrapper future) throws Throwable {
            return future.toMemory();
        }
    }

//    public static class HandlerOperation extends MemoryOperation<Handler> {
//        @Override
//        public Class<?>[] getOperationClasses() {
//            return new Class[]{Handler.class};
//        }
//
//        @Override
//        public Handler convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
//            return memory.toObject(Handler.class);
//        }
//
//        @Override
//        public Memory unconvert(Environment environment, TraceInfo traceInfo, Handler handler) throws Throwable {
//            return ObjectMemory.valueOf(handler);
//        }
//    }


    //    public static class CompositeFutureOperation extends MemoryOperation<CompositeFuture> {
//        @Override
//        public Class<?>[] getOperationClasses() {
//            return new Class[]{CompositeFuture.class};
//        }
//
//        @Override
//        public CompositeFuture convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
//            return memory.toObject(CompositeFuture.class);
//        }
//
//        @Override
//        public Memory unconvert(Environment environment, TraceInfo traceInfo, CompositeFuture handler) throws Throwable {
//            return ObjectMemory.valueOf(handler);
//        }
//
//        public static CompositeFuture convert(Environment env, Memory memory) throws Throwable {
//            return (CompositeFuture) MemoryOperation.get(CompositeFuture.class, CompositeFuture.class).convert(env, null, memory);
//        }
//    }
    private abstract static class BaseOperation<T> extends MemoryOperation<T> {
        BaseOperation() {
            MemoryOperation.register(this);
        }
    }
}


