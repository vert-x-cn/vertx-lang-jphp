package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.Frames;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FramesImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class FramesImpl extends VertxGenWrapper<io.vertx.ext.stomp.Frames> implements Frames<io.vertx.ext.stomp.Frames>{
    
    public FramesImpl(Environment env, io.vertx.ext.stomp.Frames wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createErrorFrame(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.stomp.Frames.createErrorFrame(message, headers, body)
    }

    @Signature
    public static Memory createReceiptFrame(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.stomp.Frames.createReceiptFrame(receiptId, headers)
    }

    @Signature
    public static void handleReceipt(Environment __env__, Memory... args) {
        io.vertx.ext.stomp.Frames.handleReceipt(frame, connection)
    }
    
    @Signature
    public static Memory ping(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.stomp.Frames.ping()
    }

}
