<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\MultiMap;
use io\vertx\php\core\buffer\Buffer;
use io\vertx\php\core\net\SocketAddress;
class ServerWebSocket
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return Void
     * methodSize : 1
     */
    public function accept(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function binaryHandlerID(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return WebSocketBase
     * methodSize : 1
     */
    public function binaryMessageHandler(/*1*/$arg0)
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
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function closeHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return ServerWebSocket
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
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function frameHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return ServerWebSocket
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
     * @return string
     * methodSize : 1
     */
    public function path(/*0*/)
    {

    }
    /**
     * ()
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function pause(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return WebSocketBase
     * methodSize : 1
     */
    public function pongHandler(/*1*/$arg0)
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
     * @return Void
     * (int status)
     * @return Void
     * methodSize : 2
     */
    public function reject(/*1*/$arg0)
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
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * (int maxSize)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function setWriteQueueMaxSize(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function subProtocol(/*0*/)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function textHandlerID(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return WebSocketBase
     * methodSize : 1
     */
    public function textMessageHandler(/*1*/$arg0)
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
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function write(/*1*/$arg0)
    {

    }
    /**
     * (Buffer data)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function writeBinaryMessage(/*1*/$arg0)
    {

    }
    /**
     * (Buffer data)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function writeFinalBinaryFrame(/*1*/$arg0)
    {

    }
    /**
     * (string text)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function writeFinalTextFrame(/*1*/$arg0)
    {

    }
    /**
     * (WebSocketFrame frame)
     * @return ServerWebSocket
     * methodSize : 1
     */
    public function writeFrame(/*1*/$arg0)
    {

    }
    /**
     * (Buffer data)
     * @return WebSocketBase
     * methodSize : 1
     */
    public function writePing(/*1*/$arg0)
    {

    }
    /**
     * (Buffer data)
     * @return WebSocketBase
     * methodSize : 1
     */
    public function writePong(/*1*/$arg0)
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
    /**
     * (string text)
     * @return WebSocketBase
     * methodSize : 1
     */
    public function writeTextMessage(/*1*/$arg0)
    {

    }
}
