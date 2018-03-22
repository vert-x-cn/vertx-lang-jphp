package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.WebSocketFrame;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("WebSocketFrameImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class WebSocketFrameImpl extends VertxGenWrapper<io.vertx.core.http.WebSocketFrame> implements WebSocketFrame<io.vertx.core.http.WebSocketFrame>{
    
    public WebSocketFrameImpl(Environment env, io.vertx.core.http.WebSocketFrame wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory binaryFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.binaryFrame(data, isFinal)
    }

    @Signature
    public static Memory textFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.textFrame(str, isFinal)
    }

    @Signature
    public static Memory pingFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.pingFrame(data)
    }

    @Signature
    public static Memory pongFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.pongFrame(data)
    }

    @Signature
    public static Memory continuationFrame(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, WebSocketFrameImpl::new, io.vertx.core.http.WebSocketFrame.continuationFrame(data, isFinal)
    }

}
