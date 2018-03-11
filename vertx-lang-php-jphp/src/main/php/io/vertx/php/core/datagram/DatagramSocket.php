<?php 
namespace io\vertx\php\core\datagram;
use io\vertx\php\core\buffer\Buffer;
use io\vertx\php\core\net\SocketAddress;
use io\vertx\php\core\streams\WriteStream;
class DatagramSocket
{
    
    private function __construct()
    {

    }
    /**
     * (string multicastAddress, string sourceToBlock, callable handler)
     * @return DatagramSocket
     * (string multicastAddress, string networkInterface, string sourceToBlock, callable handler)
     * @return DatagramSocket
     * methodSize : 2
     */
    public function blockMulticastGroup(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (callable handler)
     * @return Void
     * ()
     * @return Void
     * methodSize : 2
     */
    public function close(/*1*/$arg0)
    {

    }
    /**
     * (callable endHandler)
     * @return DatagramSocket
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return DatagramSocket
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return DatagramSocket
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
    public function isMetricsEnabled(/*0*/)
    {

    }
    /**
     * (int port, string host, callable handler)
     * @return DatagramSocket
     * methodSize : 1
     */
    public function listen(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (string multicastAddress, callable handler)
     * @return DatagramSocket
     * (string multicastAddress, string networkInterface, string source, callable handler)
     * @return DatagramSocket
     * methodSize : 2
     */
    public function listenMulticastGroup(/*4*/$arg0, $arg1, $arg2, $arg3)
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
     * @return DatagramSocket
     * methodSize : 1
     */
    public function pause(/*0*/)
    {

    }
    /**
     * ()
     * @return DatagramSocket
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * (Buffer packet, int port, string host, callable handler)
     * @return DatagramSocket
     * (string str, int port, string host, callable handler)
     * @return DatagramSocket
     * (string str, string enc, int port, string host, callable handler)
     * @return DatagramSocket
     * methodSize : 3
     */
    public function send(/*5*/$arg0, $arg1, $arg2, $arg3, $arg4)
    {

    }
    /**
     * (int port, string host)
     * @return WriteStream
     * methodSize : 1
     */
    public function sender(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (string multicastAddress, callable handler)
     * @return DatagramSocket
     * (string multicastAddress, string networkInterface, string source, callable handler)
     * @return DatagramSocket
     * methodSize : 2
     */
    public function unlistenMulticastGroup(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
}
