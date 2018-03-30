package io.vertx.php.ext.shell.term;

import io.vertx.core.http.ClientAuth;
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
import io.vertx.php.ext.auth.AuthOptions;
import io.vertx.php.ext.web.handler.sockjs.SockJSHandlerOptions;
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
@Name("HttpTermOptions")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
//false
public  class HttpTermOptions extends DataObjectWrapper<io.vertx.ext.shell.term.HttpTermOptions> { 
    public HttpTermOptions(Environment env, io.vertx.ext.shell.term.HttpTermOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public HttpTermOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.shell.term.HttpTermOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.shell.term.HttpTermOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getAcceptBacklog(){ 
        return this.getWrappedObject().getAcceptBacklog();
    }

    @Signature
    public HttpTermOptions setAcceptBacklog(int acceptBacklog){ 
        this.getWrappedObject().setAcceptBacklog(acceptBacklog);
        return this;
    }

    @Signature
    public boolean isAcceptUnmaskedFrames(){ 
        return this.getWrappedObject().isAcceptUnmaskedFrames();
    }

    @Signature
    public HttpTermOptions setAcceptUnmaskedFrames(boolean acceptUnmaskedFrames){ 
        this.getWrappedObject().setAcceptUnmaskedFrames(acceptUnmaskedFrames);
        return this;
    }

    @Signature
    public List<HttpVersion> getAlpnVersions(){ 
        return this.getWrappedObject().getAlpnVersions();
    }

    @Signature
    public HttpTermOptions setAlpnVersions(List<HttpVersion> alpnVersions){ 
        this.getWrappedObject().setAlpnVersions(alpnVersions);
        return this;
    }

    @Signature
    public AuthOptions getAuthOptions(){ 
        return new AuthOptions(__env__, this.getWrappedObject().getAuthOptions());
    }

    @Signature
    public String getCharset(){ 
        return this.getWrappedObject().getCharset();
    }

    @Signature
    public HttpTermOptions setCharset(String charset){ 
        this.getWrappedObject().setCharset(charset);
        return this;
    }

    @Signature
    public ClientAuth getClientAuth(){ 
        return this.getWrappedObject().getClientAuth();
    }

    @Signature
    public HttpTermOptions setClientAuth(ClientAuth clientAuth){ 
        this.getWrappedObject().setClientAuth(clientAuth);
        return this;
    }

    @Signature
    public boolean isClientAuthRequired(){ 
        return this.getWrappedObject().isClientAuthRequired();
    }

    @Signature
    public HttpTermOptions setClientAuthRequired(boolean clientAuthRequired){ 
        this.getWrappedObject().setClientAuthRequired(clientAuthRequired);
        return this;
    }

    @Signature
    public int getCompressionLevel(){ 
        return this.getWrappedObject().getCompressionLevel();
    }

    @Signature
    public HttpTermOptions setCompressionLevel(int compressionLevel){ 
        this.getWrappedObject().setCompressionLevel(compressionLevel);
        return this;
    }

    @Signature
    public boolean isCompressionSupported(){ 
        return this.getWrappedObject().isCompressionSupported();
    }

    @Signature
    public HttpTermOptions setCompressionSupported(boolean compressionSupported){ 
        this.getWrappedObject().setCompressionSupported(compressionSupported);
        return this;
    }

    @Signature
    public HttpTermOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public HttpTermOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
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
    public HttpTermOptions setDecoderInitialBufferSize(int decoderInitialBufferSize){ 
        this.getWrappedObject().setDecoderInitialBufferSize(decoderInitialBufferSize);
        return this;
    }

    @Signature
    public boolean isDecompressionSupported(){ 
        return this.getWrappedObject().isDecompressionSupported();
    }

    @Signature
    public HttpTermOptions setDecompressionSupported(boolean decompressionSupported){ 
        this.getWrappedObject().setDecompressionSupported(decompressionSupported);
        return this;
    }

    @Signature
    public HttpTermOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public HttpTermOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public HttpTermOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public boolean isHandle100ContinueAutomatically(){ 
        return this.getWrappedObject().isHandle100ContinueAutomatically();
    }

    @Signature
    public HttpTermOptions setHandle100ContinueAutomatically(boolean handle100ContinueAutomatically){ 
        this.getWrappedObject().setHandle100ContinueAutomatically(handle100ContinueAutomatically);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public HttpTermOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public int getHttp2ConnectionWindowSize(){ 
        return this.getWrappedObject().getHttp2ConnectionWindowSize();
    }

    @Signature
    public HttpTermOptions setHttp2ConnectionWindowSize(int http2ConnectionWindowSize){ 
        this.getWrappedObject().setHttp2ConnectionWindowSize(http2ConnectionWindowSize);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public HttpTermOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public Http2Settings getInitialSettings(){ 
        return new Http2Settings(__env__, this.getWrappedObject().getInitialSettings());
    }

    @Signature
    public HttpTermOptions setInitialSettings(Http2Settings initialSettings){ 
        this.getWrappedObject().setInitialSettings(initialSettings.getWrappedObject());
        return this;
    }

    @Signature
    public String getIntputrc(){ 
        return this.getWrappedObject().getIntputrc();
    }

    @Signature
    public HttpTermOptions setIntputrc(String intputrc){ 
        this.getWrappedObject().setIntputrc(intputrc);
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public HttpTermOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public HttpTermOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public HttpTermOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public int getMaxChunkSize(){ 
        return this.getWrappedObject().getMaxChunkSize();
    }

    @Signature
    public HttpTermOptions setMaxChunkSize(int maxChunkSize){ 
        this.getWrappedObject().setMaxChunkSize(maxChunkSize);
        return this;
    }

    @Signature
    public int getMaxHeaderSize(){ 
        return this.getWrappedObject().getMaxHeaderSize();
    }

    @Signature
    public HttpTermOptions setMaxHeaderSize(int maxHeaderSize){ 
        this.getWrappedObject().setMaxHeaderSize(maxHeaderSize);
        return this;
    }

    @Signature
    public int getMaxInitialLineLength(){ 
        return this.getWrappedObject().getMaxInitialLineLength();
    }

    @Signature
    public HttpTermOptions setMaxInitialLineLength(int maxInitialLineLength){ 
        this.getWrappedObject().setMaxInitialLineLength(maxInitialLineLength);
        return this;
    }

    @Signature
    public int getMaxWebsocketFrameSize(){ 
        return this.getWrappedObject().getMaxWebsocketFrameSize();
    }

    @Signature
    public HttpTermOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize){ 
        this.getWrappedObject().setMaxWebsocketFrameSize(maxWebsocketFrameSize);
        return this;
    }

    @Signature
    public int getMaxWebsocketMessageSize(){ 
        return this.getWrappedObject().getMaxWebsocketMessageSize();
    }

    @Signature
    public HttpTermOptions setMaxWebsocketMessageSize(int maxWebsocketMessageSize){ 
        this.getWrappedObject().setMaxWebsocketMessageSize(maxWebsocketMessageSize);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public HttpTermOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public HttpTermOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public HttpTermOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public HttpTermOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public HttpTermOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public HttpTermOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public HttpTermOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public HttpTermOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public HttpTermOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public HttpTermOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public Buffer getShellHtmlResource(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getShellHtmlResource());
    }

    @Signature
    public HttpTermOptions setShellHtmlResource(Buffer shellHtmlResource){ 
        this.getWrappedObject().setShellHtmlResource(shellHtmlResource.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isSni(){ 
        return this.getWrappedObject().isSni();
    }

    @Signature
    public HttpTermOptions setSni(boolean sni){ 
        this.getWrappedObject().setSni(sni);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public HttpTermOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public SockJSHandlerOptions getSockJSHandlerOptions(){ 
        return new SockJSHandlerOptions(__env__, this.getWrappedObject().getSockJSHandlerOptions());
    }

    @Signature
    public HttpTermOptions setSockJSHandlerOptions(SockJSHandlerOptions sockJSHandlerOptions){ 
        this.getWrappedObject().setSockJSHandlerOptions(sockJSHandlerOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getSockJSPath(){ 
        return this.getWrappedObject().getSockJSPath();
    }

    @Signature
    public HttpTermOptions setSockJSPath(String sockJSPath){ 
        this.getWrappedObject().setSockJSPath(sockJSPath);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public HttpTermOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public HttpTermOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public HttpTermOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public HttpTermOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public HttpTermOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public HttpTermOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public Buffer getTermJsResource(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getTermJsResource());
    }

    @Signature
    public HttpTermOptions setTermJsResource(Buffer termJsResource){ 
        this.getWrappedObject().setTermJsResource(termJsResource.getWrappedObject());
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public HttpTermOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public HttpTermOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public HttpTermOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public HttpTermOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Signature
    public Buffer getVertsShellJsResource(){ 
        return Buffer.__create(__env__, this.getWrappedObject().getVertsShellJsResource());
    }

    @Signature
    public HttpTermOptions setVertsShellJsResource(Buffer vertsShellJsResource){ 
        this.getWrappedObject().setVertsShellJsResource(vertsShellJsResource.getWrappedObject());
        return this;
    }

    @Signature
    public String getWebsocketSubProtocols(){ 
        return this.getWrappedObject().getWebsocketSubProtocols();
    }

    @Signature
    public HttpTermOptions setWebsocketSubProtocols(String websocketSubProtocols){ 
        this.getWrappedObject().setWebsocketSubProtocols(websocketSubProtocols);
        return this;
    }
}
