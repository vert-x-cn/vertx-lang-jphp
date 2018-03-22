package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("BodyHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface BodyHandler<S extends io.vertx.ext.web.handler.BodyHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyHandlerImpl::new, io.vertx.ext.web.handler.BodyHandler.create()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyHandlerImpl::new, io.vertx.ext.web.handler.BodyHandler.create()
    }

    @Signature
    default Memory setBodyLimit(Environment __env__, Memory... args) {
        this.getWrappedObject().setBodyLimit(bodyLimit)
    }

    @Signature
    default Memory setUploadsDirectory(Environment __env__, Memory... args) {
        this.getWrappedObject().setUploadsDirectory(uploadsDirectory)
    }

    @Signature
    default Memory setMergeFormAttributes(Environment __env__, Memory... args) {
        this.getWrappedObject().setMergeFormAttributes(mergeFormAttributes)
    }

    @Signature
    default Memory setDeleteUploadedFilesOnEnd(Environment __env__, Memory... args) {
        this.getWrappedObject().setDeleteUploadedFilesOnEnd(deleteUploadedFilesOnEnd)
    }

}
