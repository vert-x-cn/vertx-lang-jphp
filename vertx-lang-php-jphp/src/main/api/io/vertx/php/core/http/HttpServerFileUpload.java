package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
@Name("HttpServerFileUpload")
@Namespace("io\\vertx\\php\\core\\http")
public interface HttpServerFileUpload<S extends io.vertx.core.http.HttpServerFileUpload> extends IWrapper<S>{

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }
    
    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory streamToFileSystem(Environment __env__, Memory... args) {
        this.getWrappedObject().streamToFileSystem(filename)
    }
    
    @Signature
    default Memory filename(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().filename()
    }
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }
    
    @Signature
    default Memory contentType(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().contentType()
    }
    
    @Signature
    default Memory contentTransferEncoding(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().contentTransferEncoding()
    }
    
    @Signature
    default Memory charset(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().charset()
    }
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
    }
    
    @Signature
    default Memory isSizeAvailable(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSizeAvailable()
    }

}
