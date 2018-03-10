<?php 
namespace io\vertx\php\core\http;

class GoAway  
{ 
    public function __construct($goAway)
    { 
        
    }
    
    /**
     * @return int 
     */
    public function getDebugData()
    { 
        return 1;
    }
    
    /**
     * @param $debugData int 
     * @return $this
     */
    public function setDebugData($debugData)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getErrorCode()
    { 
        return 1;
    }
    
    /**
     * @param $errorCode int 
     * @return $this
     */
    public function setErrorCode($errorCode)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getLastStreamId()
    { 
        return 1;
    }
    
    /**
     * @param $lastStreamId int 
     * @return $this
     */
    public function setLastStreamId($lastStreamId)
    { 
        return $this;
    }
}
