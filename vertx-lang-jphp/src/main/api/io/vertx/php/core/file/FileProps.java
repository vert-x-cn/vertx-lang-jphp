package io.vertx.php.core.file;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("FileProps")
@Namespace("io\\vertx\\php\\core\\file")
@SuppressWarnings("ALL")
public class FileProps extends VertxGenVariable0Wrapper<io.vertx.core.file.FileProps>{
    
    private FileProps(Environment env, io.vertx.core.file.FileProps wrappedObject){
        super(env, wrappedObject);
    }
    public static  FileProps __create(Environment env, io.vertx.core.file.FileProps wrappedObject){
        return new FileProps(env, wrappedObject);
    }

    @Signature
    public Memory creationTime(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().creationTime());
    }/*1*/

    @Signature
    public Memory lastAccessTime(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().lastAccessTime());
    }/*1*/

    @Signature
    public Memory lastModifiedTime(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().lastModifiedTime());
    }/*1*/

    @Signature
    public Memory isDirectory(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isDirectory());
    }/*1*/

    @Signature
    public Memory isOther(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isOther());
    }/*1*/

    @Signature
    public Memory isRegularFile(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isRegularFile());
    }/*1*/

    @Signature
    public Memory isSymbolicLink(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSymbolicLink());
    }/*1*/

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().size());
    }/*1*/

}
