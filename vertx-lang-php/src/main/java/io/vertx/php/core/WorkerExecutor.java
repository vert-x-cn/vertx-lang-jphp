package io.vertx.php.core;

import com.google.gson.JsonElement;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.php.VertxExtension;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;
//API

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\WorkerExecutor")
public class WorkerExecutor extends BaseWrapper<io.vertx.core.WorkerExecutor>{
    public WorkerExecutor(Environment env, io.vertx.core.WorkerExecutor wrappedObject) {
        super(env, wrappedObject);
    }

    public WorkerExecutor(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
