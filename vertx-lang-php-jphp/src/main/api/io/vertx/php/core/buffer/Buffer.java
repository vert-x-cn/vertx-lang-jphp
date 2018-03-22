package io.vertx.php.core.buffer;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
@Name("Buffer")
@Namespace("io\\vertx\\php\\core\\buffer")
public interface Buffer<S extends io.vertx.core.buffer.Buffer> extends IWrapper<S>{
    
    @Signature
    static Memory buffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, io.vertx.core.buffer.Buffer.buffer()
    }

    @Signature
    static Memory buffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, io.vertx.core.buffer.Buffer.buffer()
    }

    @Signature
    default Memory toString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().toString()
    }
    
    @Signature
    default Memory toJsonObject(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().toJsonObject()
    }
    
    @Signature
    default Memory toJsonArray(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().toJsonArray()
    }

    @Signature
    default Memory getByte(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getByte(pos)
    }

    @Signature
    default Memory getUnsignedByte(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedByte(pos)
    }

    @Signature
    default Memory getInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getInt(pos)
    }

    @Signature
    default Memory getIntLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getIntLE(pos)
    }

    @Signature
    default Memory getUnsignedInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedInt(pos)
    }

    @Signature
    default Memory getUnsignedIntLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedIntLE(pos)
    }

    @Signature
    default Memory getLong(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getLong(pos)
    }

    @Signature
    default Memory getLongLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getLongLE(pos)
    }

    @Signature
    default Memory getDouble(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getDouble(pos)
    }

    @Signature
    default Memory getFloat(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getFloat(pos)
    }

    @Signature
    default Memory getShort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getShort(pos)
    }

    @Signature
    default Memory getShortLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getShortLE(pos)
    }

    @Signature
    default Memory getUnsignedShort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedShort(pos)
    }

    @Signature
    default Memory getUnsignedShortLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedShortLE(pos)
    }

    @Signature
    default Memory getMedium(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMedium(pos)
    }

    @Signature
    default Memory getMediumLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMediumLE(pos)
    }

    @Signature
    default Memory getUnsignedMedium(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedMedium(pos)
    }

    @Signature
    default Memory getUnsignedMediumLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedMediumLE(pos)
    }

    @Signature
    default Memory getBuffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().getBuffer(start, end)
    }

    @Signature
    default Memory getString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getString(start, end)
    }

    @Signature
    default Memory appendBuffer(Environment __env__, Memory... args) {
        this.getWrappedObject().appendBuffer(buff)
    }

    @Signature
    default Memory appendByte(Environment __env__, Memory... args) {
        this.getWrappedObject().appendByte(b)
    }

    @Signature
    default Memory appendUnsignedByte(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedByte(b)
    }

    @Signature
    default Memory appendInt(Environment __env__, Memory... args) {
        this.getWrappedObject().appendInt(i)
    }

    @Signature
    default Memory appendIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendIntLE(i)
    }

    @Signature
    default Memory appendUnsignedInt(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedInt(i)
    }

    @Signature
    default Memory appendUnsignedIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedIntLE(i)
    }

    @Signature
    default Memory appendMedium(Environment __env__, Memory... args) {
        this.getWrappedObject().appendMedium(i)
    }

    @Signature
    default Memory appendMediumLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendMediumLE(i)
    }

    @Signature
    default Memory appendLong(Environment __env__, Memory... args) {
        this.getWrappedObject().appendLong(l)
    }

    @Signature
    default Memory appendLongLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendLongLE(l)
    }

    @Signature
    default Memory appendShort(Environment __env__, Memory... args) {
        this.getWrappedObject().appendShort(s)
    }

    @Signature
    default Memory appendShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendShortLE(s)
    }

    @Signature
    default Memory appendUnsignedShort(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedShort(s)
    }

    @Signature
    default Memory appendUnsignedShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedShortLE(s)
    }

    @Signature
    default Memory appendFloat(Environment __env__, Memory... args) {
        this.getWrappedObject().appendFloat(f)
    }

    @Signature
    default Memory appendDouble(Environment __env__, Memory... args) {
        this.getWrappedObject().appendDouble(d)
    }

    @Signature
    default Memory appendString(Environment __env__, Memory... args) {
        this.getWrappedObject().appendString(str)
    }

    @Signature
    default Memory setByte(Environment __env__, Memory... args) {
        this.getWrappedObject().setByte(pos, b)
    }

    @Signature
    default Memory setUnsignedByte(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedByte(pos, b)
    }

    @Signature
    default Memory setInt(Environment __env__, Memory... args) {
        this.getWrappedObject().setInt(pos, i)
    }

    @Signature
    default Memory setIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setIntLE(pos, i)
    }

    @Signature
    default Memory setUnsignedInt(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedInt(pos, i)
    }

    @Signature
    default Memory setUnsignedIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedIntLE(pos, i)
    }

    @Signature
    default Memory setMedium(Environment __env__, Memory... args) {
        this.getWrappedObject().setMedium(pos, i)
    }

    @Signature
    default Memory setMediumLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setMediumLE(pos, i)
    }

    @Signature
    default Memory setLong(Environment __env__, Memory... args) {
        this.getWrappedObject().setLong(pos, l)
    }

    @Signature
    default Memory setLongLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setLongLE(pos, l)
    }

    @Signature
    default Memory setDouble(Environment __env__, Memory... args) {
        this.getWrappedObject().setDouble(pos, d)
    }

    @Signature
    default Memory setFloat(Environment __env__, Memory... args) {
        this.getWrappedObject().setFloat(pos, f)
    }

    @Signature
    default Memory setShort(Environment __env__, Memory... args) {
        this.getWrappedObject().setShort(pos, s)
    }

    @Signature
    default Memory setShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setShortLE(pos, s)
    }

    @Signature
    default Memory setUnsignedShort(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedShort(pos, s)
    }

    @Signature
    default Memory setUnsignedShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedShortLE(pos, s)
    }

    @Signature
    default Memory setBuffer(Environment __env__, Memory... args) {
        this.getWrappedObject().setBuffer(pos, b)
    }

    @Signature
    default Memory setString(Environment __env__, Memory... args) {
        this.getWrappedObject().setString(pos, str)
    }
    
    @Signature
    default Memory length(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().length()
    }
    
    @Signature
    default Memory copy(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().copy()
    }
    
    @Signature
    default Memory slice(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().slice()
    }

    @Signature
    default Memory slice(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().slice()
    }

}
