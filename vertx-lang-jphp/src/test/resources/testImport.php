<?php
/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2018/4/11
 * Time: 20:19
 */

echo "====\n";
var_dump($vertx);
echo "====\n";


use io\vertx\jphp\core\http\HttpServerOptions;

$httpServerOptions = new HttpServerOptions();
$httpServerOptions->setPort(8080);
$httpServerOptions->setHost("localhost");
