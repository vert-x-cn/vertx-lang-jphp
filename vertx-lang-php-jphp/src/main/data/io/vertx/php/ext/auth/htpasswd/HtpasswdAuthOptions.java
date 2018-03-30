package io.vertx.php.ext.auth.htpasswd;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("HtpasswdAuthOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\htpasswd")
//false
public  class HtpasswdAuthOptions extends DataObjectWrapper<io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions> { 
    public HtpasswdAuthOptions(Environment env, io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public HtpasswdAuthOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isEnabledCryptPwd(){ 
        return this.getWrappedObject().isEnabledCryptPwd();
    }

    @Signature
    public boolean isEnabledPlainTextPwd(){ 
        return this.getWrappedObject().isEnabledPlainTextPwd();
    }

    @Signature
    public String getHtpasswdFile(){ 
        return this.getWrappedObject().getHtpasswdFile();
    }

    @Signature
    public HtpasswdAuthOptions setHtpasswdFile(String htpasswdFile){ 
        this.getWrappedObject().setHtpasswdFile(htpasswdFile);
        return this;
    }

    @Signature
    public HtpasswdAuthOptions setUsersAuthorizedForEverything(boolean usersAuthorizedForEverything){ 
        this.getWrappedObject().setUsersAuthorizedForEverything(usersAuthorizedForEverything);
        return this;
    }
}
