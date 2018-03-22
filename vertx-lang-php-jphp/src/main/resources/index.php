<?php
//    use io\vertx\php\core\Vertx;
//
//    $vertx = Vertx::vertx();
//    $httpServer = $vertx->createHttpServer();
//    $httpServer->requestHandler(function($req){
//        echo "receive a request\n";
//        $req->response()->end("Hello vertx-lang-php!");
//    });
//    $httpServer->listen(8998, "127.0.0.1", function(){});
    $a = array("a" => 2);
    $b = json_encode($a);
    var_dump($b);
    var_dump("=".$a);
    var_dump($a + 1);


