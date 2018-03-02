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
@Name("io\\vertx\\php\\core\\MultiMap")
public class MultiMap extends BaseWrapper<io.vertx.core.MultiMap>{
    public MultiMap(Environment env, io.vertx.core.MultiMap wrappedObject) {
        super(env, wrappedObject);
    }

    public MultiMap(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
