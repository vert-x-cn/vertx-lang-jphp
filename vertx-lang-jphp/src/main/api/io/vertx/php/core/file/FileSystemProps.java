package io.vertx.php.core.file;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("FileSystemProps")
@Namespace("io\\vertx\\php\\core\\file")
@SuppressWarnings("ALL")
public class FileSystemProps extends VertxGenVariable0Wrapper<io.vertx.core.file.FileSystemProps>{
    
    private FileSystemProps(Environment env, io.vertx.core.file.FileSystemProps wrappedObject){
        super(env, wrappedObject);
    }
    public static  FileSystemProps __create(Environment env, io.vertx.core.file.FileSystemProps wrappedObject){
        return new FileSystemProps(env, wrappedObject);
    }

    @Signature
    public Memory totalSpace(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().totalSpace());
    }/*1*/

    @Signature
    public Memory unallocatedSpace(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().unallocatedSpace());
    }/*1*/

    @Signature
    public Memory usableSpace(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().usableSpace());
    }/*1*/

}
