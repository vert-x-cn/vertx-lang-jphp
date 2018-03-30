package io.vertx.php.ext.consul;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("SessionList")
@Namespace("io\\vertx\\php\\ext\\consul")
//false
public  class SessionList extends DataObjectWrapper<io.vertx.ext.consul.SessionList> { 
    public SessionList(Environment env, io.vertx.ext.consul.SessionList wrappedObject) {
        super(env, wrappedObject);
    }

    public SessionList(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.consul.SessionList();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.consul.SessionList(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public long getIndex(){ 
        return this.getWrappedObject().getIndex();
    }

    @Signature
    public SessionList setIndex(long index){ 
        this.getWrappedObject().setIndex(index);
        return this;
    }

    @Signature
    public List<Session> getList(){ 
        return this.getWrappedObject().getList().stream().map(v -> new Session(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public SessionList setList(List<Session> list){ 
        this.getWrappedObject().setList((list.stream().map(Session::getWrappedObject).collect(Collectors.toList())));
        return this;
    }
}
