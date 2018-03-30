package io.vertx.php.amqpbridge;

import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.JdkSSLEngineOptions;
import io.vertx.php.core.net.JksOptions;
import io.vertx.php.core.net.OpenSSLEngineOptions;
import io.vertx.php.core.net.PemKeyCertOptions;
import io.vertx.php.core.net.PemTrustOptions;
import io.vertx.php.core.net.PfxOptions;
import io.vertx.php.core.net.ProxyOptions;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.develnext.jphp.zend.ext.json.JsonFunctions;
import php.runtime.Memory;
import php.runtime.memory.ObjectMemory;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;

@SuppressWarnings("unused")
@Name("AmqpBridgeOptions")
@Namespace("io\\vertx\\php\\amqpbridge")
//false
public  class AmqpBridgeOptions extends DataObjectWrapper<io.vertx.amqpbridge.AmqpBridgeOptions> { 
    public AmqpBridgeOptions(Environment env, io.vertx.amqpbridge.AmqpBridgeOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public AmqpBridgeOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.amqpbridge.AmqpBridgeOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.amqpbridge.AmqpBridgeOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getConnectTimeout(){ 
        return this.getWrappedObject().getConnectTimeout();
    }

    @Signature
    public AmqpBridgeOptions setConnectTimeout(int connectTimeout){ 
        this.getWrappedObject().setConnectTimeout(connectTimeout);
        return this;
    }

    @Signature
    public String getContainerId(){ 
        return this.getWrappedObject().getContainerId();
    }

    @Signature
    public AmqpBridgeOptions setContainerId(String containerId){ 
        this.getWrappedObject().setContainerId(containerId);
        return this;
    }

    @Signature
    public AmqpBridgeOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public AmqpBridgeOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }

    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public AmqpBridgeOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public AmqpBridgeOptions addEnabledSaslMechanism(String enabledSaslMechanisms){ 
        this.getWrappedObject().addEnabledSaslMechanism(enabledSaslMechanisms);
        return this;
    }

    @Signature
    public Set<String> getEnabledSaslMechanisms(){ 
        return this.getWrappedObject().getEnabledSaslMechanisms();
    }

    @Signature
    public AmqpBridgeOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public AmqpBridgeOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public int getHeartbeat(){ 
        return this.getWrappedObject().getHeartbeat();
    }

    @Signature
    public AmqpBridgeOptions setHeartbeat(int heartbeat){ 
        this.getWrappedObject().setHeartbeat(heartbeat);
        return this;
    }

    @Signature
    public String getHostnameVerificationAlgorithm(){ 
        return this.getWrappedObject().getHostnameVerificationAlgorithm();
    }

    @Signature
    public AmqpBridgeOptions setHostnameVerificationAlgorithm(String hostnameVerificationAlgorithm){ 
        this.getWrappedObject().setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public AmqpBridgeOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public AmqpBridgeOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public AmqpBridgeOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getLocalAddress(){ 
        return this.getWrappedObject().getLocalAddress();
    }

    @Signature
    public AmqpBridgeOptions setLocalAddress(String localAddress){ 
        this.getWrappedObject().setLocalAddress(localAddress);
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public AmqpBridgeOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public int getMaxFrameSize(){ 
        return this.getWrappedObject().getMaxFrameSize();
    }

    @Signature
    public AmqpBridgeOptions setMaxFrameSize(int maxFrameSize){ 
        this.getWrappedObject().setMaxFrameSize(maxFrameSize);
        return this;
    }

    @Signature
    public String getMetricsName(){ 
        return this.getWrappedObject().getMetricsName();
    }

    @Signature
    public AmqpBridgeOptions setMetricsName(String metricsName){ 
        this.getWrappedObject().setMetricsName(metricsName);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public AmqpBridgeOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public AmqpBridgeOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public AmqpBridgeOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public AmqpBridgeOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public AmqpBridgeOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public ProxyOptions getProxyOptions(){ 
        return new ProxyOptions(__env__, this.getWrappedObject().getProxyOptions());
    }

    @Signature
    public AmqpBridgeOptions setProxyOptions(ProxyOptions proxyOptions){ 
        this.getWrappedObject().setProxyOptions(proxyOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public AmqpBridgeOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public int getReconnectAttempts(){ 
        return this.getWrappedObject().getReconnectAttempts();
    }

    @Signature
    public AmqpBridgeOptions setReconnectAttempts(int reconnectAttempts){ 
        this.getWrappedObject().setReconnectAttempts(reconnectAttempts);
        return this;
    }

    @Signature
    public long getReconnectInterval(){ 
        return this.getWrappedObject().getReconnectInterval();
    }

    @Signature
    public AmqpBridgeOptions setReconnectInterval(long reconnectInterval){ 
        this.getWrappedObject().setReconnectInterval(reconnectInterval);
        return this;
    }

    @Signature
    public boolean isReplyHandlingSupport(){ 
        return this.getWrappedObject().isReplyHandlingSupport();
    }

    @Signature
    public AmqpBridgeOptions setReplyHandlingSupport(boolean replyHandlingSupport){ 
        this.getWrappedObject().setReplyHandlingSupport(replyHandlingSupport);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public AmqpBridgeOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public AmqpBridgeOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public AmqpBridgeOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public String getSniServerName(){ 
        return this.getWrappedObject().getSniServerName();
    }

    @Signature
    public AmqpBridgeOptions setSniServerName(String sniServerName){ 
        this.getWrappedObject().setSniServerName(sniServerName);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public AmqpBridgeOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public AmqpBridgeOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public AmqpBridgeOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public AmqpBridgeOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public AmqpBridgeOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public AmqpBridgeOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public AmqpBridgeOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public AmqpBridgeOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }

    @Signature
    public AmqpBridgeOptions setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public AmqpBridgeOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public AmqpBridgeOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public AmqpBridgeOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Signature
    public String getVhost(){ 
        return this.getWrappedObject().getVhost();
    }

    @Signature
    public AmqpBridgeOptions setVhost(String vhost){ 
        this.getWrappedObject().setVhost(vhost);
        return this;
    }

    @Signature
    public String getVirtualHost(){ 
        return this.getWrappedObject().getVirtualHost();
    }

    @Signature
    public AmqpBridgeOptions setVirtualHost(String virtualHost){ 
        this.getWrappedObject().setVirtualHost(virtualHost);
        return this;
    }
}
