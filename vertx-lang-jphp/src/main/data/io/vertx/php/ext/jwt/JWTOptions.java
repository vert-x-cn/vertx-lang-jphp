package io.vertx.php.ext.jwt;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("JWTOptions")
@Namespace("io\\vertx\\php\\ext\\jwt")
//false
public  class JWTOptions extends DataObjectWrapper<io.vertx.ext.jwt.JWTOptions> { 
    public JWTOptions(Environment env, io.vertx.ext.jwt.JWTOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public JWTOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.jwt.JWTOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.jwt.JWTOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAlgorithm(){ 
        return this.getWrappedObject().getAlgorithm();
    }

    @Signature
    public JWTOptions setAlgorithm(String algorithm){ 
        this.getWrappedObject().setAlgorithm(algorithm);
        return this;
    }

    @Signature
    public List<String> getAudience(){ 
        return this.getWrappedObject().getAudience();
    }

    @Signature
    public JWTOptions setAudience(List<String> audience){ 
        this.getWrappedObject().setAudience(audience);
        return this;
    }

    @Signature
    public JWTOptions addAudience(String audiences){ 
        this.getWrappedObject().addAudience(audiences);
        return this;
    }

    @Signature
    public JWTOptions setExpiresInMinutes(int expiresInMinutes){ 
        this.getWrappedObject().setExpiresInMinutes(expiresInMinutes);
        return this;
    }

    @Signature
    public int getExpiresInSeconds(){ 
        return this.getWrappedObject().getExpiresInSeconds();
    }

    @Signature
    public JWTOptions setExpiresInSeconds(int expiresInSeconds){ 
        this.getWrappedObject().setExpiresInSeconds(expiresInSeconds);
        return this;
    }

    @Signature
    public Memory getHeader(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getHeader().encode());
    }

    @Signature
    public JWTOptions setHeader(Memory header){ 
        this.getWrappedObject().setHeader(new JsonObject(JsonFunctions.json_encode(header)));
        return this;
    }

    @Signature
    public boolean isIgnoreExpiration(){ 
        return this.getWrappedObject().isIgnoreExpiration();
    }

    @Signature
    public JWTOptions setIgnoreExpiration(boolean ignoreExpiration){ 
        this.getWrappedObject().setIgnoreExpiration(ignoreExpiration);
        return this;
    }

    @Signature
    public String getIssuer(){ 
        return this.getWrappedObject().getIssuer();
    }

    @Signature
    public JWTOptions setIssuer(String issuer){ 
        this.getWrappedObject().setIssuer(issuer);
        return this;
    }

    @Signature
    public int getLeeway(){ 
        return this.getWrappedObject().getLeeway();
    }

    @Signature
    public JWTOptions setLeeway(int leeway){ 
        this.getWrappedObject().setLeeway(leeway);
        return this;
    }

    @Signature
    public boolean isNoTimestamp(){ 
        return this.getWrappedObject().isNoTimestamp();
    }

    @Signature
    public JWTOptions setNoTimestamp(boolean noTimestamp){ 
        this.getWrappedObject().setNoTimestamp(noTimestamp);
        return this;
    }

    @Signature
    public JWTOptions addPermission(String permissions){ 
        this.getWrappedObject().addPermission(permissions);
        return this;
    }

    @Signature
    public List<String> getPermissions(){ 
        return this.getWrappedObject().getPermissions();
    }

    @Signature
    public JWTOptions setPermissions(List<String> permissions){ 
        this.getWrappedObject().setPermissions(permissions);
        return this;
    }

    @Signature
    public String getSubject(){ 
        return this.getWrappedObject().getSubject();
    }

    @Signature
    public JWTOptions setSubject(String subject){ 
        this.getWrappedObject().setSubject(subject);
        return this;
    }
}
