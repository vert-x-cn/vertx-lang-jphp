package io.vertx.php.ext.auth.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.User;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("UserImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\impl")
public class UserImpl extends VertxGenWrapper<io.vertx.ext.auth.User> implements User<io.vertx.ext.auth.User>{
    
    public UserImpl(Environment env, io.vertx.ext.auth.User wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory isAuthorized(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorized(authority, resultHandler)
    }

    @Signature
    public Memory isAuthorised(Environment __env__, Memory... args) {
        this.getWrappedObject().isAuthorised(authority, resultHandler)
    }

    @Signature
    public void setAuthProvider(Environment __env__, Memory... args) {
        this.getWrappedObject().setAuthProvider(authProvider)
    }

}
