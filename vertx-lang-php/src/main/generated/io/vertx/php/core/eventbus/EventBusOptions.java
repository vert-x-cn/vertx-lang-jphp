package io.vertx.php.core.eventbus;

import php.runtime.Memory;
import io.vertx.php.core.net.JksOptions;
import io.vertx.php.core.net.TCPSSLOptions;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import java.util.Set;
import io.vertx.php.core.net.OpenSSLEngineOptions;
import java.util.stream.Collectors;
import php.runtime.memory.ObjectMemory;
import java.util.List;
import io.vertx.php.core.net.JdkSSLEngineOptions;
import io.vertx.php.core.net.PemTrustOptions;
import io.vertx.php.core.net.PemKeyCertOptions;
import io.vertx.core.http.ClientAuth;
import io.vertx.core.json.JsonObject;
import io.vertx.php.core.net.PfxOptions;
import io.vertx.php.core.buffer.Buffer;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\eventbus\\EventBusOptions")
public class EventBusOptions extends TCPSSLOptions { 
    public EventBusOptions(Environment env, io.vertx.core.eventbus.EventBusOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public EventBusOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof EventBusOptions) {
            io.vertx.core.eventbus.EventBusOptions value = (io.vertx.core.eventbus.EventBusOptions)((EventBusOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.eventbus.EventBusOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.eventbus.EventBusOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.eventbus.EventBusOptions getWrappedObject(){
        return (io.vertx.core.eventbus.EventBusOptions)__wrappedObject;
    }
    
    @Signature
    public int getAcceptBacklog(){ 
        return this.getWrappedObject().getAcceptBacklog();
    }
    
    @Signature
    public EventBusOptions setAcceptBacklog(int acceptBacklog){ 
        this.getWrappedObject().setAcceptBacklog(acceptBacklog);
        return this;
    }
    
    @Signature
    public ClientAuth getClientAuth(){ 
        return this.getWrappedObject().getClientAuth();
    }
    
    @Signature
    public EventBusOptions setClientAuth(ClientAuth clientAuth){ 
        this.getWrappedObject().setClientAuth(clientAuth);
        return this;
    }
    
    @Signature
    public long getClusterPingInterval(){ 
        return this.getWrappedObject().getClusterPingInterval();
    }
    
    @Signature
    public EventBusOptions setClusterPingInterval(long clusterPingInterval){ 
        this.getWrappedObject().setClusterPingInterval(clusterPingInterval);
        return this;
    }
    
    @Signature
    public long getClusterPingReplyInterval(){ 
        return this.getWrappedObject().getClusterPingReplyInterval();
    }
    
    @Signature
    public EventBusOptions setClusterPingReplyInterval(long clusterPingReplyInterval){ 
        this.getWrappedObject().setClusterPingReplyInterval(clusterPingReplyInterval);
        return this;
    }
    
    @Signature
    public String getClusterPublicHost(){ 
        return this.getWrappedObject().getClusterPublicHost();
    }
    
    @Signature
    public EventBusOptions setClusterPublicHost(String clusterPublicHost){ 
        this.getWrappedObject().setClusterPublicHost(clusterPublicHost);
        return this;
    }
    
    @Signature
    public int getClusterPublicPort(){ 
        return this.getWrappedObject().getClusterPublicPort();
    }
    
    @Signature
    public EventBusOptions setClusterPublicPort(int clusterPublicPort){ 
        this.getWrappedObject().setClusterPublicPort(clusterPublicPort);
        return this;
    }
    
    @Signature
    public boolean isClustered(){ 
        return this.getWrappedObject().isClustered();
    }
    
    @Signature
    public EventBusOptions setClustered(boolean clustered){ 
        this.getWrappedObject().setClustered(clustered);
        return this;
    }
    
    @Signature
    public int getConnectTimeout(){ 
        return this.getWrappedObject().getConnectTimeout();
    }
    
    @Signature
    public EventBusOptions setConnectTimeout(int connectTimeout){ 
        this.getWrappedObject().setConnectTimeout(connectTimeout);
        return this;
    }
        
    @Signature
    public EventBusOptions addCrlPath(java.lang.String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }
        
    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }
        
    @Signature
    public EventBusOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }
        
    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> new Buffer(__env__, v)).collect(Collectors.toList());
    }
        
    @Signature
    public EventBusOptions addEnabledCipherSuite(java.lang.String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }
        
    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }
        
    @Signature
    public EventBusOptions addEnabledSecureTransportProtocol(java.lang.String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }
        
    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }
    
    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }
    
    @Signature
    public EventBusOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }
    
    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }
    
    @Signature
    public EventBusOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }
    
    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }
    
    @Signature
    public EventBusOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }
    
    @Signature
    public EventBusOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }
    
    @Signature
    public EventBusOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }
    
    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }
    
    @Signature
    public EventBusOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }
    
    @Signature
    public EventBusOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }
    
    @Signature
    public EventBusOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }
    
    @Signature
    public EventBusOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }
    
    @Signature
    public EventBusOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }
    
    @Signature
    public EventBusOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }
    
    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }
    
    @Signature
    public EventBusOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }
    
    @Signature
    public int getReconnectAttempts(){ 
        return this.getWrappedObject().getReconnectAttempts();
    }
    
    @Signature
    public EventBusOptions setReconnectAttempts(int reconnectAttempts){ 
        this.getWrappedObject().setReconnectAttempts(reconnectAttempts);
        return this;
    }
    
    @Signature
    public long getReconnectInterval(){ 
        return this.getWrappedObject().getReconnectInterval();
    }
    
    @Signature
    public EventBusOptions setReconnectInterval(long reconnectInterval){ 
        this.getWrappedObject().setReconnectInterval(reconnectInterval);
        return this;
    }
    
    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }
    
    @Signature
    public EventBusOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }
    
    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }
    
    @Signature
    public EventBusOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }
    
    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }
    
    @Signature
    public EventBusOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }
    
    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }
    
    @Signature
    public EventBusOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }
    
    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }
    
    @Signature
    public EventBusOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }
    
    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }
    
    @Signature
    public EventBusOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }
    
    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }
    
    @Signature
    public EventBusOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }
    
    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }
    
    @Signature
    public EventBusOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }
    
    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }
    
    @Signature
    public EventBusOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }
    
    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }
    
    @Signature
    public EventBusOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }
    
    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }
    
    @Signature
    public EventBusOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }
    
    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }
    
    @Signature
    public EventBusOptions setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }
    
    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }
    
    @Signature
    public EventBusOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }
    
    @Signature
    public EventBusOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }
    
    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }
    
    @Signature
    public EventBusOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }
    
}
