<?php 
namespace io\vertx\php\core\http;
use io\vertx\php\core\MultiMap;
use io\vertx\php\core\streams\ReadStream;
class HttpClient
{
    
    private function __construct()
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
     * (RequestOptions options)
     * @return HttpClientRequest
     * (string requestURI)
     * @return HttpClientRequest
     * (int port, string host, string requestURI)
     * @return HttpClientRequest
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (string host, string requestURI)
     * @return HttpClientRequest
     * (RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function delete(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string absoluteURI)
     * @return HttpClientRequest
     * (string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function deleteAbs(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (RequestOptions options)
     * @return HttpClientRequest
     * (string requestURI)
     * @return HttpClientRequest
     * (int port, string host, string requestURI)
     * @return HttpClientRequest
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (string host, string requestURI)
     * @return HttpClientRequest
     * (RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function get(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string absoluteURI)
     * @return HttpClientRequest
     * (string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function getAbs(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (RequestOptions options, callable responseHandler)
     * @return HttpClient
     * (string requestURI, callable responseHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClient
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClient
     * methodSize : 4
     */
    public function getNow(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (RequestOptions options)
     * @return HttpClientRequest
     * (string requestURI)
     * @return HttpClientRequest
     * (int port, string host, string requestURI)
     * @return HttpClientRequest
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (string host, string requestURI)
     * @return HttpClientRequest
     * (RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function head(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string absoluteURI)
     * @return HttpClientRequest
     * (string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function headAbs(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (RequestOptions options, callable responseHandler)
     * @return HttpClient
     * (string requestURI, callable responseHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClient
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClient
     * methodSize : 4
     */
    public function headNow(/*4*/$arg0, $arg1, $arg2, $arg3)
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
     * (RequestOptions options)
     * @return HttpClientRequest
     * (string requestURI)
     * @return HttpClientRequest
     * (int port, string host, string requestURI)
     * @return HttpClientRequest
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (string host, string requestURI)
     * @return HttpClientRequest
     * (RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function options(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string absoluteURI)
     * @return HttpClientRequest
     * (string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function optionsAbs(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (RequestOptions options, callable responseHandler)
     * @return HttpClient
     * (string requestURI, callable responseHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClient
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClient
     * methodSize : 4
     */
    public function optionsNow(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (RequestOptions options)
     * @return HttpClientRequest
     * (string requestURI)
     * @return HttpClientRequest
     * (int port, string host, string requestURI)
     * @return HttpClientRequest
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (string host, string requestURI)
     * @return HttpClientRequest
     * (RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function post(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string absoluteURI)
     * @return HttpClientRequest
     * (string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function postAbs(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (RequestOptions options)
     * @return HttpClientRequest
     * (string requestURI)
     * @return HttpClientRequest
     * (int port, string host, string requestURI)
     * @return HttpClientRequest
     * (string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (string host, string requestURI)
     * @return HttpClientRequest
     * (RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function put(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
    /**
     * (string absoluteURI)
     * @return HttpClientRequest
     * (string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function putAbs(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (callable handler)
     * @return HttpClient
     * methodSize : 1
     */
    public function redirectHandler(/*1*/$arg0)
    {

    }
    /**
     * (enum method, RequestOptions options)
     * @return HttpClientRequest
     * (enum method, string requestURI)
     * @return HttpClientRequest
     * (enum method, int port, string host, string requestURI)
     * @return HttpClientRequest
     * (enum method, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (enum method, string host, string requestURI)
     * @return HttpClientRequest
     * (enum method, RequestOptions options, callable responseHandler)
     * @return HttpClientRequest
     * (enum method, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * (enum method, int port, string host, string requestURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 8
     */
    public function request(/*5*/$arg0, $arg1, $arg2, $arg3, $arg4)
    {

    }
    /**
     * (enum method, string absoluteURI)
     * @return HttpClientRequest
     * (enum method, string absoluteURI, callable responseHandler)
     * @return HttpClientRequest
     * methodSize : 2
     */
    public function requestAbs(/*3*/$arg0, $arg1, $arg2)
    {

    }
    /**
     * (RequestOptions options, callable wsConnect)
     * @return HttpClient
     * (string requestURI, callable wsConnect)
     * @return HttpClient
     * (int port, string host, string requestURI, callable wsConnect)
     * @return HttpClient
     * (string host, string requestURI, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (RequestOptions options, MultiMap headers, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string host, string requestURI, MultiMap headers, callable wsConnect)
     * @return HttpClient
     * (RequestOptions options, MultiMap headers, enum version, callable wsConnect)
     * @return HttpClient
     * (string requestURI, MultiMap headers, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string requestURI, MultiMap headers, enum version, callable wsConnect)
     * @return HttpClient
     * (RequestOptions options, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string host, string requestURI, callable wsConnect)
     * @return HttpClient
     * (RequestOptions options, MultiMap headers, callable wsConnect)
     * @return HttpClient
     * (string requestURI, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string requestURI, MultiMap headers, callable wsConnect)
     * @return HttpClient
     * (int port, string host, string requestURI, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, MultiMap headers, callable wsConnect)
     * @return HttpClient
     * (string host, string requestURI, MultiMap headers, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (RequestOptions options, MultiMap headers, enum version, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string host, string requestURI, MultiMap headers, enum version, callable wsConnect)
     * @return HttpClient
     * (RequestOptions options, MultiMap headers, enum version, string subProtocols, callable wsConnect)
     * @return HttpClient
     * (string requestURI, MultiMap headers, enum version, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string requestURI, MultiMap headers, enum version, string subProtocols, callable wsConnect)
     * @return HttpClient
     * (int port, string host, string requestURI, MultiMap headers, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, MultiMap headers, enum version, callable wsConnect)
     * @return HttpClient
     * (string host, string requestURI, MultiMap headers, enum version, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (RequestOptions options, MultiMap headers, enum version, string subProtocols, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (string host, string requestURI, MultiMap headers, enum version, string subProtocols, callable wsConnect)
     * @return HttpClient
     * (string requestURI, MultiMap headers, enum version, string subProtocols, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, MultiMap headers, enum version, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, MultiMap headers, enum version, string subProtocols, callable wsConnect)
     * @return HttpClient
     * (string host, string requestURI, MultiMap headers, enum version, string subProtocols, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * (int port, string host, string requestURI, MultiMap headers, enum version, string subProtocols, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * methodSize : 32
     */
    public function websocket(/*8*/$arg0, $arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)
    {

    }
    /**
     * (string url, MultiMap headers, enum version, string subProtocols, callable wsConnect, callable failureHandler)
     * @return HttpClient
     * methodSize : 1
     */
    public function websocketAbs(/*6*/$arg0, $arg1, $arg2, $arg3, $arg4, $arg5)
    {

    }
    /**
     * (RequestOptions options)
     * @return ReadStream
     * (string requestURI)
     * @return ReadStream
     * (int port, string host, string requestURI)
     * @return ReadStream
     * (string host, string requestURI, MultiMap headers)
     * @return ReadStream
     * (RequestOptions options, MultiMap headers, enum version)
     * @return ReadStream
     * (string requestURI, MultiMap headers, enum version)
     * @return ReadStream
     * (string host, string requestURI)
     * @return ReadStream
     * (RequestOptions options, MultiMap headers)
     * @return ReadStream
     * (string requestURI, MultiMap headers)
     * @return ReadStream
     * (int port, string host, string requestURI, MultiMap headers)
     * @return ReadStream
     * (string host, string requestURI, MultiMap headers, enum version)
     * @return ReadStream
     * (RequestOptions options, MultiMap headers, enum version, string subProtocols)
     * @return ReadStream
     * (string requestURI, MultiMap headers, enum version, string subProtocols)
     * @return ReadStream
     * (int port, string host, string requestURI, MultiMap headers, enum version)
     * @return ReadStream
     * (string host, string requestURI, MultiMap headers, enum version, string subProtocols)
     * @return ReadStream
     * (int port, string host, string requestURI, MultiMap headers, enum version, string subProtocols)
     * @return ReadStream
     * methodSize : 16
     */
    public function websocketStream(/*6*/$arg0, $arg1, $arg2, $arg3, $arg4, $arg5)
    {

    }
    /**
     * (string url, MultiMap headers, enum version, string subProtocols)
     * @return ReadStream
     * methodSize : 1
     */
    public function websocketStreamAbs(/*4*/$arg0, $arg1, $arg2, $arg3)
    {

    }
}
