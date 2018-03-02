<?php 
namespace io\vertx\php\core\net;

class JksOptions  
{ 
    public function __construct($jksOptions)
    { 
        
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
     * @return String 
     */
    public function getPath()
    { 
        return "";
    }
    
    /**
     * @param $path String 
     * @return $this
     */
    public function setPath($path)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getValue()
    { 
        return 1;
    }
    
    /**
     * @param $value int 
     * @return $this
     */
    public function setValue($value)
    { 
        return $this;
    }
}
