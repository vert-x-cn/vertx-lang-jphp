package io.vertx.php.core.http;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
@Name("WebSocketFrame")
@Namespace("io\\vertx\\php\\core\\http")
public interface WebSocketFrame<S extends io.vertx.core.http.WebSocketFrame> extends IWrapper<S>{

    @Signature
    static Memory binaryFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.binaryFrame(data, isFinal)
    }

    @Signature
    static Memory textFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.textFrame(str, isFinal)
    }

    @Signature
    static Memory pingFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.pingFrame(data)
    }

    @Signature
    static Memory pongFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.pongFrame(data)
    }

    @Signature
    static Memory continuationFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.continuationFrame(data, isFinal)
    }
    
    @Signature
    default Memory isText(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isText()
    }
    
    @Signature
    default Memory isBinary(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isBinary()
    }
    
    @Signature
    default Memory isContinuation(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isContinuation()
    }
    
    @Signature
    default Memory isClose(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isClose()
    }
    
    @Signature
    default Memory textData(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().textData()
    }
    
    @Signature
    default Memory binaryData(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().binaryData()
    }
    
    @Signature
    default Memory isFinal(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isFinal()
    }
    
    @Signature
    default Memory closeStatusCode(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().closeStatusCode()
    }
    
    @Signature
    default Memory closeReason(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().closeReason()
    }

}
