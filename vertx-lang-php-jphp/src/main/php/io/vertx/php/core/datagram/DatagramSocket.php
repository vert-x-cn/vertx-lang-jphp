<?php 
namespace io\vertx\php\core\datagram;
class DatagramSocket
{
    
    private function __construct()
    {

    }
    /*
     * (String multicastAddress, String sourceToBlock, Handler<AsyncResult<DatagramSocket>> handler)
     * (String multicastAddress, String networkInterface, String sourceToBlock, Handler<AsyncResult<DatagramSocket>> handler)
     * methodSize : 2
     */
    public function blockMulticastGroup()
    {

    }
    /*
     * (Handler<AsyncResult<Void>> handler)
     * ()
     * methodSize : 2
     */
    public function close()
    {

    }
    /*
     * (Handler<Void> endHandler)
     * methodSize : 1
     */
    public function endHandler()
    {

    }
    /*
     * (Handler<Throwable> handler)
     * methodSize : 1
     */
    public function exceptionHandler()
    {

    }
    /*
     * (Handler<DatagramPacket> handler)
     * methodSize : 1
     */
    public function handler()
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
     * (int port, String host, Handler<AsyncResult<DatagramSocket>> handler)
     * methodSize : 1
     */
    public function listen()
    {

    }
    /*
     * (String multicastAddress, Handler<AsyncResult<DatagramSocket>> handler)
     * (String multicastAddress, String networkInterface, String source, Handler<AsyncResult<DatagramSocket>> handler)
     * methodSize : 2
     */
    public function listenMulticastGroup()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function localAddress()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function pause()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function resume()
    {

    }
    /*
     * (Buffer packet, int port, String host, Handler<AsyncResult<DatagramSocket>> handler)
     * (String str, int port, String host, Handler<AsyncResult<DatagramSocket>> handler)
     * (String str, String enc, int port, String host, Handler<AsyncResult<DatagramSocket>> handler)
     * methodSize : 3
     */
    public function send()
    {

    }
    /*
     * (int port, String host)
     * methodSize : 1
     */
    public function sender()
    {

    }
    /*
     * (String multicastAddress, Handler<AsyncResult<DatagramSocket>> handler)
     * (String multicastAddress, String networkInterface, String source, Handler<AsyncResult<DatagramSocket>> handler)
     * methodSize : 2
     */
    public function unlistenMulticastGroup()
    {

    }
}
