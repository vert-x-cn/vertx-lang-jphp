<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\MultiMap;
use io\vertx\php\core\buffer\Buffer;
class HttpClientRequest
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function absoluteURI(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpConnection
     * methodSize : 1
     */
    public function connection(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function connectionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function continueHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function drainHandler(/*1*/$arg0)
    {

    }
    /**
     * (string chunk)
     * @return Void
     * (Buffer chunk)
     * @return Void
     * (string chunk, string enc)
     * @return Void
     * ()
     * @return Void
     * methodSize : 4
     */
    public function end(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (callable endHandler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function getHost(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function getRawMethod(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function handler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return MultiMap
     * methodSize : 1
     */
    public function headers(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isChunked(/*0*/)
    {

    }
    /**
     * ()
     * @return enum
     * methodSize : 1
     */
    public function method(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function path(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function pause(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function pushHandler(/*1*/$arg0)
    {

    }
    /**
     * (string name, string value)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function putHeader(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function query(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * (num code)
     * @return bool
     * methodSize : 2
     */
    public function reset(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpClientRequest
     * (callable completionHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function sendHead(/*1*/$arg0)
    {

    }
    /**
     * (bool chunked)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function setChunked(/*1*/$arg0)
    {

    }
    /**
     * (bool followRedirects)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function setFollowRedirects(/*1*/$arg0)
    {

    }
    /**
     * (string host)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function setHost(/*1*/$arg0)
    {

    }
    /**
     * (string method)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function setRawMethod(/*1*/$arg0)
    {

    }
    /**
     * (num timeoutMs)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function setTimeout(/*1*/$arg0)
    {

    }
    /**
     * (int maxSize)
     * @return HttpClientRequest
     * methodSize : 1
     */
    public function setWriteQueueMaxSize(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return int
     * methodSize : 1
     */
    public function streamId(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function uri(/*0*/)
    {

    }
    /**
     * (Buffer data)
     * @return HttpClientRequest
     * (string chunk)
     * @return HttpClientRequest
     * (string chunk, string enc)
     * @return HttpClientRequest
     * methodSize : 3
     */
    public function write(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (int type, int flags, Buffer payload)
     * @return HttpClientRequest
     * (HttpFrame frame)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function writeCustomFrame(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function writeQueueFull(/*0*/)
    {

    }
}
