package io.vertx.php.core.file;

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
@Name("io\\vertx\\php\\core\\file\\AsyncFile")
public class AsyncFile extends BaseWrapper<io.vertx.core.file.AsyncFile>{
    public AsyncFile(Environment env, io.vertx.core.file.AsyncFile wrappedObject) {
        super(env, wrappedObject);
    }

    public AsyncFile(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
