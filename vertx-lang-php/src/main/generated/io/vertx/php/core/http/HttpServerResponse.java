package io.vertx.php.core.http;

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
@Name("io\\vertx\\php\\core\\http\\HttpServerResponse")
public class HttpServerResponse extends BaseWrapper<io.vertx.core.http.HttpServerResponse>{
    public HttpServerResponse(Environment env, io.vertx.core.http.HttpServerResponse wrappedObject) {
        super(env, wrappedObject);
    }

    public HttpServerResponse(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
