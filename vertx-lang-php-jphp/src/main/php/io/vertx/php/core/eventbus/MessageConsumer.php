<?php 
namespace io\vertx\php\core\eventbus;
use io\vertx\php\core\streams\ReadStream;
class MessageConsumer
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
     * @return ReadStream
     * methodSize : 1
     */
    public function bodyStream(/*0*/)
    {

    }
    /**
     * (callable completionHandler)
     * @return Void
     * methodSize : 1
     */
    public function completionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable endHandler)
     * @return MessageConsumer
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return MessageConsumer
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
    public function getMaxBufferedMessages(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return MessageConsumer
     * methodSize : 1
     */
    public function handler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isRegistered(/*0*/)
    {

    }
    /**
     * ()
     * @return MessageConsumer
     * methodSize : 1
     */
    public function pause(/*0*/)
    {

    }
    /**
     * ()
     * @return MessageConsumer
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * (int maxBufferedMessages)
     * @return MessageConsumer
     * methodSize : 1
     */
    public function setMaxBufferedMessages(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return Void
     * (callable completionHandler)
     * @return Void
     * methodSize : 2
     */
    public function unregister(/*1*/$arg0)
    {

    }
}
