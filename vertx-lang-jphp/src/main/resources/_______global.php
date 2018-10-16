<?php
    /**
     * 本文件不需要引入，只是为了方便代码提示用的
     */
    use io\vertx\jphp\core\Vertx;
    global $vertx;
    global $config;
    $vertx = Vertx::vertx();
    $config = [];