package io.vertx.php.core.http;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("HttpFrame")
@Namespace("io\\vertx\\php\\core\\http")
@SuppressWarnings("ALL")
public class HttpFrame extends VertxGenVariable0Wrapper<io.vertx.core.http.HttpFrame>{
    
    private HttpFrame(Environment env, io.vertx.core.http.HttpFrame wrappedObject){
        super(env, wrappedObject);
    }
    public static  HttpFrame __create(Environment env, io.vertx.core.http.HttpFrame wrappedObject){
        return new HttpFrame(env, wrappedObject);
    }

    @Signature
    public Memory type(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().type());
    }/*1*/

    @Signature
    public Memory flags(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().flags());
    }/*1*/

    @Signature
    public Memory payload(Environment __ENV__) {
        return Utils.<io.vertx.core.buffer.Buffer, Buffer>convReturnVertxGenVariable0(__ENV__, Buffer.class, Buffer::__create, this.getWrappedObject().payload());
    }/*1*/

}
