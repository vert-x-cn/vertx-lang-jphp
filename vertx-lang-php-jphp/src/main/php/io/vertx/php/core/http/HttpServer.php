<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\streams\ReadStream;
class HttpServer
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return int
     * methodSize : 1
     */
    public function actualPort(/*0*/)
    {

    }
    /**
     * ()
     * @return Void
     * (callable completionHandler)
     * @return Void
     * methodSize : 2
     */
    public function close(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpServer
     * methodSize : 1
     */
    public function connectionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpServer
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isMetricsEnabled(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpServer
     * (int port, string host)
     * @return HttpServer
     * (int port, callable listenHandler)
     * @return HttpServer
     * (int port, string host, callable listenHandler)
     * @return HttpServer
     * (int port)
     * @return HttpServer
     * (callable listenHandler)
     * @return HttpServer
     * methodSize : 6
     */
    public function listen(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (callable handler)
     * @return HttpServer
     * methodSize : 1
     */
    public function requestHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return ReadStream
     * methodSize : 1
     */
    public function requestStream(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpServer
     * methodSize : 1
     */
    public function websocketHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return ReadStream
     * methodSize : 1
     */
    public function websocketStream(/*0*/)
    {

    }
}
