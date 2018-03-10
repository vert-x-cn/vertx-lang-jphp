<?php 
namespace io\vertx\php\core\net;

class PemTrustOptions  
{ 
    public function __construct($pemTrustOptions)
    { 
        
    }
        
    /**
     * @param $certPaths String 
     * @return $this
     */
    public function addCertPath($certPaths) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getCertPaths()
    { 
        return [];
    }
        
    /**
     * @param $certValues int 
     * @return $this
     */
    public function addCertValue($certValues) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getCertValues()
    { 
        return [];
    }
}
