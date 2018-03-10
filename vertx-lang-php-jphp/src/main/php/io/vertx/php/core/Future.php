<?php 
namespace io\vertx\php\core;
class Future
{
    
    private function __construct()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function cause()
    {

    }
    /*
     * (T result)
     * ()
     * methodSize : 2
     */
    public function complete()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function completer()
    {

    }
    /*
     * (Handler<T> handler, Future<U> next)
     * (Function<T,Future<U>> mapper)
     * methodSize : 2
     */
    public function compose()
    {

    }
    /*
     * (Throwable cause)
     * (String failureMessage)
     * methodSize : 2
     */
    public function fail()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function failed()
    {

    }
    /*
     * (Throwable t)
     * (String failureMessage)
     * methodSize : 2
     */
    public function failedFuture()
    {

    }
    /*
     * (Handler<Future<T>> handler)
     * ()
     * methodSize : 2
     */
    public function future()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function isComplete()
    {

    }
    /*
     * (Function<T,U> mapper)
     * (V value)
     * methodSize : 2
     */
    public function map()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function mapEmpty()
    {

    }
    /*
     * (Function<Throwable,T> mapper)
     * (T value)
     * methodSize : 2
     */
    public function otherwise()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function otherwiseEmpty()
    {

    }
    /*
     * (Function<Throwable,Future<T>> mapper)
     * methodSize : 1
     */
    public function recover()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function result()
    {

    }
    /*
     * (Handler<AsyncResult<T>> handler)
     * methodSize : 1
     */
    public function setHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function succeeded()
    {

    }
    /*
     * ()
     * (T result)
     * methodSize : 2
     */
    public function succeededFuture()
    {

    }
    /*
     * (T result)
     * ()
     * methodSize : 2
     */
    public function tryComplete()
    {

    }
    /*
     * (Throwable cause)
     * (String failureMessage)
     * methodSize : 2
     */
    public function tryFail()
    {

    }
}
