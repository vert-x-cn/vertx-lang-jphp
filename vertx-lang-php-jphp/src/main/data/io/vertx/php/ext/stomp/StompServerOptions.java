package io.vertx.php.ext.stomp;

import io.vertx.core.http.ClientAuth;
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
@Name("StompServerOptions")
@Namespace("io\\vertx\\php\\ext\\stomp")
//false
public  class StompServerOptions extends DataObjectWrapper<io.vertx.ext.stomp.StompServerOptions> { 
    public StompServerOptions(Environment env, io.vertx.ext.stomp.StompServerOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public StompServerOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.stomp.StompServerOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.stomp.StompServerOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getAcceptBacklog(){ 
        return this.getWrappedObject().getAcceptBacklog();
    }

    @Signature
    public StompServerOptions setAcceptBacklog(int acceptBacklog){ 
        this.getWrappedObject().setAcceptBacklog(acceptBacklog);
        return this;
    }

    @Signature
    public ClientAuth getClientAuth(){ 
        return this.getWrappedObject().getClientAuth();
    }

    @Signature
    public StompServerOptions setClientAuth(ClientAuth clientAuth){ 
        this.getWrappedObject().setClientAuth(clientAuth);
        return this;
    }

    @Signature
    public boolean isClientAuthRequired(){ 
        return this.getWrappedObject().isClientAuthRequired();
    }

    @Signature
    public StompServerOptions setClientAuthRequired(boolean clientAuthRequired){ 
        this.getWrappedObject().setClientAuthRequired(clientAuthRequired);
        return this;
    }

    @Signature
    public StompServerOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public StompServerOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }

    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public StompServerOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public StompServerOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public StompServerOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Memory getHeartbeat(){ 
        return JsonFunctions.json_decode(__env__, this.getWrappedObject().getHeartbeat().encode());
    }

    @Signature
    public StompServerOptions setHeartbeat(Memory heartbeat){ 
        this.getWrappedObject().setHeartbeat(new JsonObject(JsonFunctions.json_encode(heartbeat)));
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public StompServerOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public StompServerOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public StompServerOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public StompServerOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public StompServerOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public int getMaxBodyLength(){ 
        return this.getWrappedObject().getMaxBodyLength();
    }

    @Signature
    public StompServerOptions setMaxBodyLength(int maxBodyLength){ 
        this.getWrappedObject().setMaxBodyLength(maxBodyLength);
        return this;
    }

    @Signature
    public int getMaxFrameInTransaction(){ 
        return this.getWrappedObject().getMaxFrameInTransaction();
    }

    @Signature
    public StompServerOptions setMaxFrameInTransaction(int maxFrameInTransaction){ 
        this.getWrappedObject().setMaxFrameInTransaction(maxFrameInTransaction);
        return this;
    }

    @Signature
    public int getMaxHeaderLength(){ 
        return this.getWrappedObject().getMaxHeaderLength();
    }

    @Signature
    public StompServerOptions setMaxHeaderLength(int maxHeaderLength){ 
        this.getWrappedObject().setMaxHeaderLength(maxHeaderLength);
        return this;
    }

    @Signature
    public int getMaxHeaders(){ 
        return this.getWrappedObject().getMaxHeaders();
    }

    @Signature
    public StompServerOptions setMaxHeaders(int maxHeaders){ 
        this.getWrappedObject().setMaxHeaders(maxHeaders);
        return this;
    }

    @Signature
    public int getMaxSubscriptionsByClient(){ 
        return this.getWrappedObject().getMaxSubscriptionsByClient();
    }

    @Signature
    public StompServerOptions setMaxSubscriptionsByClient(int maxSubscriptionsByClient){ 
        this.getWrappedObject().setMaxSubscriptionsByClient(maxSubscriptionsByClient);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public StompServerOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public StompServerOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public StompServerOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public StompServerOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public StompServerOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public StompServerOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public StompServerOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public StompServerOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public StompServerOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public boolean isSecured(){ 
        return this.getWrappedObject().isSecured();
    }

    @Signature
    public StompServerOptions setSecured(boolean secured){ 
        this.getWrappedObject().setSecured(secured);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public StompServerOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public boolean isSendErrorOnNoSubscriptions(){ 
        return this.getWrappedObject().isSendErrorOnNoSubscriptions();
    }

    @Signature
    public StompServerOptions setSendErrorOnNoSubscriptions(boolean sendErrorOnNoSubscriptions){ 
        this.getWrappedObject().setSendErrorOnNoSubscriptions(sendErrorOnNoSubscriptions);
        return this;
    }

    @Signature
    public boolean isSni(){ 
        return this.getWrappedObject().isSni();
    }

    @Signature
    public StompServerOptions setSni(boolean sni){ 
        this.getWrappedObject().setSni(sni);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public StompServerOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public StompServerOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public List<String> getSupportedVersions(){ 
        return this.getWrappedObject().getSupportedVersions();
    }

    @Signature
    public StompServerOptions setSupportedVersions(List<String> supportedVersions){ 
        this.getWrappedObject().setSupportedVersions(supportedVersions);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public StompServerOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public StompServerOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public StompServerOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public StompServerOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public StompServerOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public int getTimeFactor(){ 
        return this.getWrappedObject().getTimeFactor();
    }

    @Signature
    public StompServerOptions setTimeFactor(int timeFactor){ 
        this.getWrappedObject().setTimeFactor(timeFactor);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public StompServerOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public boolean isTrailingLine(){ 
        return this.getWrappedObject().isTrailingLine();
    }

    @Signature
    public StompServerOptions setTrailingLine(boolean trailingLine){ 
        this.getWrappedObject().setTrailingLine(trailingLine);
        return this;
    }

    @Signature
    public int getTransactionChunkSize(){ 
        return this.getWrappedObject().getTransactionChunkSize();
    }

    @Signature
    public StompServerOptions setTransactionChunkSize(int transactionChunkSize){ 
        this.getWrappedObject().setTransactionChunkSize(transactionChunkSize);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public StompServerOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public StompServerOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public StompServerOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }

    @Signature
    public boolean isWebsocketBridge(){ 
        return this.getWrappedObject().isWebsocketBridge();
    }

    @Signature
    public StompServerOptions setWebsocketBridge(boolean websocketBridge){ 
        this.getWrappedObject().setWebsocketBridge(websocketBridge);
        return this;
    }

    @Signature
    public String getWebsocketPath(){ 
        return this.getWrappedObject().getWebsocketPath();
    }

    @Signature
    public StompServerOptions setWebsocketPath(String websocketPath){ 
        this.getWrappedObject().setWebsocketPath(websocketPath);
        return this;
    }
}
