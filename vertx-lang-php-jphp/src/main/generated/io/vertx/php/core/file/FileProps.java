package io.vertx.php.core.file;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("FileProps")
@Namespace("io\\vertx\\php\\core\\file")
public class FileProps extends BaseWrapper<io.vertx.core.file.FileProps> {
    
    public FileProps(Environment env, io.vertx.core.file.FileProps wrappedObject) {
        super(env, wrappedObject);
    }
    
    public FileProps(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.file.FileProps getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public long creationTime(){
        return this.getWrappedObject().creationTime();
    }
   
    @Signature
    //false
    public boolean isDirectory(){
        return this.getWrappedObject().isDirectory();
    }
   
    @Signature
    //false
    public boolean isOther(){
        return this.getWrappedObject().isOther();
    }
   
    @Signature
    //false
    public boolean isRegularFile(){
        return this.getWrappedObject().isRegularFile();
    }
   
    @Signature
    //false
    public boolean isSymbolicLink(){
        return this.getWrappedObject().isSymbolicLink();
    }
   
    @Signature
    //false
    public long lastAccessTime(){
        return this.getWrappedObject().lastAccessTime();
    }
   
    @Signature
    //false
    public long lastModifiedTime(){
        return this.getWrappedObject().lastModifiedTime();
    }
   
    @Signature
    //false
    public long size(){
        return this.getWrappedObject().size();
    }

}
