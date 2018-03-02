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
@Name("io\\vertx\\php\\core\\eventbus\\MessageProducer")
public class MessageProducer extends BaseWrapper<io.vertx.core.eventbus.MessageProducer>{
    public MessageProducer(Environment env, io.vertx.core.eventbus.MessageProducer wrappedObject) {
        super(env, wrappedObject);
    }

    public MessageProducer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
