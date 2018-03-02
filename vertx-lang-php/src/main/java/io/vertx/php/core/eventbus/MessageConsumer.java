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
@Name("io\\vertx\\php\\core\\eventbus\\MessageConsumer")
public class MessageConsumer extends BaseWrapper<io.vertx.core.eventbus.MessageConsumer>{
    public MessageConsumer(Environment env, io.vertx.core.eventbus.MessageConsumer wrappedObject) {
        super(env, wrappedObject);
    }

    public MessageConsumer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
