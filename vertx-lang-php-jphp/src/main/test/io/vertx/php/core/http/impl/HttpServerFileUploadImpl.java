package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpServerFileUpload;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServerFileUploadImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpServerFileUploadImpl extends VertxGenWrapper<io.vertx.core.http.HttpServerFileUpload> implements HttpServerFileUpload<io.vertx.core.http.HttpServerFileUpload>{
    
    public HttpServerFileUploadImpl(Environment env, io.vertx.core.http.HttpServerFileUpload wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory streamToFileSystem(Environment __env__, Memory... args) {
        this.getWrappedObject().streamToFileSystem(filename)
    }

}
