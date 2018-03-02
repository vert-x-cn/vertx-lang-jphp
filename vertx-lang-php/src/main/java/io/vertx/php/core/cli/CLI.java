package io.vertx.php.core.cli;

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
@Name("io\\vertx\\php\\core\\cli\\CLI")
public class CLI extends BaseWrapper<io.vertx.core.cli.CLI>{
    public CLI(Environment env, io.vertx.core.cli.CLI wrappedObject) {
        super(env, wrappedObject);
    }

    public CLI(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
