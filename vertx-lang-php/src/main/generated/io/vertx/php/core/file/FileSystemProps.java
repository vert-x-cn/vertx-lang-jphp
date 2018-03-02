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
@Name("io\\vertx\\php\\core\\file\\FileSystemProps")
public class FileSystemProps extends BaseWrapper<io.vertx.core.file.FileSystemProps>{
    public FileSystemProps(Environment env, io.vertx.core.file.FileSystemProps wrappedObject) {
        super(env, wrappedObject);
    }

    public FileSystemProps(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
