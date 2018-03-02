package io.vertx.php.core.dns;

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
@Name("io\\vertx\\php\\core\\dns\\SrvRecord")
public class SrvRecord extends BaseWrapper<io.vertx.core.dns.SrvRecord>{
    public SrvRecord(Environment env, io.vertx.core.dns.SrvRecord wrappedObject) {
        super(env, wrappedObject);
    }

    public SrvRecord(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
