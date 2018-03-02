<?php 
namespace io\vertx\php\core\net;

class JdkSSLEngineOptions  
{ 
    public function __construct($jdkSSLEngineOptions)
    { 
        
    }
    
    /**
     * @return bool 
     */
    public function isAlpnAvailable()
    { 
        return false;
    }
}
