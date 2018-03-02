package io.vertx.php.core.buffer;

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
@Name("io\\vertx\\php\\core\\buffer\\Buffer")
public class Buffer extends BaseWrapper<io.vertx.core.buffer.Buffer>{
    public Buffer(Environment env, io.vertx.core.buffer.Buffer wrappedObject) {
        super(env, wrappedObject);
    }

    public Buffer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
