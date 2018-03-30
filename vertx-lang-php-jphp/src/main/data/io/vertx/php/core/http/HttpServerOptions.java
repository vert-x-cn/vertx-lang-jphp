package io.vertx.php.core.http;

import io.vertx.core.http.ClientAuth;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.wrapper.DataObjectWrapper;
import io.vertx.php.core.buffer.Buffer;
import io.vertx.php.core.net.JdkSSLEngineOptions;
import io.vertx.php.core.net.JksOptions;
import io.vertx.php.core.net.OpenSSLEngineOptions;
import io.vertx.php.core.net.PemKeyCertOptions;
import io.vertx.php.core.net.PemTrustOptions;
import io.vertx.php.core.net.PfxOptions;
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
@Name("HttpServerOptions")
@Namespace("io\\vertx\\php\\core\\http")
//false
public  class HttpServerOptions extends DataObjectWrapper<io.vertx.core.http.HttpServerOptions> { 
    public HttpServerOptions(Environment env, io.vertx.core.http.HttpServerOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public HttpServerOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.core.http.HttpServerOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.core.http.HttpServerOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getAcceptBacklog(){ 
        return this.getWrappedObject().getAcceptBacklog();
    }

    @Signature
    public HttpServerOptions setAcceptBacklog(int acceptBacklog){ 
        this.getWrappedObject().setAcceptBacklog(acceptBacklog);
        return this;
    }

    @Signature
    public boolean isAcceptUnmaskedFrames(){ 
        return this.getWrappedObject().isAcceptUnmaskedFrames();
    }

    @Signature
    public HttpServerOptions setAcceptUnmaskedFrames(boolean acceptUnmaskedFrames){ 
        this.getWrappedObject().setAcceptUnmaskedFrames(acceptUnmaskedFrames);
        return this;
    }

    @Signature
    public List<HttpVersion> getAlpnVersions(){ 
        return this.getWrappedObject().getAlpnVersions();
    }

    @Signature
    public HttpServerOptions setAlpnVersions(List<HttpVersion> alpnVersions){ 
        this.getWrappedObject().setAlpnVersions(alpnVersions);
        return this;
    }

    @Signature
    public ClientAuth getClientAuth(){ 
        return this.getWrappedObject().getClientAuth();
    }

    @Signature
    public HttpServerOptions setClientAuth(ClientAuth clientAuth){ 
        this.getWrappedObject().setClientAuth(clientAuth);
        return this;
    }

    @Signature
    public boolean isClientAuthRequired(){ 
        return this.getWrappedObject().isClientAuthRequired();
    }

    @Signature
    public HttpServerOptions setClientAuthRequired(boolean clientAuthRequired){ 
        this.getWrappedObject().setClientAuthRequired(clientAuthRequired);
        return this;
    }

    @Signature
    public int getCompressionLevel(){ 
        return this.getWrappedObject().getCompressionLevel();
    }

    @Signature
    public HttpServerOptions setCompressionLevel(int compressionLevel){ 
        this.getWrappedObject().setCompressionLevel(compressionLevel);
        return this;
    }

    @Signature
    public boolean isCompressionSupported(){ 
        return this.getWrappedObject().isCompressionSupported();
    }

    @Signature
    public HttpServerOptions setCompressionSupported(boolean compressionSupported){ 
        this.getWrappedObject().setCompressionSupported(compressionSupported);
        return this;
    }

    @Signature
    public HttpServerOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public HttpServerOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
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
    public HttpServerOptions setDecoderInitialBufferSize(int decoderInitialBufferSize){ 
        this.getWrappedObject().setDecoderInitialBufferSize(decoderInitialBufferSize);
        return this;
    }

    @Signature
    public boolean isDecompressionSupported(){ 
        return this.getWrappedObject().isDecompressionSupported();
    }

    @Signature
    public HttpServerOptions setDecompressionSupported(boolean decompressionSupported){ 
        this.getWrappedObject().setDecompressionSupported(decompressionSupported);
        return this;
    }

    @Signature
    public HttpServerOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public HttpServerOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public HttpServerOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public boolean isHandle100ContinueAutomatically(){ 
        return this.getWrappedObject().isHandle100ContinueAutomatically();
    }

    @Signature
    public HttpServerOptions setHandle100ContinueAutomatically(boolean handle100ContinueAutomatically){ 
        this.getWrappedObject().setHandle100ContinueAutomatically(handle100ContinueAutomatically);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public HttpServerOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public int getHttp2ConnectionWindowSize(){ 
        return this.getWrappedObject().getHttp2ConnectionWindowSize();
    }

    @Signature
    public HttpServerOptions setHttp2ConnectionWindowSize(int http2ConnectionWindowSize){ 
        this.getWrappedObject().setHttp2ConnectionWindowSize(http2ConnectionWindowSize);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public HttpServerOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public Http2Settings getInitialSettings(){ 
        return new Http2Settings(__env__, this.getWrappedObject().getInitialSettings());
    }

    @Signature
    public HttpServerOptions setInitialSettings(Http2Settings initialSettings){ 
        this.getWrappedObject().setInitialSettings(initialSettings.getWrappedObject());
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public HttpServerOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public HttpServerOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public HttpServerOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public int getMaxChunkSize(){ 
        return this.getWrappedObject().getMaxChunkSize();
    }

    @Signature
    public HttpServerOptions setMaxChunkSize(int maxChunkSize){ 
        this.getWrappedObject().setMaxChunkSize(maxChunkSize);
        return this;
    }

    @Signature
    public int getMaxHeaderSize(){ 
        return this.getWrappedObject().getMaxHeaderSize();
    }

    @Signature
    public HttpServerOptions setMaxHeaderSize(int maxHeaderSize){ 
        this.getWrappedObject().setMaxHeaderSize(maxHeaderSize);
        return this;
    }

    @Signature
    public int getMaxInitialLineLength(){ 
        return this.getWrappedObject().getMaxInitialLineLength();
    }

    @Signature
    public HttpServerOptions setMaxInitialLineLength(int maxInitialLineLength){ 
        this.getWrappedObject().setMaxInitialLineLength(maxInitialLineLength);
        return this;
    }

    @Signature
    public int getMaxWebsocketFrameSize(){ 
        return this.getWrappedObject().getMaxWebsocketFrameSize();
    }

    @Signature
    public HttpServerOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize){ 
        this.getWrappedObject().setMaxWebsocketFrameSize(maxWebsocketFrameSize);
        return this;
    }

    @Signature
    public int getMaxWebsocketMessageSize(){ 
        return this.getWrappedObject().getMaxWebsocketMessageSize();
    }

    @Signature
    public HttpServerOptions setMaxWebsocketMessageSize(int maxWebsocketMessageSize){ 
        this.getWrappedObject().setMaxWebsocketMessageSize(maxWebsocketMessageSize);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public HttpServerOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public HttpServerOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public HttpServerOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public HttpServerOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public HttpServerOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public HttpServerOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public HttpServerOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public HttpServerOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public HttpServerOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public HttpServerOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public boolean isSni(){ 
        return this.getWrappedObject().isSni();
    }

    @Signature
    public HttpServerOptions setSni(boolean sni){ 
        this.getWrappedObject().setSni(sni);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public HttpServerOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public HttpServerOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public HttpServerOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public HttpServerOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public HttpServerOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public HttpServerOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public HttpServerOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public HttpServerOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public HttpServerOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public HttpServerOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public HttpServerOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Signature
    public String getWebsocketSubProtocols(){ 
        return this.getWrappedObject().getWebsocketSubProtocols();
    }

    @Signature
    public HttpServerOptions setWebsocketSubProtocols(String websocketSubProtocols){ 
        this.getWrappedObject().setWebsocketSubProtocols(websocketSubProtocols);
        return this;
    }
}
