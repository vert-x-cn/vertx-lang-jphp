package io.vertx.php.ext.stomp;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.DataObjectConverter;
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
@Name("Acknowledgement")
@Namespace("io\\vertx\\php\\ext\\stomp")
@SuppressWarnings("ALL")
public class Acknowledgement extends VertxGenVariable0Wrapper<io.vertx.ext.stomp.Acknowledgement>{
    
    private Acknowledgement(Environment env, io.vertx.ext.stomp.Acknowledgement wrappedObject){
        super(env, wrappedObject);
    }
    public static  Acknowledgement __create(Environment env, io.vertx.ext.stomp.Acknowledgement wrappedObject){
        return new Acknowledgement(env, wrappedObject);
    }

    @Signature
    public Memory subscription(Environment __ENV__) {
        return Utils.convReturnDataObject(__ENV__, io.vertx.ext.stomp.Frame.class, Frame::new, this.getWrappedObject().subscription());
    }/*1*/

    @Signature
    public Memory frames(Environment __ENV__) {
        return Utils.convReturnList(__ENV__, DataObjectConverter.create(io.vertx.ext.stomp.Frame.class),this.getWrappedObject().frames());
    }/*1*/

}
