package io.vertx.php.config.vault.client;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.Map;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("TokenRequest")
@Namespace("io\\vertx\\php\\config\\vault\\client")
//false
public  class TokenRequest extends DataObjectWrapper<io.vertx.config.vault.client.TokenRequest> { 
    public TokenRequest(Environment env, io.vertx.config.vault.client.TokenRequest wrappedObject) {
        super(env, wrappedObject);
    }

    public TokenRequest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.config.vault.client.TokenRequest();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.config.vault.client.TokenRequest(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getDisplayName(){ 
        return this.getWrappedObject().getDisplayName();
    }

    @Signature
    public TokenRequest setDisplayName(String displayName){ 
        this.getWrappedObject().setDisplayName(displayName);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public TokenRequest setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public Map<String, String> getMeta(){ 
        return this.getWrappedObject().getMeta();
    }

    @Signature
    public TokenRequest setMeta(Map<String, String> meta){ 
        this.getWrappedObject().setMeta(meta);
        return this;
    }

    @Signature
    public boolean isNoDefaultPolicy(){ 
        return this.getWrappedObject().isNoDefaultPolicy();
    }

    @Signature
    public TokenRequest setNoDefaultPolicy(boolean noDefaultPolicy){ 
        this.getWrappedObject().setNoDefaultPolicy(noDefaultPolicy);
        return this;
    }

    @Signature
    public boolean isNoParent(){ 
        return this.getWrappedObject().isNoParent();
    }

    @Signature
    public TokenRequest setNoParent(boolean noParent){ 
        this.getWrappedObject().setNoParent(noParent);
        return this;
    }

    @Signature
    public long getNumUses(){ 
        return this.getWrappedObject().getNumUses();
    }

    @Signature
    public TokenRequest setNumUses(long numUses){ 
        this.getWrappedObject().setNumUses(numUses);
        return this;
    }

    @Signature
    public List<String> getPolicies(){ 
        return this.getWrappedObject().getPolicies();
    }

    @Signature
    public TokenRequest setPolicies(List<String> policies){ 
        this.getWrappedObject().setPolicies(policies);
        return this;
    }

    @Signature
    public String getRole(){ 
        return this.getWrappedObject().getRole();
    }

    @Signature
    public TokenRequest setRole(String role){ 
        this.getWrappedObject().setRole(role);
        return this;
    }

    @Signature
    public String getTtl(){ 
        return this.getWrappedObject().getTtl();
    }

    @Signature
    public TokenRequest setTTL(String ttl){ 
        this.getWrappedObject().setTTL(ttl);
        return this;
    }
}
