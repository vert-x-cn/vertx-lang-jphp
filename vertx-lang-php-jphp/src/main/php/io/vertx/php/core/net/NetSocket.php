<?php 
namespace io\vertx\php\core\net;
use io\vertx\php\core\buffer\Buffer;
class NetSocket
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
     * @return NetSocket
     * methodSize : 1
     */
    public function closeHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return NetSocket
     * methodSize : 1
     */
    public function drainHandler(/*1*/$arg0)
    {

    }
    /**
     * (Buffer t)
     * @return Void
     * ()
     * @return Void
     * methodSize : 2
     */
    public function end(/*1*/$arg0)
    {

    }
    /**
     * (callable endHandler)
     * @return NetSocket
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return NetSocket
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return NetSocket
     * methodSize : 1
     */
    public function handler(/*1*/$arg0)
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
     * ()
     * @return NetSocket
     * methodSize : 1
     */
    public function pause(/*0*/)
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
     * @return NetSocket
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * (string filename)
     * @return NetSocket
     * (string filename, num offset)
     * @return NetSocket
     * (string filename, callable resultHandler)
     * @return NetSocket
     * (string filename, num offset, num length)
     * @return NetSocket
     * (string filename, num offset, callable resultHandler)
     * @return NetSocket
     * (string filename, num offset, num length, callable resultHandler)
     * @return NetSocket
     * methodSize : 6
     */
    public function sendFile(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (int maxSize)
     * @return NetSocket
     * methodSize : 1
     */
    public function setWriteQueueMaxSize(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return NetSocket
     * (string serverName, callable handler)
     * @return NetSocket
     * methodSize : 2
     */
    public function upgradeToSsl(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (Buffer data)
     * @return NetSocket
     * (string str)
     * @return NetSocket
     * (string str, string enc)
     * @return NetSocket
     * methodSize : 3
     */
    public function write(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function writeHandlerID(/*0*/)
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
