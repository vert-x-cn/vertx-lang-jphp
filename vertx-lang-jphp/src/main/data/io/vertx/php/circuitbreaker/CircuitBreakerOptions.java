package io.vertx.php.circuitbreaker;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("CircuitBreakerOptions")
@Namespace("io\\vertx\\php\\circuitbreaker")
//false
public  class CircuitBreakerOptions extends DataObjectWrapper<io.vertx.circuitbreaker.CircuitBreakerOptions> { 
    public CircuitBreakerOptions(Environment env, io.vertx.circuitbreaker.CircuitBreakerOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public CircuitBreakerOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.circuitbreaker.CircuitBreakerOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.circuitbreaker.CircuitBreakerOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isFallbackOnFailure(){ 
        return this.getWrappedObject().isFallbackOnFailure();
    }

    @Signature
    public CircuitBreakerOptions setFallbackOnFailure(boolean fallbackOnFailure){ 
        this.getWrappedObject().setFallbackOnFailure(fallbackOnFailure);
        return this;
    }

    @Signature
    public int getMaxFailures(){ 
        return this.getWrappedObject().getMaxFailures();
    }

    @Signature
    public CircuitBreakerOptions setMaxFailures(int maxFailures){ 
        this.getWrappedObject().setMaxFailures(maxFailures);
        return this;
    }

    @Signature
    public int getMaxRetries(){ 
        return this.getWrappedObject().getMaxRetries();
    }

    @Signature
    public CircuitBreakerOptions setMaxRetries(int maxRetries){ 
        this.getWrappedObject().setMaxRetries(maxRetries);
        return this;
    }

    @Signature
    public int getMetricsRollingBuckets(){ 
        return this.getWrappedObject().getMetricsRollingBuckets();
    }

    @Signature
    public CircuitBreakerOptions setMetricsRollingBuckets(int metricsRollingBuckets){ 
        this.getWrappedObject().setMetricsRollingBuckets(metricsRollingBuckets);
        return this;
    }

    @Signature
    public long getMetricsRollingWindow(){ 
        return this.getWrappedObject().getMetricsRollingWindow();
    }

    @Signature
    public CircuitBreakerOptions setMetricsRollingWindow(long metricsRollingWindow){ 
        this.getWrappedObject().setMetricsRollingWindow(metricsRollingWindow);
        return this;
    }

    @Signature
    public String getNotificationAddress(){ 
        return this.getWrappedObject().getNotificationAddress();
    }

    @Signature
    public CircuitBreakerOptions setNotificationAddress(String notificationAddress){ 
        this.getWrappedObject().setNotificationAddress(notificationAddress);
        return this;
    }

    @Signature
    public long getNotificationPeriod(){ 
        return this.getWrappedObject().getNotificationPeriod();
    }

    @Signature
    public CircuitBreakerOptions setNotificationPeriod(long notificationPeriod){ 
        this.getWrappedObject().setNotificationPeriod(notificationPeriod);
        return this;
    }

    @Signature
    public long getResetTimeout(){ 
        return this.getWrappedObject().getResetTimeout();
    }

    @Signature
    public CircuitBreakerOptions setResetTimeout(long resetTimeout){ 
        this.getWrappedObject().setResetTimeout(resetTimeout);
        return this;
    }

    @Signature
    public long getTimeout(){ 
        return this.getWrappedObject().getTimeout();
    }

    @Signature
    public CircuitBreakerOptions setTimeout(long timeout){ 
        this.getWrappedObject().setTimeout(timeout);
        return this;
    }
}
