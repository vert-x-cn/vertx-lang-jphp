<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\buffer\Buffer;
use io\vertx\php\core\net\SocketAddress;
class HttpConnection
{
    
    private function __construct()
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
     * @return HttpConnection
     * methodSize : 1
     */
    public function closeHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpConnection
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
    public function getWindowSize(/*0*/)
    {

    }
    /**
     * (num errorCode)
     * @return HttpConnection
     * (num errorCode, int lastStreamId)
     * @return HttpConnection
     * (num errorCode, int lastStreamId, Buffer debugData)
     * @return HttpConnection
     * methodSize : 3
     */
    public function goAway(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (callable handler)
     * @return HttpConnection
     * methodSize : 1
     */
    public function goAwayHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function indicatedServerName(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isSsl(/*0*/)
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
     * (Buffer data, callable pongHandler)
     * @return HttpConnection
     * methodSize : 1
     */
    public function ping(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (callable handler)
     * @return HttpConnection
     * methodSize : 1
     */
    public function pingHandler(/*1*/$arg0)
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
     * @return Http2Settings
     * methodSize : 1
     */
    public function remoteSettings(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return HttpConnection
     * methodSize : 1
     */
    public function remoteSettingsHandler(/*1*/$arg0)
    {

    }
    /**
     * (int windowSize)
     * @return HttpConnection
     * methodSize : 1
     */
    public function setWindowSize(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return Http2Settings
     * methodSize : 1
     */
    public function settings(/*0*/)
    {

    }
    /**
     * ()
     * @return HttpConnection
     * (num timeoutMs)
     * @return HttpConnection
     * methodSize : 2
     */
    public function shutdown(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return HttpConnection
     * methodSize : 1
     */
    public function shutdownHandler(/*1*/$arg0)
    {

    }
    /**
     * (Http2Settings settings)
     * @return HttpConnection
     * (Http2Settings settings, callable completionHandler)
     * @return HttpConnection
     * methodSize : 2
     */
    public function updateSettings(/*2*/$arg0, $arg1)
    {

    }
}
