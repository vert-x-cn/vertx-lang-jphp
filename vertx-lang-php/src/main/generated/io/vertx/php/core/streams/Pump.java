package io.vertx.php.core.streams;

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
@Name("io\\vertx\\php\\core\\streams\\Pump")
public class Pump extends BaseWrapper<io.vertx.core.streams.Pump>{
    public Pump(Environment env, io.vertx.core.streams.Pump wrappedObject) {
        super(env, wrappedObject);
    }

    public Pump(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
