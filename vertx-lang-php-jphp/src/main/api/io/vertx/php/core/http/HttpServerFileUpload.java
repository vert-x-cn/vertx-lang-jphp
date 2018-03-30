package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.converter.VertxGenVariable0Converter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpServerFileUpload")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class HttpServerFileUpload extends VertxGenVariable0Wrapper<io.vertx.core.http.HttpServerFileUpload>{
    
    private HttpServerFileUpload(Environment env, io.vertx.core.http.HttpServerFileUpload wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpServerFileUpload __create(Environment env, io.vertx.core.http.HttpServerFileUpload wrappedObject){
        return new HttpServerFileUpload(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().exceptionHandler(Utils.convParamHandler(__ENV__, TypeConverter.THROWABLE, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory handler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().handler(Utils.convParamHandler(__ENV__, VertxGenVariable0Converter.<io.vertx.core.buffer.Buffer, Buffer>create0(Buffer.class, Buffer::__create), arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory endHandler(Environment __ENV__, Memory arg0) {
        if(Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().endHandler(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory pause(Environment __ENV__) {
        this.getWrappedObject().pause();
        return toMemory();
    }/*1*/

    @Signature
    public Memory resume(Environment __ENV__) {
        this.getWrappedObject().resume();
        return toMemory();
    }/*1*/

    @Signature
    public Memory streamToFileSystem(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().streamToFileSystem(Utils.convParamString(__ENV__, arg0));
            return toMemory();
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public Memory filename(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().filename());
    }/*1*/

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
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
    public Memory charset(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().charset());
    }/*1*/

    @Signature
    public Memory size(Environment __ENV__) {
        return Utils.convReturnLong(__ENV__, this.getWrappedObject().size());
    }/*1*/

    @Signature
    public Memory isSizeAvailable(Environment __ENV__) {
        return Utils.convReturnBoolean(__ENV__, this.getWrappedObject().isSizeAvailable());
    }/*1*/

}
