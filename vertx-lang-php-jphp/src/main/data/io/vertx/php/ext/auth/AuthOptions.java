package io.vertx.php.ext.auth;

import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("AuthOptions")
@Namespace("io\\vertx\\php\\ext\\auth")
//true
public  class AuthOptions extends DataObjectWrapper<io.vertx.ext.auth.AuthOptions> { 
    public AuthOptions(Environment env, io.vertx.ext.auth.AuthOptions wrappedObject) {
        super(env, wrappedObject);
    }

}
