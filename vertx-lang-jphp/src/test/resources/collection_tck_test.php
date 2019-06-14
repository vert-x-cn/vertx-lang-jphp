<?php

use io\vertx\jphp\test\lang\jphp\TCKUtils;
//use io\vertx\jphp\codegen\testmodel\TestDataObject;
use io\vertx\jphp\codegen\testmodel\RefedInterface1;

$tck = TCKUtils::createCollectionTCK();
$refedObj1 = TCKUtils::createRefedInterface1();
$refedObj2 = TCKUtils::createRefedInterface1();


function testMethodWithHandlerListAndSet()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListAndSet(function ($listString) use (&$count) {
    assertTrue(gettype($listString) === 'array');
    assertEquals("foo", $listString[0]);
    assertEquals("bar", $listString[1]);
    assertEquals("wibble", $listString[2]);
    $count++;
  }, function ($listInt) use (&$count) {
    assertTrue(gettype($listInt) === 'array');
    assertEquals(5, $listInt[0]);
    assertEquals(12, $listInt[1]);
    assertEquals(100, $listInt[2]);
    $count++;
  }, function ($setString) use (&$count) {
    assertTrue(gettype($setString) === 'array');
    assertEquals("foo", $setString[0]);
    assertEquals("bar", $setString[1]);
    assertEquals("wibble", $setString[2]);
    $count++;
  }, function ($setInt) use (&$count) {
    assertTrue(gettype($setInt) === 'array');
    assertEquals(5, $setInt[0]);
    assertEquals(12, $setInt[1]);
    assertEquals(100, $setInt[2]);
    $count++;
  });
  assertEquals(4, $count);
}

function testMethodWithHandlerAsyncResultListAndSet()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListString(function ($listString, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listString) === 'array');
    assertEquals("foo", $listString[0]);
    assertEquals("bar", $listString[1]);
    assertEquals("wibble", $listString[2]);
    $count++;
  });
  $tck->methodWithHandlerAsyncResultListInteger(function ($listInt, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listInt) === 'array');
    assertEquals(5, $listInt[0]);
    assertEquals(12, $listInt[1]);
    assertEquals(100, $listInt[2]);
    $count++;
  });
  $tck->methodWithHandlerAsyncResultSetString(function ($setString, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setString) === 'array');
    assertEquals("foo", $setString[0]);
    assertEquals("bar", $setString[1]);
    assertEquals("wibble", $setString[2]);
    $count++;
  });
  $tck->methodWithHandlerAsyncResultSetInteger(function ($setInt, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setInt) === 'array');
    assertEquals(5, $setInt[0]);
    assertEquals(12, $setInt[1]);
    assertEquals(100, $setInt[2]);
    $count++;
  });
  assertEquals(4, $count);
}

function testMethodWithHandlerListVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListVertxGen(function ($listVertxGen) use (&$count) {
    assertTrue(gettype($listVertxGen) === 'array');
    assertTrue(gettype($listVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foo", $listVertxGen[0]->getString());
    assertTrue(gettype($listVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("bar", $listVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListAbstractVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListAbstractVertxGen(function ($listVertxGen) use (&$count) {
    assertTrue(gettype($listVertxGen) === 'array');
    assertTrue(gettype($listVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractfoo", $listVertxGen[0]->getString());
    assertTrue(gettype($listVertxGen[1]));
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractbar", $listVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListVertxGen(function ($listVertxGen, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listVertxGen) === 'array');
    assertTrue(gettype($listVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foo", $listVertxGen[0]->getString());
    assertTrue(gettype($listVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("bar", $listVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListAbstractVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListAbstractVertxGen(function ($listVertxGen, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listVertxGen) === 'array');
    assertTrue(gettype($listVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractfoo", $listVertxGen[0]->getString());
    assertTrue(gettype($listVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractbar", $listVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerSetVertxGen(function ($setVertxGen) use (&$count) {
    assertTrue(gettype($setVertxGen) === 'array');
    assertTrue(gettype($setVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foo", $setVertxGen[0]->getString());
    assertTrue(gettype($setVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("bar", $setVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetAbstractVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerSetAbstractVertxGen(function ($setVertxGen) use (&$count) {
    assertTrue(gettype($setVertxGen) === 'array');
    assertTrue(gettype($setVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractfoo", $setVertxGen[0]->getString());
    assertTrue(gettype($setVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractbar", $setVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}


function testMethodWithHandlerAsyncResultSetVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetVertxGen(function ($setVertxGen, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setVertxGen) === 'array');
    assertTrue(gettype($setVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foo", $setVertxGen[0]->getString());
    assertTrue(gettype($setVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("bar", $setVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultSetAbstractVertxGen()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetAbstractVertxGen(function ($setVertxGen, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setVertxGen) === 'array');
    assertTrue(gettype($setVertxGen[0]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractfoo", $setVertxGen[0]->getString());
    assertTrue(gettype($setVertxGen[1]) === 'object');
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("abstractbar", $setVertxGen[1]->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListJsonObject(function ($listJsonObject) use (&$count) {
    assertTrue(gettype($listJsonObject) === 'array');
    assertTrue(gettype($listJsonObject[0]) === 'array');
    assertEquals("stilton", $listJsonObject[0]["cheese"]);
    assertTrue(gettype($listJsonObject[1]) === 'array');
    assertEquals("tartan", $listJsonObject[1]["socks"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListComplexJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListComplexJsonObject(function ($listJsonObject) use (&$count) {
    assertTrue(gettype($listJsonObject) === 'array');
    assertTrue(gettype($listJsonObject[0]) === 'array');
    assertTrue(gettype($listJsonObject[0]["outer"]) === 'array');
    assertEquals("tartan", $listJsonObject[0]["outer"]["socks"]);
    assertTrue(is_array($listJsonObject[0]["list"]));
    assertEquals("yellow", $listJsonObject[0]["list"][0]);
    assertEquals("blue", $listJsonObject[0]["list"][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListJsonObject(function ($listJsonObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listJsonObject) === 'array');
    assertTrue(gettype($listJsonObject[0]) === 'array');
    assertEquals("stilton", $listJsonObject[0]["cheese"]);
    assertTrue(gettype($listJsonObject[1]) === 'array');
    assertEquals("tartan", $listJsonObject[1]["socks"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListComplexJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListComplexJsonObject(function ($listJsonObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listJsonObject) === 'array');
    assertTrue(gettype($listJsonObject[0]) === 'array');
    assertTrue(gettype($listJsonObject[0]["outer"]) === 'array');
    assertEquals("tartan", $listJsonObject[0]["outer"]["socks"]);
    assertTrue(is_array($listJsonObject[0]["list"]));
    assertEquals("yellow", $listJsonObject[0]["list"][0]);
    assertEquals("blue", $listJsonObject[0]["list"][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerSetJsonObject(function ($setJsonObject) use (&$count) {
    assertTrue(gettype($setJsonObject) === 'array');
    assertTrue(gettype($setJsonObject[0]) === 'array');
    assertEquals("stilton", $setJsonObject[0]["cheese"]);
    assertTrue(gettype($setJsonObject[1]) === 'array');
    assertEquals("tartan", $setJsonObject[1]["socks"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetComplexJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerSetComplexJsonObject(function ($setJsonObject) use (&$count) {
    assertTrue(gettype($setJsonObject) === 'array');
    assertTrue(gettype($setJsonObject[0]) === 'array');
    assertTrue(gettype($setJsonObject[0]["outer"]) === 'array');
    assertEquals("tartan", $setJsonObject[0]["outer"]["socks"]);
    assertTrue(is_array($setJsonObject[0]["list"]));
    assertEquals("yellow", $setJsonObject[0]["list"][0]);
    assertEquals("blue", $setJsonObject[0]["list"][1]);
    $count++;
  });
  assertEquals(1, $count);
}


function testMethodWithHandlerAsyncResultSetJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetJsonObject(function ($setJsonObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setJsonObject) === 'array');
    assertTrue(gettype($setJsonObject[0]) === 'array');
    assertEquals("stilton", $setJsonObject[0]["cheese"]);
    assertTrue(gettype($setJsonObject[1]) === 'array');
    assertEquals("tartan", $setJsonObject[1]["socks"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultSetComplexJsonObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetComplexJsonObject(function ($setJsonObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setJsonObject) === 'array');
    assertTrue(gettype($setJsonObject[0]) === 'array');
    assertTrue(gettype($setJsonObject[0]["outer"]) === 'array');
    assertEquals("tartan", $setJsonObject[0]["outer"]["socks"]);
    assertTrue(is_array($setJsonObject[0]["list"]));
    assertEquals("yellow", $setJsonObject[0]["list"][0]);
    assertEquals("blue", $setJsonObject[0]["list"][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListJsonArray(function ($listJsonArray) use (&$count) {
    assertTrue(gettype($listJsonArray) === 'array');
    assertTrue(gettype($listJsonArray[0]) === 'array');
    assertTrue(is_array($listJsonArray[0]));
    assertEquals("green", $listJsonArray[0][0]);
    assertEquals("blue", $listJsonArray[0][1]);
    assertTrue(gettype($listJsonArray[1]) === 'array');
    assertTrue(is_array($listJsonArray[1]));
    assertEquals("yellow", $listJsonArray[1][0]);
    assertEquals("purple", $listJsonArray[1][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListComplexJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListComplexJsonArray(function ($listJsonArray) use (&$count) {
    assertTrue(gettype($listJsonArray) === 'array');
    assertTrue(is_array($listJsonArray[0]));
    assertTrue(gettype($listJsonArray[0][0]) === 'array');
    assertEquals("hello", $listJsonArray[0][0]["foo"]);
    assertTrue(is_array($listJsonArray[1]));
    assertTrue(gettype($listJsonArray[1][0] === 'object'));
    assertEquals("bye", $listJsonArray[1][0]["bar"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListJsonArray(function ($listJsonArray, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listJsonArray) === 'array');
    assertTrue(gettype($listJsonArray[0]) === 'array');
    assertTrue(is_array($listJsonArray[0]));
    assertEquals("green", $listJsonArray[0][0]);
    assertEquals("blue", $listJsonArray[0][1]);
    assertTrue(gettype($listJsonArray[1]) === 'array');
    assertTrue(is_array($listJsonArray[1]));
    assertEquals("yellow", $listJsonArray[1][0]);
    assertEquals("purple", $listJsonArray[1][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListComplexJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListComplexJsonArray(function ($listJsonArray, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listJsonArray) === 'array');
    assertTrue(is_array($listJsonArray[0]));
    assertTrue(gettype($listJsonArray[0][0]) === 'array');
    assertEquals("hello", $listJsonArray[0][0]["foo"]);
    assertTrue(is_array($listJsonArray[1]));
    assertTrue(gettype($listJsonArray[1][0] === 'object'));
    assertEquals("bye", $listJsonArray[1][0]["bar"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerSetJsonArray(function ($setJsonArray) use (&$count) {
    assertTrue(gettype($setJsonArray) === 'array');
    assertTrue(gettype($setJsonArray[0]) === 'array');
    assertTrue(is_array($setJsonArray[0]));
    assertEquals("green", $setJsonArray[0][0]);
    assertEquals("blue", $setJsonArray[0][1]);
    assertTrue(gettype($setJsonArray[1]) === 'array');
    assertTrue(is_array($setJsonArray[1]));
    assertEquals("yellow", $setJsonArray[1][0]);
    assertEquals("purple", $setJsonArray[1][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetComplexJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerSetComplexJsonArray(function ($setJsonArray) use (&$count) {
    assertTrue(gettype($setJsonArray) === 'array');
    assertTrue(is_array($setJsonArray[0]));
    assertTrue(gettype($setJsonArray[0][0]) === 'array');
    assertEquals("hello", $setJsonArray[0][0]["foo"]);
    assertTrue(is_array($setJsonArray[1]));
    assertTrue(gettype($setJsonArray[1][0] === 'object'));
    assertEquals("bye", $setJsonArray[1][0]["bar"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultSetJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetJsonArray(function ($setJsonArray, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setJsonArray) === 'array');
    assertTrue(gettype($setJsonArray[0]) === 'array');
    assertTrue(is_array($setJsonArray[0]));
    assertEquals("green", $setJsonArray[0][0]);
    assertEquals("blue", $setJsonArray[0][1]);
    assertTrue(gettype($setJsonArray[1]) === 'array');
    assertTrue(is_array($setJsonArray[1]));
    assertEquals("yellow", $setJsonArray[1][0]);
    assertEquals("purple", $setJsonArray[1][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultSetComplexJsonArray()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetComplexJsonArray(function ($setJsonArray, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setJsonArray) === 'array');
    assertTrue(is_array($setJsonArray[0]));
    assertTrue(gettype($setJsonArray[0][0]) === 'array');
    assertEquals("hello", $setJsonArray[0][0]["foo"]);
    assertTrue(is_array($setJsonArray[1]));
    assertTrue(gettype($setJsonArray[1][0] === 'object'));
    assertEquals("bye", $setJsonArray[1][0]["bar"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListDataObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListDataObject(function ($listDataObject) use (&$count) {
    assertTrue(gettype($listDataObject) === 'array');
    assertTrue(gettype($listDataObject[0]) === 'array');
//    assertTrue($listDataObject[0] instanceof TestDataObject);
    assertEquals("String 1", $listDataObject[0]["foo"]);
    assertEquals(1, $listDataObject[0]["bar"]);
    assertEquals(1.1, $listDataObject[0]["wibble"]);
    assertTrue(gettype($listDataObject[1]) === 'array');
//    assertTrue($listDataObject[1] instanceof TestDataObject);
    assertEquals("String 2", $listDataObject[1]["foo"]);
    assertEquals(2, $listDataObject[1]["bar"]);
    assertEquals(2.2, $listDataObject[1]["wibble"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetDataObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetDataObject(function ($setDataObject) use (&$count) {
    assertTrue(gettype($setDataObject) === 'array');
    assertTrue(gettype($setDataObject[0]) === 'array');
//    assertTrue($setDataObject[0] instanceof TestDataObject);
    assertEquals("String 1", $setDataObject[0]["foo"]);
    assertEquals(1, $setDataObject[0]["bar"]);
    assertEquals(1.1, $setDataObject[0]["wibble"]);
    assertTrue(gettype($setDataObject[1]) === 'array');
//    assertTrue($setDataObject[1] instanceof TestDataObject);
    assertEquals("String 2", $setDataObject[1]["foo"]);
    assertEquals(2, $setDataObject[1]["bar"]);
    assertEquals(2.2, $setDataObject[1]["wibble"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListDataObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListDataObject(function ($listDataObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listDataObject) === 'array');
    assertTrue(gettype($listDataObject[0]) === 'array');
//    assertTrue($listDataObject[0] instanceof TestDataObject);
    assertEquals("String 1", $listDataObject[0]["foo"]);
    assertEquals(1, $listDataObject[0]["bar"]);
    assertEquals(1.1, $listDataObject[0]["wibble"]);
    assertTrue(gettype($listDataObject[1]) === 'array');
//    assertTrue($listDataObject[1] instanceof TestDataObject);
    assertEquals("String 2", $listDataObject[1]["foo"]);
    assertEquals(2, $listDataObject[1]["bar"]);
    assertEquals(2.2, $listDataObject[1]["wibble"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultSetDataObject()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultSetDataObject(function ($setDataObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setDataObject) === 'array');
    assertTrue(gettype($setDataObject[0]) === 'array');
//    assertTrue($setDataObject[0] instanceof TestDataObject);
    assertEquals("String 1", $setDataObject[0]["foo"]);
    assertEquals(1, $setDataObject[0]["bar"]);
    assertEquals(1.1, $setDataObject[0]["wibble"]);
    assertTrue(gettype($setDataObject[1]) === 'array');
//    assertTrue($setDataObject[1] instanceof TestDataObject);
    assertEquals("String 2", $setDataObject[1]["foo"]);
    assertEquals(2, $setDataObject[1]["bar"]);
    assertEquals(2.2, $setDataObject[1]["wibble"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerListEnum()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListEnum(function ($listEnum) use (&$count) {
    assertTrue(gettype($listEnum) === 'array');
    assertEquals('TIM', $listEnum[0]);
    assertEquals('JULIEN', $listEnum[1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerSetEnum()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerListEnum(function ($setEnum) use (&$count) {
    assertTrue(gettype($setEnum) === 'array');
    assertEquals('TIM', $setEnum[0]);
    assertEquals('JULIEN', $setEnum[1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultListEnum()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListEnum(function ($listEnum, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($listEnum) === 'array');
    assertEquals('TIM', $listEnum[0]);
    assertEquals('JULIEN', $listEnum[1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultSetEnum()
{
  global $tck;
  $count = 0;
  $tck->methodWithHandlerAsyncResultListEnum(function ($setEnum, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($setEnum) === 'array');
    assertEquals('TIM', $setEnum[0]);
    assertEquals('JULIEN', $setEnum[1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMapReturn()
{
  //TODO jphp没法直接与java交流，只能将数据传到php中
  echo "error";
}

function testMapStringReturn()
{
  global $tck;
  $map = $tck->methodWithMapStringReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  assertEquals("bar", $map["foo"]);
//  assertEquals("bar", map.foo);
  assertTrue(gettype($map["foo"]) === 'string');
}

function testMapJsonObjectReturn()
{
  global $tck;
  $map = $tck->methodWithMapJsonObjectReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  $json = $map["foo"];
  assertTrue(gettype($json) === 'array');
  assertEquals("eek", $json["wibble"]);
  $count = 0;
  foreach ($map as $index => $val) {
    assertTrue($count == 0);
    assertEquals("foo", $index);
    assertTrue(gettype($val) === 'array');
    assertEquals("eek", $val["wibble"]);
  }
}

function testMapComplexJsonObjectReturn()
{
  global $tck;
  $map = $tck->methodWithMapComplexJsonObjectReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  $complex = $map["foo"];
  assertTrue(gettype($complex) === 'array');
  assertTrue(gettype($complex["outer"]) === 'array');
  assertEquals("tartan", $complex["outer"]["socks"]);
  assertTrue(is_array($complex["list"]));
  assertEquals("yellow", $complex["list"][0]);
  assertEquals("blue", $complex["list"][1]);
}

function testMapJsonArrayReturn()
{
  global $tck;
  $map = $tck->methodWithMapJsonArrayReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  $arr = $map["foo"];
  assertTrue(gettype($arr) === 'array');
  assertTrue(is_array($arr));
  assertEquals("wibble", $arr[0]);
}

function testMapVertxGenReturn()
{
  global $tck;
  $map = $tck->methodWithMapVertxGenReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  $obj = $map["foo"];
  assertTrue(gettype($obj) === 'object');
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals("foo", $obj->getString());
}
function testMapDataObjectReturn()
{
  global $tck;
  $map = $tck->methodWithMapDataObjectReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  $obj = $map["foo"];
  assertEquals("String 1", $obj["foo"]);
}
function testMapEnumReturn()
{
  global $tck;
  $map = $tck->methodWithMapEnumReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  assertEquals("JULIEN", $map["foo"]);
}
function testMapLongReturn()
{
  global $tck;
  $map = $tck->methodWithMapLongReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  assertTrue(123 === $map["foo"]);
  assertTrue(gettype($map["foo"]) === 'integer');
}

function testListStringReturn()
{
  global $tck;
  $list = $tck->methodWithListStringReturn();
  assertTrue(gettype($list) === 'array');
  assertEquals("foo", $list[0]);
  assertEquals("bar", $list[1]);
  assertEquals("wibble", $list[2]);
}

function testListLongReturn()
{
  global $tck;
  $list = $tck->methodWithListLongReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(123 === $list[0]);
  assertTrue(456 === $list[1]);
}

function testListJsonObjectReturn()
{
  global $tck;
  $list = $tck->methodWithListJsonObjectReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $obj1 = $list[0];
  $obj2 = $list[1];
  assertEquals("bar", $obj1["foo"]);
  assertEquals("eek", $obj2["blah"]);
}

function testListComplexJsonObjectReturn()
{
  global $tck;
  $list = $tck->methodWithListComplexJsonObjectReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $json1 = $list[0];
  assertTrue(gettype($json1) === 'array');
  assertTrue(gettype($json1["outer"]) === 'array');
  assertEquals("tartan", $json1["outer"]["socks"]);
  assertTrue(is_array($json1["list"]));
  assertEquals("yellow", $json1["list"][0]);
  assertEquals("blue", $json1["list"][1]);
}

function testListJsonArrayReturn()
{
  global $tck;
  $list = $tck->methodWithListJsonArrayReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $arr1 = $list[0];
  $arr2 = $list[1];
  assertTrue(is_array($arr1));
  assertTrue(is_array($arr2));
  assertEquals("foo", $arr1[0]);
  assertEquals("blah", $arr2[0]);
}

function testListComplexJsonArrayReturn()
{
  global $tck;
  $list = $tck->methodWithListComplexJsonArrayReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $json1 = $list[0];
  assertTrue(is_array($json1));
  assertEquals("hello", $json1[0]["foo"]);
  $json2 = $list[1];
  assertTrue(is_array($json2));
  assertEquals("bye", $json2[0]["bar"]);
}

function testListVertxGenReturn()
{
  global $tck;
  $list = $tck->methodWithListVertxGenReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $obj1 = $list[0];
  $obj2 = $list[1];
  assertTrue(gettype($obj1) === 'object');
  assertTrue($obj1 instanceof RefedInterface1);
  assertTrue(gettype($obj2) === 'object');
  assertTrue($obj2 instanceof RefedInterface1);
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals("foo", $obj1->getString());
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals("bar", $obj2->getString());
}

function testListDataObjectReturn()
{
  global $tck;
  $listDataObject = $tck->methodWithListDataObjectReturn();
  assertTrue(gettype($listDataObject) === 'array');
  assertTrue(gettype($listDataObject[0]) === 'array');
//  assertTrue($listDataObject[0] instanceof TestDataObject);
  assertEquals("String 1", $listDataObject[0]["foo"]);
  assertEquals(1, $listDataObject[0]["bar"]);
  assertEquals(1.1, $listDataObject[0]["wibble"]);
  assertTrue(gettype($listDataObject[1]) === 'array');
//  assertTrue($listDataObject[1] instanceof TestDataObject);
  assertEquals("String 2", $listDataObject[1]["foo"]);
  assertEquals(2, $listDataObject[1]["bar"]);
  assertEquals(2.2, $listDataObject[1]["wibble"]);
}

function testListEnumReturn()
{
  global $tck;
  $listEnum = $tck->methodWithListEnumReturn();
  assertTrue(gettype($listEnum) === 'array');
  assertEquals("JULIEN", $listEnum[0]);
  assertEquals("TIM", $listEnum[1]);
}

function testSetStringReturn()
{
  global $tck;
  $setString = $tck->methodWithSetStringReturn();
  assertTrue(gettype($setString) === 'array');
  assertEquals("foo", $setString[0]);
  assertEquals("bar", $setString[1]);
  assertEquals("wibble", $setString[2]);
}

function testSetLongReturn()
{
  global $tck;
  $list = $tck->methodWithSetLongReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(123 === $list[0]);
  assertTrue(456 === $list[1]);
}

function testSetJsonObjectReturn()
{
  global $tck;
  $list = $tck->methodWithSetJsonObjectReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $obj1 = $list[0];
  $obj2 = $list[1];
  assertEquals("bar", $obj1["foo"]);
  assertEquals("eek", $obj2["blah"]);
}

function testSetComplexJsonObjectReturn()
{
  global $tck;
  $list = $tck->methodWithSetComplexJsonObjectReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $json1 = $list[0];
  assertTrue(gettype($json1) === 'array');
  assertTrue(gettype($json1["outer"]) === 'array');
  assertEquals("tartan", $json1["outer"]["socks"]);
  assertTrue(is_array($json1["list"]));
  assertEquals("yellow", $json1["list"][0]);
  assertEquals("blue", $json1["list"][1]);
}

function testSetJsonArrayReturn()
{
  global $tck;
  $list = $tck->methodWithSetJsonArrayReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $arr1 = $list[0];
  $arr2 = $list[1];
  assertTrue(is_array($arr1));
  assertTrue(is_array($arr2));
  assertEquals("foo", $arr1[0]);
  assertEquals("blah", $arr2[0]);
}

function testSetComplexJsonArrayReturn()
{
  global $tck;
  $_set = $tck->methodWithSetComplexJsonArrayReturn();
  assertTrue(gettype($_set) === 'array');
  assertTrue(is_array($_set));
  $arr1 = $_set[0];
  assertTrue(is_array($arr1));
  assertEquals("hello", $arr1[0]["foo"]);
  $arr2 = $_set[1];
  assertTrue(is_array($arr2));
  assertEquals("bye", $arr2[0]["bar"]);
}

function testSetVertxGenReturn()
{
  global $tck;
  $list = $tck->methodWithSetVertxGenReturn();
  assertTrue(gettype($list) === 'array');
  assertTrue(is_array($list));
  $obj1 = $list[0];
  $obj2 = $list[1];
  assertTrue(gettype($obj1) === 'object');
  assertTrue($obj1 instanceof RefedInterface1);
  assertTrue(gettype($obj2) === 'object');
  assertTrue($obj2 instanceof RefedInterface1);
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals("foo", $obj1->getString());
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals("bar", $obj2->getString());
}

function testSetDataObjectReturn()
{
  global $tck;
  $setDataObject = $tck->methodWithSetDataObjectReturn();
  assertTrue(gettype($setDataObject) === 'array');
  assertTrue(gettype($setDataObject[0]) === 'array');
//  assertTrue($setDataObject[0] instanceof TestDataObject);
  assertEquals("String 1", $setDataObject[0]["foo"]);
  assertEquals(1, $setDataObject[0]["bar"]);
  assertEquals(1.1, $setDataObject[0]["wibble"]);
  assertTrue(gettype($setDataObject[1]) === 'array');
//  assertTrue($setDataObject[1] instanceof TestDataObject);
  assertEquals("String 2", $setDataObject[1]["foo"]);
  assertEquals(2, $setDataObject[1]["bar"]);
  assertEquals(2.2, $setDataObject[1]["wibble"]);
}

function testSetEnumReturn()
{
  global $tck;
  $setEnum = $tck->methodWithSetEnumReturn();
  assertTrue(gettype($setEnum) === 'array');
  assertEquals("JULIEN", $setEnum[0]);
  assertEquals("TIM", $setEnum[1]);
}

function testMapComplexJsonArrayReturn()
{
  global $tck;
  $map = $tck->methodWithMapComplexJsonArrayReturn(function () {
  });
  assertTrue(gettype($map) === 'array');
  $complex = $map["foo"];
  assertTrue(is_array($complex));
  assertEquals("hello", $complex[0]["foo"]);
  assertEquals("bye", $complex[1]["bar"]);
}

function testMethodWithListParams()
{
  global $tck, $refedObj1, $refedObj2;
  $tck->methodWithListParams(["foo", "bar"], [2, 3], [12, 13], [1234, 1345], [123, 456], [array("foo" => "bar"), array("eek" => "wibble")], [["foo"], ["blah"]], [$refedObj1->setString("foo"), $refedObj2->setString("bar")], [array(
    "foo" => "String 1",
    "bar" => 1,
    "wibble" => 1.1
  ), array("foo" => "String 2", "bar" => 2, "wibble" => 2.2)], ["JULIEN", "TIM"], array("foo", 4, 3.4, true, array("wibble" => "eek"), array("one", 2)));
}

function testMethodWithSetParams()
{
  global $tck, $refedObj1, $refedObj2;
  $tck->methodWithSetParams(["foo", "bar"], [2, 3], [12, 13], [1234, 1345], [123, 456], [array("foo" => "bar"), array("eek" => "wibble")], [["foo"], ["blah"]], [$refedObj1->setString("foo"), $refedObj2->setString("bar")], [array(
    "foo" => "String 1",
    "bar" => 1,
    "wibble" => 1.1
  ), array("foo" => "String 2", "bar" => 2, "wibble" => 2.2)], ["JULIEN", "TIM"], array("foo", 4, 3.4, true, array("wibble" => "eek"), array("one", 2)));
}

function testMethodWithMapParams()
{
  global $tck, $refedObj1, $refedObj2;
  $tck->methodWithMapParams(
    array("foo" => "bar", "eek" => "wibble"),
    array("foo" => 2, "eek" => 3),
    array("foo" => 12, "eek" => 13),
    array("foo" => 1234, "eek" => 1345),
    array("foo" => 123, "eek" => 456),
    array(
      "foo" => array("foo" => "bar"),
      "eek" => array("eek" => "wibble")
    ),
    array(
      "foo" => ["foo"],
      "eek" => ["blah"]
    ),
    array(
      "foo" => $refedObj1->setString("foo"),
      "eek" => $refedObj2->setString("bar")
    ),
    array(
      "foo" => array(
        "foo" => "String 1",
        "bar" => 1,
        "wibble" => 1.1,
      ),
    ),
    array(
      "foo" => "JULIEN",
    ),
    array(
      "string" => "foo",
      "integer" => 4,
      "float" => 3.4,
      "boolean" => true,
      "object" => array("wibble" => "eek"),
      "array" => array("one", 2),
    )
  );
}
