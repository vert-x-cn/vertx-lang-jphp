package io.vertx.php.core.shareddata.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.shareddata.SharedData;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SharedDataImpl")
@Namespace("io\\vertx\\php\\core\\shareddata\\impl")
public class SharedDataImpl extends VertxGenWrapper<io.vertx.core.shareddata.SharedData> implements SharedData<io.vertx.core.shareddata.SharedData>{
    
    public SharedDataImpl(Environment env, io.vertx.core.shareddata.SharedData wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public void getClusterWideMap(Environment __env__, Memory... args) {
        this.getWrappedObject().getClusterWideMap(name, resultHandler)
    }

    @Signature
    public void getAsyncMap(Environment __env__, Memory... args) {
        this.getWrappedObject().getAsyncMap(name, resultHandler)
    }

    @Signature
    public void getLock(Environment __env__, Memory... args) {
        this.getWrappedObject().getLock(name, resultHandler)
    }

    @Signature
    public void getLockWithTimeout(Environment __env__, Memory... args) {
        this.getWrappedObject().getLockWithTimeout(name, timeout, resultHandler)
    }

    @Signature
    public void getCounter(Environment __env__, Memory... args) {
        this.getWrappedObject().getCounter(name, resultHandler)
    }

    @Signature
    public Memory getLocalMap(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, LocalMapImpl::new, this.getWrappedObject().getLocalMap(name)
    }

}
