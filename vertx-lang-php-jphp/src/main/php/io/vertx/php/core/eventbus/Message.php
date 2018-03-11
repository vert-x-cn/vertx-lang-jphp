<?php 
namespace io\vertx\php\core\eventbus;
use io\vertx\php\core\MultiMap;
class Message
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function address(/*0*/)
    {

    }
    /**
     * ()
     * @return Memory
     * methodSize : 1
     */
    public function body(/*0*/)
    {

    }
    /**
     * (int failureCode, string message)
     * @return Void
     * methodSize : 1
     */
    public function fail(/*2*/$arg0, $arg1)
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
    public function isSend(/*0*/)
    {

    }
    /**
     * (object message)
     * @return Void
     * (object message, callable replyHandler)
     * @return Void
     * (object message, DeliveryOptions options)
     * @return Void
     * (object message, DeliveryOptions options, callable replyHandler)
     * @return Void
     * methodSize : 4
     */
    public function reply(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function replyAddress(/*0*/)
    {

    }
}
