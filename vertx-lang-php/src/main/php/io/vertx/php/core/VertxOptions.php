<?php 
namespace io\vertx\php\core;

class VertxOptions  
{ 
    public function __construct($vertxOptions)
    { 
        
    }
    
    /**
     * @return int 
     */
    public function getAddressResolverOptions()
    { 
        return 1;
    }
    
    /**
     * @param $addressResolverOptions int 
     * @return $this
     */
    public function setAddressResolverOptions($addressResolverOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getBlockedThreadCheckInterval()
    { 
        return 1;
    }
    
    /**
     * @param $blockedThreadCheckInterval int 
     * @return $this
     */
    public function setBlockedThreadCheckInterval($blockedThreadCheckInterval)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getClusterHost()
    { 
        return "";
    }
    
    /**
     * @param $clusterHost String 
     * @return $this
     */
    public function setClusterHost($clusterHost)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getClusterPingInterval()
    { 
        return 1;
    }
    
    /**
     * @param $clusterPingInterval int 
     * @return $this
     */
    public function setClusterPingInterval($clusterPingInterval)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getClusterPingReplyInterval()
    { 
        return 1;
    }
    
    /**
     * @param $clusterPingReplyInterval int 
     * @return $this
     */
    public function setClusterPingReplyInterval($clusterPingReplyInterval)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getClusterPort()
    { 
        return 1;
    }
    
    /**
     * @param $clusterPort int 
     * @return $this
     */
    public function setClusterPort($clusterPort)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getClusterPublicHost()
    { 
        return "";
    }
    
    /**
     * @param $clusterPublicHost String 
     * @return $this
     */
    public function setClusterPublicHost($clusterPublicHost)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getClusterPublicPort()
    { 
        return 1;
    }
    
    /**
     * @param $clusterPublicPort int 
     * @return $this
     */
    public function setClusterPublicPort($clusterPublicPort)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isClustered()
    { 
        return false;
    }
    
    /**
     * @param $clustered bool 
     * @return $this
     */
    public function setClustered($clustered)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getEventBusOptions()
    { 
        return 1;
    }
    
    /**
     * @param $eventBusOptions int 
     * @return $this
     */
    public function setEventBusOptions($eventBusOptions)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getEventLoopPoolSize()
    { 
        return 1;
    }
    
    /**
     * @param $eventLoopPoolSize int 
     * @return $this
     */
    public function setEventLoopPoolSize($eventLoopPoolSize)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isFileResolverCachingEnabled()
    { 
        return false;
    }
    
    /**
     * @param $fileResolverCachingEnabled bool 
     * @return $this
     */
    public function setFileResolverCachingEnabled($fileResolverCachingEnabled)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isHAEnabled()
    { 
        return false;
    }
    
    /**
     * @param $haEnabled bool 
     * @return $this
     */
    public function setHAEnabled($haEnabled)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getHAGroup()
    { 
        return "";
    }
    
    /**
     * @param $haGroup String 
     * @return $this
     */
    public function setHAGroup($haGroup)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getInternalBlockingPoolSize()
    { 
        return 1;
    }
    
    /**
     * @param $internalBlockingPoolSize int 
     * @return $this
     */
    public function setInternalBlockingPoolSize($internalBlockingPoolSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxEventLoopExecuteTime()
    { 
        return 1;
    }
    
    /**
     * @param $maxEventLoopExecuteTime int 
     * @return $this
     */
    public function setMaxEventLoopExecuteTime($maxEventLoopExecuteTime)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMaxWorkerExecuteTime()
    { 
        return 1;
    }
    
    /**
     * @param $maxWorkerExecuteTime int 
     * @return $this
     */
    public function setMaxWorkerExecuteTime($maxWorkerExecuteTime)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getMetricsOptions()
    { 
        return 1;
    }
    
    /**
     * @param $metricsOptions int 
     * @return $this
     */
    public function setMetricsOptions($metricsOptions)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function getPreferNativeTransport()
    { 
        return false;
    }
    
    /**
     * @param $preferNativeTransport bool 
     * @return $this
     */
    public function setPreferNativeTransport($preferNativeTransport)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getQuorumSize()
    { 
        return 1;
    }
    
    /**
     * @param $quorumSize int 
     * @return $this
     */
    public function setQuorumSize($quorumSize)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getWarningExceptionTime()
    { 
        return 1;
    }
    
    /**
     * @param $warningExceptionTime int 
     * @return $this
     */
    public function setWarningExceptionTime($warningExceptionTime)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getWorkerPoolSize()
    { 
        return 1;
    }
    
    /**
     * @param $workerPoolSize int 
     * @return $this
     */
    public function setWorkerPoolSize($workerPoolSize)
    { 
        return $this;
    }
}
