<?php
    use io\vertx\jphp\core\Vertx;
    global $vertx;
    global $config;
    $vertx = Vertx::vertx();
    $config = [];