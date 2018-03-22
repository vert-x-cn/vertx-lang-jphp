package io.vertx.php.servicediscovery.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.servicediscovery.ServiceReference;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("ServiceReferenceImpl")
@Namespace("io\\vertx\\php\\servicediscovery\\impl")
public class ServiceReferenceImpl extends VertxGenWrapper<io.vertx.servicediscovery.ServiceReference> implements ServiceReference<io.vertx.servicediscovery.ServiceReference>{
    
    public ServiceReferenceImpl(Environment env, io.vertx.servicediscovery.ServiceReference wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory getAs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().getAs(x)
    }

    @Signature
    public Memory cachedAs(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().cachedAs(x)
    }

    @Signature
    public Memory isHolding(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isHolding(object)
    }

}
