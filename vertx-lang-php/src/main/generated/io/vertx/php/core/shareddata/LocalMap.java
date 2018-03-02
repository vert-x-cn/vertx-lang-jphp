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
@Name("io\\vertx\\php\\core\\shareddata\\LocalMap")
public class LocalMap extends BaseWrapper<io.vertx.core.shareddata.LocalMap>{
    public LocalMap(Environment env, io.vertx.core.shareddata.LocalMap wrappedObject) {
        super(env, wrappedObject);
    }

    public LocalMap(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
