package io.vertx.php.core.file;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("FileProps")
@Namespace("io\\vertx\\php\\core\\file")
public interface FileProps<S extends io.vertx.core.file.FileProps> extends IWrapper<S>{
    
    @Signature
    default Memory creationTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().creationTime()
    }
    
    @Signature
    default Memory lastAccessTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lastAccessTime()
    }
    
    @Signature
    default Memory lastModifiedTime(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().lastModifiedTime()
    }
    
    @Signature
    default Memory isDirectory(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isDirectory()
    }
    
    @Signature
    default Memory isOther(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isOther()
    }
    
    @Signature
    default Memory isRegularFile(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isRegularFile()
    }
    
    @Signature
    default Memory isSymbolicLink(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isSymbolicLink()
    }
    
    @Signature
    default Memory size(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().size()
    }

}
