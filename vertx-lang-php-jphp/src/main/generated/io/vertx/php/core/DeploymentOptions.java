package io.vertx.php.core;

import io.vertx.core.json.JsonObject;
import java.util.List;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("DeploymentOptions")
@Namespace("io\\vertx\\php\\core")
public class DeploymentOptions extends BaseWrapper<io.vertx.core.DeploymentOptions> { 
    public DeploymentOptions(Environment env, io.vertx.core.DeploymentOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DeploymentOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof DeploymentOptions) {
            io.vertx.core.DeploymentOptions value = ((DeploymentOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.DeploymentOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.DeploymentOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.DeploymentOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public Memory getConfig(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getConfig().encode());
    }
    
    @Signature
    public DeploymentOptions setConfig(Memory config){ 
        this.getWrappedObject().setConfig(new JsonObject(JsonFunctions.json_encode(config)));
        return this;
    }
    
    @Signature
    public List<String> getExtraClasspath(){ 
        return this.getWrappedObject().getExtraClasspath();
    }
    
    @Signature
    public DeploymentOptions setExtraClasspath(List<String> extraClasspath){ 
        this.getWrappedObject().setExtraClasspath(extraClasspath);
        return this;
    }
    
    @Signature
    public boolean isHa(){ 
        return this.getWrappedObject().isHa();
    }
    
    @Signature
    public DeploymentOptions setHa(boolean ha){ 
        this.getWrappedObject().setHa(ha);
        return this;
    }
    
    @Signature
    public int getInstances(){ 
        return this.getWrappedObject().getInstances();
    }
    
    @Signature
    public DeploymentOptions setInstances(int instances){ 
        this.getWrappedObject().setInstances(instances);
        return this;
    }
    
    @Signature
    public List<String> getIsolatedClasses(){ 
        return this.getWrappedObject().getIsolatedClasses();
    }
    
    @Signature
    public DeploymentOptions setIsolatedClasses(List<String> isolatedClasses){ 
        this.getWrappedObject().setIsolatedClasses(isolatedClasses);
        return this;
    }
    
    @Signature
    public String getIsolationGroup(){ 
        return this.getWrappedObject().getIsolationGroup();
    }
    
    @Signature
    public DeploymentOptions setIsolationGroup(String isolationGroup){ 
        this.getWrappedObject().setIsolationGroup(isolationGroup);
        return this;
    }
    
    @Signature
    public long getMaxWorkerExecuteTime(){ 
        return this.getWrappedObject().getMaxWorkerExecuteTime();
    }
    
    @Signature
    public DeploymentOptions setMaxWorkerExecuteTime(long maxWorkerExecuteTime){ 
        this.getWrappedObject().setMaxWorkerExecuteTime(maxWorkerExecuteTime);
        return this;
    }
    
    @Signature
    public boolean isMultiThreaded(){ 
        return this.getWrappedObject().isMultiThreaded();
    }
    
    @Signature
    public DeploymentOptions setMultiThreaded(boolean multiThreaded){ 
        this.getWrappedObject().setMultiThreaded(multiThreaded);
        return this;
    }
    
    @Signature
    public boolean isWorker(){ 
        return this.getWrappedObject().isWorker();
    }
    
    @Signature
    public DeploymentOptions setWorker(boolean worker){ 
        this.getWrappedObject().setWorker(worker);
        return this;
    }
    
    @Signature
    public String getWorkerPoolName(){ 
        return this.getWrappedObject().getWorkerPoolName();
    }
    
    @Signature
    public DeploymentOptions setWorkerPoolName(String workerPoolName){ 
        this.getWrappedObject().setWorkerPoolName(workerPoolName);
        return this;
    }
    
    @Signature
    public int getWorkerPoolSize(){ 
        return this.getWrappedObject().getWorkerPoolSize();
    }
    
    @Signature
    public DeploymentOptions setWorkerPoolSize(int workerPoolSize){ 
        this.getWrappedObject().setWorkerPoolSize(workerPoolSize);
        return this;
    }
    
}
