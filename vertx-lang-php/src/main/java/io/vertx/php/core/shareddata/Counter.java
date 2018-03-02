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
@Name("io\\vertx\\php\\core\\shareddata\\Counter")
public class Counter extends BaseWrapper<io.vertx.core.shareddata.Counter>{
    public Counter(Environment env, io.vertx.core.shareddata.Counter wrappedObject) {
        super(env, wrappedObject);
    }

    public Counter(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
