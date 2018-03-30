package io.vertx.php.ext.auth.jdbc;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("JDBCAuthOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\jdbc")
//false
public  class JDBCAuthOptions extends DataObjectWrapper<io.vertx.ext.auth.jdbc.JDBCAuthOptions> { 
    public JDBCAuthOptions(Environment env, io.vertx.ext.auth.jdbc.JDBCAuthOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JDBCAuthOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.jdbc.JDBCAuthOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.jdbc.JDBCAuthOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAuthenticationQuery(){ 
        return this.getWrappedObject().getAuthenticationQuery();
    }

    @Signature
    public JDBCAuthOptions setAuthenticationQuery(String authenticationQuery){ 
        this.getWrappedObject().setAuthenticationQuery(authenticationQuery);
        return this;
    }

    @Signature
    public Memory getConfig(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getConfig().encode());
    }

    @Signature
    public JDBCAuthOptions setConfig(Memory config){ 
        this.getWrappedObject().setConfig(new JsonObject(JsonFunctions.json_encode(config)));
        return this;
    }

    @Signature
    public String getDatasourceName(){ 
        return this.getWrappedObject().getDatasourceName();
    }

    @Signature
    public JDBCAuthOptions setDatasourceName(String datasourceName){ 
        this.getWrappedObject().setDatasourceName(datasourceName);
        return this;
    }

    @Signature
    public String getPermissionsQuery(){ 
        return this.getWrappedObject().getPermissionsQuery();
    }

    @Signature
    public JDBCAuthOptions setPermissionsQuery(String permissionsQuery){ 
        this.getWrappedObject().setPermissionsQuery(permissionsQuery);
        return this;
    }

    @Signature
    public String getRolesPrefix(){ 
        return this.getWrappedObject().getRolesPrefix();
    }

    @Signature
    public JDBCAuthOptions setRolesPrefix(String rolesPrefix){ 
        this.getWrappedObject().setRolesPrefix(rolesPrefix);
        return this;
    }

    @Signature
    public String getRolesQuery(){ 
        return this.getWrappedObject().getRolesQuery();
    }

    @Signature
    public JDBCAuthOptions setRolesQuery(String rolesQuery){ 
        this.getWrappedObject().setRolesQuery(rolesQuery);
        return this;
    }

    @Signature
    public boolean isShared(){ 
        return this.getWrappedObject().isShared();
    }

    @Signature
    public JDBCAuthOptions setShared(boolean shared){ 
        this.getWrappedObject().setShared(shared);
        return this;
    }
}
