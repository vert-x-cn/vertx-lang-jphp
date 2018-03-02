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
@Name("io\\vertx\\php\\core\\net\\NetClient")
public class NetClient extends BaseWrapper<io.vertx.core.net.NetClient>{
    public NetClient(Environment env, io.vertx.core.net.NetClient wrappedObject) {
        super(env, wrappedObject);
    }

    public NetClient(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
