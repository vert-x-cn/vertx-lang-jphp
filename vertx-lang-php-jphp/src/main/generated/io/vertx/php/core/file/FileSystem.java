package io.vertx.php.core.file;
import io.vertx.lang.php.wrapper.AsyncResult;
import io.vertx.php.core.buffer.Buffer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Void;
import java.util.List;
import java.util.stream.Collectors;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.Closure;
import php.runtime.lang.IObject;
import php.runtime.reflection.ClassEntity;
@Name("FileSystem")
@Namespace("io\\vertx\\php\\core\\file")
public class FileSystem extends BaseWrapper<io.vertx.core.file.FileSystem> {
    
    public FileSystem(Environment env, io.vertx.core.file.FileSystem wrappedObject) {
        super(env, wrappedObject);
    }
    
    public FileSystem(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    
    public io.vertx.core.file.FileSystem getWrappedObject(){
        return this.__wrappedObject;
    }
   
    @Signature
    //false
    public FileSystem chmod(String path, String perms, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem chmodBlocking(String path, String perms){
         return this;
    }
   
    @Signature
    //false
    public FileSystem chmodRecursive(String path, String perms, String dirPerms, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem chmodRecursiveBlocking(String path, String perms, String dirPerms){
         return this;
    }
   
    @Signature
    //false
    public FileSystem chown(String path, String user, String group, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem chownBlocking(String path, String user, String group){
         return this;
    }
   
    @Signature
    //false
    public FileSystem copy(String from, String to, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem copy(String from, String to, CopyOptions options, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem copyBlocking(String from, String to){
         return this;
    }
   
    @Signature
    //false
    public FileSystem copyRecursive(String from, String to, boolean recursive, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem copyRecursiveBlocking(String from, String to, boolean recursive){
         return this;
    }
   
    @Signature
    //false
    public FileSystem createFile(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem createFile(String path, String perms, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem createFileBlocking(String path){
         return this;
    }
   
    @Signature
    //false
    public FileSystem createFileBlocking(String path, String perms){
         return this;
    }
   
    @Signature
    //false
    public FileSystem delete(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem deleteBlocking(String path){
         return this;
    }
   
    @Signature
    //false
    public FileSystem deleteRecursive(String path, boolean recursive, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem deleteRecursiveBlocking(String path, boolean recursive){
         return this;
    }
   
    @Signature
    //false
    public FileSystem exists(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public boolean existsBlocking(String path){
        return this.getWrappedObject().existsBlocking(path);
    }
   
    @Signature
    //false
    public FileSystem fsProps(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystemProps fsPropsBlocking(String path){
        return new FileSystemProps(__env__, this.getWrappedObject().fsPropsBlocking(path));
    }
   
    @Signature
    //false
    public FileSystem link(String link, String existing, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem linkBlocking(String link, String existing){
         return this;
    }
   
    @Signature
    //false
    public FileSystem lprops(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileProps lpropsBlocking(String path){
        return new FileProps(__env__, this.getWrappedObject().lpropsBlocking(path));
    }
   
    @Signature
    //false
    public FileSystem mkdir(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdir(String path, String perms, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdirBlocking(String path){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdirBlocking(String path, String perms){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdirs(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdirs(String path, String perms, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdirsBlocking(String path){
         return this;
    }
   
    @Signature
    //false
    public FileSystem mkdirsBlocking(String path, String perms){
         return this;
    }
   
    @Signature
    //false
    public FileSystem move(String from, String to, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem move(String from, String to, CopyOptions options, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem moveBlocking(String from, String to){
         return this;
    }
   
    @Signature
    //false
    public FileSystem open(String path, OpenOptions options, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public AsyncFile openBlocking(String path, OpenOptions options){
        return new AsyncFile(__env__, this.getWrappedObject().openBlocking(path,options.getWrappedObject()));
    }
   
    @Signature
    //false
    public FileSystem props(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileProps propsBlocking(String path){
        return new FileProps(__env__, this.getWrappedObject().propsBlocking(path));
    }
   
    @Signature
    //false
    public FileSystem readDir(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem readDir(String path, String filter, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public List readDirBlocking(String path){
        return this.getWrappedObject().readDirBlocking(path);
    }
   
    @Signature
    //false
    public List readDirBlocking(String path, String filter){
        return this.getWrappedObject().readDirBlocking(path,filter);
    }
   
    @Signature
    //false
    public FileSystem readFile(String path, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public Buffer readFileBlocking(String path){
        return new Buffer(__env__, this.getWrappedObject().readFileBlocking(path));
    }
   
    @Signature
    //false
    public FileSystem readSymlink(String link, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public String readSymlinkBlocking(String link){
        return this.getWrappedObject().readSymlinkBlocking(link);
    }
   
    @Signature
    //false
    public FileSystem symlink(String link, String existing, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem symlinkBlocking(String link, String existing){
         return this;
    }
   
    @Signature
    //false
    public FileSystem truncate(String path, long len, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem truncateBlocking(String path, long len){
         return this;
    }
   
    @Signature
    //false
    public FileSystem unlink(String link, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem unlinkBlocking(String link){
         return this;
    }
   
    @Signature
    //false
    public FileSystem writeFile(String path, Buffer data, Closure handler){
         return this;
    }
   
    @Signature
    //false
    public FileSystem writeFileBlocking(String path, Buffer data){
         return this;
    }

}
