package io.vertx.php.ext.web;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FileUpload")
@Namespace("io\\vertx\\php\\ext\\web")
@SuppressWarnings("ALL")
public class FileUpload extends VertxGenVariable0Wrapper<io.vertx.ext.web.FileUpload>{
    
    private FileUpload(Environment env, io.vertx.ext.web.FileUpload wrappedObject){
        super(env, wrappedObject);
    }
    public static  FileUpload __create(Environment env, io.vertx.ext.web.FileUpload wrappedObject){
        return new FileUpload(env, wrappedObject);
    }

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

    @Signature
    public Memory uploadedFileName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().uploadedFileName());
    }/*1*/

    @Signature
    public Memory fileName(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().fileName());
    }/*1*/

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().size());
    }/*1*/

    @Signature
    public Memory contentType(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().contentType());
    }/*1*/

    @Signature
    public Memory contentTransferEncoding(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().contentTransferEncoding());
    }/*1*/

    @Signature
    public Memory charSet(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().charSet());
    }/*1*/

}
