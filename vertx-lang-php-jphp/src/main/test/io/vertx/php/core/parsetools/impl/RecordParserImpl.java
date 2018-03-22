package io.vertx.php.core.parsetools.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.parsetools.RecordParser;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("RecordParserImpl")
@Namespace("io\\vertx\\php\\core\\parsetools\\impl")
public class RecordParserImpl extends VertxGenWrapper<io.vertx.core.parsetools.RecordParser> implements RecordParser<io.vertx.core.parsetools.RecordParser>{
    
    public RecordParserImpl(Environment env, io.vertx.core.parsetools.RecordParser wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void setOutput(Environment __env__, Memory... args) {
        this.getWrappedObject().setOutput(output)
    }

    @Signature
    public static Memory newDelimited(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RecordParserImpl::new, io.vertx.core.parsetools.RecordParser.newDelimited(delim)
    }

    @Signature
    public static Memory newFixed(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, RecordParserImpl::new, io.vertx.core.parsetools.RecordParser.newFixed(size)
    }

    @Signature
    public void delimitedMode(Environment __env__, Memory... args) {
        this.getWrappedObject().delimitedMode(delim)
    }

    @Signature
    public void fixedSizeMode(Environment __env__, Memory... args) {
        this.getWrappedObject().fixedSizeMode(size)
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(buffer)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

}
