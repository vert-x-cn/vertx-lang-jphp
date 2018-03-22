package io.vertx.php.kafka.admin;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.core.Vertx;
@Name("AdminUtils")
@Namespace("io\\vertx\\php\\kafka\\admin")
public interface AdminUtils<S extends io.vertx.kafka.admin.AdminUtils> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, AdminUtilsImpl::new, io.vertx.kafka.admin.AdminUtils.create(vertx, zookeeperHosts)
    }

    @Signature
    default void createTopic(Environment __env__, Memory... args) {
        this.getWrappedObject().createTopic(topicName, partitionCount, replicationFactor, completionHandler)
    }

    @Signature
    default void deleteTopic(Environment __env__, Memory... args) {
        this.getWrappedObject().deleteTopic(topicName, completionHandler)
    }

    @Signature
    default void topicExists(Environment __env__, Memory... args) {
        this.getWrappedObject().topicExists(topicName, completionHandler)
    }

    @Signature
    default void changeTopicConfig(Environment __env__, Memory... args) {
        this.getWrappedObject().changeTopicConfig(topicName, topicConfig, completionHandler)
    }

    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(completionHandler)
    }

}
