<?php

use io\vertx\jphp\codegen\testmodel\ConstantTCK;


function testBasic() {
  assertEquals(ConstantTCK::BYTE, 123);
  assertEquals(ConstantTCK::SHORT, 12345);
  assertEquals(ConstantTCK::INT, 12345464);
  assertEquals(ConstantTCK::LONG, 65675123);
  assertEquals(ConstantTCK::FLOAT, 1.23);
  assertEquals(ConstantTCK::DOUBLE, 3.34535);
  assertTrue(ConstantTCK::BOOLEAN);
  assertEquals("Y", ConstantTCK::CHAR);
  assertEquals("orangutan", ConstantTCK::STRING);
}

function testVertxGen() {
  $ret = ConstantTCK::VERTX_GEN;
  assertEquals("chaffinch", $ret->getString());
//  assertTrue($ret->_jdel);
}

function testDataObject() {
  $ret = ConstantTCK::DATA_OBJECT;
  assertTrue(gettype($ret) === 'object');
  assertEquals("foo", $ret->getFoo());
  assertEquals(123, $ret->getBar());
  assertEquals(0.0, $ret->getWibble());
}

function testJson() {
  $ret = ConstantTCK::JSON_OBJECT;
  assertTrue(gettype($ret) === 'array');
  assertEquals("stilton", $ret["cheese"]);
  $ret = ConstantTCK::JSON_ARRAY;
  assertTrue(gettype($ret) === 'array');
  assertTrue(is_array($ret));
  assertEquals("socks",$ret[0]);
  assertEquals("shoes",$ret[1]);
}

function testEnum() {
  assertEquals("JULIEN", ConstantTCK::ENUM);
}

function testThrowable() {
  $err = ConstantTCK::THROWABLE;
  assertEquals("test", $err->getMessage());
}

function testObject() {
  assertEquals(ConstantTCK::OBJECT, 4);
}
//
function testNullable() {
  $ret = ConstantTCK::NULLABLE_NON_NULL;
  assertEquals("chaffinch",$ret->getString());
//  assertTrue($ret->_jdel);
  assertNull(ConstantTCK::NULLABLE_NULL);
}

/**
 * @param $array array
 */
function checkArray($array) {
  assertTrue(is_array($array));
  assertEquals(sizeof($array), 1);
}

function testList() {
  $longList = ConstantTCK::LONG_LIST;
  checkArray($longList);
  assertEquals($longList[0], 65675123);
  $vertxGenList = ConstantTCK::VERTX_GEN_LIST;
  checkArray($vertxGenList);
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($vertxGenList[0]->getString(), 'chaffinch');
  $jsonObjectList = ConstantTCK::JSON_OBJECT_LIST;
  checkArray($jsonObjectList);
  assertEquals($jsonObjectList[0]['cheese'], 'stilton');
  $jsonArrayList = ConstantTCK::JSON_ARRAY_LIST;
  checkArray($jsonArrayList);
  assertEquals($jsonArrayList[0][0], 'socks');
  assertEquals($jsonArrayList[0][1], 'shoes');
  assertEquals(sizeof($jsonArrayList[0]), 2);
  $dataObjectList = ConstantTCK::DATA_OBJECT_LIST;
  checkArray($dataObjectList);
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($dataObjectList[0]->getFoo(), 'foo');
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($dataObjectList[0]->getBar(), 123);
  $enumList = ConstantTCK::ENUM_LIST;
  checkArray($enumList);
  assertEquals($enumList[0], 'JULIEN');
}

function testSet() {
  $longSet = ConstantTCK::LONG_SET;
  checkArray($longSet);
  assertEquals($longSet[0], 65675123);
  $vertxGenSet = ConstantTCK::VERTX_GEN_SET;
  checkArray($vertxGenSet);
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($vertxGenSet[0]->getString(), 'chaffinch');
  $jsonObjectSet = ConstantTCK::JSON_OBJECT_SET;
  checkArray($jsonObjectSet);
  assertEquals($jsonObjectSet[0]['cheese'], 'stilton');
  $jsonArraySet = ConstantTCK::JSON_ARRAY_SET;
  checkArray($jsonArraySet);
  assertEquals($jsonArraySet[0][0], 'socks');
  assertEquals($jsonArraySet[0][1], 'shoes');
  assertEquals(sizeof($jsonArraySet[0]), 2);

  $dataObjectSet = ConstantTCK::DATA_OBJECT_SET;
  checkArray($dataObjectSet);
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($dataObjectSet[0]->getFoo(), 'foo');
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($dataObjectSet[0]->getBar(), 123);
  $enumSet = ConstantTCK::ENUM_SET;
  checkArray($enumSet);
  assertEquals($enumSet[0], 'JULIEN');
}

function testMap() {
  $longMap = ConstantTCK::LONG_MAP;
  assertEquals($longMap['foo'], 65675123);
  $jsonObjectMap = ConstantTCK::JSON_OBJECT_MAP;
  assertEquals($jsonObjectMap['foo']['cheese'], 'stilton');
  $jsonArrayMap = ConstantTCK::JSON_ARRAY_MAP;
  assertEquals($jsonArrayMap['foo'][0], 'socks');
  assertEquals($jsonArrayMap['foo'][1], 'shoes');
  assertEquals(sizeof($jsonArrayMap['foo']), 2);
}
