<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\buffer\Buffer;
class WebSocketFrame
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return Buffer
     * methodSize : 1
     */
    public function binaryData(/*0*/)
    {

    }
    /**
     * (Buffer data, bool isFinal)
     * @return WebSocketFrame
     * methodSize : 1
     */
    public function binaryFrame(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (Buffer data, bool isFinal)
     * @return WebSocketFrame
     * methodSize : 1
     */
    public function continuationFrame(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isBinary(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isContinuation(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isFinal(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isText(/*0*/)
    {

    }
    /**
     * (Buffer data)
     * @return WebSocketFrame
     * methodSize : 1
     */
    public function pingFrame(/*1*/$arg0)
    {

    }
    /**
     * (Buffer data)
     * @return WebSocketFrame
     * methodSize : 1
     */
    public function pongFrame(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function textData(/*0*/)
    {

    }
    /**
     * (string str, bool isFinal)
     * @return WebSocketFrame
     * methodSize : 1
     */
    public function textFrame(/*2*/$arg0, $arg1)
    {

    }
}
