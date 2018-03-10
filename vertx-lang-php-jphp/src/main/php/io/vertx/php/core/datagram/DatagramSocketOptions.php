<?php 
namespace io\vertx\php\core\datagram;
use io\vertx\php\core\net\NetworkOptions;

class DatagramSocketOptions extends NetworkOptions 
{ 
    public function __construct($datagramSocketOptions)
    { 
        
    }
    
    /**
     * @return bool 
     */
    public function isBroadcast()
    { 
        return false;
    }
    
    /**
     * @param $broadcast bool 
     * @return $this
     */
    public function setBroadcast($broadcast)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isIpV6()
    { 
        return false;
    }
    
    /**
     * @param $ipV6 bool 
     * @return $this
     */
    public function setIpV6($ipV6)
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
     * @return bool 
     */
    public function isLoopbackModeDisabled()
    { 
        return false;
    }
    
    /**
     * @param $loopbackModeDisabled bool 
     * @return $this
     */
    public function setLoopbackModeDisabled($loopbackModeDisabled)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getMulticastNetworkInterface()
    { 
        return "";
    }
    
    /**
     * @param $multicastNetworkInterface String 
     * @return $this
     */
    public function setMulticastNetworkInterface($multicastNetworkInterface)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMulticastTimeToLive()
    { 
        return 1;
    }
    
    /**
     * @param $multicastTimeToLive int 
     * @return $this
     */
    public function setMulticastTimeToLive($multicastTimeToLive)
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
}
