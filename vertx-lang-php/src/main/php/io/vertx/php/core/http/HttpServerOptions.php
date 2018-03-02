<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\net\NetServerOptions;

class HttpServerOptions extends NetServerOptions 
{ 
    public function __construct($httpServerOptions)
    { 
        
    }
    
    /**
     * @return int 
     */
    public function getAcceptBacklog()
    { 
        return 1;
    }
    
    /**
     * @param $acceptBacklog int 
     * @return $this
     */
    public function setAcceptBacklog($acceptBacklog)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isAcceptUnmaskedFrames()
    { 
        return false;
    }
    
    /**
     * @param $acceptUnmaskedFrames bool 
     * @return $this
     */
    public function setAcceptUnmaskedFrames($acceptUnmaskedFrames)
    { 
        return $this;
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
    public function getClientAuth()
    { 
        return 1;
    }
    
    /**
     * @param $clientAuth int 
     * @return $this
     */
    public function setClientAuth($clientAuth)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isClientAuthRequired()
    { 
        return false;
    }
    
    /**
     * @param $clientAuthRequired bool 
     * @return $this
     */
    public function setClientAuthRequired($clientAuthRequired)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getCompressionLevel()
    { 
        return 1;
    }
    
    /**
     * @param $compressionLevel int 
     * @return $this
     */
    public function setCompressionLevel($compressionLevel)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isCompressionSupported()
    { 
        return false;
    }
    
    /**
     * @param $compressionSupported bool 
     * @return $this
     */
    public function setCompressionSupported($compressionSupported)
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
     * @return bool 
     */
    public function isDecompressionSupported()
    { 
        return false;
    }
    
    /**
     * @param $decompressionSupported bool 
     * @return $this
     */
    public function setDecompressionSupported($decompressionSupported)
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
    public function isHandle100ContinueAutomatically()
    { 
        return false;
    }
    
    /**
     * @param $handle100ContinueAutomatically bool 
     * @return $this
     */
    public function setHandle100ContinueAutomatically($handle100ContinueAutomatically)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getHost()
    { 
        return "";
    }
    
    /**
     * @param $host String 
     * @return $this
     */
    public function setHost($host)
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
     * @return int 
     */
    public function getPort()
    { 
        return 1;
    }
    
    /**
     * @param $port int 
     * @return $this
     */
    public function setPort($port)
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
    public function isSni()
    { 
        return false;
    }
    
    /**
     * @param $sni bool 
     * @return $this
     */
    public function setSni($sni)
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
     * @return String 
     */
    public function getWebsocketSubProtocols()
    { 
        return "";
    }
    
    /**
     * @param $websocketSubProtocols String 
     * @return $this
     */
    public function setWebsocketSubProtocols($websocketSubProtocols)
    { 
        return $this;
    }
}
