<?php 
namespace io\vertx\php\core;
class CompositeFuture
{
    
    private function __construct()
    {

    }
    /**
     * (Future f1, Future f2)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4, Future f5)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4, Future f5, Future f6)
     * @return CompositeFuture
     * (string futures)
     * @return CompositeFuture
     * methodSize : 6
     */
    public function all(/*6*/$arg0, $arg1, $arg2, $arg3, $arg4, $arg5)
    {

    }
    /**
     * (Future f1, Future f2)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4, Future f5)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4, Future f5, Future f6)
     * @return CompositeFuture
     * (string futures)
     * @return CompositeFuture
     * methodSize : 6
     */
    public function any(/*6*/$arg0, $arg1, $arg2, $arg3, $arg4, $arg5)
    {

    }
    /**
     * (int index)
     * @return Throwable
     * methodSize : 1
     */
    public function cause(/*1*/$arg0)
    {

    }
    /**
     * (CompositeFuture result)
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
     * (int index)
     * @return bool
     * methodSize : 1
     */
    public function failed(/*1*/$arg0)
    {

    }
    /**
     * (int index)
     * @return bool
     * methodSize : 1
     */
    public function isComplete(/*1*/$arg0)
    {

    }
    /**
     * (Future f1, Future f2)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4, Future f5)
     * @return CompositeFuture
     * (Future f1, Future f2, Future f3, Future f4, Future f5, Future f6)
     * @return CompositeFuture
     * (string futures)
     * @return CompositeFuture
     * methodSize : 6
     */
    public function join(/*6*/$arg0, $arg1, $arg2, $arg3, $arg4, $arg5)
    {

    }
    /**
     * (callable mapper)
     * @return Future
     * methodSize : 1
     */
    public function map(/*1*/$arg0)
    {

    }
    /**
     * (callable mapper)
     * @return Future
     * (CompositeFuture value)
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
     * @return CompositeFuture
     * methodSize : 1
     */
    public function result(/*0*/)
    {

    }
    /**
     * (int index)
     * @return Memory
     * methodSize : 1
     */
    public function resultAt(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return CompositeFuture
     * methodSize : 1
     */
    public function setHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return int
     * methodSize : 1
     */
    public function size(/*0*/)
    {

    }
    /**
     * (int index)
     * @return bool
     * methodSize : 1
     */
    public function succeeded(/*1*/$arg0)
    {

    }
    /**
     * (CompositeFuture result)
     * @return bool
     * ()
     * @return bool
     * methodSize : 2
     */
    public function tryComplete(/*1*/$arg0)
    {

    }
}
