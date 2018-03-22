package io.vertx.php.redis;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Script")
@Namespace("io\\vertx\\php\\redis")
public interface Script<S extends io.vertx.redis.Script> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ScriptImpl::new, io.vertx.redis.Script.create(script)
    }
    
    @Signature
    default Memory getScript(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getScript()
    }
    
    @Signature
    default Memory getSha1(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSha1()
    }

}
