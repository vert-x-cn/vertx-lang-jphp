package io.vertx.php.core.parsetools;

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
@Name("io\\vertx\\php\\core\\parsetools\\RecordParser")
public class RecordParser extends BaseWrapper<io.vertx.core.parsetools.RecordParser>{
    public RecordParser(Environment env, io.vertx.core.parsetools.RecordParser wrappedObject) {
        super(env, wrappedObject);
    }

    public RecordParser(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
