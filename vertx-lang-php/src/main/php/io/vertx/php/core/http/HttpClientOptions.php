<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\net\ClientOptionsBase;

class HttpClientOptions extends ClientOptionsBase 
{ 
    public function __construct($httpClientOptions)
    { 
        
    }
    
    /**
     * @return array 
     */
    public function getAlpnVersions()
    { 
        return [];
    }
    
    /**
     * @param $alpnVersions array 
     * @return $this
     */
    public function setAlpnVersions($alpnVersions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getConnectTimeout()
    { 
        return 1;
    }
    
    /**
     * @param $connectTimeout int 
     * @return $this
     */
    public function setConnectTimeout($connectTimeout)
    { 
        return $this;
    }
        
    /**
     * @param $crlPaths String 
     * @return $this
     */
    public function addCrlPath($crlPaths) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getCrlPaths()
    { 
        return [];
    }
        
    /**
     * @param $crlValues int 
     * @return $this
     */
    public function addCrlValue($crlValues) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getCrlValues()
    { 
        return [];
    }
    
    /**
     * @return int 
     */
    public function getDecoderInitialBufferSize()
    { 
        return 1;
    }
    
    /**
     * @param $decoderInitialBufferSize int 
     * @return $this
     */
    public function setDecoderInitialBufferSize($decoderInitialBufferSize)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getDefaultHost()
    { 
        return "";
    }
    
    /**
     * @param $defaultHost String 
     * @return $this
     */
    public function setDefaultHost($defaultHost)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getDefaultPort()
    { 
        return 1;
    }
    
    /**
     * @param $defaultPort int 
     * @return $this
     */
    public function setDefaultPort($defaultPort)
    { 
        return $this;
    }
        
    /**
     * @param $enabledCipherSuites String 
     * @return $this
     */
    public function addEnabledCipherSuite($enabledCipherSuites) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getEnabledCipherSuites()
    { 
        return [];
    }
        
    /**
     * @param $enabledSecureTransportProtocols String 
     * @return $this
     */
    public function addEnabledSecureTransportProtocol($enabledSecureTransportProtocols) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getEnabledSecureTransportProtocols()
    { 
        return [];
    }
    
    /**
     * @return bool 
     */
    public function isForceSni()
    { 
        return false;
    }
    
    /**
     * @param $forceSni bool 
     * @return $this
     */
    public function setForceSni($forceSni)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isHttp2ClearTextUpgrade()
    { 
        return false;
    }
    
    /**
     * @param $http2ClearTextUpgrade bool 
     * @return $this
     */
    public function setHttp2ClearTextUpgrade($http2ClearTextUpgrade)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getHttp2ConnectionWindowSize()
    { 
        return 1;
    }
    
    /**
     * @param $http2ConnectionWindowSize int 
     * @return $this
     */
    public function setHttp2ConnectionWindowSize($http2ConnectionWindowSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getHttp2MaxPoolSize()
    { 
        return 1;
    }
    
    /**
     * @param $http2MaxPoolSize int 
     * @return $this
     */
    public function setHttp2MaxPoolSize($http2MaxPoolSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getHttp2MultiplexingLimit()
    { 
        return 1;
    }
    
    /**
     * @param $http2MultiplexingLimit int 
     * @return $this
     */
    public function setHttp2MultiplexingLimit($http2MultiplexingLimit)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getIdleTimeout()
    { 
        return 1;
    }
    
    /**
     * @param $idleTimeout int 
     * @return $this
     */
    public function setIdleTimeout($idleTimeout)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getInitialSettings()
    { 
        return 1;
    }
    
    /**
     * @param $initialSettings int 
     * @return $this
     */
    public function setInitialSettings($initialSettings)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getJdkSslEngineOptions()
    { 
        return 1;
    }
    
    /**
     * @param $jdkSslEngineOptions int 
     * @return $this
     */
    public function setJdkSslEngineOptions($jdkSslEngineOptions)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isKeepAlive()
    { 
        return false;
    }
    
    /**
     * @param $keepAlive bool 
     * @return $this
     */
    public function setKeepAlive($keepAlive)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getKeyStoreOptions()
    { 
        return 1;
    }
    
    /**
     * @param $keyStoreOptions int 
     * @return $this
     */
    public function setKeyStoreOptions($keyStoreOptions)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getLocalAddress()
    { 
        return "";
    }
    
    /**
     * @param $localAddress String 
     * @return $this
     */
    public function setLocalAddress($localAddress)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function getLogActivity()
    { 
        return false;
    }
    
    /**
     * @param $logActivity bool 
     * @return $this
     */
    public function setLogActivity($logActivity)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxChunkSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxChunkSize int 
     * @return $this
     */
    public function setMaxChunkSize($maxChunkSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxHeaderSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxHeaderSize int 
     * @return $this
     */
    public function setMaxHeaderSize($maxHeaderSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxInitialLineLength()
    { 
        return 1;
    }
    
    /**
     * @param $maxInitialLineLength int 
     * @return $this
     */
    public function setMaxInitialLineLength($maxInitialLineLength)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxPoolSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxPoolSize int 
     * @return $this
     */
    public function setMaxPoolSize($maxPoolSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxRedirects()
    { 
        return 1;
    }
    
    /**
     * @param $maxRedirects int 
     * @return $this
     */
    public function setMaxRedirects($maxRedirects)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxWaitQueueSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxWaitQueueSize int 
     * @return $this
     */
    public function setMaxWaitQueueSize($maxWaitQueueSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxWebsocketFrameSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxWebsocketFrameSize int 
     * @return $this
     */
    public function setMaxWebsocketFrameSize($maxWebsocketFrameSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxWebsocketMessageSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxWebsocketMessageSize int 
     * @return $this
     */
    public function setMaxWebsocketMessageSize($maxWebsocketMessageSize)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getMetricsName()
    { 
        return "";
    }
    
    /**
     * @param $metricsName String 
     * @return $this
     */
    public function setMetricsName($metricsName)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getOpenSslEngineOptions()
    { 
        return 1;
    }
    
    /**
     * @param $openSslEngineOptions int 
     * @return $this
     */
    public function setOpenSslEngineOptions($openSslEngineOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getPemKeyCertOptions()
    { 
        return 1;
    }
    
    /**
     * @param $pemKeyCertOptions int 
     * @return $this
     */
    public function setPemKeyCertOptions($pemKeyCertOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getPemTrustOptions()
    { 
        return 1;
    }
    
    /**
     * @param $pemTrustOptions int 
     * @return $this
     */
    public function setPemTrustOptions($pemTrustOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getPfxKeyCertOptions()
    { 
        return 1;
    }
    
    /**
     * @param $pfxKeyCertOptions int 
     * @return $this
     */
    public function setPfxKeyCertOptions($pfxKeyCertOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getPfxTrustOptions()
    { 
        return 1;
    }
    
    /**
     * @param $pfxTrustOptions int 
     * @return $this
     */
    public function setPfxTrustOptions($pfxTrustOptions)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isPipelining()
    { 
        return false;
    }
    
    /**
     * @param $pipelining bool 
     * @return $this
     */
    public function setPipelining($pipelining)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getPipeliningLimit()
    { 
        return 1;
    }
    
    /**
     * @param $pipeliningLimit int 
     * @return $this
     */
    public function setPipeliningLimit($pipeliningLimit)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getProtocolVersion()
    { 
        return 1;
    }
    
    /**
     * @param $protocolVersion int 
     * @return $this
     */
    public function setProtocolVersion($protocolVersion)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getProxyOptions()
    { 
        return 1;
    }
    
    /**
     * @param $proxyOptions int 
     * @return $this
     */
    public function setProxyOptions($proxyOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getReceiveBufferSize()
    { 
        return 1;
    }
    
    /**
     * @param $receiveBufferSize int 
     * @return $this
     */
    public function setReceiveBufferSize($receiveBufferSize)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isReuseAddress()
    { 
        return false;
    }
    
    /**
     * @param $reuseAddress bool 
     * @return $this
     */
    public function setReuseAddress($reuseAddress)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isReusePort()
    { 
        return false;
    }
    
    /**
     * @param $reusePort bool 
     * @return $this
     */
    public function setReusePort($reusePort)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getSendBufferSize()
    { 
        return 1;
    }
    
    /**
     * @param $sendBufferSize int 
     * @return $this
     */
    public function setSendBufferSize($sendBufferSize)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isSendUnmaskedFrames()
    { 
        return false;
    }
    
    /**
     * @param $sendUnmaskedFrames bool 
     * @return $this
     */
    public function setSendUnmaskedFrames($sendUnmaskedFrames)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getSoLinger()
    { 
        return 1;
    }
    
    /**
     * @param $soLinger int 
     * @return $this
     */
    public function setSoLinger($soLinger)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isSsl()
    { 
        return false;
    }
    
    /**
     * @param $ssl bool 
     * @return $this
     */
    public function setSsl($ssl)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTcpCork()
    { 
        return false;
    }
    
    /**
     * @param $tcpCork bool 
     * @return $this
     */
    public function setTcpCork($tcpCork)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTcpFastOpen()
    { 
        return false;
    }
    
    /**
     * @param $tcpFastOpen bool 
     * @return $this
     */
    public function setTcpFastOpen($tcpFastOpen)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTcpKeepAlive()
    { 
        return false;
    }
    
    /**
     * @param $tcpKeepAlive bool 
     * @return $this
     */
    public function setTcpKeepAlive($tcpKeepAlive)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTcpNoDelay()
    { 
        return false;
    }
    
    /**
     * @param $tcpNoDelay bool 
     * @return $this
     */
    public function setTcpNoDelay($tcpNoDelay)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTcpQuickAck()
    { 
        return false;
    }
    
    /**
     * @param $tcpQuickAck bool 
     * @return $this
     */
    public function setTcpQuickAck($tcpQuickAck)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getTrafficClass()
    { 
        return 1;
    }
    
    /**
     * @param $trafficClass int 
     * @return $this
     */
    public function setTrafficClass($trafficClass)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTrustAll()
    { 
        return false;
    }
    
    /**
     * @param $trustAll bool 
     * @return $this
     */
    public function setTrustAll($trustAll)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getTrustStoreOptions()
    { 
        return 1;
    }
    
    /**
     * @param $trustStoreOptions int 
     * @return $this
     */
    public function setTrustStoreOptions($trustStoreOptions)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTryUseCompression()
    { 
        return false;
    }
    
    /**
     * @param $tryUseCompression bool 
     * @return $this
     */
    public function setTryUseCompression($tryUseCompression)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isUseAlpn()
    { 
        return false;
    }
    
    /**
     * @param $useAlpn bool 
     * @return $this
     */
    public function setUseAlpn($useAlpn)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isUsePooledBuffers()
    { 
        return false;
    }
    
    /**
     * @param $usePooledBuffers bool 
     * @return $this
     */
    public function setUsePooledBuffers($usePooledBuffers)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isVerifyHost()
    { 
        return false;
    }
    
    /**
     * @param $verifyHost bool 
     * @return $this
     */
    public function setVerifyHost($verifyHost)
    { 
        return $this;
    }
}
