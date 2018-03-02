<?php 
namespace io\vertx\php\core\dns;

class DnsClientOptions  
{ 
    public function __construct($dnsClientOptions)
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
     * @return int 
     */
    public function getQueryTimeout()
    { 
        return 1;
    }
    
    /**
     * @param $queryTimeout int 
     * @return $this
     */
    public function setQueryTimeout($queryTimeout)
    { 
        return $this;
    }
}
