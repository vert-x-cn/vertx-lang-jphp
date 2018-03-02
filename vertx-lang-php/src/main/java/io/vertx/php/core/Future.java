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
@Name("io\\vertx\\php\\core\\Future")
public class Future extends BaseWrapper<io.vertx.core.Future>{
    public Future(Environment env, io.vertx.core.Future wrappedObject) {
        super(env, wrappedObject);
    }

    public Future(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
