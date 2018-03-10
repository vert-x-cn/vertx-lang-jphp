<?php 
namespace io\vertx\php\core\eventbus;
class EventBus
{
    
    private function __construct()
    {

    }
    /*
     * (Handler<SendContext> interceptor)
     * methodSize : 1
     */
    public function addInterceptor()
    {

    }
    /*
     * (String address)
     * (String address, Handler<Message<T>> handler)
     * methodSize : 2
     */
    public function consumer()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function isMetricsEnabled()
    {

    }
    /*
     * (String address)
     * (String address, Handler<Message<T>> handler)
     * methodSize : 2
     */
    public function localConsumer()
    {

    }
    /*
     * (String address, Object message)
     * (String address, Object message, DeliveryOptions options)
     * methodSize : 2
     */
    public function publish()
    {

    }
    /*
     * (String address)
     * (String address, DeliveryOptions options)
     * methodSize : 2
     */
    public function publisher()
    {

    }
    /*
     * (Handler<SendContext> interceptor)
     * methodSize : 1
     */
    public function removeInterceptor()
    {

    }
    /*
     * (String address, Object message)
     * (String address, Object message, Handler<AsyncResult<Message<T>>> replyHandler)
     * (String address, Object message, DeliveryOptions options)
     * (String address, Object message, DeliveryOptions options, Handler<AsyncResult<Message<T>>> replyHandler)
     * methodSize : 4
     */
    public function send()
    {

    }
    /*
     * (String address)
     * (String address, DeliveryOptions options)
     * methodSize : 2
     */
    public function sender()
    {

    }
}
