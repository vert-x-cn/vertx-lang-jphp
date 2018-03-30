package io.vertx.php.ext.shell.term;

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
@Name("TelnetTermOptions")
@Namespace("io\\vertx\\php\\ext\\shell\\term")
//false
public  class TelnetTermOptions extends DataObjectWrapper<io.vertx.ext.shell.term.TelnetTermOptions> { 
    public TelnetTermOptions(Environment env, io.vertx.ext.shell.term.TelnetTermOptions wrappedObject) {
        super(env, wrappedObject);
    }

    public TelnetTermOptions(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory __construct(){
        this.__wrappedObject = new io.vertx.ext.shell.term.TelnetTermOptions();
        return Memory.NULL;    }

    @Signature
    public Memory __construct(Memory memory) {
        this.__wrappedObject = new io.vertx.ext.shell.term.TelnetTermOptions(new JsonObject(JsonFunctions.json_encode(memory)));
        return Memory.NULL;
    }

    @Signature
    public int getAcceptBacklog(){ 
        return this.getWrappedObject().getAcceptBacklog();
    }

    @Signature
    public TelnetTermOptions setAcceptBacklog(int acceptBacklog){ 
        this.getWrappedObject().setAcceptBacklog(acceptBacklog);
        return this;
    }

    @Signature
    public String getCharset(){ 
        return this.getWrappedObject().getCharset();
    }

    @Signature
    public TelnetTermOptions setCharset(String charset){ 
        this.getWrappedObject().setCharset(charset);
        return this;
    }

    @Signature
    public ClientAuth getClientAuth(){ 
        return this.getWrappedObject().getClientAuth();
    }

    @Signature
    public TelnetTermOptions setClientAuth(ClientAuth clientAuth){ 
        this.getWrappedObject().setClientAuth(clientAuth);
        return this;
    }

    @Signature
    public boolean isClientAuthRequired(){ 
        return this.getWrappedObject().isClientAuthRequired();
    }

    @Signature
    public TelnetTermOptions setClientAuthRequired(boolean clientAuthRequired){ 
        this.getWrappedObject().setClientAuthRequired(clientAuthRequired);
        return this;
    }

    @Signature
    public TelnetTermOptions addCrlPath(String crlPaths){ 
        this.getWrappedObject().addCrlPath(crlPaths);
        return this;
    }

    @Signature
    public List<String> getCrlPaths(){ 
        return this.getWrappedObject().getCrlPaths();
    }

    @Signature
    public TelnetTermOptions addCrlValue(io.vertx.core.buffer.Buffer crlValues){ 
        this.getWrappedObject().addCrlValue(crlValues);
        return this;
    }

    @Signature
    public List<Buffer> getCrlValues(){ 
        return this.getWrappedObject().getCrlValues().stream().map(v -> Buffer.__create(__env__, v)).collect(Collectors.toList());
    }

    @Signature
    public TelnetTermOptions addEnabledCipherSuite(String enabledCipherSuites){ 
        this.getWrappedObject().addEnabledCipherSuite(enabledCipherSuites);
        return this;
    }

    @Signature
    public Set<String> getEnabledCipherSuites(){ 
        return this.getWrappedObject().getEnabledCipherSuites();
    }

    @Signature
    public TelnetTermOptions addEnabledSecureTransportProtocol(String enabledSecureTransportProtocols){ 
        this.getWrappedObject().addEnabledSecureTransportProtocol(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public Set<String> getEnabledSecureTransportProtocols(){ 
        return this.getWrappedObject().getEnabledSecureTransportProtocols();
    }

    @Signature
    public TelnetTermOptions setEnabledSecureTransportProtocols(Set<String> enabledSecureTransportProtocols){ 
        this.getWrappedObject().setEnabledSecureTransportProtocols(enabledSecureTransportProtocols);
        return this;
    }

    @Signature
    public String getHost(){ 
        return this.getWrappedObject().getHost();
    }

    @Signature
    public TelnetTermOptions setHost(String host){ 
        this.getWrappedObject().setHost(host);
        return this;
    }

    @Signature
    public int getIdleTimeout(){ 
        return this.getWrappedObject().getIdleTimeout();
    }

    @Signature
    public TelnetTermOptions setIdleTimeout(int idleTimeout){ 
        this.getWrappedObject().setIdleTimeout(idleTimeout);
        return this;
    }

    @Signature
    public boolean getInBinary(){ 
        return this.getWrappedObject().getInBinary();
    }

    @Signature
    public TelnetTermOptions setInBinary(boolean inBinary){ 
        this.getWrappedObject().setInBinary(inBinary);
        return this;
    }

    @Signature
    public String getIntputrc(){ 
        return this.getWrappedObject().getIntputrc();
    }

    @Signature
    public TelnetTermOptions setIntputrc(String intputrc){ 
        this.getWrappedObject().setIntputrc(intputrc);
        return this;
    }

    @Signature
    public JdkSSLEngineOptions getJdkSslEngineOptions(){ 
        return new JdkSSLEngineOptions(__env__, this.getWrappedObject().getJdkSslEngineOptions());
    }

    @Signature
    public TelnetTermOptions setJdkSslEngineOptions(JdkSSLEngineOptions jdkSslEngineOptions){ 
        this.getWrappedObject().setJdkSslEngineOptions(jdkSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public JksOptions getKeyStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getKeyStoreOptions());
    }

    @Signature
    public TelnetTermOptions setKeyStoreOptions(JksOptions keyStoreOptions){ 
        this.getWrappedObject().setKeyStoreOptions(keyStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean getLogActivity(){ 
        return this.getWrappedObject().getLogActivity();
    }

    @Signature
    public TelnetTermOptions setLogActivity(boolean logActivity){ 
        this.getWrappedObject().setLogActivity(logActivity);
        return this;
    }

    @Signature
    public OpenSSLEngineOptions getOpenSslEngineOptions(){ 
        return new OpenSSLEngineOptions(__env__, this.getWrappedObject().getOpenSslEngineOptions());
    }

    @Signature
    public TelnetTermOptions setOpenSslEngineOptions(OpenSSLEngineOptions openSslEngineOptions){ 
        this.getWrappedObject().setOpenSslEngineOptions(openSslEngineOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean getOutBinary(){ 
        return this.getWrappedObject().getOutBinary();
    }

    @Signature
    public TelnetTermOptions setOutBinary(boolean outBinary){ 
        this.getWrappedObject().setOutBinary(outBinary);
        return this;
    }

    @Signature
    public PemKeyCertOptions getPemKeyCertOptions(){ 
        return new PemKeyCertOptions(__env__, this.getWrappedObject().getPemKeyCertOptions());
    }

    @Signature
    public TelnetTermOptions setPemKeyCertOptions(PemKeyCertOptions pemKeyCertOptions){ 
        this.getWrappedObject().setPemKeyCertOptions(pemKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PemTrustOptions getPemTrustOptions(){ 
        return new PemTrustOptions(__env__, this.getWrappedObject().getPemTrustOptions());
    }

    @Signature
    public TelnetTermOptions setPemTrustOptions(PemTrustOptions pemTrustOptions){ 
        this.getWrappedObject().setPemTrustOptions(pemTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxKeyCertOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxKeyCertOptions());
    }

    @Signature
    public TelnetTermOptions setPfxKeyCertOptions(PfxOptions pfxKeyCertOptions){ 
        this.getWrappedObject().setPfxKeyCertOptions(pfxKeyCertOptions.getWrappedObject());
        return this;
    }

    @Signature
    public PfxOptions getPfxTrustOptions(){ 
        return new PfxOptions(__env__, this.getWrappedObject().getPfxTrustOptions());
    }

    @Signature
    public TelnetTermOptions setPfxTrustOptions(PfxOptions pfxTrustOptions){ 
        this.getWrappedObject().setPfxTrustOptions(pfxTrustOptions.getWrappedObject());
        return this;
    }

    @Signature
    public int getPort(){ 
        return this.getWrappedObject().getPort();
    }

    @Signature
    public TelnetTermOptions setPort(int port){ 
        this.getWrappedObject().setPort(port);
        return this;
    }

    @Signature
    public int getReceiveBufferSize(){ 
        return this.getWrappedObject().getReceiveBufferSize();
    }

    @Signature
    public TelnetTermOptions setReceiveBufferSize(int receiveBufferSize){ 
        this.getWrappedObject().setReceiveBufferSize(receiveBufferSize);
        return this;
    }

    @Signature
    public boolean isReuseAddress(){ 
        return this.getWrappedObject().isReuseAddress();
    }

    @Signature
    public TelnetTermOptions setReuseAddress(boolean reuseAddress){ 
        this.getWrappedObject().setReuseAddress(reuseAddress);
        return this;
    }

    @Signature
    public boolean isReusePort(){ 
        return this.getWrappedObject().isReusePort();
    }

    @Signature
    public TelnetTermOptions setReusePort(boolean reusePort){ 
        this.getWrappedObject().setReusePort(reusePort);
        return this;
    }

    @Signature
    public int getSendBufferSize(){ 
        return this.getWrappedObject().getSendBufferSize();
    }

    @Signature
    public TelnetTermOptions setSendBufferSize(int sendBufferSize){ 
        this.getWrappedObject().setSendBufferSize(sendBufferSize);
        return this;
    }

    @Signature
    public boolean isSni(){ 
        return this.getWrappedObject().isSni();
    }

    @Signature
    public TelnetTermOptions setSni(boolean sni){ 
        this.getWrappedObject().setSni(sni);
        return this;
    }

    @Signature
    public int getSoLinger(){ 
        return this.getWrappedObject().getSoLinger();
    }

    @Signature
    public TelnetTermOptions setSoLinger(int soLinger){ 
        this.getWrappedObject().setSoLinger(soLinger);
        return this;
    }

    @Signature
    public boolean isSsl(){ 
        return this.getWrappedObject().isSsl();
    }

    @Signature
    public TelnetTermOptions setSsl(boolean ssl){ 
        this.getWrappedObject().setSsl(ssl);
        return this;
    }

    @Signature
    public boolean isTcpCork(){ 
        return this.getWrappedObject().isTcpCork();
    }

    @Signature
    public TelnetTermOptions setTcpCork(boolean tcpCork){ 
        this.getWrappedObject().setTcpCork(tcpCork);
        return this;
    }

    @Signature
    public boolean isTcpFastOpen(){ 
        return this.getWrappedObject().isTcpFastOpen();
    }

    @Signature
    public TelnetTermOptions setTcpFastOpen(boolean tcpFastOpen){ 
        this.getWrappedObject().setTcpFastOpen(tcpFastOpen);
        return this;
    }

    @Signature
    public boolean isTcpKeepAlive(){ 
        return this.getWrappedObject().isTcpKeepAlive();
    }

    @Signature
    public TelnetTermOptions setTcpKeepAlive(boolean tcpKeepAlive){ 
        this.getWrappedObject().setTcpKeepAlive(tcpKeepAlive);
        return this;
    }

    @Signature
    public boolean isTcpNoDelay(){ 
        return this.getWrappedObject().isTcpNoDelay();
    }

    @Signature
    public TelnetTermOptions setTcpNoDelay(boolean tcpNoDelay){ 
        this.getWrappedObject().setTcpNoDelay(tcpNoDelay);
        return this;
    }

    @Signature
    public boolean isTcpQuickAck(){ 
        return this.getWrappedObject().isTcpQuickAck();
    }

    @Signature
    public TelnetTermOptions setTcpQuickAck(boolean tcpQuickAck){ 
        this.getWrappedObject().setTcpQuickAck(tcpQuickAck);
        return this;
    }

    @Signature
    public int getTrafficClass(){ 
        return this.getWrappedObject().getTrafficClass();
    }

    @Signature
    public TelnetTermOptions setTrafficClass(int trafficClass){ 
        this.getWrappedObject().setTrafficClass(trafficClass);
        return this;
    }

    @Signature
    public JksOptions getTrustStoreOptions(){ 
        return new JksOptions(__env__, this.getWrappedObject().getTrustStoreOptions());
    }

    @Signature
    public TelnetTermOptions setTrustStoreOptions(JksOptions trustStoreOptions){ 
        this.getWrappedObject().setTrustStoreOptions(trustStoreOptions.getWrappedObject());
        return this;
    }

    @Signature
    public boolean isUseAlpn(){ 
        return this.getWrappedObject().isUseAlpn();
    }

    @Signature
    public TelnetTermOptions setUseAlpn(boolean useAlpn){ 
        this.getWrappedObject().setUseAlpn(useAlpn);
        return this;
    }

    @Signature
    public boolean isUsePooledBuffers(){ 
        return this.getWrappedObject().isUsePooledBuffers();
    }

    @Signature
    public TelnetTermOptions setUsePooledBuffers(boolean usePooledBuffers){ 
        this.getWrappedObject().setUsePooledBuffers(usePooledBuffers);
        return this;
    }
}
