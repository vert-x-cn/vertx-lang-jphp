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
@Name("io\\vertx\\php\\core\\net\\NetServer")
public class NetServer extends BaseWrapper<io.vertx.core.net.NetServer>{
    public NetServer(Environment env, io.vertx.core.net.NetServer wrappedObject) {
        super(env, wrappedObject);
    }

    public NetServer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
