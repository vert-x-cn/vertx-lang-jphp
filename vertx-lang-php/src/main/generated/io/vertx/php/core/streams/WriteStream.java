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
@Name("io\\vertx\\php\\core\\streams\\WriteStream")
public class WriteStream extends BaseWrapper<io.vertx.core.streams.WriteStream>{
    public WriteStream(Environment env, io.vertx.core.streams.WriteStream wrappedObject) {
        super(env, wrappedObject);
    }

    public WriteStream(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
