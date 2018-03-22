package io.vertx.php.ext.web.handler.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.handler.BodyHandler;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("BodyHandlerImpl")
@Namespace("io\\vertx\\php\\ext\\web\\handler\\impl")
public class BodyHandlerImpl extends VertxGenWrapper<io.vertx.ext.web.handler.BodyHandler> implements BodyHandler<io.vertx.ext.web.handler.BodyHandler>{
    
    public BodyHandlerImpl(Environment env, io.vertx.ext.web.handler.BodyHandler wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyHandlerImpl::new, io.vertx.ext.web.handler.BodyHandler.create()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyHandlerImpl::new, io.vertx.ext.web.handler.BodyHandler.create()
    }

    @Signature
    public Memory setBodyLimit(Environment __env__, Memory... args) {
        this.getWrappedObject().setBodyLimit(bodyLimit)
    }

    @Signature
    public Memory setUploadsDirectory(Environment __env__, Memory... args) {
        this.getWrappedObject().setUploadsDirectory(uploadsDirectory)
    }

    @Signature
    public Memory setMergeFormAttributes(Environment __env__, Memory... args) {
        this.getWrappedObject().setMergeFormAttributes(mergeFormAttributes)
    }

    @Signature
    public Memory setDeleteUploadedFilesOnEnd(Environment __env__, Memory... args) {
        this.getWrappedObject().setDeleteUploadedFilesOnEnd(deleteUploadedFilesOnEnd)
    }

}
