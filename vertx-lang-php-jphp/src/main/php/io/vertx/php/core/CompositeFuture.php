<?php 
namespace io\vertx\php\core;
class CompositeFuture
{
    
    private function __construct()
    {

    }
    /*
     * (Future<T1> f1, Future<T2> f2)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4, Future<T5> f5)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4, Future<T5> f5, Future<T6> f6)
     * (List<Future> futures)
     * methodSize : 6
     */
    public function all()
    {

    }
    /*
     * (Future<T1> f1, Future<T2> f2)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4, Future<T5> f5)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4, Future<T5> f5, Future<T6> f6)
     * (List<Future> futures)
     * methodSize : 6
     */
    public function any()
    {

    }
    /*
     * (int index)
     * methodSize : 1
     */
    public function cause()
    {

    }
    /*
     * (CompositeFuture result)
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
     * (Handler<CompositeFuture> handler, Future<U> next)
     * (Function<CompositeFuture,Future<U>> mapper)
     * methodSize : 2
     */
    public function compose()
    {

    }
    /*
     * (int index)
     * methodSize : 1
     */
    public function failed()
    {

    }
    /*
     * (int index)
     * methodSize : 1
     */
    public function isComplete()
    {

    }
    /*
     * (Future<T1> f1, Future<T2> f2)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4, Future<T5> f5)
     * (Future<T1> f1, Future<T2> f2, Future<T3> f3, Future<T4> f4, Future<T5> f5, Future<T6> f6)
     * (List<Future> futures)
     * methodSize : 6
     */
    public function join()
    {

    }
    /*
     * (Function<CompositeFuture,U> mapper)
     * methodSize : 1
     */
    public function map()
    {

    }
    /*
     * (Function<Throwable,CompositeFuture> mapper)
     * (CompositeFuture value)
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
     * (Function<Throwable,Future<CompositeFuture>> mapper)
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
     * (int index)
     * methodSize : 1
     */
    public function resultAt()
    {

    }
    /*
     * (Handler<AsyncResult<CompositeFuture>> handler)
     * methodSize : 1
     */
    public function setHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function size()
    {

    }
    /*
     * (int index)
     * methodSize : 1
     */
    public function succeeded()
    {

    }
    /*
     * (CompositeFuture result)
     * ()
     * methodSize : 2
     */
    public function tryComplete()
    {

    }
}
