<?php 
namespace io\vertx\php\core;
class Vertx
{
    
    private function __construct()
    {

    }
    /*
     * (long id)
     * methodSize : 1
     */
    public function cancelTimer()
    {

    }
    /*
     * ()
     * (Handler<AsyncResult<Void>> completionHandler)
     * methodSize : 2
     */
    public function close()
    {

    }
    /*
     * (VertxOptions options, Handler<AsyncResult<Vertx>> resultHandler)
     * methodSize : 1
     */
    public function clusteredVertx()
    {

    }
    /*
     * (DatagramSocketOptions options)
     * ()
     * methodSize : 2
     */
    public function createDatagramSocket()
    {

    }
    /*
     * (int port, String host)
     * (DnsClientOptions options)
     * methodSize : 2
     */
    public function createDnsClient()
    {

    }
    /*
     * (HttpClientOptions options)
     * ()
     * methodSize : 2
     */
    public function createHttpClient()
    {

    }
    /*
     * (HttpServerOptions options)
     * ()
     * methodSize : 2
     */
    public function createHttpServer()
    {

    }
    /*
     * (NetClientOptions options)
     * ()
     * methodSize : 2
     */
    public function createNetClient()
    {

    }
    /*
     * (NetServerOptions options)
     * ()
     * methodSize : 2
     */
    public function createNetServer()
    {

    }
    /*
     * (String name)
     * (String name, int poolSize)
     * (String name, int poolSize, long maxExecuteTime)
     * methodSize : 3
     */
    public function createSharedWorkerExecutor()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function currentContext()
    {

    }
    /*
     * (String name)
     * (String name, Handler<AsyncResult<String>> completionHandler)
     * (String name, DeploymentOptions options)
     * (String name, DeploymentOptions options, Handler<AsyncResult<String>> completionHandler)
     * methodSize : 4
     */
    public function deployVerticle()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function deploymentIDs()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function eventBus()
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
     * (Handler<Future<T>> blockingCodeHandler, boolean ordered, Handler<AsyncResult<T>> resultHandler)
     * (Handler<Future<T>> blockingCodeHandler, Handler<AsyncResult<T>> resultHandler)
     * methodSize : 2
     */
    public function executeBlocking()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function fileSystem()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function getOrCreateContext()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function isClustered()
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
     * ()
     * methodSize : 1
     */
    public function isNativeTransportEnabled()
    {

    }
    /*
     * (long delay)
     * methodSize : 1
     */
    public function periodicStream()
    {

    }
    /*
     * (Handler<Void> action)
     * methodSize : 1
     */
    public function runOnContext()
    {

    }
    /*
     * (long delay, Handler<Long> handler)
     * methodSize : 1
     */
    public function setPeriodic()
    {

    }
    /*
     * (long delay, Handler<Long> handler)
     * methodSize : 1
     */
    public function setTimer()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function sharedData()
    {

    }
    /*
     * (long delay)
     * methodSize : 1
     */
    public function timerStream()
    {

    }
    /*
     * (String deploymentID)
     * (String deploymentID, Handler<AsyncResult<Void>> completionHandler)
     * methodSize : 2
     */
    public function undeploy()
    {

    }
    /*
     * ()
     * (VertxOptions options)
     * methodSize : 2
     */
    public function vertx()
    {

    }
}
