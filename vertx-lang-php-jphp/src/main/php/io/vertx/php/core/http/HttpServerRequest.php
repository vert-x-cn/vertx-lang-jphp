<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\MultiMap;
use io\vertx\php\core\net\NetSocket;
use io\vertx\php\core\net\SocketAddress;
class HttpServerRequest
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
     * (callable bodyHandler)
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function bodyHandler(/*1*/$arg0)
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
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function customFrameHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable endHandler)
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return MultiMap
     * methodSize : 1
     */
    public function formAttributes(/*0*/)
    {

    }
    /**
     * (string attributeName)
     * @return string
     * methodSize : 1
     */
    public function getFormAttribute(/*1*/$arg0)
    {

    }
    /**
     * (string headerName)
     * @return string
     * methodSize : 1
     */
    public function getHeader(/*1*/$arg0)
    {

    }
    /**
     * (string paramName)
     * @return string
     * methodSize : 1
     */
    public function getParam(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpServerRequest
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
     * @return string
     * methodSize : 1
     */
    public function host(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isEnded(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isExpectMultipart(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isSSL(/*0*/)
    {

    }
    /**
     * ()
     * @return SocketAddress
     * methodSize : 1
     */
    public function localAddress(/*0*/)
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
     * @return NetSocket
     * methodSize : 1
     */
    public function netSocket(/*0*/)
    {

    }
    /**
     * ()
     * @return MultiMap
     * methodSize : 1
     */
    public function params(/*0*/)
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
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function pause(/*0*/)
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
     * @return string
     * methodSize : 1
     */
    public function rawMethod(/*0*/)
    {

    }
    /**
     * ()
     * @return SocketAddress
     * methodSize : 1
     */
    public function remoteAddress(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpServerResponse
     * methodSize : 1
     */
    public function response(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function scheme(/*0*/)
    {

    }
    /**
     * (bool expect)
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function setExpectMultipart(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function upgrade(/*0*/)
    {

    }
    /**
     * (callable uploadHandler)
     * @return HttpServerRequest
     * methodSize : 1
     */
    public function uploadHandler(/*1*/$arg0)
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
     * ()
     * @return enum
     * methodSize : 1
     */
    public function version(/*0*/)
    {

    }
}
