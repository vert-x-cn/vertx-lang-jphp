package io.vertx.php.ext.dropwizard;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.dropwizard.MatchType;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("Match")
@Namespace("io\\vertx\\php\\ext\\dropwizard")
//false
public  class Match extends DataObjectWrapper<io.vertx.ext.dropwizard.Match> { 
    public Match(Environment env, io.vertx.ext.dropwizard.Match wrappedObject) {
        super(env, wrappedObject);
    }

    public Match(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.dropwizard.Match();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.dropwizard.Match(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public String getAlias(){ 
        return this.getWrappedObject().getAlias();
    }

    @Signature
    public Match setAlias(String alias){ 
        this.getWrappedObject().setAlias(alias);
        return this;
    }

    @Signature
    public MatchType getType(){ 
        return this.getWrappedObject().getType();
    }

    @Signature
    public Match setType(MatchType type){ 
        this.getWrappedObject().setType(type);
        return this;
    }

    @Signature
    public String getValue(){ 
        return this.getWrappedObject().getValue();
    }

    @Signature
    public Match setValue(String value){ 
        this.getWrappedObject().setValue(value);
        return this;
    }
}
