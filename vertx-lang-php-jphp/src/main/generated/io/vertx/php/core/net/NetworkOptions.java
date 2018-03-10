package io.vertx.php.core.net;

import php.runtime.lang.BaseWrapper;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("NetworkOptions")
@Namespace("io\\vertx\\php\\core\\net")
public abstract class NetworkOptions extends BaseWrapper<io.vertx.core.net.NetworkOptions> { 
    public NetworkOptions(Environment env, io.vertx.core.net.NetworkOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public NetworkOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    public io.vertx.core.net.NetworkOptions getWrappedObject(){
        return __wrappedObject;
    }
    
    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }
    
    @Signature
    public NetworkOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }
    
    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }
    
    @Signature
    public NetworkOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }
    
    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }
    
    @Signature
    public NetworkOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }
    
    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }
    
    @Signature
    public NetworkOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }
    
    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }
    
    @Signature
    public NetworkOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }
    
    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }
    
    @Signature
    public NetworkOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }
    
}
