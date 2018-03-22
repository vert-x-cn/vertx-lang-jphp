package io.vertx.php.core.file;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("FileSystemProps")
@Namespace("io\\vertx\\php\\core\\file")
public interface FileSystemProps<S extends io.vertx.core.file.FileSystemProps> extends IWrapper<S>{
    
    @Signature
    default Memory totalSpace(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().totalSpace()
    }
    
    @Signature
    default Memory unallocatedSpace(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().unallocatedSpace()
    }
    
    @Signature
    default Memory usableSpace(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().usableSpace()
    }

}
