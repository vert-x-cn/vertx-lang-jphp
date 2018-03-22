<?php
/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2018/3/10
 * Time: 13:49
 */
require_once 'Test.php';
echo "HelloWorld!";


class A{

    /**
     * @param $port int
     */
    public function websocket(){
        $__args = func_get_args();
        $argSize = count($__args);
        if ($argSize === 2 && (is_object($__args[0]) && $__args[0] != null) && is_callable($__args[1])) {

        }
//        if ($__args)
    }
}

$a = new A();
$a->test();