<?php 
namespace io\vertx\php\core\http;

class Http2Settings  
{ 
    public function __construct($http2Settings)
    { 
        
    }
    
    /**
     * @return int 
     */
    public function getHeaderTableSize()
    { 
        return 1;
    }
    
    /**
     * @param $headerTableSize int 
     * @return $this
     */
    public function setHeaderTableSize($headerTableSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getInitialWindowSize()
    { 
        return 1;
    }
    
    /**
     * @param $initialWindowSize int 
     * @return $this
     */
    public function setInitialWindowSize($initialWindowSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxConcurrentStreams()
    { 
        return 1;
    }
    
    /**
     * @param $maxConcurrentStreams int 
     * @return $this
     */
    public function setMaxConcurrentStreams($maxConcurrentStreams)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxFrameSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxFrameSize int 
     * @return $this
     */
    public function setMaxFrameSize($maxFrameSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxHeaderListSize()
    { 
        return 1;
    }
    
    /**
     * @param $maxHeaderListSize int 
     * @return $this
     */
    public function setMaxHeaderListSize($maxHeaderListSize)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isPushEnabled()
    { 
        return false;
    }
    
    /**
     * @param $pushEnabled bool 
     * @return $this
     */
    public function setPushEnabled($pushEnabled)
    { 
        return $this;
    }
}
