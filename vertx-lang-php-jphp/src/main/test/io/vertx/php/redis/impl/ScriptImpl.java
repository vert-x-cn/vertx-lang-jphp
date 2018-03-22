package io.vertx.php.redis.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.redis.Script;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ScriptImpl")
@Namespace("io\\vertx\\php\\redis\\impl")
public class ScriptImpl extends VertxGenWrapper<io.vertx.redis.Script> implements Script<io.vertx.redis.Script>{
    
    public ScriptImpl(Environment env, io.vertx.redis.Script wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ScriptImpl::new, io.vertx.redis.Script.create(script)
    }

}
