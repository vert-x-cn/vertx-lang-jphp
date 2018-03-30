package io.vertx.php.core.dns;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("MxRecord")
@Namespace("io\\vertx\\php\\core\\dns")
@SuppressWarnings("ALL")
public class MxRecord extends VertxGenVariable0Wrapper<io.vertx.core.dns.MxRecord>{
    
    private MxRecord(Environment env, io.vertx.core.dns.MxRecord wrappedObject){
        super(env, wrappedObject);
    }
    public static  MxRecord __create(Environment env, io.vertx.core.dns.MxRecord wrappedObject){
        return new MxRecord(env, wrappedObject);
    }

    @Signature
    public Memory priority(Environment __ENV__) {
        return Utils.convReturnInteger(__ENV__, this.getWrappedObject().priority());
    }/*1*/

    @Signature
    public Memory name(Environment __ENV__) {
        return Utils.convReturnString(__ENV__, this.getWrappedObject().name());
    }/*1*/

}
