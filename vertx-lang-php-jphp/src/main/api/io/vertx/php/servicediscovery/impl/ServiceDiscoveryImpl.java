package io.vertx.php.servicediscovery.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.ServiceDiscovery;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServiceDiscoveryImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\impl")
public class ServiceDiscoveryImpl extends VertxGenWrapper<io.vertx.servicediscovery.ServiceDiscovery> implements ServiceDiscovery<io.vertx.servicediscovery.ServiceDiscovery>{
    
    public ServiceDiscoveryImpl(Environment env, io.vertx.servicediscovery.ServiceDiscovery wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceDiscoveryImpl::new, io.vertx.servicediscovery.ServiceDiscovery.create(vertx)
    }

    @Signature
    public Memory getReference(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceReferenceImpl::new, this.getWrappedObject().getReference(record)
    }

    @Signature
    public Memory getReferenceWithConfiguration(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceReferenceImpl::new, this.getWrappedObject().getReferenceWithConfiguration(record, configuration)
    }

    @Signature
    public Memory release(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().release(reference)
    }

    @Signature
    public Memory registerServiceImporter(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceDiscoveryImpl::new, this.getWrappedObject().registerServiceImporter(importer, configuration)
    }

    @Signature
    public Memory registerServiceExporter(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceDiscoveryImpl::new, this.getWrappedObject().registerServiceExporter(exporter, configuration)
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
    public void getRecord(Environment __env__, Memory... args) {
        this.getWrappedObject().getRecord(filter, resultHandler)
    }

    @Signature
    public void getRecords(Environment __env__, Memory... args) {
        this.getWrappedObject().getRecords(filter, resultHandler)
    }

    @Signature
    public void update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(record, resultHandler)
    }

    @Signature
    public static void releaseServiceObject(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.ServiceDiscovery.releaseServiceObject(discovery, svcObject)
    }

}
