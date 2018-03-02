package io.vertx.php.core.net;

import java.util.List;
import php.runtime.Memory;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import io.vertx.php.core.net.ClientOptionsBase;
import java.util.Set;
import io.vertx.core.json.JsonObject;
import io.vertx.php.core.buffer.Buffer;
import java.util.stream.Collectors;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("io\\vertx\\php\\core\\net\\NetClientOptions")
public class NetClientOptions extends ClientOptionsBase { 
    public NetClientOptions(Environment env, io.vertx.core.net.NetClientOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public NetClientOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    @Signature
    public Memory __construct(Memory memory) {
        if (memory instanceof ObjectMemory && ((ObjectMemory) memory).value instanceof NetClientOptions) {
            io.vertx.core.net.NetClientOptions value = (io.vertx.core.net.NetClientOptions)((NetClientOptions) ((ObjectMemory)memory).value).__wrappedObject;
            this.__wrappedObject = new io.vertx.core.net.NetClientOptions(value);
        } else {
            this.__wrappedObject = new io.vertx.core.net.NetClientOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        }
        return Memory.NULL;
    }
        
    public io.vertx.core.net.NetClientOptions getWrappedObject(){
        return (io.vertx.core.net.NetClientOptions)__wrappedObject;
    }
    
    @Signature
    public int getConnectTimeout(){ 
        return this.getWrappedObject().getConnectTimeout();
    }
    
    @Signature
    public NetClientOptions setConnectTimeout(int connectTimeout){ 
        this.getWrappedObject().setConnectTimeout(connectTimeout);
        return this;
    }
        
    @Signature
    public NetClientOptions addCrlPath(java.lang.String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }
        
    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }
        
    @Signature
    public NetClientOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }
        
    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> new Buffer(__env__, v)).collect(Collectors.toList());
    }
        
    @Signature
    public NetClientOptions addEnabledCipherSuite(java.lang.String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }
        
    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }
        
    @Signature
    public NetClientOptions addEnabledSecureTransportProtocol(java.lang.String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }
        
    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }
    
    @Signature
    public String getHostnameVerificationAlgorithm(){ 
        return this.getWrappedObject().getHostnameVerificationAlgorithm();
    }
    
    @Signature
    public NetClientOptions setHostnameVerificationAlgorithm(String hostnameVerificationAlgorithm){ 
        this.getWrappedObject().setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm);
        return this;
    }
    
    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }
    
    @Signature
    public NetClientOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }
    
    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }
    
    @Signature
    public NetClientOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }
    
    @Signature
    public NetClientOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public String getLocalAddress(){ 
        return this.getWrappedObject().getLocalAddress();
    }
    
    @Signature
    public NetClientOptions setLocalAddress(String localAddress){ 
        this.getWrappedObject().setLocalAddress(localAddress);
        return this;
    }
    
    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }
    
    @Signature
    public NetClientOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }
    
    @Signature
    public String getMetricsName(){ 
        return this.getWrappedObject().getMetricsName();
    }
    
    @Signature
    public NetClientOptions setMetricsName(String metricsName){ 
        this.getWrappedObject().setMetricsName(metricsName);
        return this;
    }
    
    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }
    
    @Signature
    public NetClientOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }
    
    @Signature
    public NetClientOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }
    
    @Signature
    public NetClientOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }
    
    @Signature
    public NetClientOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }
    
    @Signature
    public NetClientOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public ProxyOptions getProxyOptions(){ 
        return new ProxyOptions(__env__, this.getWrappedObject().getProxyOptions());
    }
    
    @Signature
    public NetClientOptions setProxyOptions(ProxyOptions proxyOptions){ 
        this.getWrappedObject().setProxyOptions(proxyOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }
    
    @Signature
    public NetClientOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }
    
    @Signature
    public int getReconnectAttempts(){ 
        return this.getWrappedObject().getReconnectAttempts();
    }
    
    @Signature
    public NetClientOptions setReconnectAttempts(int reconnectAttempts){ 
        this.getWrappedObject().setReconnectAttempts(reconnectAttempts);
        return this;
    }
    
    @Signature
    public long getReconnectInterval(){ 
        return this.getWrappedObject().getReconnectInterval();
    }
    
    @Signature
    public NetClientOptions setReconnectInterval(long reconnectInterval){ 
        this.getWrappedObject().setReconnectInterval(reconnectInterval);
        return this;
    }
    
    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }
    
    @Signature
    public NetClientOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }
    
    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }
    
    @Signature
    public NetClientOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }
    
    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }
    
    @Signature
    public NetClientOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }
    
    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }
    
    @Signature
    public NetClientOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }
    
    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }
    
    @Signature
    public NetClientOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }
    
    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }
    
    @Signature
    public NetClientOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }
    
    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }
    
    @Signature
    public NetClientOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }
    
    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }
    
    @Signature
    public NetClientOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }
    
    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }
    
    @Signature
    public NetClientOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }
    
    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }
    
    @Signature
    public NetClientOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }
    
    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }
    
    @Signature
    public NetClientOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }
    
    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }
    
    @Signature
    public NetClientOptions setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }
    
    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }
    
    @Signature
    public NetClientOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }
    
    @Signature
    public NetClientOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }
    
    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }
    
    @Signature
    public NetClientOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }
    
}
