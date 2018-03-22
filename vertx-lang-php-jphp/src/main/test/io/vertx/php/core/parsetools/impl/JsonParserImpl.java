package io.vertx.php.core.parsetools.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.parsetools.JsonParser;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JsonParserImpl")
@Namespace("io\\vertx\\php\\core\\parsetools\\impl")
public class JsonParserImpl extends VertxGenWrapper<io.vertx.core.parsetools.JsonParser> implements JsonParser<io.vertx.core.parsetools.JsonParser>{
    
    public JsonParserImpl(Environment env, io.vertx.core.parsetools.JsonParser wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    public static Memory newParser(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JsonParserImpl::new, io.vertx.core.parsetools.JsonParser.newParser()
    }

    @Signature
    public static Memory newParser(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JsonParserImpl::new, io.vertx.core.parsetools.JsonParser.newParser()
    }

    @Signature
    public Memory write(Environment __env__, Memory... args) {
        this.getWrappedObject().write(buffer)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

}
