<?php 
namespace io\vertx\php\core\eventbus;
class EventBus
{
    
    private function __construct()
    {

    }
    /**
     * (callable interceptor)
     * @return EventBus
     * methodSize : 1
     */
    public function addInterceptor(/*1*/$arg0)
    {

    }
    /**
     * (string address)
     * @return MessageConsumer
     * (string address, callable handler)
     * @return MessageConsumer
     * methodSize : 2
     */
    public function consumer(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isMetricsEnabled(/*0*/)
    {

    }
    /**
     * (string address)
     * @return MessageConsumer
     * (string address, callable handler)
     * @return MessageConsumer
     * methodSize : 2
     */
    public function localConsumer(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string address, object message)
     * @return EventBus
     * (string address, object message, DeliveryOptions options)
     * @return EventBus
     * methodSize : 2
     */
    public function publish(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string address)
     * @return MessageProducer
     * (string address, DeliveryOptions options)
     * @return MessageProducer
     * methodSize : 2
     */
    public function publisher(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (callable interceptor)
     * @return EventBus
     * methodSize : 1
     */
    public function removeInterceptor(/*1*/$arg0)
    {

    }
    /**
     * (string address, object message)
     * @return EventBus
     * (string address, object message, callable replyHandler)
     * @return EventBus
     * (string address, object message, DeliveryOptions options)
     * @return EventBus
     * (string address, object message, DeliveryOptions options, callable replyHandler)
     * @return EventBus
     * methodSize : 4
     */
    public function send(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string address)
     * @return MessageProducer
     * (string address, DeliveryOptions options)
     * @return MessageProducer
     * methodSize : 2
     */
    public function sender(/*2*/$arg0, $arg1)
    {

    }
}
