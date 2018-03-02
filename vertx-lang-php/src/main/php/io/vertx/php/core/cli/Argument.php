<?php 
namespace io\vertx\php\core\cli;

class Argument  
{ 
    public function __construct($argument)
    { 
        
    }
    
    /**
     * @return String 
     */
    public function getArgName()
    { 
        return "";
    }
    
    /**
     * @param $argName String 
     * @return $this
     */
    public function setArgName($argName)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getDefaultValue()
    { 
        return "";
    }
    
    /**
     * @param $defaultValue String 
     * @return $this
     */
    public function setDefaultValue($defaultValue)
    { 
        return $this;
    }
    
    /**
     * @return String 
     */
    public function getDescription()
    { 
        return "";
    }
    
    /**
     * @param $description String 
     * @return $this
     */
    public function setDescription($description)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isHidden()
    { 
        return false;
    }
    
    /**
     * @param $hidden bool 
     * @return $this
     */
    public function setHidden($hidden)
    { 
        return $this;
    }
    
    /**
     * @return int 
     */
    public function getIndex()
    { 
        return 1;
    }
    
    /**
     * @param $index int 
     * @return $this
     */
    public function setIndex($index)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isMultiValued()
    { 
        return false;
    }
    
    /**
     * @param $multiValued bool 
     * @return $this
     */
    public function setMultiValued($multiValued)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isRequired()
    { 
        return false;
    }
    
    /**
     * @param $required bool 
     * @return $this
     */
    public function setRequired($required)
    { 
        return $this;
    }
}
