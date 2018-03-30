package io.vertx.php.ext.auth.oauth2;

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
import io.vertx.php.ext.auth.PubSecKeyOptions;
import io.vertx.php.ext.jwt.JWTOptions;
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
@Name("OAuth2ClientOptions")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2")
//false
public  class OAuth2ClientOptions extends DataObjectWrapper<io.vertx.ext.auth.oauth2.OAuth2ClientOptions> { 
    public OAuth2ClientOptions(Environment env, io.vertx.ext.auth.oauth2.OAuth2ClientOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public OAuth2ClientOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.auth.oauth2.OAuth2ClientOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.auth.oauth2.OAuth2ClientOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public List<HttpVersion> getAlpnVersions(){ 
        return this.getWrappedObject().getAlpnVersions();
    }

    @Signature
    public OAuth2ClientOptions setAlpnVersions(List<HttpVersion> alpnVersions){ 
        this.getWrappedObject().setAlpnVersions(alpnVersions);
        return this;
    }

    @Signature
    public String getAuthorizationPath(){ 
        return this.getWrappedObject().getAuthorizationPath();
    }

    @Signature
    public OAuth2ClientOptions setAuthorizationPath(String authorizationPath){ 
        this.getWrappedObject().setAuthorizationPath(authorizationPath);
        return this;
    }

    @Signature
    public String getClientID(){ 
        return this.getWrappedObject().getClientID();
    }

    @Signature
    public OAuth2ClientOptions setClientID(String clientID){ 
        this.getWrappedObject().setClientID(clientID);
        return this;
    }

    @Signature
    public String getClientSecret(){ 
        return this.getWrappedObject().getClientSecret();
    }

    @Signature
    public OAuth2ClientOptions setClientSecret(String clientSecret){ 
        this.getWrappedObject().setClientSecret(clientSecret);
        return this;
    }

    @Signature
    public String getClientSecretParameterName(){ 
        return this.getWrappedObject().getClientSecretParameterName();
    }

    @Signature
    public OAuth2ClientOptions setClientSecretParameterName(String clientSecretParameterName){ 
        this.getWrappedObject().setClientSecretParameterName(clientSecretParameterName);
        return this;
    }

    @Signature
    public int getConnectTimeout(){ 
        return this.getWrappedObject().getConnectTimeout();
    }

    @Signature
    public OAuth2ClientOptions setConnectTimeout(int connectTimeout){ 
        this.getWrappedObject().setConnectTimeout(connectTimeout);
        return this;
    }

    @Signature
    public OAuth2ClientOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public OAuth2ClientOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
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
    public OAuth2ClientOptions setDecoderInitialBufferSize(int decoderInitialBufferSize){ 
        this.getWrappedObject().setDecoderInitialBufferSize(decoderInitialBufferSize);
        return this;
    }

    @Signature
    public String getDefaultHost(){ 
        return this.getWrappedObject().getDefaultHost();
    }

    @Signature
    public OAuth2ClientOptions setDefaultHost(String defaultHost){ 
        this.getWrappedObject().setDefaultHost(defaultHost);
        return this;
    }

    @Signature
    public int getDefaultPort(){ 
        return this.getWrappedObject().getDefaultPort();
    }

    @Signature
    public OAuth2ClientOptions setDefaultPort(int defaultPort){ 
        this.getWrappedObject().setDefaultPort(defaultPort);
        return this;
    }

    @Signature
    public OAuth2ClientOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public OAuth2ClientOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public OAuth2ClientOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Memory getExtraParameters(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getExtraParameters().encode());
    }

    @Signature
    public OAuth2ClientOptions setExtraParameters(Memory extraParameters){ 
        this.getWrappedObject().setExtraParameters(new JsonObject(JsonFunctions.json_encode(extraParameters)));
        return this;
    }

    @Signature
    public boolean isForceSni(){ 
        return this.getWrappedObject().isForceSni();
    }

    @Signature
    public OAuth2ClientOptions setForceSni(boolean forceSni){ 
        this.getWrappedObject().setForceSni(forceSni);
        return this;
    }

    @Signature
    public Memory getHeaders(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getHeaders().encode());
    }

    @Signature
    public OAuth2ClientOptions setHeaders(Memory headers){ 
        this.getWrappedObject().setHeaders(new JsonObject(JsonFunctions.json_encode(headers)));
        return this;
    }

    @Signature
    public boolean isHttp2ClearTextUpgrade(){ 
        return this.getWrappedObject().isHttp2ClearTextUpgrade();
    }

    @Signature
    public OAuth2ClientOptions setHttp2ClearTextUpgrade(boolean http2ClearTextUpgrade){ 
        this.getWrappedObject().setHttp2ClearTextUpgrade(http2ClearTextUpgrade);
        return this;
    }

    @Signature
    public int getHttp2ConnectionWindowSize(){ 
        return this.getWrappedObject().getHttp2ConnectionWindowSize();
    }

    @Signature
    public OAuth2ClientOptions setHttp2ConnectionWindowSize(int http2ConnectionWindowSize){ 
        this.getWrappedObject().setHttp2ConnectionWindowSize(http2ConnectionWindowSize);
        return this;
    }

    @Signature
    public int getHttp2MaxPoolSize(){ 
        return this.getWrappedObject().getHttp2MaxPoolSize();
    }

    @Signature
    public OAuth2ClientOptions setHttp2MaxPoolSize(int http2MaxPoolSize){ 
        this.getWrappedObject().setHttp2MaxPoolSize(http2MaxPoolSize);
        return this;
    }

    @Signature
    public int getHttp2MultiplexingLimit(){ 
        return this.getWrappedObject().getHttp2MultiplexingLimit();
    }

    @Signature
    public OAuth2ClientOptions setHttp2MultiplexingLimit(int http2MultiplexingLimit){ 
        this.getWrappedObject().setHttp2MultiplexingLimit(http2MultiplexingLimit);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public OAuth2ClientOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public Http2Settings getInitialSettings(){ 
        return new Http2Settings(__env__, this.getWrappedObject().getInitialSettings());
    }

    @Signature
    public OAuth2ClientOptions setInitialSettings(Http2Settings initialSettings){ 
        this.getWrappedObject().setInitialSettings(initialSettings.getWrappedObject());
        return this;
    }

    @Signature
    public String getIntrospectionPath(){ 
        return this.getWrappedObject().getIntrospectionPath();
    }

    @Signature
    public OAuth2ClientOptions setIntrospectionPath(String introspectionPath){ 
        this.getWrappedObject().setIntrospectionPath(introspectionPath);
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public OAuth2ClientOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getJwkPath(){ 
        return this.getWrappedObject().getJwkPath();
    }

    @Signature
    public OAuth2ClientOptions setJwkPath(String jwkPath){ 
        this.getWrappedObject().setJwkPath(jwkPath);
        return this;
    }

    @Signature
    public JWTOptions getJWTOptions(){ 
        return new JWTOptions(__env__, this.getWrappedObject().getJWTOptions());
    }

    @Signature
    public OAuth2ClientOptions setJWTOptions(JWTOptions jwtOptions){ 
        this.getWrappedObject().setJWTOptions(jwtOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isJWTToken(){ 
        return this.getWrappedObject().isJWTToken();
    }

    @Signature
    public OAuth2ClientOptions setJWTToken(boolean jwtToken){ 
        this.getWrappedObject().setJWTToken(jwtToken);
        return this;
    }

    @Signature
    public boolean isKeepAlive(){ 
        return this.getWrappedObject().isKeepAlive();
    }

    @Signature
    public OAuth2ClientOptions setKeepAlive(boolean keepAlive){ 
        this.getWrappedObject().setKeepAlive(keepAlive);
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public OAuth2ClientOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public String getLocalAddress(){ 
        return this.getWrappedObject().getLocalAddress();
    }

    @Signature
    public OAuth2ClientOptions setLocalAddress(String localAddress){ 
        this.getWrappedObject().setLocalAddress(localAddress);
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public OAuth2ClientOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public String getLogoutPath(){ 
        return this.getWrappedObject().getLogoutPath();
    }

    @Signature
    public OAuth2ClientOptions setLogoutPath(String logoutPath){ 
        this.getWrappedObject().setLogoutPath(logoutPath);
        return this;
    }

    @Signature
    public int getMaxChunkSize(){ 
        return this.getWrappedObject().getMaxChunkSize();
    }

    @Signature
    public OAuth2ClientOptions setMaxChunkSize(int maxChunkSize){ 
        this.getWrappedObject().setMaxChunkSize(maxChunkSize);
        return this;
    }

    @Signature
    public int getMaxHeaderSize(){ 
        return this.getWrappedObject().getMaxHeaderSize();
    }

    @Signature
    public OAuth2ClientOptions setMaxHeaderSize(int maxHeaderSize){ 
        this.getWrappedObject().setMaxHeaderSize(maxHeaderSize);
        return this;
    }

    @Signature
    public int getMaxInitialLineLength(){ 
        return this.getWrappedObject().getMaxInitialLineLength();
    }

    @Signature
    public OAuth2ClientOptions setMaxInitialLineLength(int maxInitialLineLength){ 
        this.getWrappedObject().setMaxInitialLineLength(maxInitialLineLength);
        return this;
    }

    @Signature
    public int getMaxPoolSize(){ 
        return this.getWrappedObject().getMaxPoolSize();
    }

    @Signature
    public OAuth2ClientOptions setMaxPoolSize(int maxPoolSize){ 
        this.getWrappedObject().setMaxPoolSize(maxPoolSize);
        return this;
    }

    @Signature
    public int getMaxRedirects(){ 
        return this.getWrappedObject().getMaxRedirects();
    }

    @Signature
    public OAuth2ClientOptions setMaxRedirects(int maxRedirects){ 
        this.getWrappedObject().setMaxRedirects(maxRedirects);
        return this;
    }

    @Signature
    public int getMaxWaitQueueSize(){ 
        return this.getWrappedObject().getMaxWaitQueueSize();
    }

    @Signature
    public OAuth2ClientOptions setMaxWaitQueueSize(int maxWaitQueueSize){ 
        this.getWrappedObject().setMaxWaitQueueSize(maxWaitQueueSize);
        return this;
    }

    @Signature
    public int getMaxWebsocketFrameSize(){ 
        return this.getWrappedObject().getMaxWebsocketFrameSize();
    }

    @Signature
    public OAuth2ClientOptions setMaxWebsocketFrameSize(int maxWebsocketFrameSize){ 
        this.getWrappedObject().setMaxWebsocketFrameSize(maxWebsocketFrameSize);
        return this;
    }

    @Signature
    public int getMaxWebsocketMessageSize(){ 
        return this.getWrappedObject().getMaxWebsocketMessageSize();
    }

    @Signature
    public OAuth2ClientOptions setMaxWebsocketMessageSize(int maxWebsocketMessageSize){ 
        this.getWrappedObject().setMaxWebsocketMessageSize(maxWebsocketMessageSize);
        return this;
    }

    @Signature
    public String getMetricsName(){ 
        return this.getWrappedObject().getMetricsName();
    }

    @Signature
    public OAuth2ClientOptions setMetricsName(String metricsName){ 
        this.getWrappedObject().setMetricsName(metricsName);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public OAuth2ClientOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public OAuth2ClientOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public OAuth2ClientOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public OAuth2ClientOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public OAuth2ClientOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isPipelining(){ 
        return this.getWrappedObject().isPipelining();
    }

    @Signature
    public OAuth2ClientOptions setPipelining(boolean pipelining){ 
        this.getWrappedObject().setPipelining(pipelining);
        return this;
    }

    @Signature
    public int getPipeliningLimit(){ 
        return this.getWrappedObject().getPipeliningLimit();
    }

    @Signature
    public OAuth2ClientOptions setPipeliningLimit(int pipeliningLimit){ 
        this.getWrappedObject().setPipeliningLimit(pipeliningLimit);
        return this;
    }

    @Signature
    public HttpVersion getProtocolVersion(){ 
        return this.getWrappedObject().getProtocolVersion();
    }

    @Signature
    public OAuth2ClientOptions setProtocolVersion(HttpVersion protocolVersion){ 
        this.getWrappedObject().setProtocolVersion(protocolVersion);
        return this;
    }

    @Signature
    public ProxyOptions getProxyOptions(){ 
        return new ProxyOptions(__env__, this.getWrappedObject().getProxyOptions());
    }

    @Signature
    public OAuth2ClientOptions setProxyOptions(ProxyOptions proxyOptions){ 
        this.getWrappedObject().setProxyOptions(proxyOptions.getWrappedObject());
        return this;
    }

    @Signature
    public OAuth2ClientOptions addPubSecKey(io.vertx.ext.auth.PubSecKeyOptions pubSecKeys){ 
        this.getWrappedObject().addPubSecKey(pubSecKeys);
        return this;
    }

    @Signature
    public List<PubSecKeyOptions> getPubSecKeys(){ 
        return this.getWrappedObject().getPubSecKeys().stream().map(v -> new PubSecKeyOptions(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public OAuth2ClientOptions setPubSecKeys(List<PubSecKeyOptions> pubSecKeys){ 
        this.getWrappedObject().setPubSecKeys((pubSecKeys.stream().map(PubSecKeyOptions::getWrappedObject).collect(Collectors.toList())));
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public OAuth2ClientOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public OAuth2ClientOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public OAuth2ClientOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public String getRevocationPath(){ 
        return this.getWrappedObject().getRevocationPath();
    }

    @Signature
    public OAuth2ClientOptions setRevocationPath(String revocationPath){ 
        this.getWrappedObject().setRevocationPath(revocationPath);
        return this;
    }

    @Signature
    public String getScopeSeparator(){ 
        return this.getWrappedObject().getScopeSeparator();
    }

    @Signature
    public OAuth2ClientOptions setScopeSeparator(String scopeSeparator){ 
        this.getWrappedObject().setScopeSeparator(scopeSeparator);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public OAuth2ClientOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public boolean isSendUnmaskedFrames(){ 
        return this.getWrappedObject().isSendUnmaskedFrames();
    }

    @Signature
    public OAuth2ClientOptions setSendUnmaskedFrames(boolean sendUnmaskedFrames){ 
        this.getWrappedObject().setSendUnmaskedFrames(sendUnmaskedFrames);
        return this;
    }

    @Signature
    public String getSite(){ 
        return this.getWrappedObject().getSite();
    }

    @Signature
    public OAuth2ClientOptions setSite(String site){ 
        this.getWrappedObject().setSite(site);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public OAuth2ClientOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public OAuth2ClientOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public OAuth2ClientOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public OAuth2ClientOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public OAuth2ClientOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public OAuth2ClientOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public OAuth2ClientOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public String getTokenPath(){ 
        return this.getWrappedObject().getTokenPath();
    }

    @Signature
    public OAuth2ClientOptions setTokenPath(String tokenPath){ 
        this.getWrappedObject().setTokenPath(tokenPath);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public OAuth2ClientOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public boolean isTrustAll(){ 
        return this.getWrappedObject().isTrustAll();
    }

    @Signature
    public OAuth2ClientOptions setTrustAll(boolean trustAll){ 
        this.getWrappedObject().setTrustAll(trustAll);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public OAuth2ClientOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isTryUseCompression(){ 
        return this.getWrappedObject().isTryUseCompression();
    }

    @Signature
    public OAuth2ClientOptions setTryUseCompression(boolean tryUseCompression){ 
        this.getWrappedObject().setTryUseCompression(tryUseCompression);
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public OAuth2ClientOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUseBasicAuthorizationHeader(){ 
        return this.getWrappedObject().isUseBasicAuthorizationHeader();
    }

    @Signature
    public OAuth2ClientOptions setUseBasicAuthorizationHeader(boolean useBasicAuthorizationHeader){ 
        this.getWrappedObject().setUseBasicAuthorizationHeader(useBasicAuthorizationHeader);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public OAuth2ClientOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Signature
    public String getUserAgent(){ 
        return this.getWrappedObject().getUserAgent();
    }

    @Signature
    public OAuth2ClientOptions setUserAgent(String userAgent){ 
        this.getWrappedObject().setUserAgent(userAgent);
        return this;
    }

    @Signature
    public Memory getUserInfoParameters(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getUserInfoParameters().encode());
    }

    @Signature
    public OAuth2ClientOptions setUserInfoParameters(Memory userInfoParameters){ 
        this.getWrappedObject().setUserInfoParameters(new JsonObject(JsonFunctions.json_encode(userInfoParameters)));
        return this;
    }

    @Signature
    public String getUserInfoPath(){ 
        return this.getWrappedObject().getUserInfoPath();
    }

    @Signature
    public OAuth2ClientOptions setUserInfoPath(String userInfoPath){ 
        this.getWrappedObject().setUserInfoPath(userInfoPath);
        return this;
    }

    @Signature
    public boolean isVerifyHost(){ 
        return this.getWrappedObject().isVerifyHost();
    }

    @Signature
    public OAuth2ClientOptions setVerifyHost(boolean verifyHost){ 
        this.getWrappedObject().setVerifyHost(verifyHost);
        return this;
    }
}
