<?php 
namespace io\vertx\php\core;

class DeploymentOptions  
{ 
    public function __construct($deploymentOptions)
    { 
        
    }
    
    /**
     * @return array json 
     */
    public function getConfig()
    { 
        return [];
    }
    
    /**
     * @param $config array json 
     * @return $this
     */
    public function setConfig($config)
    { 
        return $this;
    }
    
    /**
     * @return array 
     */
    public function getExtraClasspath()
    { 
        return [];
    }
    
    /**
     * @param $extraClasspath array 
     * @return $this
     */
    public function setExtraClasspath($extraClasspath)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isHa()
    { 
        return false;
    }
    
    /**
     * @param $ha bool 
     * @return $this
     */
    public function setHa($ha)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getInstances()
    { 
        return 1;
    }
    
    /**
     * @param $instances int 
     * @return $this
     */
    public function setInstances($instances)
    { 
        return $this;
    }
    
    /**
     * @return array 
     */
    public function getIsolatedClasses()
    { 
        return [];
    }
    
    /**
     * @param $isolatedClasses array 
     * @return $this
     */
    public function setIsolatedClasses($isolatedClasses)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getIsolationGroup()
    { 
        return "";
    }
    
    /**
     * @param $isolationGroup String 
     * @return $this
     */
    public function setIsolationGroup($isolationGroup)
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
     * @return bool 
     */
    public function isMultiThreaded()
    { 
        return false;
    }
    
    /**
     * @param $multiThreaded bool 
     * @return $this
     */
    public function setMultiThreaded($multiThreaded)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isWorker()
    { 
        return false;
    }
    
    /**
     * @param $worker bool 
     * @return $this
     */
    public function setWorker($worker)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getWorkerPoolName()
    { 
        return "";
    }
    
    /**
     * @param $workerPoolName String 
     * @return $this
     */
    public function setWorkerPoolName($workerPoolName)
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
