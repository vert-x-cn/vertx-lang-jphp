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
@Name("io\\vertx\\php\\core\\streams\\ReadStream")
public class ReadStream extends BaseWrapper<io.vertx.core.streams.ReadStream>{
    public ReadStream(Environment env, io.vertx.core.streams.ReadStream wrappedObject) {
        super(env, wrappedObject);
    }

    public ReadStream(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
