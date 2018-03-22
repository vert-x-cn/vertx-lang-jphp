package io.vertx.php.servicediscovery.spi.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.spi.ServicePublisher;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServicePublisherImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\spi\\impl")
public class ServicePublisherImpl extends VertxGenWrapper<io.vertx.servicediscovery.spi.ServicePublisher> implements ServicePublisher<io.vertx.servicediscovery.spi.ServicePublisher>{
    
    public ServicePublisherImpl(Environment env, io.vertx.servicediscovery.spi.ServicePublisher wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(record, resultHandler)
    }

    @Signature
    public void unpublish(Environment __env__, Memory... args) {
        this.getWrappedObject().unpublish(id, resultHandler)
    }

    @Signature
    public void update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(record, resultHandler)
    }

}
