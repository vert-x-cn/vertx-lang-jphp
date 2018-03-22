package io.vertx.php.kafka.admin.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.kafka.admin.AdminUtils;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AdminUtilsImpl")
@Namespace("io\\vertx\\php\\kafka\\admin\\impl")
public class AdminUtilsImpl extends VertxGenWrapper<io.vertx.kafka.admin.AdminUtils> implements AdminUtils<io.vertx.kafka.admin.AdminUtils>{
    
    public AdminUtilsImpl(Environment env, io.vertx.kafka.admin.AdminUtils wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AdminUtilsImpl::new, io.vertx.kafka.admin.AdminUtils.create(vertx, zookeeperHosts)
    }

    @Signature
    public void createTopic(Environment __env__, Memory... args) {
        this.getWrappedObject().createTopic(topicName, partitionCount, replicationFactor, completionHandler)
    }

    @Signature
    public void deleteTopic(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteTopic(topicName, completionHandler)
    }

    @Signature
    public void topicExists(Environment __env__, Memory... args) {
        this.getWrappedObject().topicExists(topicName, completionHandler)
    }

    @Signature
    public void changeTopicConfig(Environment __env__, Memory... args) {
        this.getWrappedObject().changeTopicConfig(topicName, topicConfig, completionHandler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(completionHandler)
    }

}
