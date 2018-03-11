<?php 
namespace io\vertx\php\core\parsetools;
use io\vertx\php\core\buffer\Buffer;
use io\vertx\php\core\streams\ReadStream;
class RecordParser
{
    
    private function __construct()
    {

    }
    /**
     * (string delim)
     * @return Void
     * (Buffer delim)
     * @return Void
     * methodSize : 2
     */
    public function delimitedMode(/*1*/$arg0)
    {

    }
    /**
     * (callable endHandler)
     * @return RecordParser
     * methodSize : 1
     */
    public function endHandler(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return RecordParser
     * methodSize : 1
     */
    public function exceptionHandler(/*1*/$arg0)
    {

    }
    /**
     * (int size)
     * @return Void
     * methodSize : 1
     */
    public function fixedSizeMode(/*1*/$arg0)
    {

    }
    /**
     * (Buffer buffer)
     * @return Void
     * methodSize : 1
     */
    public function handle(/*1*/$arg0)
    {

    }
    /**
     * (callable handler)
     * @return RecordParser
     * methodSize : 1
     */
    public function handler(/*1*/$arg0)
    {

    }
    /**
     * (string delim, callable output)
     * @return RecordParser
     * (string delim, ReadStream stream)
     * @return RecordParser
     * (Buffer delim, callable output)
     * @return RecordParser
     * (Buffer delim, ReadStream stream)
     * @return RecordParser
     * (string delim)
     * @return RecordParser
     * (Buffer delim)
     * @return RecordParser
     * methodSize : 6
     */
    public function newDelimited(/*2*/$arg0, $arg1)
    {

    }
    /**
     * (int size)
     * @return RecordParser
     * (int size, callable output)
     * @return RecordParser
     * (int size, ReadStream stream)
     * @return RecordParser
     * methodSize : 3
     */
    public function newFixed(/*2*/$arg0, $arg1)
    {

    }
    /**
     * ()
     * @return RecordParser
     * methodSize : 1
     */
    public function pause(/*0*/)
    {

    }
    /**
     * ()
     * @return RecordParser
     * methodSize : 1
     */
    public function resume(/*0*/)
    {

    }
    /**
     * (callable output)
     * @return Void
     * methodSize : 1
     */
    public function setOutput(/*1*/$arg0)
    {

    }
}
