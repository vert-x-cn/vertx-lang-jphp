<?php 
namespace io\vertx\php\core\eventbus;
class MessageProducer
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
     * @return Void
     * methodSize : 1
     */
    public function close(/*0*/)
    {

    }
    /**
     * (DeliveryOptions options)
     * @return MessageProducer
     * methodSize : 1
     */
    public function deliveryOptions(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return MessageProducer
     * methodSize : 1
     */
    public function drainHandler(/*1*/$arg0)
    {

    }
    /**
     * (Memory t)
     * @return Void
     * ()
     * @return Void
     * methodSize : 2
     */
    public function end(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return MessageProducer
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (Memory message)
     * @return MessageProducer
     * (Memory message, callable replyHandler)
     * @return MessageProducer
     * methodSize : 2
     */
    public function send(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (int maxSize)
     * @return MessageProducer
     * methodSize : 1
     */
    public function setWriteQueueMaxSize(/*1*/$arg0)
    {

    }
    /**
     * (Memory data)
     * @return MessageProducer
     * methodSize : 1
     */
    public function write(/*1*/$arg0)
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
