<?php 
namespace io\vertx\php\core\net;

class PemKeyCertOptions  
{ 
    public function __construct($pemKeyCertOptions)
    { 
        
    }
    
    /**
     * @param $certPath String 
     * @return $this
     */
    public function setCertPath($certPath)
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
     * @param $certPaths array 
     * @return $this
     */
    public function setCertPaths($certPaths)
    { 
        return $this;
    }
    
    /**
     * @param $certValue int 
     * @return $this
     */
    public function setCertValue($certValue)
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
    
    /**
     * @param $certValues array 
     * @return $this
     */
    public function setCertValues($certValues)
    { 
        return $this;
    }
    
    /**
     * @param $keyPath String 
     * @return $this
     */
    public function setKeyPath($keyPath)
    { 
        return $this;
    }
    
    /**
     * @return array 
     */
    public function getKeyPaths()
    { 
        return [];
    }
    
    /**
     * @param $keyPaths array 
     * @return $this
     */
    public function setKeyPaths($keyPaths)
    { 
        return $this;
    }
    
    /**
     * @param $keyValue int 
     * @return $this
     */
    public function setKeyValue($keyValue)
    { 
        return $this;
    }
    
    /**
     * @return array 
     */
    public function getKeyValues()
    { 
        return [];
    }
    
    /**
     * @param $keyValues array 
     * @return $this
     */
    public function setKeyValues($keyValues)
    { 
        return $this;
    }
}
