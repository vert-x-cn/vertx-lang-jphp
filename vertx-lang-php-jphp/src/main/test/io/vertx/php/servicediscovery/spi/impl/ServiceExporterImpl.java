package io.vertx.php.servicediscovery.spi.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.spi.ServiceExporter;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServiceExporterImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\spi\\impl")
public class ServiceExporterImpl extends VertxGenWrapper<io.vertx.servicediscovery.spi.ServiceExporter> implements ServiceExporter<io.vertx.servicediscovery.spi.ServiceExporter>{
    
    public ServiceExporterImpl(Environment env, io.vertx.servicediscovery.spi.ServiceExporter wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void init(Environment __env__, Memory... args) {
        this.getWrappedObject().init(vertx, publisher, configuration, future)
    }

    @Signature
    public void onPublish(Environment __env__, Memory... args) {
        this.getWrappedObject().onPublish(record)
    }

    @Signature
    public void onUpdate(Environment __env__, Memory... args) {
        this.getWrappedObject().onUpdate(record)
    }

    @Signature
    public void onUnpublish(Environment __env__, Memory... args) {
        this.getWrappedObject().onUnpublish(id)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close(closeHandler)
    }

}
