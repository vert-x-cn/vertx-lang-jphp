<?php 
namespace io\vertx\php\core;
use io\vertx\php\core\datagram\DatagramSocket;
use io\vertx\php\core\dns\DnsClient;
use io\vertx\php\core\eventbus\EventBus;
use io\vertx\php\core\file\FileSystem;
use io\vertx\php\core\http\HttpClient;
use io\vertx\php\core\http\HttpServer;
use io\vertx\php\core\net\NetClient;
use io\vertx\php\core\net\NetServer;
use io\vertx\php\core\shareddata\SharedData;
class Vertx
{
    
    private function __construct()
    {

    }
    /**
     * (num id)
     * @return bool
     * methodSize : 1
     */
    public function cancelTimer(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return Void
     * (callable completionHandler)
     * @return Void
     * methodSize : 2
     */
    public function close(/*1*/$arg0)
    {

    }
    /**
     * (VertxOptions options, callable resultHandler)
     * @return Void
     * methodSize : 1
     */
    public function clusteredVertx(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (DatagramSocketOptions options)
     * @return DatagramSocket
     * ()
     * @return DatagramSocket
     * methodSize : 2
     */
    public function createDatagramSocket(/*1*/$arg0)
    {

    }
    /**
     * (int port, string host)
     * @return DnsClient
     * (DnsClientOptions options)
     * @return DnsClient
     * methodSize : 2
     */
    public function createDnsClient(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (HttpClientOptions options)
     * @return HttpClient
     * ()
     * @return HttpClient
     * methodSize : 2
     */
    public function createHttpClient(/*1*/$arg0)
    {

    }
    /**
     * (HttpServerOptions options)
     * @return HttpServer
     * ()
     * @return HttpServer
     * methodSize : 2
     */
    public function createHttpServer(/*1*/$arg0)
    {

    }
    /**
     * (NetClientOptions options)
     * @return NetClient
     * ()
     * @return NetClient
     * methodSize : 2
     */
    public function createNetClient(/*1*/$arg0)
    {

    }
    /**
     * (NetServerOptions options)
     * @return NetServer
     * ()
     * @return NetServer
     * methodSize : 2
     */
    public function createNetServer(/*1*/$arg0)
    {

    }
    /**
     * (string name)
     * @return WorkerExecutor
     * (string name, int poolSize)
     * @return WorkerExecutor
     * (string name, int poolSize, num maxExecuteTime)
     * @return WorkerExecutor
     * methodSize : 3
     */
    public function createSharedWorkerExecutor(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * ()
     * @return Context
     * methodSize : 1
     */
    public function currentContext(/*0*/)
    {

    }
    /**
     * (string name)
     * @return Void
     * (string name, callable completionHandler)
     * @return Void
     * (string name, DeploymentOptions options)
     * @return Void
     * (string name, DeploymentOptions options, callable completionHandler)
     * @return Void
     * methodSize : 4
     */
    public function deployVerticle(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * ()
     * @return string
     * methodSize : 1
     */
    public function deploymentIDs(/*0*/)
    {

    }
    /**
     * ()
     * @return EventBus
     * methodSize : 1
     */
    public function eventBus(/*0*/)
    {

    }
    /**
     * (callable handler)
     * @return Vertx
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable blockingCodeHandler, bool ordered, callable resultHandler)
     * @return Void
     * (callable blockingCodeHandler, callable resultHandler)
     * @return Void
     * methodSize : 2
     */
    public function executeBlocking(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * ()
     * @return FileSystem
     * methodSize : 1
     */
    public function fileSystem(/*0*/)
    {

    }
    /**
     * ()
     * @return Context
     * methodSize : 1
     */
    public function getOrCreateContext(/*0*/)
    {

    }
    /**
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isClustered(/*0*/)
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
     * ()
     * @return bool
     * methodSize : 1
     */
    public function isNativeTransportEnabled(/*0*/)
    {

    }
    /**
     * (num delay)
     * @return TimeoutStream
     * methodSize : 1
     */
    public function periodicStream(/*1*/$arg0)
    {

    }
    /**
     * (callable action)
     * @return Void
     * methodSize : 1
     */
    public function runOnContext(/*1*/$arg0)
    {

    }
    /**
     * (num delay, callable handler)
     * @return num
     * methodSize : 1
     */
    public function setPeriodic(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (num delay, callable handler)
     * @return num
     * methodSize : 1
     */
    public function setTimer(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return SharedData
     * methodSize : 1
     */
    public function sharedData(/*0*/)
    {

    }
    /**
     * (num delay)
     * @return TimeoutStream
     * methodSize : 1
     */
    public function timerStream(/*1*/$arg0)
    {

    }
    /**
     * (string deploymentID)
     * @return Void
     * (string deploymentID, callable completionHandler)
     * @return Void
     * methodSize : 2
     */
    public function undeploy(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return Vertx
     * (VertxOptions options)
     * @return Vertx
     * methodSize : 2
     */
    public function vertx(/*1*/$arg0)
    {

    }
}
