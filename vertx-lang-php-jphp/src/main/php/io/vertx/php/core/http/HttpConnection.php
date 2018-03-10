<?php 
namespace io\vertx\php\core\http;
class HttpConnection
{
    
    private function __construct()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function close()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function closeHandler()
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
     * ()
     * methodSize : 1
     */
    public function getWindowSize()
    {

    }
    /*
     * (long errorCode)
     * (long errorCode, int lastStreamId)
     * (long errorCode, int lastStreamId, Buffer debugData)
     * methodSize : 3
     */
    public function goAway()
    {

    }
    /*
     * (Handler<GoAway> handler)
     * methodSize : 1
     */
    public function goAwayHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function indicatedServerName()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function isSsl()
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
     * (Buffer data, Handler<AsyncResult<Buffer>> pongHandler)
     * methodSize : 1
     */
    public function ping()
    {

    }
    /*
     * (Handler<Buffer> handler)
     * methodSize : 1
     */
    public function pingHandler()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function remoteAddress()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function remoteSettings()
    {

    }
    /*
     * (Handler<Http2Settings> handler)
     * methodSize : 1
     */
    public function remoteSettingsHandler()
    {

    }
    /*
     * (int windowSize)
     * methodSize : 1
     */
    public function setWindowSize()
    {

    }
    /*
     * ()
     * methodSize : 1
     */
    public function settings()
    {

    }
    /*
     * ()
     * (long timeoutMs)
     * methodSize : 2
     */
    public function shutdown()
    {

    }
    /*
     * (Handler<Void> handler)
     * methodSize : 1
     */
    public function shutdownHandler()
    {

    }
    /*
     * (Http2Settings settings)
     * (Http2Settings settings, Handler<AsyncResult<Void>> completionHandler)
     * methodSize : 2
     */
    public function updateSettings()
    {

    }
}
