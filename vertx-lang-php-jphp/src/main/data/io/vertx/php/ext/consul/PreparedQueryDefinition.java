package io.vertx.php.ext.consul;

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
@Name("PreparedQueryDefinition")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class PreparedQueryDefinition extends DataObjectWrapper<io.vertx.ext.consul.PreparedQueryDefinition> { 
    public PreparedQueryDefinition(Environment env, io.vertx.ext.consul.PreparedQueryDefinition wrappedObject) {
        super(env, wrappedObject);
    }

    public PreparedQueryDefinition(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.PreparedQueryDefinition();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.PreparedQueryDefinition(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<String> getDcs(){ 
        return this.getWrappedObject().getDcs();
    }

    @Signature
    public PreparedQueryDefinition setDcs(List<String> dcs){ 
        this.getWrappedObject().setDcs(dcs);
        return this;
    }

    @Signature
    public String getDnsTtl(){ 
        return this.getWrappedObject().getDnsTtl();
    }

    @Signature
    public PreparedQueryDefinition setDnsTtl(String dnsTtl){ 
        this.getWrappedObject().setDnsTtl(dnsTtl);
        return this;
    }

    @Signature
    public String getId(){ 
        return this.getWrappedObject().getId();
    }

    @Signature
    public PreparedQueryDefinition setId(String id){ 
        this.getWrappedObject().setId(id);
        return this;
    }

    @Signature
    public Map<String, String> getMeta(){ 
        return this.getWrappedObject().getMeta();
    }

    @Signature
    public PreparedQueryDefinition setMeta(Map<String, String> meta){ 
        this.getWrappedObject().setMeta(meta);
        return this;
    }

    @Signature
    public String getName(){ 
        return this.getWrappedObject().getName();
    }

    @Signature
    public PreparedQueryDefinition setName(String name){ 
        this.getWrappedObject().setName(name);
        return this;
    }

    @Signature
    public int getNearestN(){ 
        return this.getWrappedObject().getNearestN();
    }

    @Signature
    public PreparedQueryDefinition setNearestN(int nearestN){ 
        this.getWrappedObject().setNearestN(nearestN);
        return this;
    }

    @Signature
    public boolean getPassing(){ 
        return this.getWrappedObject().getPassing();
    }

    @Signature
    public PreparedQueryDefinition setPassing(boolean passing){ 
        this.getWrappedObject().setPassing(passing);
        return this;
    }

    @Signature
    public String getService(){ 
        return this.getWrappedObject().getService();
    }

    @Signature
    public PreparedQueryDefinition setService(String service){ 
        this.getWrappedObject().setService(service);
        return this;
    }

    @Signature
    public String getSession(){ 
        return this.getWrappedObject().getSession();
    }

    @Signature
    public PreparedQueryDefinition setSession(String session){ 
        this.getWrappedObject().setSession(session);
        return this;
    }

    @Signature
    public List<String> getTags(){ 
        return this.getWrappedObject().getTags();
    }

    @Signature
    public PreparedQueryDefinition setTags(List<String> tags){ 
        this.getWrappedObject().setTags(tags);
        return this;
    }

    @Signature
    public String getTemplateRegexp(){ 
        return this.getWrappedObject().getTemplateRegexp();
    }

    @Signature
    public PreparedQueryDefinition setTemplateRegexp(String templateRegexp){ 
        this.getWrappedObject().setTemplateRegexp(templateRegexp);
        return this;
    }

    @Signature
    public String getTemplateType(){ 
        return this.getWrappedObject().getTemplateType();
    }

    @Signature
    public PreparedQueryDefinition setTemplateType(String templateType){ 
        this.getWrappedObject().setTemplateType(templateType);
        return this;
    }

    @Signature
    public String getToken(){ 
        return this.getWrappedObject().getToken();
    }

    @Signature
    public PreparedQueryDefinition setToken(String token){ 
        this.getWrappedObject().setToken(token);
        return this;
    }
}
