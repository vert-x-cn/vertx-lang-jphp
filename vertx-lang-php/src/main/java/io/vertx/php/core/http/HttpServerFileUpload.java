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
@Name("io\\vertx\\php\\core\\http\\HttpServerFileUpload")
public class HttpServerFileUpload extends BaseWrapper<io.vertx.core.http.HttpServerFileUpload>{
    public HttpServerFileUpload(Environment env, io.vertx.core.http.HttpServerFileUpload wrappedObject) {
        super(env, wrappedObject);
    }

    public HttpServerFileUpload(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
