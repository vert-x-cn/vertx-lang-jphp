package io.vertx.lang.php.wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.Closure;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;

import java.lang.Throwable;

@SuppressWarnings({"unused", "WeakerAccess", "unchecked"})
public class AsyncResult extends BaseWrapper<io.vertx.core.AsyncResult<Memory>> implements io.vertx.core.AsyncResult<Memory> {
    public AsyncResult(Environment env, io.vertx.core.AsyncResult<Memory> wrappedObject) {
        super(env, wrappedObject);
    }

    public AsyncResult(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory result() {
        return __wrappedObject.result();
    }

    @Signature
    public JavaThrowable causeJava() {
        return new JavaThrowable(__env__, cause());
    }

    public java.lang.Throwable cause() {
        return __wrappedObject.cause();
    }

    @Signature
    public boolean succeeded() {
        return false;
    }

    @Signature
    public boolean failed() {
        return false;
    }

    @Signature
    public AsyncResult map(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof Closure) {
            Closure mapper = (Closure) ((ObjectMemory) memory).value;
            return new AsyncResult(__env__, __wrappedObject.map(r -> {
                Memory m = null;
                try {
                    m = mapper.__invoke(__env__, this.result());
                } catch (java.lang.Throwable throwable) {
                    __env__.forwardThrow(throwable);
                }
                return m;
            }));
        } else {
            return new AsyncResult(__env__, __wrappedObject.map(memory));
        }
    }

    @Signature
    public AsyncResult mapEmpty() {
        return new AsyncResult(__env__, this.__wrappedObject.mapEmpty());
    }

    @Signature
    public AsyncResult otherwise(Memory memory) {
        return new AsyncResult(__env__, __wrappedObject.otherwise(throwable -> {
            if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof Closure) {
                Closure mapper = (Closure) ((ObjectMemory) memory).value;
                Memory result = null;
                try {
                    result = mapper.__invoke(__env__, ObjectMemory.valueOf(new JavaThrowable(__env__, throwable)));
                } catch (Throwable throwable1) {
                    __env__.forwardThrow(throwable1);
                }
                return result;
            } else {
                return memory;
            }
        }));
    }

    @Signature
    public AsyncResult otherwiseEmpty() {
        return new AsyncResult(__env__, __wrappedObject.otherwiseEmpty());
    }
}
