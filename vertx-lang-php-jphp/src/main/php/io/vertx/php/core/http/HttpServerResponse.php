<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\MultiMap;
use io\vertx\php\core\buffer\Buffer;
class HttpServerResponse
{
    
    private function __construct()
    {

    }
    /**
     * (callable handler)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function bodyEndHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return num
     * methodSize : 1
     */
    public function bytesWritten(/*0*/)
    {

    }
    /**
     * ()
     * @return Void
     * methodSize : 1
     */
    public function close(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function closeHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function closed(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpServerResponse
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
     * (callable handler)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function ended(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return int
     * methodSize : 1
     */
    public function getStatusCode(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function getStatusMessage(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function headWritten(/*0*/)
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
     * (callable handler)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function headersEndHandler(/*1*/$arg0)
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
     * (enum method, string host, string path, callable handler)
     * @return HttpServerResponse
     * (enum method, string path, MultiMap headers, callable handler)
     * @return HttpServerResponse
     * (enum method, string path, callable handler)
     * @return HttpServerResponse
     * (enum method, string host, string path, MultiMap headers, callable handler)
     * @return HttpServerResponse
     * methodSize : 4
     */
    public function push(/*5*/$arg0, $arg1, $arg2, $arg3, $arg4)
    {

    }
    /**
     * (string name, string value)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function putHeader(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string name, string value)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function putTrailer(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return Void
     * (num code)
     * @return Void
     * methodSize : 2
     */
    public function reset(/*1*/$arg0)
    {

    }
    /**
     * (string filename)
     * @return HttpServerResponse
     * (string filename, num offset)
     * @return HttpServerResponse
     * (string filename, callable resultHandler)
     * @return HttpServerResponse
     * (string filename, num offset, num length)
     * @return HttpServerResponse
     * (string filename, num offset, callable resultHandler)
     * @return HttpServerResponse
     * (string filename, num offset, num length, callable resultHandler)
     * @return HttpServerResponse
     * methodSize : 6
     */
    public function sendFile(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (bool chunked)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function setChunked(/*1*/$arg0)
    {

    }
    /**
     * (int statusCode)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function setStatusCode(/*1*/$arg0)
    {

    }
    /**
     * (string statusMessage)
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function setStatusMessage(/*1*/$arg0)
    {

    }
    /**
     * (int maxSize)
     * @return HttpServerResponse
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
     * @return MultiMap
     * methodSize : 1
     */
    public function trailers(/*0*/)
    {

    }
    /**
     * (Buffer data)
     * @return HttpServerResponse
     * (string chunk)
     * @return HttpServerResponse
     * (string chunk, string enc)
     * @return HttpServerResponse
     * methodSize : 3
     */
    public function write(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function writeContinue(/*0*/)
    {

    }
    /**
     * (int type, int flags, Buffer payload)
     * @return HttpServerResponse
     * (HttpFrame frame)
     * @return HttpServerResponse
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
