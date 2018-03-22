package io.vertx.php.core.parsetools;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
@Name("RecordParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
public interface RecordParser<S extends io.vertx.core.parsetools.RecordParser> extends IWrapper<S>{

    @Signature
    default void setOutput(Environment __env__, Memory... args) {
        this.getWrappedObject().setOutput(output)
    }

    @Signature
    static Memory newDelimited(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RecordParserImpl::new, io.vertx.core.parsetools.RecordParser.newDelimited(delim)
    }

    @Signature
    static Memory newFixed(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RecordParserImpl::new, io.vertx.core.parsetools.RecordParser.newFixed(size)
    }

    @Signature
    default void delimitedMode(Environment __env__, Memory... args) {
        this.getWrappedObject().delimitedMode(delim)
    }

    @Signature
    default void fixedSizeMode(Environment __env__, Memory... args) {
        this.getWrappedObject().fixedSizeMode(size)
    }

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(buffer)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }
    
    @Signature
    default Memory pause(Environment __env__, Memory... args) {
        this.getWrappedObject().pause()
    }
    
    @Signature
    default Memory resume(Environment __env__, Memory... args) {
        this.getWrappedObject().resume()
    }

    @Signature
    default Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

}
