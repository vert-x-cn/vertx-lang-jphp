<?php 
namespace io\vertx\php\core\dns;

class AddressResolverOptions  
{ 
    public function __construct($addressResolverOptions)
    { 
        
    }
    
    /**
     * @return int 
     */
    public function getCacheMaxTimeToLive()
    { 
        return 1;
    }
    
    /**
     * @param $cacheMaxTimeToLive int 
     * @return $this
     */
    public function setCacheMaxTimeToLive($cacheMaxTimeToLive)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getCacheMinTimeToLive()
    { 
        return 1;
    }
    
    /**
     * @param $cacheMinTimeToLive int 
     * @return $this
     */
    public function setCacheMinTimeToLive($cacheMinTimeToLive)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getCacheNegativeTimeToLive()
    { 
        return 1;
    }
    
    /**
     * @param $cacheNegativeTimeToLive int 
     * @return $this
     */
    public function setCacheNegativeTimeToLive($cacheNegativeTimeToLive)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getHostsPath()
    { 
        return "";
    }
    
    /**
     * @param $hostsPath String 
     * @return $this
     */
    public function setHostsPath($hostsPath)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getHostsValue()
    { 
        return 1;
    }
    
    /**
     * @param $hostsValue int 
     * @return $this
     */
    public function setHostsValue($hostsValue)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxQueries()
    { 
        return 1;
    }
    
    /**
     * @param $maxQueries int 
     * @return $this
     */
    public function setMaxQueries($maxQueries)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getNdots()
    { 
        return 1;
    }
    
    /**
     * @param $ndots int 
     * @return $this
     */
    public function setNdots($ndots)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isOptResourceEnabled()
    { 
        return false;
    }
    
    /**
     * @param $optResourceEnabled bool 
     * @return $this
     */
    public function setOptResourceEnabled($optResourceEnabled)
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
    
    /**
     * @return bool 
     */
    public function getRdFlag()
    { 
        return false;
    }
    
    /**
     * @param $rdFlag bool 
     * @return $this
     */
    public function setRdFlag($rdFlag)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isRotateServers()
    { 
        return false;
    }
    
    /**
     * @param $rotateServers bool 
     * @return $this
     */
    public function setRotateServers($rotateServers)
    { 
        return $this;
    }
        
    /**
     * @param $searchDomains String 
     * @return $this
     */
    public function addSearchDomain($searchDomains) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getSearchDomains()
    { 
        return [];
    }
    
    /**
     * @param $searchDomains array 
     * @return $this
     */
    public function setSearchDomains($searchDomains)
    { 
        return $this;
    }
        
    /**
     * @param $servers String 
     * @return $this
     */
    public function addServer($servers) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getServers()
    { 
        return [];
    }
    
    /**
     * @param $servers array 
     * @return $this
     */
    public function setServers($servers)
    { 
        return $this;
    }
}
