<?php

require_once 'testImport.php';

//$httpServer = $vertx->createHttpServer();
//$httpServer->requestHandler(function ($res) {
//    $res->response()->end("Hello from Vert.x!");
//});
//$httpServer->listen(8998);

//    use php\lang\Thread;
    function vertxStart(){
        echo "start";
    }
    function vertxStop(){
        echo "end";
    }
//    var_dump(Thread::current());