package io.vertx.php.ext.auth.jdbc.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.jdbc.JDBCHashStrategy;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JDBCHashStrategyImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc\\impl")
public class JDBCHashStrategyImpl extends VertxGenWrapper<io.vertx.ext.auth.jdbc.JDBCHashStrategy> implements JDBCHashStrategy<io.vertx.ext.auth.jdbc.JDBCHashStrategy>{
    
    public JDBCHashStrategyImpl(Environment env, io.vertx.ext.auth.jdbc.JDBCHashStrategy wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory createSHA512(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCHashStrategyImpl::new, io.vertx.ext.auth.jdbc.JDBCHashStrategy.createSHA512(vertx)
    }

    @Signature
    public static Memory createPBKDF2(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCHashStrategyImpl::new, io.vertx.ext.auth.jdbc.JDBCHashStrategy.createPBKDF2(vertx)
    }

    @Signature
    public Memory computeHash(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().computeHash(password, salt, version)
    }

    @Signature
    public Memory getHashedStoredPwd(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getHashedStoredPwd(row)
    }

    @Signature
    public Memory getSalt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getSalt(row)
    }

    @Signature
    public void setNonces(Environment __env__, Memory... args) {
        this.getWrappedObject().setNonces(nonces)
    }

    @Signature
    public static Memory isEqual(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, io.vertx.ext.auth.jdbc.JDBCHashStrategy.isEqual(hasha, hashb)
    }

}
