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
@Name("io\\vertx\\php\\core\\net\\SelfSignedCertificate")
public class SelfSignedCertificate extends BaseWrapper<io.vertx.core.net.SelfSignedCertificate>{
    public SelfSignedCertificate(Environment env, io.vertx.core.net.SelfSignedCertificate wrappedObject) {
        super(env, wrappedObject);
    }

    public SelfSignedCertificate(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
