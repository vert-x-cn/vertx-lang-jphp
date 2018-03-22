package io.vertx.php.core.file.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.file.FileSystemProps;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FileSystemPropsImpl")
@Namespace("io\\vertx\\php\\core\\file\\impl")
public class FileSystemPropsImpl extends VertxGenWrapper<io.vertx.core.file.FileSystemProps> implements FileSystemProps<io.vertx.core.file.FileSystemProps>{
    
    public FileSystemPropsImpl(Environment env, io.vertx.core.file.FileSystemProps wrappedObject){
        super(env, wrappedObject);
    }

}
