package io.vertx.php.core.buffer.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("BufferImpl")
@Namespace("io\\vertx\\php\\core\\buffer\\impl")
public class BufferImpl extends VertxGenWrapper<io.vertx.core.buffer.Buffer> implements Buffer<io.vertx.core.buffer.Buffer>{
    
    public BufferImpl(Environment env, io.vertx.core.buffer.Buffer wrappedObject){
        super(env, wrappedObject);
    }
    
    @Signature
    public static Memory buffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, io.vertx.core.buffer.Buffer.buffer()
    }

    @Signature
    public static Memory buffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, io.vertx.core.buffer.Buffer.buffer()
    }

@Signature
    public String toString(){
        return this.getWrappedObject().toString();    }

    @Signature
    public Memory toString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().toString()
    }

    @Signature
    public Memory getByte(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getByte(pos)
    }

    @Signature
    public Memory getUnsignedByte(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedByte(pos)
    }

    @Signature
    public Memory getInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getInt(pos)
    }

    @Signature
    public Memory getIntLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getIntLE(pos)
    }

    @Signature
    public Memory getUnsignedInt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedInt(pos)
    }

    @Signature
    public Memory getUnsignedIntLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedIntLE(pos)
    }

    @Signature
    public Memory getLong(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getLong(pos)
    }

    @Signature
    public Memory getLongLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getLongLE(pos)
    }

    @Signature
    public Memory getDouble(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getDouble(pos)
    }

    @Signature
    public Memory getFloat(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getFloat(pos)
    }

    @Signature
    public Memory getShort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getShort(pos)
    }

    @Signature
    public Memory getShortLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getShortLE(pos)
    }

    @Signature
    public Memory getUnsignedShort(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedShort(pos)
    }

    @Signature
    public Memory getUnsignedShortLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedShortLE(pos)
    }

    @Signature
    public Memory getMedium(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMedium(pos)
    }

    @Signature
    public Memory getMediumLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getMediumLE(pos)
    }

    @Signature
    public Memory getUnsignedMedium(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedMedium(pos)
    }

    @Signature
    public Memory getUnsignedMediumLE(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getUnsignedMediumLE(pos)
    }

    @Signature
    public Memory getBuffer(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().getBuffer(start, end)
    }

    @Signature
    public Memory getString(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getString(start, end)
    }

    @Signature
    public Memory appendBuffer(Environment __env__, Memory... args) {
        this.getWrappedObject().appendBuffer(buff)
    }

    @Signature
    public Memory appendByte(Environment __env__, Memory... args) {
        this.getWrappedObject().appendByte(b)
    }

    @Signature
    public Memory appendUnsignedByte(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedByte(b)
    }

    @Signature
    public Memory appendInt(Environment __env__, Memory... args) {
        this.getWrappedObject().appendInt(i)
    }

    @Signature
    public Memory appendIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendIntLE(i)
    }

    @Signature
    public Memory appendUnsignedInt(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedInt(i)
    }

    @Signature
    public Memory appendUnsignedIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedIntLE(i)
    }

    @Signature
    public Memory appendMedium(Environment __env__, Memory... args) {
        this.getWrappedObject().appendMedium(i)
    }

    @Signature
    public Memory appendMediumLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendMediumLE(i)
    }

    @Signature
    public Memory appendLong(Environment __env__, Memory... args) {
        this.getWrappedObject().appendLong(l)
    }

    @Signature
    public Memory appendLongLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendLongLE(l)
    }

    @Signature
    public Memory appendShort(Environment __env__, Memory... args) {
        this.getWrappedObject().appendShort(s)
    }

    @Signature
    public Memory appendShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendShortLE(s)
    }

    @Signature
    public Memory appendUnsignedShort(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedShort(s)
    }

    @Signature
    public Memory appendUnsignedShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().appendUnsignedShortLE(s)
    }

    @Signature
    public Memory appendFloat(Environment __env__, Memory... args) {
        this.getWrappedObject().appendFloat(f)
    }

    @Signature
    public Memory appendDouble(Environment __env__, Memory... args) {
        this.getWrappedObject().appendDouble(d)
    }

    @Signature
    public Memory appendString(Environment __env__, Memory... args) {
        this.getWrappedObject().appendString(str)
    }

    @Signature
    public Memory setByte(Environment __env__, Memory... args) {
        this.getWrappedObject().setByte(pos, b)
    }

    @Signature
    public Memory setUnsignedByte(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedByte(pos, b)
    }

    @Signature
    public Memory setInt(Environment __env__, Memory... args) {
        this.getWrappedObject().setInt(pos, i)
    }

    @Signature
    public Memory setIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setIntLE(pos, i)
    }

    @Signature
    public Memory setUnsignedInt(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedInt(pos, i)
    }

    @Signature
    public Memory setUnsignedIntLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedIntLE(pos, i)
    }

    @Signature
    public Memory setMedium(Environment __env__, Memory... args) {
        this.getWrappedObject().setMedium(pos, i)
    }

    @Signature
    public Memory setMediumLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setMediumLE(pos, i)
    }

    @Signature
    public Memory setLong(Environment __env__, Memory... args) {
        this.getWrappedObject().setLong(pos, l)
    }

    @Signature
    public Memory setLongLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setLongLE(pos, l)
    }

    @Signature
    public Memory setDouble(Environment __env__, Memory... args) {
        this.getWrappedObject().setDouble(pos, d)
    }

    @Signature
    public Memory setFloat(Environment __env__, Memory... args) {
        this.getWrappedObject().setFloat(pos, f)
    }

    @Signature
    public Memory setShort(Environment __env__, Memory... args) {
        this.getWrappedObject().setShort(pos, s)
    }

    @Signature
    public Memory setShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setShortLE(pos, s)
    }

    @Signature
    public Memory setUnsignedShort(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedShort(pos, s)
    }

    @Signature
    public Memory setUnsignedShortLE(Environment __env__, Memory... args) {
        this.getWrappedObject().setUnsignedShortLE(pos, s)
    }

    @Signature
    public Memory setBuffer(Environment __env__, Memory... args) {
        this.getWrappedObject().setBuffer(pos, b)
    }

    @Signature
    public Memory setString(Environment __env__, Memory... args) {
        this.getWrappedObject().setString(pos, str)
    }

    @Signature
    public Memory slice(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, BufferImpl::new, this.getWrappedObject().slice()
    }

}
