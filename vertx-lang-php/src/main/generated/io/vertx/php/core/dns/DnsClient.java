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
@Name("io\\vertx\\php\\core\\dns\\DnsClient")
public class DnsClient extends BaseWrapper<io.vertx.core.dns.DnsClient>{
    public DnsClient(Environment env, io.vertx.core.dns.DnsClient wrappedObject) {
        super(env, wrappedObject);
    }

    public DnsClient(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
