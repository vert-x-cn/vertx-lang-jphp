package io.vertx.php.core.net;

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
@Name("io\\vertx\\php\\core\\net\\NetSocket")
public class NetSocket extends BaseWrapper<io.vertx.core.net.NetSocket>{
    public NetSocket(Environment env, io.vertx.core.net.NetSocket wrappedObject) {
        super(env, wrappedObject);
    }

    public NetSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
