package io.vertx.php.ext.stomp;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.stomp.StompServerConnection;
@Name("Frames")
@Namespace("io\\vertx\\php\\ext\\stomp")
public interface Frames<S extends io.vertx.ext.stomp.Frames> extends IWrapper<S>{

    @Signature
    static Memory createErrorFrame(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.stomp.Frames.createErrorFrame(message, headers, body)
    }

    @Signature
    static Memory createReceiptFrame(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.stomp.Frames.createReceiptFrame(receiptId, headers)
    }

    @Signature
    static void handleReceipt(Environment __env__, Memory... args) {
        io.vertx.ext.stomp.Frames.handleReceipt(frame, connection)
    }
    
    @Signature
    static Memory ping(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.stomp.Frames.ping()
    }

}
