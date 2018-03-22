package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.FileUpload;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FileUploadImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class FileUploadImpl extends VertxGenWrapper<io.vertx.ext.web.FileUpload> implements FileUpload<io.vertx.ext.web.FileUpload>{
    
    public FileUploadImpl(Environment env, io.vertx.ext.web.FileUpload wrappedObject){
        super(env, wrappedObject);
    }

}
