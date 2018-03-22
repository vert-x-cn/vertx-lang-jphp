package io.vertx.php.ext.auth.jdbc.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.jdbc.JDBCAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("JDBCAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc\\impl")
public class JDBCAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.jdbc.JDBCAuth> implements JDBCAuth<io.vertx.ext.auth.jdbc.JDBCAuth>{
    
    public JDBCAuthImpl(Environment env, io.vertx.ext.auth.jdbc.JDBCAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCAuthImpl::new, io.vertx.ext.auth.jdbc.JDBCAuth.create(vertx, client)
    }

    @Signature
    public Memory setAuthenticationQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().setAuthenticationQuery(authenticationQuery)
    }

    @Signature
    public Memory setRolesQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().setRolesQuery(rolesQuery)
    }

    @Signature
    public Memory setPermissionsQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().setPermissionsQuery(permissionsQuery)
    }

    @Signature
    public Memory setRolePrefix(Environment __env__, Memory... args) {
        this.getWrappedObject().setRolePrefix(rolePrefix)
    }

    @Signature
    public Memory computeHash(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().computeHash(password, salt)
    }

    @Signature
    public Memory setNonces(Environment __env__, Memory... args) {
        this.getWrappedObject().setNonces(nonces)
    }

}
