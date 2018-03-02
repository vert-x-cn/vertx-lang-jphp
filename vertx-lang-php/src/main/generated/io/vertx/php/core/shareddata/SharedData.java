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
@Name("io\\vertx\\php\\core\\shareddata\\SharedData")
public class SharedData extends BaseWrapper<io.vertx.core.shareddata.SharedData>{
    public SharedData(Environment env, io.vertx.core.shareddata.SharedData wrappedObject) {
        super(env, wrappedObject);
    }

    public SharedData(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
