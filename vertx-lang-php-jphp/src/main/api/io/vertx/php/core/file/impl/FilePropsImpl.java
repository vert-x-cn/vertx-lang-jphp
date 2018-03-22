package io.vertx.php.core.file.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.file.FileProps;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FilePropsImpl")
@Namespace("io\\vertx\\php\\core\\file\\impl")
public class FilePropsImpl extends VertxGenWrapper<io.vertx.core.file.FileProps> implements FileProps<io.vertx.core.file.FileProps>{
    
    public FilePropsImpl(Environment env, io.vertx.core.file.FileProps wrappedObject){
        super(env, wrappedObject);
    }

}
