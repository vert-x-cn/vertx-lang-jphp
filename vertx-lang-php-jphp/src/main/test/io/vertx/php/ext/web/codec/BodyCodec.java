package io.vertx.php.ext.web.codec;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.streams.WriteStream;
@Name("BodyCodec")
@Namespace("io\\vertx\\php\\ext\\web\\codec")
public interface BodyCodec<S extends io.vertx.ext.web.codec.BodyCodec<T>, T> extends IWrapper<S>{
    
    @Signature
    static Memory string(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.string()
    }

    @Signature
    static Memory string(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.string()
    }
    
    @Signature
    static Memory buffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.buffer()
    }
    
    @Signature
    static Memory jsonObject(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.jsonObject()
    }
    
    @Signature
    static Memory jsonArray(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.jsonArray()
    }

    @Signature
    static Memory json(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.json(type)
    }
    
    @Signature
    static Memory none(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.none()
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.create(decode)
    }

    @Signature
    static Memory pipe(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BodyCodecImpl::new, io.vertx.ext.web.codec.BodyCodec.pipe(stream)
    }

}
