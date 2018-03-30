package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ServerFrame")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class ServerFrame extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.ServerFrame>{
    
    private ServerFrame(Environment env, io.vertx.ext.stomp.ServerFrame wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServerFrame __create(Environment env, io.vertx.ext.stomp.ServerFrame wrappedObject){
        return new ServerFrame(env, wrappedObject);
    }

    @Signature
    public Memory frame(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, Frame::new, this.getWrappedObject().frame());
    }/*1*/

    @Signature
    public Memory connection(Environment __ENV__) {
        return Utils.<io.vertx.ext.stomp.StompServerConnection, StompServerConnection>convReturnVertxGenVariable0(__ENV__, StompServerConnection.class, StompServerConnection::__create, this.getWrappedObject().connection());
    }/*1*/

}
