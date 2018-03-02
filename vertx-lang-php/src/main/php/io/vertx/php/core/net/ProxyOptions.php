<?php 
namespace io\vertx\php\core\net;

class ProxyOptions  
{ 
    public function __construct($proxyOptions)
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
     * @return String 
     */
    public function getPassword()
    { 
        return "";
    }
    
    /**
     * @param $password String 
     * @return $this
     */
    public function setPassword($password)
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
    public function getType()
    { 
        return 1;
    }
    
    /**
     * @param $type int 
     * @return $this
     */
    public function setType($type)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getUsername()
    { 
        return "";
    }
    
    /**
     * @param $username String 
     * @return $this
     */
    public function setUsername($username)
    { 
        return $this;
    }
}
