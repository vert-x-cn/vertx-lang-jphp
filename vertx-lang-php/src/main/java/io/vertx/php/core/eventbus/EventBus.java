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
@Name("io\\vertx\\php\\core\\eventbus\\EventBus")
public class EventBus extends BaseWrapper<io.vertx.core.eventbus.EventBus>{
    public EventBus(Environment env, io.vertx.core.eventbus.EventBus wrappedObject) {
        super(env, wrappedObject);
    }

    public EventBus(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
