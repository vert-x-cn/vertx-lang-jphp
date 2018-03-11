<?php 
namespace io\vertx\php\core\file;
use io\vertx\php\core\buffer\Buffer;
class AsyncFile
{
    
    private function __construct()
    {

    }
    /**
     * ()
     * @return Void
     * (callable handler)
     * @return Void
     * methodSize : 2
     */
    public function close(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return AsyncFile
     * methodSize : 1
     */
    public function drainHandler(/*1*/$arg0)
    {

    }
    /**
     * (Buffer t)
     * @return Void
     * ()
     * @return Void
     * methodSize : 2
     */
    public function end(/*1*/$arg0)
    {

    }
    /**
     * (callable endHandler)
     * @return AsyncFile
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return AsyncFile
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return AsyncFile
     * (callable handler)
     * @return AsyncFile
     * methodSize : 2
     */
    public function flush(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return AsyncFile
     * methodSize : 1
     */
    public function handler(/*1*/$arg0)
    {

    }
    /**
     * ()
     * @return AsyncFile
     * methodSize : 1
     */
    public function pause(/*0*/)
    {

    }
    /**
     * (Buffer buffer, int offset, num position, int length, callable handler)
     * @return AsyncFile
     * methodSize : 1
     */
    public function read(/*5*/$arg0, $arg1, $arg2, $arg3, $arg4)
    {

    }
    /**
     * ()
     * @return AsyncFile
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * (int readBufferSize)
     * @return AsyncFile
     * methodSize : 1
     */
    public function setReadBufferSize(/*1*/$arg0)
    {

    }
    /**
     * (num readPos)
     * @return AsyncFile
     * methodSize : 1
     */
    public function setReadPos(/*1*/$arg0)
    {

    }
    /**
     * (num writePos)
     * @return AsyncFile
     * methodSize : 1
     */
    public function setWritePos(/*1*/$arg0)
    {

    }
    /**
     * (int maxSize)
     * @return AsyncFile
     * methodSize : 1
     */
    public function setWriteQueueMaxSize(/*1*/$arg0)
    {

    }
    /**
     * (Buffer data)
     * @return AsyncFile
     * (Buffer buffer, num position, callable handler)
     * @return AsyncFile
     * methodSize : 2
     */
    public function write(/*3*/$arg0, $arg1, $arg2)
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
