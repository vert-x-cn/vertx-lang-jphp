package io.vertx.php.servicediscovery;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.servicediscovery.ServiceReference;
import io.vertx.php.core.Vertx;
import io.vertx.php.servicediscovery.spi.ServiceImporter;
import io.vertx.php.servicediscovery.spi.ServiceExporter;
@Name("ServiceDiscovery")
@Namespace("io\\vertx\\php\\servicediscovery")
public interface ServiceDiscovery<S extends io.vertx.servicediscovery.ServiceDiscovery> extends IWrapper<S>{

    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceDiscoveryImpl::new, io.vertx.servicediscovery.ServiceDiscovery.create(vertx)
    }

    @Signature
    default Memory getReference(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceReferenceImpl::new, this.getWrappedObject().getReference(record)
    }

    @Signature
    default Memory getReferenceWithConfiguration(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceReferenceImpl::new, this.getWrappedObject().getReferenceWithConfiguration(record, configuration)
    }

    @Signature
    default Memory release(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().release(reference)
    }

    @Signature
    default Memory registerServiceImporter(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceDiscoveryImpl::new, this.getWrappedObject().registerServiceImporter(importer, configuration)
    }

    @Signature
    default Memory registerServiceExporter(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, ServiceDiscoveryImpl::new, this.getWrappedObject().registerServiceExporter(exporter, configuration)
    }
    
    @Signature
    default void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

    @Signature
    default void publish(Environment __env__, Memory... args) {
        this.getWrappedObject().publish(record, resultHandler)
    }

    @Signature
    default void unpublish(Environment __env__, Memory... args) {
        this.getWrappedObject().unpublish(id, resultHandler)
    }

    @Signature
    default void getRecord(Environment __env__, Memory... args) {
        this.getWrappedObject().getRecord(filter, resultHandler)
    }

    @Signature
    default void getRecords(Environment __env__, Memory... args) {
        this.getWrappedObject().getRecords(filter, resultHandler)
    }

    @Signature
    default void update(Environment __env__, Memory... args) {
        this.getWrappedObject().update(record, resultHandler)
    }
    
    @Signature
    default Memory bindings(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().bindings()
    }
    
    @Signature
    default Memory options(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().options()
    }

    @Signature
    static void releaseServiceObject(Environment __env__, Memory... args) {
        io.vertx.servicediscovery.ServiceDiscovery.releaseServiceObject(discovery, svcObject)
    }

}
