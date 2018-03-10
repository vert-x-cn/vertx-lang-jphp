<?php
    $a = "bda";
    echo $a;
    $t = new Test();
    $t->test();


    use io\vertx\php\core\Future;
    use io\vertx\php\core\CompositeFuture;

    $future1 = Future::future();
    $future2 = Future::future();
    $compositeFuture = CompositeFuture::all($future1, $future2);

    $compositeFuture->setHandler(function($event){

    });


