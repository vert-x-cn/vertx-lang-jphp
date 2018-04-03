<?php

//echo "Test\n";
////var_dump(class_exists("io\\vertx\\php\\core\\Vertx"));
//use io\vertx\php\core\Vertx;
//use io\vertx\php\ext\web\Router;
//use io\vertx\php\ext\web\handler\LoggerHandler;
//$vertx = Vertx::vertx();
//$httpServer = $vertx->createHttpServer();
//$router = Router::router($vertx);
//$router->route("/*")->handler(LoggerHandler::create());
//
//class A {
//    public function test($routerContext){
//        $routerContext->response()->end("Hello Vertx Php!");
//        echo "\n-----------test\n";
//    }
//}
//
//$a = new A();
//
//$router->route("/")->handler([$a, "test"]);
//
//$httpServer->requestHandler($router);
//$httpServer->listen(8998);
//
//$vertx->eventBus()->consumer("test", function($a) {
//    var_dump($a->body()["a"]);
//});
//
//$vertx->eventBus()->send("test", array("a" => "b"));
//


use io\vertx\php\core\Future;
$future = Future::future();
$future->setHandler(function($res){
    var_dump($res);
});
$future->complete("result");

$future2 = Future::future(function($f) {
    $h = $f->completer();
    var_dump($h);
    $h("result2", null);
});
$future2->setHandler(function($res){
    var_dump($res);
});
