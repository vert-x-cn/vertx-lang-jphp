<?php 
namespace io\vertx\php\core\http;

class RequestOptions  
{ 
    public function __construct($requestOptions)
    { 
        
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
     * @return String 
     */
    public function getURI()
    { 
        return "";
    }
    
    /**
     * @param $uri String 
     * @return $this
     */
    public function setURI($uri)
    { 
        return $this;
    }
}
