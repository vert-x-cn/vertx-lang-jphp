package io.vertx.php.kafka.client.common;

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
@Name("PartitionInfo")
@Namespace("io\\vertx\\php\\kafka\\client\\common")
//false
public  class PartitionInfo extends DataObjectWrapper<io.vertx.kafka.client.common.PartitionInfo> { 
    public PartitionInfo(Environment env, io.vertx.kafka.client.common.PartitionInfo wrappedObject) {
        super(env, wrappedObject);
    }

    public PartitionInfo(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.kafka.client.common.PartitionInfo();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.kafka.client.common.PartitionInfo(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<Node> getInSyncReplicas(){ 
        return this.getWrappedObject().getInSyncReplicas().stream().map(v -> new Node(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public PartitionInfo setInSyncReplicas(List<Node> inSyncReplicas){ 
        this.getWrappedObject().setInSyncReplicas((inSyncReplicas.stream().map(Node::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public Node getLeader(){ 
        return new Node(__env__, this.getWrappedObject().getLeader());
    }

    @Signature
    public PartitionInfo setLeader(Node leader){ 
        this.getWrappedObject().setLeader(leader.getWrappedObject());
        return this;
    }

    @Signature
    public int getPartition(){ 
        return this.getWrappedObject().getPartition();
    }

    @Signature
    public PartitionInfo setPartition(int partition){ 
        this.getWrappedObject().setPartition(partition);
        return this;
    }

    @Signature
    public List<Node> getReplicas(){ 
        return this.getWrappedObject().getReplicas().stream().map(v -> new Node(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public PartitionInfo setReplicas(List<Node> replicas){ 
        this.getWrappedObject().setReplicas((replicas.stream().map(Node::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public String getTopic(){ 
        return this.getWrappedObject().getTopic();
    }

    @Signature
    public PartitionInfo setTopic(String topic){ 
        this.getWrappedObject().setTopic(topic);
        return this;
    }
}
