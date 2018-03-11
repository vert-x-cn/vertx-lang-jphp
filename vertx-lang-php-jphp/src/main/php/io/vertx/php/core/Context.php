<?php 
namespace io\vertx\php\core;
class Context
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return object
     * methodSize : 1
     */
    public function config(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function deploymentID(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return Context
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable blockingCodeHandler, bool ordered, callable resultHandler)
     * @return Void
     * (callable blockingCodeHandler, callable resultHandler)
     * @return Void
     * methodSize : 2
     */
    public function executeBlocking(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string key)
     * @return Memory
     * methodSize : 1
     */
    public function get(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return int
     * methodSize : 1
     */
    public function getInstanceCount(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isEventLoopContext(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isMultiThreadedWorkerContext(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isOnEventLoopThread(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isOnVertxThread(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isOnWorkerThread(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isWorkerContext(/*0*/)
    {

    }
    /**
     * ()
     * @return Vertx
     * methodSize : 1
     */
    public function owner(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function processArgs(/*0*/)
    {

    }
    /**
     * (string key, object value)
     * @return Void
     * methodSize : 1
     */
    public function put(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string key)
     * @return bool
     * methodSize : 1
     */
    public function remove(/*1*/$arg0)
    {

    }
    /**
     * (callable action)
     * @return Void
     * methodSize : 1
     */
    public function runOnContext(/*1*/$arg0)
    {

    }
}
