package io.vertx.php.ext.auth.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.mongo.HashSaltStyle;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("MongoAuthOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\mongo")
//false
public  class MongoAuthOptions extends DataObjectWrapper<io.vertx.ext.auth.mongo.MongoAuthOptions> { 
    public MongoAuthOptions(Environment env, io.vertx.ext.auth.mongo.MongoAuthOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public MongoAuthOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.mongo.MongoAuthOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.mongo.MongoAuthOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getCollectionName(){ 
        return this.getWrappedObject().getCollectionName();
    }

    @Signature
    public MongoAuthOptions setCollectionName(String collectionName){ 
        this.getWrappedObject().setCollectionName(collectionName);
        return this;
    }

    @Signature
    public Memory getConfig(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getConfig().encode());
    }

    @Signature
    public MongoAuthOptions setConfig(Memory config){ 
        this.getWrappedObject().setConfig(new JsonObject(JsonFunctions.json_encode(config)));
        return this;
    }

    @Signature
    public String getDatasourceName(){ 
        return this.getWrappedObject().getDatasourceName();
    }

    @Signature
    public MongoAuthOptions setDatasourceName(String datasourceName){ 
        this.getWrappedObject().setDatasourceName(datasourceName);
        return this;
    }

    @Signature
    public String getPasswordField(){ 
        return this.getWrappedObject().getPasswordField();
    }

    @Signature
    public MongoAuthOptions setPasswordField(String passwordField){ 
        this.getWrappedObject().setPasswordField(passwordField);
        return this;
    }

    @Signature
    public String getPermissionField(){ 
        return this.getWrappedObject().getPermissionField();
    }

    @Signature
    public MongoAuthOptions setPermissionField(String permissionField){ 
        this.getWrappedObject().setPermissionField(permissionField);
        return this;
    }

    @Signature
    public String getRoleField(){ 
        return this.getWrappedObject().getRoleField();
    }

    @Signature
    public MongoAuthOptions setRoleField(String roleField){ 
        this.getWrappedObject().setRoleField(roleField);
        return this;
    }

    @Signature
    public String getSaltField(){ 
        return this.getWrappedObject().getSaltField();
    }

    @Signature
    public MongoAuthOptions setSaltField(String saltField){ 
        this.getWrappedObject().setSaltField(saltField);
        return this;
    }

    @Signature
    public HashSaltStyle getSaltStyle(){ 
        return this.getWrappedObject().getSaltStyle();
    }

    @Signature
    public MongoAuthOptions setSaltStyle(HashSaltStyle saltStyle){ 
        this.getWrappedObject().setSaltStyle(saltStyle);
        return this;
    }

    @Signature
    public boolean getShared(){ 
        return this.getWrappedObject().getShared();
    }

    @Signature
    public MongoAuthOptions setShared(boolean shared){ 
        this.getWrappedObject().setShared(shared);
        return this;
    }

    @Signature
    public String getUsernameCredentialField(){ 
        return this.getWrappedObject().getUsernameCredentialField();
    }

    @Signature
    public MongoAuthOptions setUsernameCredentialField(String usernameCredentialField){ 
        this.getWrappedObject().setUsernameCredentialField(usernameCredentialField);
        return this;
    }

    @Signature
    public String getUsernameField(){ 
        return this.getWrappedObject().getUsernameField();
    }

    @Signature
    public MongoAuthOptions setUsernameField(String usernameField){ 
        this.getWrappedObject().setUsernameField(usernameField);
        return this;
    }
}
