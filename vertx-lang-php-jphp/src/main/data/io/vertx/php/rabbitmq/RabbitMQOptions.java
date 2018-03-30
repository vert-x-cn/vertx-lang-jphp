package io.vertx.php.rabbitmq;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("RabbitMQOptions")
@Namespace("io\\vertx\\php\\rabbitmq")
//false
public  class RabbitMQOptions extends DataObjectWrapper<io.vertx.rabbitmq.RabbitMQOptions> { 
    public RabbitMQOptions(Environment env, io.vertx.rabbitmq.RabbitMQOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public RabbitMQOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.rabbitmq.RabbitMQOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.rabbitmq.RabbitMQOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public boolean isAutomaticRecoveryEnabled(){ 
        return this.getWrappedObject().isAutomaticRecoveryEnabled();
    }

    @Signature
    public RabbitMQOptions setAutomaticRecoveryEnabled(boolean automaticRecoveryEnabled){ 
        this.getWrappedObject().setAutomaticRecoveryEnabled(automaticRecoveryEnabled);
        return this;
    }

    @Signature
    public Integer getConnectionRetries(){ 
        return this.getWrappedObject().getConnectionRetries();
    }

    @Signature
    public RabbitMQOptions setConnectionRetries(Integer connectionRetries){ 
        this.getWrappedObject().setConnectionRetries(connectionRetries);
        return this;
    }

    @Signature
    public long getConnectionRetryDelay(){ 
        return this.getWrappedObject().getConnectionRetryDelay();
    }

    @Signature
    public RabbitMQOptions setConnectionRetryDelay(long connectionRetryDelay){ 
        this.getWrappedObject().setConnectionRetryDelay(connectionRetryDelay);
        return this;
    }

    @Signature
    public int getConnectionTimeout(){ 
        return this.getWrappedObject().getConnectionTimeout();
    }

    @Signature
    public RabbitMQOptions setConnectionTimeout(int connectionTimeout){ 
        this.getWrappedObject().setConnectionTimeout(connectionTimeout);
        return this;
    }

    @Signature
    public int getHandshakeTimeout(){ 
        return this.getWrappedObject().getHandshakeTimeout();
    }

    @Signature
    public RabbitMQOptions setHandshakeTimeout(int handshakeTimeout){ 
        this.getWrappedObject().setHandshakeTimeout(handshakeTimeout);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public RabbitMQOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public boolean getIncludeProperties(){ 
        return this.getWrappedObject().getIncludeProperties();
    }

    @Signature
    public RabbitMQOptions setIncludeProperties(boolean includeProperties){ 
        this.getWrappedObject().setIncludeProperties(includeProperties);
        return this;
    }

    @Signature
    public long getNetworkRecoveryInterval(){ 
        return this.getWrappedObject().getNetworkRecoveryInterval();
    }

    @Signature
    public RabbitMQOptions setNetworkRecoveryInterval(long networkRecoveryInterval){ 
        this.getWrappedObject().setNetworkRecoveryInterval(networkRecoveryInterval);
        return this;
    }

    @Signature
    public String getPassword(){ 
        return this.getWrappedObject().getPassword();
    }

    @Signature
    public RabbitMQOptions setPassword(String password){ 
        this.getWrappedObject().setPassword(password);
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public RabbitMQOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public int getRequestedChannelMax(){ 
        return this.getWrappedObject().getRequestedChannelMax();
    }

    @Signature
    public RabbitMQOptions setRequestedChannelMax(int requestedChannelMax){ 
        this.getWrappedObject().setRequestedChannelMax(requestedChannelMax);
        return this;
    }

    @Signature
    public int getRequestedHeartbeat(){ 
        return this.getWrappedObject().getRequestedHeartbeat();
    }

    @Signature
    public RabbitMQOptions setRequestedHeartbeat(int requestedHeartbeat){ 
        this.getWrappedObject().setRequestedHeartbeat(requestedHeartbeat);
        return this;
    }

    @Signature
    public String getUri(){ 
        return this.getWrappedObject().getUri();
    }

    @Signature
    public RabbitMQOptions setUri(String uri){ 
        this.getWrappedObject().setUri(uri);
        return this;
    }

    @Signature
    public String getUser(){ 
        return this.getWrappedObject().getUser();
    }

    @Signature
    public RabbitMQOptions setUser(String user){ 
        this.getWrappedObject().setUser(user);
        return this;
    }

    @Signature
    public String getVirtualHost(){ 
        return this.getWrappedObject().getVirtualHost();
    }

    @Signature
    public RabbitMQOptions setVirtualHost(String virtualHost){ 
        this.getWrappedObject().setVirtualHost(virtualHost);
        return this;
    }
}
