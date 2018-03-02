package io.vertx.php.core.datagram;

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
@Name("io\\vertx\\php\\core\\datagram\\DatagramSocket")
public class DatagramSocket extends BaseWrapper<io.vertx.core.datagram.DatagramSocket>{
    public DatagramSocket(Environment env, io.vertx.core.datagram.DatagramSocket wrappedObject) {
        super(env, wrappedObject);
    }

    public DatagramSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
