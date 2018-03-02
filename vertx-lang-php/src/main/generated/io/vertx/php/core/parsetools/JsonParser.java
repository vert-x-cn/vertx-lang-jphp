package io.vertx.php.core.parsetools;

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
@Name("io\\vertx\\php\\core\\parsetools\\JsonParser")
public class JsonParser extends BaseWrapper<io.vertx.core.parsetools.JsonParser>{
    public JsonParser(Environment env, io.vertx.core.parsetools.JsonParser wrappedObject) {
        super(env, wrappedObject);
    }

    public JsonParser(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
