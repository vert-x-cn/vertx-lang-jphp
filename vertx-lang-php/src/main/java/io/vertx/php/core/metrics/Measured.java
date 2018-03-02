package io.vertx.php.core.metrics;

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
@Name("io\\vertx\\php\\core\\metrics\\Measured")
public class Measured extends BaseWrapper<io.vertx.core.metrics.Measured>{
    public Measured(Environment env, io.vertx.core.metrics.Measured wrappedObject) {
        super(env, wrappedObject);
    }

    public Measured(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
