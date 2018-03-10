package io.vertx.lang.php;

import io.vertx.lang.php.wrapper.Handler;
//import io.vertx.php.core.CompositeFuture;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.support.MemoryOperation;

public class Operations {
    public static class HandlerOperation extends MemoryOperation<Handler> {
        @Override
        public Class<?>[] getOperationClasses() {
            return new Class[]{Handler.class};
        }

        @Override
        public Handler convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
            return memory.toObject(Handler.class);
        }

        @Override
        public Memory unconvert(Environment environment, TraceInfo traceInfo, Handler handler) throws Throwable {
            return ObjectMemory.valueOf(handler);
        }
    }


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
}


