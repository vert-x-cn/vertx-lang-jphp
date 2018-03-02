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
@Name("io\\vertx\\php\\core\\streams\\StreamBase")
public class StreamBase extends BaseWrapper<io.vertx.core.streams.StreamBase>{
    public StreamBase(Environment env, io.vertx.core.streams.StreamBase wrappedObject) {
        super(env, wrappedObject);
    }

    public StreamBase(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
