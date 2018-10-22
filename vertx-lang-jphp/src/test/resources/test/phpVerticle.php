<?php

use io\vertx\php\ext\web\Router;
use io\vertx\php\ext\web\handler\LoggerHandler;

$httpServer = $vertx->createHttpServer();
$router = Router::router($vertx);
$router->route("/*")->handler(LoggerHandler::create());

class A
{
  public function test($routerContext)
  {
    $routerContext->response()->end("Hello Vertx Php!");
    echo "\n-----------test\n";
  }
}

$a = new A();

$router->route("/")->handler([$a, "test"]);

$httpServer->requestHandler($router);
$httpServer->listen(8998);
