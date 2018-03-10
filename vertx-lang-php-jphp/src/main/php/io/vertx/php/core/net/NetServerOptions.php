<?php 
namespace io\vertx\php\core\net;

class NetServerOptions extends TCPSSLOptions 
{ 
    public function __construct($netServerOptions)
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
}
