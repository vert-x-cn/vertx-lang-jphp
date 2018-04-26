<?php

//require_once 'testImport.php';

$httpServerOptions = array(
    "port"  =>  8998,
    "host"  =>  "localhost",
);
$a = [
    "port"  =>  8998,
    "host"  =>  "localhost",
];

$httpServer = $vertx->createHttpServer($a);
$httpServer->requestHandler(function ($res) {
    $res->response()->end("Hello from Vert.x!");
});
$httpServer->listen();

//    use php\lang\Thread;
//    function vertxStart(){
//        echo "start";
//    }
//    function vertxStop(){
//        echo "end";
//    }
//    var_dump(Thread::current());