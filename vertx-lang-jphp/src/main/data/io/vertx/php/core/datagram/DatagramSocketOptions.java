package io.vertx.php.core.datagram;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("DatagramSocketOptions")
@Namespace("io\\vertx\\php\\core\\datagram")
//false
public  class DatagramSocketOptions extends DataObjectWrapper<io.vertx.core.datagram.DatagramSocketOptions> { 
    public DatagramSocketOptions(Environment env, io.vertx.core.datagram.DatagramSocketOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public DatagramSocketOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.datagram.DatagramSocketOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.datagram.DatagramSocketOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isBroadcast(){ 
        return this.getWrappedObject().isBroadcast();
    }

    @Signature
    public DatagramSocketOptions setBroadcast(boolean broadcast){ 
        this.getWrappedObject().setBroadcast(broadcast);
        return this;
    }

    @Signature
    public boolean isIpV6(){ 
        return this.getWrappedObject().isIpV6();
    }

    @Signature
    public DatagramSocketOptions setIpV6(boolean ipV6){ 
        this.getWrappedObject().setIpV6(ipV6);
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public DatagramSocketOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public boolean isLoopbackModeDisabled(){ 
        return this.getWrappedObject().isLoopbackModeDisabled();
    }

    @Signature
    public DatagramSocketOptions setLoopbackModeDisabled(boolean loopbackModeDisabled){ 
        this.getWrappedObject().setLoopbackModeDisabled(loopbackModeDisabled);
        return this;
    }

    @Signature
    public String getMulticastNetworkInterface(){ 
        return this.getWrappedObject().getMulticastNetworkInterface();
    }

    @Signature
    public DatagramSocketOptions setMulticastNetworkInterface(String multicastNetworkInterface){ 
        this.getWrappedObject().setMulticastNetworkInterface(multicastNetworkInterface);
        return this;
    }

    @Signature
    public int getMulticastTimeToLive(){ 
        return this.getWrappedObject().getMulticastTimeToLive();
    }

    @Signature
    public DatagramSocketOptions setMulticastTimeToLive(int multicastTimeToLive){ 
        this.getWrappedObject().setMulticastTimeToLive(multicastTimeToLive);
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public DatagramSocketOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public DatagramSocketOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public DatagramSocketOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public DatagramSocketOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public DatagramSocketOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }
}
