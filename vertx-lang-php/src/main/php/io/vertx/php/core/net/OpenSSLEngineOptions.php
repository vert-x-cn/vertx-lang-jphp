<?php 
namespace io\vertx\php\core\net;

class OpenSSLEngineOptions  
{ 
    public function __construct($openSSLEngineOptions)
    { 
        
    }
    
    /**
     * @return bool 
     */
    public function isAlpnAvailable()
    { 
        return false;
    }
    
    /**
     * @return bool 
     */
    public function isAvailable()
    { 
        return false;
    }
    
    /**
     * @return bool 
     */
    public function isSessionCacheEnabled()
    { 
        return false;
    }
    
    /**
     * @param $sessionCacheEnabled bool 
     * @return $this
     */
    public function setSessionCacheEnabled($sessionCacheEnabled)
    { 
        return $this;
    }
}
