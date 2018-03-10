<?php 
namespace io\vertx\php\core\net;

class NetClientOptions extends ClientOptionsBase 
{ 
    public function __construct($netClientOptions)
    { 
        
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
     * @return String 
     */
    public function getHostnameVerificationAlgorithm()
    { 
        return "";
    }
    
    /**
     * @param $hostnameVerificationAlgorithm String 
     * @return $this
     */
    public function setHostnameVerificationAlgorithm($hostnameVerificationAlgorithm)
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
     * @return int 
     */
    public function getReconnectAttempts()
    { 
        return 1;
    }
    
    /**
     * @param $reconnectAttempts int 
     * @return $this
     */
    public function setReconnectAttempts($reconnectAttempts)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getReconnectInterval()
    { 
        return 1;
    }
    
    /**
     * @param $reconnectInterval int 
     * @return $this
     */
    public function setReconnectInterval($reconnectInterval)
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
}