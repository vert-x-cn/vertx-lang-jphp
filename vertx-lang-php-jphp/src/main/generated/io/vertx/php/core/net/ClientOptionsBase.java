package io.vertx.php.core.net;

import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.TCPSSLOptions;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("ClientOptionsBase")
@Namespace("io\\vertx\\php\\core\\net")
public abstract class ClientOptionsBase extends TCPSSLOptions { 
    public ClientOptionsBase(Environment env, io.vertx.core.net.ClientOptionsBase wrappedObject) {
        super(env, wrappedObject);
    }

    public ClientOptionsBase(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
        
    public io.vertx.core.net.ClientOptionsBase getWrappedObject(){
        return (io.vertx.core.net.ClientOptionsBase)__wrappedObject;
    }
    
    @Signature
    public int getConnectTimeout(){ 
        return this.getWrappedObject().getConnectTimeout();
    }
    
    @Signature
    public ClientOptionsBase setConnectTimeout(int connectTimeout){ 
        this.getWrappedObject().setConnectTimeout(connectTimeout);
        return this;
    }
        
    @Signature
    public ClientOptionsBase addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }
        
    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }
        
    @Signature
    public ClientOptionsBase addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }
        
    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> new Buffer(__env__, v)).collect(Collectors.toList());
    }
        
    @Signature
    public ClientOptionsBase addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }
        
    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }
        
    @Signature
    public ClientOptionsBase addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }
        
    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }
    
    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }
    
    @Signature
    public ClientOptionsBase setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }
    
    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }
    
    @Signature
    public ClientOptionsBase setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }
    
    @Signature
    public ClientOptionsBase setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public String getLocalAddress(){ 
        return this.getWrappedObject().getLocalAddress();
    }
    
    @Signature
    public ClientOptionsBase setLocalAddress(String localAddress){ 
        this.getWrappedObject().setLocalAddress(localAddress);
        return this;
    }
    
    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }
    
    @Signature
    public ClientOptionsBase setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }
    
    @Signature
    public String getMetricsName(){ 
        return this.getWrappedObject().getMetricsName();
    }
    
    @Signature
    public ClientOptionsBase setMetricsName(String metricsName){ 
        this.getWrappedObject().setMetricsName(metricsName);
        return this;
    }
    
    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }
    
    @Signature
    public ClientOptionsBase setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }
    
    @Signature
    public ClientOptionsBase setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }
    
    @Signature
    public ClientOptionsBase setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }
    
    @Signature
    public ClientOptionsBase setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }
    
    @Signature
    public ClientOptionsBase setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public ProxyOptions getProxyOptions(){ 
        return new ProxyOptions(__env__, this.getWrappedObject().getProxyOptions());
    }
    
    @Signature
    public ClientOptionsBase setProxyOptions(ProxyOptions proxyOptions){ 
        this.getWrappedObject().setProxyOptions(proxyOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }
    
    @Signature
    public ClientOptionsBase setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }
    
    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }
    
    @Signature
    public ClientOptionsBase setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }
    
    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }
    
    @Signature
    public ClientOptionsBase setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }
    
    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }
    
    @Signature
    public ClientOptionsBase setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }
    
    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }
    
    @Signature
    public ClientOptionsBase setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }
    
    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }
    
    @Signature
    public ClientOptionsBase setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }
    
    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }
    
    @Signature
    public ClientOptionsBase setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }
    
    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }
    
    @Signature
    public ClientOptionsBase setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }
    
    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }
    
    @Signature
    public ClientOptionsBase setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }
    
    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }
    
    @Signature
    public ClientOptionsBase setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }
    
    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }
    
    @Signature
    public ClientOptionsBase setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }
    
    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }
    
    @Signature
    public ClientOptionsBase setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }
    
    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }
    
    @Signature
    public ClientOptionsBase setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }
    
    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }
    
    @Signature
    public ClientOptionsBase setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }
    
    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }
    
    @Signature
    public ClientOptionsBase setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }
    
    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }
    
    @Signature
    public ClientOptionsBase setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }
    
}
