<?php 
namespace io\vertx\php\core\metrics;

class MetricsOptions  
{ 
    public function __construct($metricsOptions)
    { 
        
    }
    
    /**
     * @return bool 
     */
    public function isEnabled()
    { 
        return false;
    }
    
    /**
     * @param $enabled bool 
     * @return $this
     */
    public function setEnabled($enabled)
    { 
        return $this;
    }
}
