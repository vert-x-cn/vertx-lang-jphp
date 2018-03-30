package io.vertx.php.ext.web.client;

import io.vertx.core.http.HttpVersion;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.http.Http2Settings;
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
@Name("WebClientOptions")
@Namespace("io\\vertx\\php\\ext\\web\\client")
//false
public  class WebClientOptions extends DataObjectWrapper<io.vertx.ext.web.client.WebClientOptions> { 
    public WebClientOptions(Environment env, io.vertx.ext.web.client.WebClientOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public WebClientOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.web.client.WebClientOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.web.client.WebClientOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<HttpVersion> getAlpnVersions(){ 
        return this.getWrappedObject().getAlpnVersions();
    }

    @Signature
    public WebClientOptions setAlpnVersions(List<HttpVersion> alpnVersions){ 
        this.getWrappedObject().setAlpnVersions(alpnVersions);
        return this;
    }

    @Signature
    public int getConnectTimeout(){ 
        return this.getWrappedObject().getConnectTimeout();
    }

    @Signature
    public WebClientOptions setConnectTimeout(int connectTimeout){ 
        this.getWrappedObject().setConnectTimeout(connectTimeout);
        return this;
    }

    @Signature
    public WebClientOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public WebClientOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }

    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public int getDecoderInitialBufferSize(){ 
        return this.getWrappedObject().getDecoderInitialBufferSize();
    }

    @Signature
    public WebClientOptions setDecoderInitialBufferSize(int decoderInitialBufferSize){ 
        this.getWrappedObject().setDecoderInitialBufferSize(decoderInitialBufferSize);
        return this;
    }

    @Signature
    public String getDefaultHost(){ 
        return this.getWrappedObject().getDefaultHost();
    }

    @Signature
    public WebClientOptions setDefaultHost(String defaultHost){ 
        this.getWrappedObject().setDefaultHost(defaultHost);
        return this;
    }

    @Signature
    public int getDefaultPort(){ 
        return this.getWrappedObject().getDefaultPort();
    }

    @Signature
    public WebClientOptions setDefaultPort(int defaultPort){ 
        this.getWrappedObject().setDefaultPort(defaultPort);
        return this;
    }

    @Signature
    public WebClientOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public WebClientOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public WebClientOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public boolean isFollowRedirects(){ 
        return this.getWrappedObject().isFollowRedirects();
    }

    @Signature
    public WebClientOptions setFollowRedirects(boolean followRedirects){ 
        this.getWrappedObject().setFollowRedirects(followRedirects);
        return this;
    }

    @Signature
    public boolean isForceSni(){ 
        return this.getWrappedObject().isForceSni();
    }

    @Signature
    public WebClientOptions setForceSni(boolean forceSni){ 
        this.getWrappedObject().setForceSni(forceSni);
        return this;
    }

    @Signature
    public boolean isHttp2ClearTextUpgrade(){ 
        return this.getWrappedObject().isHttp2ClearTextUpgrade();
    }

    @Signature
    public WebClientOptions setHttp2ClearTextUpgrade(boolean http2ClearTextUpgrade){ 
        this.getWrappedObject().setHttp2ClearTextUpgrade(http2ClearTextUpgrade);
        return this;
    }

    @Signature
    public int getHttp2ConnectionWindowSize(){ 
        return this.getWrappedObject().getHttp2ConnectionWindowSize();
    }

    @Signature
    public WebClientOptions setHttp2ConnectionWindowSize(int http2ConnectionWindowSize){ 
        this.getWrappedObject().setHttp2ConnectionWindowSize(http2ConnectionWindowSize);
        return this;
    }

    @Signature
    public int getHttp2MaxPoolSize(){ 
        return this.getWrappedObject().getHttp2MaxPoolSize();
    }

    @Signature
    public WebClientOptions setHttp2MaxPoolSize(int http2MaxPoolSize){ 
        this.getWrappedObject().setHttp2MaxPoolSize(http2MaxPoolSize);
        return this;
    }

    @Signature
    public int getHttp2MultiplexingLimit(){ 
        return this.getWrappedObject().getHttp2MultiplexingLimit();
    }

    @Signature
    public WebClientOptions setHttp2MultiplexingLimit(int http2MultiplexingLimit){ 
        this.getWrappedObject().setHttp2MultiplexingLimit(http2MultiplexingLimit);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public WebClientOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public Http2Settings getInitialSettings(){ 
        return new Http2Settings(__env__, this.getWrappedObject().getInitialSettings());
    }

    @Signature
    public WebClientOptions setInitialSettings(Http2Settings initialSettings){ 
        this.getWrappedObject().setInitialSettings(initialSettings.getWrappedObject());
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public WebClientOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isKeepAlive(){ 
        return this.getWrappedObject().isKeepAlive();
    }

    @Signature
    public WebClientOptions setKeepAlive(boolean keepAlive){ 
        this.getWrappedObject().setKeepAlive(keepAlive);
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public WebClientOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getLocalAddress(){ 
        return this.getWrappedObject().getLocalAddress();
    }

    @Signature
    public WebClientOptions setLocalAddress(String localAddress){ 
        this.getWrappedObject().setLocalAddress(localAddress);
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public WebClientOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public int getMaxChunkSize(){ 
        return this.getWrappedObject().getMaxChunkSize();
    }

    @Signature
    public WebClientOptions setMaxChunkSize(int maxChunkSize){ 
        this.getWrappedObject().setMaxChunkSize(maxChunkSize);
        return this;
    }

    @Signature
    public int getMaxHeaderSize(){ 
        return this.getWrappedObject().getMaxHeaderSize();
    }

    @Signature
    public WebClientOptions setMaxHeaderSize(int maxHeaderSize){ 
        this.getWrappedObject().setMaxHeaderSize(maxHeaderSize);
        return this;
    }

    @Signature
    public int getMaxInitialLineLength(){ 
        return this.getWrappedObject().getMaxInitialLineLength();
    }

    @Signature
    public WebClientOptions setMaxInitialLineLength(int maxInitialLineLength){ 
        this.getWrappedObject().setMaxInitialLineLength(maxInitialLineLength);
        return this;
    }

    @Signature
    public int getMaxPoolSize(){ 
        return this.getWrappedObject().getMaxPoolSize();
    }

    @Signature
    public WebClientOptions setMaxPoolSize(int maxPoolSize){ 
        this.getWrappedObject().setMaxPoolSize(maxPoolSize);
        return this;
    }

    @Signature
    public int getMaxRedirects(){ 
        return this.getWrappedObject().getMaxRedirects();
    }

    @Signature
    public WebClientOptions setMaxRedirects(int maxRedirects){ 
        this.getWrappedObject().setMaxRedirects(maxRedirects);
        return this;
    }

    @Signature
    public int getMaxWaitQueueSize(){ 
        return this.getWrappedObject().getMaxWaitQueueSize();
    }

    @Signature
    public WebClientOptions setMaxWaitQueueSize(int maxWaitQueueSize){ 
        this.getWrappedObject().setMaxWaitQueueSize(maxWaitQueueSize);
        return this;
    }

    @Signature
    public int getMaxWebsocketFrameSize(){ 
        return this.getWrappedObject().getMaxWebsocketFrameSize();
    }

    @Signature
    public WebClientOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize){ 
        this.getWrappedObject().setMaxWebsocketFrameSize(maxWebsocketFrameSize);
        return this;
    }

    @Signature
    public int getMaxWebsocketMessageSize(){ 
        return this.getWrappedObject().getMaxWebsocketMessageSize();
    }

    @Signature
    public WebClientOptions setMaxWebsocketMessageSize(int maxWebsocketMessageSize){ 
        this.getWrappedObject().setMaxWebsocketMessageSize(maxWebsocketMessageSize);
        return this;
    }

    @Signature
    public String getMetricsName(){ 
        return this.getWrappedObject().getMetricsName();
    }

    @Signature
    public WebClientOptions setMetricsName(String metricsName){ 
        this.getWrappedObject().setMetricsName(metricsName);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public WebClientOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public WebClientOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public WebClientOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public WebClientOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public WebClientOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isPipelining(){ 
        return this.getWrappedObject().isPipelining();
    }

    @Signature
    public WebClientOptions setPipelining(boolean pipelining){ 
        this.getWrappedObject().setPipelining(pipelining);
        return this;
    }

    @Signature
    public int getPipeliningLimit(){ 
        return this.getWrappedObject().getPipeliningLimit();
    }

    @Signature
    public WebClientOptions setPipeliningLimit(int pipeliningLimit){ 
        this.getWrappedObject().setPipeliningLimit(pipeliningLimit);
        return this;
    }

    @Signature
    public HttpVersion getProtocolVersion(){ 
        return this.getWrappedObject().getProtocolVersion();
    }

    @Signature
    public WebClientOptions setProtocolVersion(HttpVersion protocolVersion){ 
        this.getWrappedObject().setProtocolVersion(protocolVersion);
        return this;
    }

    @Signature
    public ProxyOptions getProxyOptions(){ 
        return new ProxyOptions(__env__, this.getWrappedObject().getProxyOptions());
    }

    @Signature
    public WebClientOptions setProxyOptions(ProxyOptions proxyOptions){ 
        this.getWrappedObject().setProxyOptions(proxyOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public WebClientOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public WebClientOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public WebClientOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public WebClientOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public boolean isSendUnmaskedFrames(){ 
        return this.getWrappedObject().isSendUnmaskedFrames();
    }

    @Signature
    public WebClientOptions setSendUnmaskedFrames(boolean sendUnmaskedFrames){ 
        this.getWrappedObject().setSendUnmaskedFrames(sendUnmaskedFrames);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public WebClientOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public WebClientOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public WebClientOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public WebClientOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public WebClientOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public WebClientOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public WebClientOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public WebClientOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }

    @Signature
    public WebClientOptions setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public WebClientOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isTryUseCompression(){ 
        return this.getWrappedObject().isTryUseCompression();
    }

    @Signature
    public WebClientOptions setTryUseCompression(boolean tryUseCompression){ 
        this.getWrappedObject().setTryUseCompression(tryUseCompression);
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public WebClientOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public WebClientOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Signature
    public String getUserAgent(){ 
        return this.getWrappedObject().getUserAgent();
    }

    @Signature
    public WebClientOptions setUserAgent(String userAgent){ 
        this.getWrappedObject().setUserAgent(userAgent);
        return this;
    }

    @Signature
    public boolean isUserAgentEnabled(){ 
        return this.getWrappedObject().isUserAgentEnabled();
    }

    @Signature
    public WebClientOptions setUserAgentEnabled(boolean userAgentEnabled){ 
        this.getWrappedObject().setUserAgentEnabled(userAgentEnabled);
        return this;
    }

    @Signature
    public boolean isVerifyHost(){ 
        return this.getWrappedObject().isVerifyHost();
    }

    @Signature
    public WebClientOptions setVerifyHost(boolean verifyHost){ 
        this.getWrappedObject().setVerifyHost(verifyHost);
        return this;
    }
}
