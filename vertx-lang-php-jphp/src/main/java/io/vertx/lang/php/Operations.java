package io.vertx.lang.php;

import io.vertx.lang.php.wrapper.Handler;
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
}


