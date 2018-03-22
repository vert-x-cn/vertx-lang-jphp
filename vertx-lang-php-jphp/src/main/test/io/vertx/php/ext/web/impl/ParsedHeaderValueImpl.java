package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.ParsedHeaderValue;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ParsedHeaderValueImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class ParsedHeaderValueImpl extends VertxGenWrapper<io.vertx.ext.web.ParsedHeaderValue> implements ParsedHeaderValue<io.vertx.ext.web.ParsedHeaderValue>{
    
    public ParsedHeaderValueImpl(Environment env, io.vertx.ext.web.ParsedHeaderValue wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory parameter(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().parameter(key)
    }

    @Signature
    public Memory isMatchedBy(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMatchedBy(matchTry)
    }

}
