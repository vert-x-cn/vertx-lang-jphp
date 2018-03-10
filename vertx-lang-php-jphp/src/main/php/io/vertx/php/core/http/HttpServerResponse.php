<?php 
namespace io\vertx\php\core\http;
class HttpServerResponse
{
    
    private function __construct()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function bodyEndHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function bytesWritten()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function close()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function closeHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function closed()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function drainHandler()
    {

    }
    /*
     * (String chunk)
     * (Buffer chunk)
     * (String chunk, String enc)
     * ()
     * methodSize : 4
     */
    public function end()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function endHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function ended()
    {

    }
    /*
     * (Handler<Throwable> handler)
     * methodSize : 1
     */
    public function exceptionHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function getStatusCode()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function getStatusMessage()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function headWritten()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function headers()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function headersEndHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function isChunked()
    {

    }
    /*
     * (HttpMethod method, String host, String path, Handler<AsyncResult<HttpServerResponse>> handler)
     * (HttpMethod method, String path, MultiMap headers, Handler<AsyncResult<HttpServerResponse>> handler)
     * (HttpMethod method, String path, Handler<AsyncResult<HttpServerResponse>> handler)
     * (HttpMethod method, String host, String path, MultiMap headers, Handler<AsyncResult<HttpServerResponse>> handler)
     * methodSize : 4
     */
    public function push()
    {

    }
    /*
     * (String name, String value)
     * methodSize : 1
     */
    public function putHeader()
    {

    }
    /*
     * (String name, String value)
     * methodSize : 1
     */
    public function putTrailer()
    {

    }
    /*
     * ()
     * (long code)
     * methodSize : 2
     */
    public function reset()
    {

    }
    /*
     * (String filename)
     * (String filename, long offset)
     * (String filename, Handler<AsyncResult<Void>> resultHandler)
     * (String filename, long offset, long length)
     * (String filename, long offset, Handler<AsyncResult<Void>> resultHandler)
     * (String filename, long offset, long length, Handler<AsyncResult<Void>> resultHandler)
     * methodSize : 6
     */
    public function sendFile()
    {

    }
    /*
     * (boolean chunked)
     * methodSize : 1
     */
    public function setChunked()
    {

    }
    /*
     * (int statusCode)
     * methodSize : 1
     */
    public function setStatusCode()
    {

    }
    /*
     * (String statusMessage)
     * methodSize : 1
     */
    public function setStatusMessage()
    {

    }
    /*
     * (int maxSize)
     * methodSize : 1
     */
    public function setWriteQueueMaxSize()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function streamId()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function trailers()
    {

    }
    /*
     * (Buffer data)
     * (String chunk)
     * (String chunk, String enc)
     * methodSize : 3
     */
    public function write()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function writeContinue()
    {

    }
    /*
     * (int type, int flags, Buffer payload)
     * (HttpFrame frame)
     * methodSize : 2
     */
    public function writeCustomFrame()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function writeQueueFull()
    {

    }
}
