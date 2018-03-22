package io.vertx.php.ext.jdbc.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.jdbc.JDBCClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JDBCClientImpl")
@Namespace("io\\vertx\\php\\ext\\jdbc\\impl")
public class JDBCClientImpl extends VertxGenWrapper<io.vertx.ext.jdbc.JDBCClient> implements JDBCClient<io.vertx.ext.jdbc.JDBCClient>{
    
    public JDBCClientImpl(Environment env, io.vertx.ext.jdbc.JDBCClient wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory querySingle(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingle(sql, handler)
    }

    @Signature
    public Memory querySingleWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().querySingleWithParams(sql, arguments, handler)
    }

    @Signature
    public Memory getConnection(Environment __env__, Memory... args) {
        this.getWrappedObject().getConnection(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    public Memory query(Environment __env__, Memory... args) {
        this.getWrappedObject().query(sql, handler)
    }

    @Signature
    public Memory queryStream(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStream(sql, handler)
    }

    @Signature
    public Memory queryStreamWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryStreamWithParams(sql, params, handler)
    }

    @Signature
    public Memory queryWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().queryWithParams(sql, arguments, handler)
    }

    @Signature
    public Memory update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(sql, handler)
    }

    @Signature
    public Memory updateWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().updateWithParams(sql, params, handler)
    }

    @Signature
    public Memory call(Environment __env__, Memory... args) {
        this.getWrappedObject().call(sql, handler)
    }

    @Signature
    public Memory callWithParams(Environment __env__, Memory... args) {
        this.getWrappedObject().callWithParams(sql, params, outputs, handler)
    }

    @Signature
    public static Memory createNonShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCClientImpl::new, io.vertx.ext.jdbc.JDBCClient.createNonShared(vertx, config)
    }

    @Signature
    public static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCClientImpl::new, io.vertx.ext.jdbc.JDBCClient.createShared(vertx, config)
    }

}
