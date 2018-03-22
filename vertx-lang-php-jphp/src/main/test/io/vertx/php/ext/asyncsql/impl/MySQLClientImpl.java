package io.vertx.php.ext.asyncsql.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.asyncsql.MySQLClient;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MySQLClientImpl")
@Namespace("io\\vertx\\php\\ext\\asyncsql\\impl")
public class MySQLClientImpl extends VertxGenWrapper<io.vertx.ext.asyncsql.MySQLClient> implements MySQLClient<io.vertx.ext.asyncsql.MySQLClient>{
    
    public MySQLClientImpl(Environment env, io.vertx.ext.asyncsql.MySQLClient wrappedObject){
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
        return Utils.convReturnVertxGen(__env__, AsyncSQLClientImpl::new, io.vertx.ext.asyncsql.MySQLClient.createNonShared(vertx, config)
    }

    @Signature
    public static Memory createShared(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AsyncSQLClientImpl::new, io.vertx.ext.asyncsql.MySQLClient.createShared(vertx, config)
    }

}
