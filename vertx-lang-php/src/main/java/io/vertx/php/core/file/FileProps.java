package io.vertx.php.core.file;

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
@Name("io\\vertx\\php\\core\\file\\FileProps")
public class FileProps extends BaseWrapper<io.vertx.core.file.FileProps>{
    public FileProps(Environment env, io.vertx.core.file.FileProps wrappedObject) {
        super(env, wrappedObject);
    }

    public FileProps(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
