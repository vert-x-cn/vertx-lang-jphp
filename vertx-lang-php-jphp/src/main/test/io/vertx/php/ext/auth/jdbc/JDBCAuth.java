package io.vertx.php.ext.auth.jdbc;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.auth.User;
import io.vertx.php.ext.jdbc.JDBCClient;
import io.vertx.php.core.Vertx;
import io.vertx.php.ext.auth.AuthProvider;
@Name("JDBCAuth")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc")
public interface JDBCAuth<S extends io.vertx.ext.auth.jdbc.JDBCAuth> extends IWrapper<S>{

    @Signature
    default void authenticate(Environment __env__, Memory... args) {
        this.getWrappedObject().authenticate(authInfo, resultHandler)
    }

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, JDBCAuthImpl::new, io.vertx.ext.auth.jdbc.JDBCAuth.create(vertx, client)
    }

    @Signature
    default Memory setAuthenticationQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().setAuthenticationQuery(authenticationQuery)
    }

    @Signature
    default Memory setRolesQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().setRolesQuery(rolesQuery)
    }

    @Signature
    default Memory setPermissionsQuery(Environment __env__, Memory... args) {
        this.getWrappedObject().setPermissionsQuery(permissionsQuery)
    }

    @Signature
    default Memory setRolePrefix(Environment __env__, Memory... args) {
        this.getWrappedObject().setRolePrefix(rolePrefix)
    }

    @Signature
    default Memory computeHash(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().computeHash(password, salt)
    }
    
    @Signature
    default Memory generateSalt(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().generateSalt()
    }

    @Signature
    default Memory setNonces(Environment __env__, Memory... args) {
        this.getWrappedObject().setNonces(nonces)
    }

}
