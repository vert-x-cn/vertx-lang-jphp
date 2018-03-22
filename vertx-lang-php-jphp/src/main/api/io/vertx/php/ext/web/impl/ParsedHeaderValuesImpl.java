package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.ParsedHeaderValues;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ParsedHeaderValuesImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class ParsedHeaderValuesImpl extends VertxGenWrapper<io.vertx.ext.web.ParsedHeaderValues> implements ParsedHeaderValues<io.vertx.ext.web.ParsedHeaderValues>{
    
    public ParsedHeaderValuesImpl(Environment env, io.vertx.ext.web.ParsedHeaderValues wrappedObject){
        super(env, wrappedObject);
    }

}
