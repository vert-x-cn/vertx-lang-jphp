package io.vertx.php.core.parsetools;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.ReadStream;
import io.vertx.php.core.parsetools.JsonEvent;
@Name("JsonParser")
@Namespace("io\\vertx\\php\\core\\parsetools")
public interface JsonParser<S extends io.vertx.core.parsetools.JsonParser> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    static Memory newParser(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JsonParserImpl::new, io.vertx.core.parsetools.JsonParser.newParser()
    }

    @Signature
    static Memory newParser(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JsonParserImpl::new, io.vertx.core.parsetools.JsonParser.newParser()
    }

    @Signature
    default Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(buffer)
    }
    
    @Signature
    default void end(Environment __env__, Memory... args) {
        this.getWrappedObject().end()
    }
    
    @Signature
    default Memory objectEventMode(Environment __env__, Memory... args) {
        this.getWrappedObject().objectEventMode()
    }
    
    @Signature
    default Memory objectValueMode(Environment __env__, Memory... args) {
        this.getWrappedObject().objectValueMode()
    }
    
    @Signature
    default Memory arrayEventMode(Environment __env__, Memory... args) {
        this.getWrappedObject().arrayEventMode()
    }
    
    @Signature
    default Memory arrayValueMode(Environment __env__, Memory... args) {
        this.getWrappedObject().arrayValueMode()
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

    @Signature
    default Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    default Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
