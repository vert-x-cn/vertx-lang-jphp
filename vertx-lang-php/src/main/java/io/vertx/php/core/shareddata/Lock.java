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
@Name("io\\vertx\\php\\core\\shareddata\\Lock")
public class Lock extends BaseWrapper<io.vertx.core.shareddata.Lock>{
    public Lock(Environment env, io.vertx.core.shareddata.Lock wrappedObject) {
        super(env, wrappedObject);
    }

    public Lock(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
