package io.vertx.php.core.shareddata;

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
@Name("io\\vertx\\php\\core\\shareddata\\AsyncMap")
public class AsyncMap extends BaseWrapper<io.vertx.core.shareddata.AsyncMap>{
    public AsyncMap(Environment env, io.vertx.core.shareddata.AsyncMap wrappedObject) {
        super(env, wrappedObject);
    }

    public AsyncMap(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
