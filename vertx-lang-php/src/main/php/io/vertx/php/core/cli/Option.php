<?php 
namespace io\vertx\php\core\cli;

class Option  
{ 
    public function __construct($option)
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
     * @param $choices String 
     * @return $this
     */
    public function addChoice($choices) 
    {
        return $this;
    }
        
    /**
     * @return array 
     */
    public function getChoices()
    { 
        return [];
    }
    
    /**
     * @param $choices array 
     * @return $this
     */
    public function setChoices($choices)
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
    public function isFlag()
    { 
        return false;
    }
    
    /**
     * @param $flag bool 
     * @return $this
     */
    public function setFlag($flag)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isHelp()
    { 
        return false;
    }
    
    /**
     * @param $help bool 
     * @return $this
     */
    public function setHelp($help)
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
     * @return String 
     */
    public function getLongName()
    { 
        return "";
    }
    
    /**
     * @param $longName String 
     * @return $this
     */
    public function setLongName($longName)
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
     * @return String 
     */
    public function getName()
    { 
        return "";
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
    
    /**
     * @return String 
     */
    public function getShortName()
    { 
        return "";
    }
    
    /**
     * @param $shortName String 
     * @return $this
     */
    public function setShortName($shortName)
    { 
        return $this;
    }
    
    /**
     * @return bool 
     */
    public function isSingleValued()
    { 
        return false;
    }
    
    /**
     * @param $singleValued bool 
     * @return $this
     */
    public function setSingleValued($singleValued)
    { 
        return $this;
    }
}
