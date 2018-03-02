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
@Name("io\\vertx\\php\\core\\cli\\CommandLine")
public class CommandLine extends BaseWrapper<io.vertx.core.cli.CommandLine>{
    public CommandLine(Environment env, io.vertx.core.cli.CommandLine wrappedObject) {
        super(env, wrappedObject);
    }

    public CommandLine(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
