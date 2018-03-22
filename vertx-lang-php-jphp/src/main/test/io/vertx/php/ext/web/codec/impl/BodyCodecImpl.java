package io.vertx.php.ext.web.codec.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.codec.BodyCodec;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("BodyCodecImpl")
@Namespace("io\\vertx\\php\\ext\\web\\codec\\impl")
public class BodyCodecImpl<T> extends VertxGenWrapper<io.vertx.ext.web.codec.BodyCodec<T>> implements BodyCodec<io.vertx.ext.web.codec.BodyCodec<T>, T>{
    
    public BodyCodecImpl(Environment env, io.vertx.ext.web.codec.BodyCodec<T> wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory string(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.string()
    }

    @Signature
    public static Memory string(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.string()
    }
    
    @Signature
    public static Memory buffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.buffer()
    }
    
    @Signature
    public static Memory jsonObject(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.jsonObject()
    }
    
    @Signature
    public static Memory jsonArray(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.jsonArray()
    }

    @Signature
    public static Memory json(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.json(type)
    }
    
    @Signature
    public static Memory none(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.none()
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.create(decode)
    }

    @Signature
    public static Memory pipe(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.pipe(stream)
    }

}
