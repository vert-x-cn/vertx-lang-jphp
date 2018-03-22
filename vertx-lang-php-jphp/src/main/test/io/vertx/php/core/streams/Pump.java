package io.vertx.php.core.streams;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.streams.WriteStream;
import io.vertx.php.core.streams.ReadStream;
@Name("Pump")
@Namespace("io\\vertx\\php\\core\\streams")
public interface Pump<S extends io.vertx.core.streams.Pump> extends IWrapper<S>{

    @Signature
    static Memory pump(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, PumpImpl::new, io.vertx.core.streams.Pump.pump(rs, ws)
    }

    @Signature
    default Memory setWriteQueueMaxSize(Environment __env__, Memory... args) {
        this.getWrappedObject().setWriteQueueMaxSize(maxSize)
    }
    
    @Signature
    default Memory start(Environment __env__, Memory... args) {
        this.getWrappedObject().start()
    }
    
    @Signature
    default Memory stop(Environment __env__, Memory... args) {
        this.getWrappedObject().stop()
    }
    
    @Signature
    default Memory numberPumped(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().numberPumped()
    }

}
