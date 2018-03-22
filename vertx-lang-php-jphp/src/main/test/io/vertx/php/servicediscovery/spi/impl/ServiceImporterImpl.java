package io.vertx.php.servicediscovery.spi.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.spi.ServiceImporter;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServiceImporterImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\spi\\impl")
public class ServiceImporterImpl extends VertxGenWrapper<io.vertx.servicediscovery.spi.ServiceImporter> implements ServiceImporter<io.vertx.servicediscovery.spi.ServiceImporter>{
    
    public ServiceImporterImpl(Environment env, io.vertx.servicediscovery.spi.ServiceImporter wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void start(Environment __env__, Memory... args) {
        this.getWrappedObject().start(vertx, publisher, configuration, future)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(closeHandler)
    }

}
