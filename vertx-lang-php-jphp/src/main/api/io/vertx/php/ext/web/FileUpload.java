package io.vertx.php.ext.web;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("FileUpload")
@Namespace("io\\vertx\\php\\ext\\web")
public interface FileUpload<S extends io.vertx.ext.web.FileUpload> extends IWrapper<S>{
    
    @Signature
    default Memory name(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().name()
    }
    
    @Signature
    default Memory uploadedFileName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().uploadedFileName()
    }
    
    @Signature
    default Memory fileName(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().fileName()
    }
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
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
    default Memory charSet(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().charSet()
    }

}
