<?php 
namespace io\vertx\php\core;
class Future
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return Throwable
     * methodSize : 1
     */
    public function cause(/*0*/)
    {

    }
    /**
     * (Memory result)
     * @return Void
     * ()
     * @return Void
     * methodSize : 2
     */
    public function complete(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return callable
     * methodSize : 1
     */
    public function completer(/*0*/)
    {

    }
    /**
     * (callable handler, Future next)
     * @return Future
     * (callable mapper)
     * @return Future
     * methodSize : 2
     */
    public function compose(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (Throwable cause)
     * @return Void
     * (string failureMessage)
     * @return Void
     * methodSize : 2
     */
    public function fail(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function failed(/*0*/)
    {

    }
    /**
     * (Throwable t)
     * @return Future
     * (string failureMessage)
     * @return Future
     * methodSize : 2
     */
    public function failedFuture(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return Future
     * ()
     * @return Future
     * methodSize : 2
     */
    public function future(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isComplete(/*0*/)
    {

    }
    /**
     * (callable mapper)
     * @return Future
     * (Memory value)
     * @return Future
     * methodSize : 2
     */
    public function map(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return Future
     * methodSize : 1
     */
    public function mapEmpty(/*0*/)
    {

    }
    /**
     * (callable mapper)
     * @return Future
     * (Memory value)
     * @return Future
     * methodSize : 2
     */
    public function otherwise(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return Future
     * methodSize : 1
     */
    public function otherwiseEmpty(/*0*/)
    {

    }
    /**
     * (callable mapper)
     * @return Future
     * methodSize : 1
     */
    public function recover(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return Memory
     * methodSize : 1
     */
    public function result(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return Future
     * methodSize : 1
     */
    public function setHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function succeeded(/*0*/)
    {

    }
    /**
     * ()
     * @return Future
     * (Memory result)
     * @return Future
     * methodSize : 2
     */
    public function succeededFuture(/*1*/$arg0)
    {

    }
    /**
     * (Memory result)
     * @return bool
     * ()
     * @return bool
     * methodSize : 2
     */
    public function tryComplete(/*1*/$arg0)
    {

    }
    /**
     * (Throwable cause)
     * @return bool
     * (string failureMessage)
     * @return bool
     * methodSize : 2
     */
    public function tryFail(/*1*/$arg0)
    {

    }
}
