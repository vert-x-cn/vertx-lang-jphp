<?php
/**
 * 本文件不需要引入，只是为了方便代码提示用的
 */

use io\vertx\jphp\core\Vertx;
use io\vertx\jphp\core\Context;

/**
 * @global
 * @var Vertx
 */
$vertx = Vertx::vertx();
/**
 * @global
 * @var Context
 */
$context = $vertx->getOrCreateContext();
/**
 * @global
 * @var array
 */
$config = [];




