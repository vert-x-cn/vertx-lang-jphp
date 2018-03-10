<?php 
namespace io\vertx\php\core\file;

class OpenOptions  
{ 
    public function __construct($openOptions)
    { 
        
    }
    
    /**
     * @return bool 
     */
    public function isAppend()
    { 
        return false;
    }
    
    /**
     * @param $append bool 
     * @return $this
     */
    public function setAppend($append)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isCreate()
    { 
        return false;
    }
    
    /**
     * @param $create bool 
     * @return $this
     */
    public function setCreate($create)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isCreateNew()
    { 
        return false;
    }
    
    /**
     * @param $createNew bool 
     * @return $this
     */
    public function setCreateNew($createNew)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isDeleteOnClose()
    { 
        return false;
    }
    
    /**
     * @param $deleteOnClose bool 
     * @return $this
     */
    public function setDeleteOnClose($deleteOnClose)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isDsync()
    { 
        return false;
    }
    
    /**
     * @param $dsync bool 
     * @return $this
     */
    public function setDsync($dsync)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getPerms()
    { 
        return "";
    }
    
    /**
     * @param $perms String 
     * @return $this
     */
    public function setPerms($perms)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isRead()
    { 
        return false;
    }
    
    /**
     * @param $read bool 
     * @return $this
     */
    public function setRead($read)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isSparse()
    { 
        return false;
    }
    
    /**
     * @param $sparse bool 
     * @return $this
     */
    public function setSparse($sparse)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isSync()
    { 
        return false;
    }
    
    /**
     * @param $sync bool 
     * @return $this
     */
    public function setSync($sync)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isTruncateExisting()
    { 
        return false;
    }
    
    /**
     * @param $truncateExisting bool 
     * @return $this
     */
    public function setTruncateExisting($truncateExisting)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isWrite()
    { 
        return false;
    }
    
    /**
     * @param $write bool 
     * @return $this
     */
    public function setWrite($write)
    { 
        return $this;
    }
}
