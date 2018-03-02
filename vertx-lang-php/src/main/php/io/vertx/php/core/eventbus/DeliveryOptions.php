<?php 
namespace io\vertx\php\core\eventbus;

class DeliveryOptions  
{ 
    public function __construct($deliveryOptions)
    { 
        
    }
    
    /**
     * @return String 
     */
    public function getCodecName()
    { 
        return "";
    }
    
    /**
     * @param $codecName String 
     * @return $this
     */
    public function setCodecName($codecName)
    { 
        return $this;
    }
        
    /**
     * @param $key String 
     * @param $value String
     * @return $this
     */
    public function addHeader($key, $value) 
    {
        return $this;
    }
        
    /**
     * @return int 
     */
    public function getSendTimeout()
    { 
        return 1;
    }
    
    /**
     * @param $sendTimeout int 
     * @return $this
     */
    public function setSendTimeout($sendTimeout)
    { 
        return $this;
    }
}
