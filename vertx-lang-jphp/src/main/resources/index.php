<?php

echo "Test\n";
//var_dump(class_exists("io\\vertx\\php\\core\\Vertx"));
use io\vertx\php\core\Vertx;
$vertx = Vertx::vertx();
$httpServer = $vertx->createHttpServer();
$httpServer->requestHandler(function($req) {
    $req->response()->end("Hello Vertx PHP!");
});
$httpServer->listen(8998);