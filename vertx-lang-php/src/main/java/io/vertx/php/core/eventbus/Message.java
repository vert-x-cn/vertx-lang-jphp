package io.vertx.php.core.eventbus;

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
@Name("io\\vertx\\php\\core\\eventbus\\Message")
public class Message extends BaseWrapper<io.vertx.core.eventbus.Message>{
    public Message(Environment env, io.vertx.core.eventbus.Message wrappedObject) {
        super(env, wrappedObject);
    }

    public Message(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
