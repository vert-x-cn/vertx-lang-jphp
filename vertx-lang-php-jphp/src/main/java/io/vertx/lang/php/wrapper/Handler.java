package io.vertx.lang.php.wrapper;

import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

public class Handler extends BaseWrapper<io.vertx.core.Handler<Memory>> implements io.vertx.core.Handler<Memory> {
    public Handler(Environment env, io.vertx.core.Handler<Memory> wrappedObject) {
        super(env, wrappedObject);
    }

    public Handler(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public void handle(Memory event) {
        this.__wrappedObject.handle(event);
    }

    public void handle(Memory value, Memory cause) {

    }
}
