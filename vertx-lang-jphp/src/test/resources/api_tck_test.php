<?php /** @noinspection PhpUnusedParameterInspection */

use com\acme\jphp\pkg\MyInterface;
use io\vertx\jphp\codegen\testmodel\TestInterface;
use io\vertx\jphp\codegen\testmodel\Factory;
use io\vertx\jphp\test\lang\jphp\TCKUtils;

$myInterface = MyInterface::create();

$obj = $myInterface->method();

$refedObj = TCKUtils::createRefedInterface1();

function testMethodWithBasicParams()
{
  global $obj;
  $obj->methodWithBasicParams(123, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', 'foobar');
}

function testMethodWithBasicBoxedParams()
{
  global $obj;
  $obj->methodWithBasicBoxedParams(123, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X');
}

function testMethodWithHandlerBasicTypes()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerBasicTypes(function ($b) use (&$count) {
    assertEquals("integer", gettype($b));
    assertEquals(123, $b);
    $count++;
  }, function ($s) use (&$count) {
    assertEquals("integer", gettype($s));
    assertEquals(12345, $s);
    $count++;
  }, function ($i) use (&$count) {
    assertEquals("integer", gettype($i));
    assertEquals(1234567, $i);
    $count++;
  }, function ($l) use (&$count) {
    assertEquals("integer", gettype($l));
    assertEquals(1265615234, $l);
    $count++;
  }, function ($f) use (&$count) {
    assertEquals("double", gettype($f));
    assertEquals(12.345, $f);
    $count++;
  }, function ($d) use (&$count) {
    assertEquals("double", gettype($d));
    assertEquals(12.34566, $d);
    $count++;
  }, function ($bool) use (&$count) {
    assertEquals("boolean", gettype($bool));
    assertTrue($bool);
    $count++;
  }, function ($char) use (&$count) {
    assertEquals("string", gettype($char));
    assertEquals('X', $char);
    $count++;
  }, function ($str) use (&$count) {
    assertEquals("string", gettype($str));
    assertEquals("quux!", $str);
    $count++;
  });
  assertEquals(9, $count);
}

function testMethodWithHandlerAsyncResultBasicTypes()
{
  $count = 0;
  global $obj;
  $obj->methodWithHandlerAsyncResultByte(false, function ($b, $err) use (&$count) {
    assertEquals("integer", gettype($b));
    assertEquals(123, $b);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultShort(false, function ($s, $err) use (&$count) {
    assertEquals("integer", gettype($s));
    assertEquals(12345, $s);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultInteger(false, function ($i, $err) use (&$count) {
    assertEquals("integer", gettype($i));
    assertEquals(1234567, $i);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultLong(false, function ($l, $err) use (&$count) {
    assertEquals("integer", gettype($l));
    assertEquals(1265615234, $l);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultFloat(false, function ($f, $err) use (&$count) {
    assertEquals("double", gettype($f));
    assertEquals(12.345, $f);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultDouble(false, function ($d, $err) use (&$count) {
    assertEquals("double", gettype($d));
    assertEquals(12.34566, $d);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultBoolean(false, function ($bool, $err) use (&$count) {
    assertEquals("boolean", gettype($bool));
    assertTrue($bool);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultCharacter(false, function ($char, $err) use (&$count) {
    assertEquals("string", gettype($char));
    assertEquals('X', $char);
    assertNull($err);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultString(false, function ($str, $err) use (&$count) {
    assertEquals("string", gettype($str));
    assertEquals("quux!", $str);
    assertNull($err);
    $count++;
  });
  assertEquals(9, $count);
}


function testMethodWithHandlerAsyncResultBasicTypesFails()
{
  $count = 0;
  global $obj;
  $obj->methodWithHandlerAsyncResultByte(true, function ($b, $err) use (&$count) {
    assertNull($b);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultShort(true, function ($s, $err) use (&$count) {
    assertNull($s);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultInteger(true, function ($i, $err) use (&$count) {
    assertNull($i);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultLong(true, function ($l, $err) use (&$count) {
    assertNull($l);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultFloat(true, function ($f, $err) use (&$count) {
    assertNull($f);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultDouble(true, function ($d, $err) use (&$count) {
    assertNull($d);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultBoolean(true, function ($bool, $err) use (&$count) {
    assertNull($bool);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultCharacter(true, function ($char, $err) use (&$count) {
    assertNull($char);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  $obj->methodWithHandlerAsyncResultString(true, function ($str, $err) use (&$count) {
    assertNull($str);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  assertEquals(9, $count);
}

function testMethodWithUserTypes()
{
  global $refedObj, $obj;
  $refedObj->setString("aardvarks");
  $obj->methodWithUserTypes($refedObj);
}

function testObjectParam()
{
  global $obj;
  $obj->methodWithObjectParam("string", "wibble");
  $obj->methodWithObjectParam("true", true);
  $obj->methodWithObjectParam("false", false);
  $obj->methodWithObjectParam("long", 123);
  $obj->methodWithObjectParam("double", 123.456);
  $jsonObj = array(
    "foo" => "hello",
    "bar" => 123
  );
  $obj->methodWithObjectParam("JsonObject", $jsonObj);
  $jsonArr = ["foo", "bar", "wib"];
  $obj->methodWithObjectParam("JsonArray", $jsonArr);

}

function testDataObjectParam()
{
  global $obj;
  $dataObject = array(
    "foo" => "hello",
    "bar" => 123,
    "wibble" => 1.23
  );
  $obj->methodWithDataObjectParam($dataObject);
}

function testMethodWithHandlerUserTypes()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerUserTypes(function ($refedObj) use (&$count) {
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("echidnas", $refedObj->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultUserTypes()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerAsyncResultUserTypes(function ($refedObj, $err) use (&$count) {
    assertNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("cheetahs", $refedObj->getString());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithConcreteHandlerUserTypeSubtype()
{
  global $obj;
  $count = 0;
  $obj->methodWithConcreteHandlerUserTypeSubtype(Factory::createConcreteHandlerUserType(function ($refedObj) use (&$count) {
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("echidnas", $refedObj->getString());
    $count++;
  }));
  assertEquals(1, $count);
}

function testMethodWithAbstractHandlerUserTypeSubtype()
{
  global $obj;
  $count = 0;
  $obj->methodWithAbstractHandlerUserTypeSubtype(Factory::createAbstractHandlerUserType(function ($refedObj) use (&$count) {
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("echidnas", $refedObj->getString());
    $count++;
  }));
  assertEquals(1, $count);
}

function testMethodWithConcreteHandlerUserTypeSubtypeExtension()
{
  global $obj;
  $count = 0;
  $obj->methodWithConcreteHandlerUserTypeSubtypeExtension(Factory::createConcreteHandlerUserTypeExtension(function ($refedObj) use (&$count) {
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("echidnas", $refedObj->getString());
    $count++;
  }));
  assertEquals(1, $count);
}

function testMethodWithHandlerVoid()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerVoid(function () use (&$count) {
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultVoid()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerAsyncResultVoid(false, function ($_, $err) use (&$count) {
    assertNull($err);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultVoidFails()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerAsyncResultVoid(true, function ($_, $err) use (&$count) {
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foo!", $err->getMessage());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerThrowable()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerThrowable(function ($t) use (&$count) {
    assertNotNull($t);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("cheese!", $t->getMessage());
    $count++;
  });
  assertEquals(1, $count);
}

function _runTest1($value, $assert)
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerGenericUserType($value, function ($refedObj) use (&$count, $assert) {
    assertEquals("Object", "" . $refedObj);
    /** @noinspection PhpUndefinedMethodInspection */
    $assert($refedObj->getValue());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerGenericUserType()
{
  _runTest1("string_value", function ($value) {
    assertEquals("string_value", $value);
  });
  _runTest1(array("key" => "key_value"), function ($value) {
    assertEquals("key_value", $value["key"]);
  });
  _runTest1(["foo", "bar", "juu"], function ($value) {
    assertEquals(["foo", "bar", "juu"], $value);
  });
}

function _runTest2($value, $assert)
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerAsyncResultGenericUserType($value, function ($refedObj, $err) use (&$count, $assert) {
    assertNotNull($refedObj);
    assertNull($err);
    assertEquals("Object", "" . $refedObj);
    /** @noinspection PhpUndefinedMethodInspection */
    $assert($refedObj->getValue());
  });
}

function testMethodWithHandlerAsyncResultGenericUserType()
{
  _runTest2("string_value", function ($value) {
    assertEquals("string_value", $value);
  });
  _runTest2(array("key" => "key_value"), function ($value) {
    assertEquals("key_value", $value["key"]);
  });
  _runTest2(["foo", "bar", "juu"], function ($value) {
    assertEquals(["foo", "bar", "juu"], $value);
  });
}

function testMethodWithHandlerDataObject()
{
  global $obj;
  $count = 0;

  $obj->methodWithHandlerDataObject(function ($option) use (&$count) {
    assertTrue(gettype($option) === 'array');
    assertEquals("foo", $option["foo"]);
    assertEquals(123, $option["bar"]);
    assertEquals(0.0, $option["wibble"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultDataObject()
{
  $count = 0;
  global $obj;
  $obj->methodWithHandlerAsyncResultDataObject(false, function ($option, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($option) === 'array');
    assertEquals("foo", $option["foo"]);
    assertEquals(123, $option["bar"]);
    assertEquals(0.0, $option["wibble"]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerAsyncResultDataObjectFails()
{
  $count = 0;
  global $obj;
  $obj->methodWithHandlerAsyncResultDataObject(true, function ($option, $err) use (&$count) {
    assertNull($option);
    assertNotNull($err);
    /** @noinspection PhpUndefinedMethodInspection */
    assertEquals("foobar!", $err->getMessage());
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithHandlerStringReturn()
{
  global $obj;
  $handler = $obj->methodWithHandlerStringReturn("the-result");
  $handler("the-result");
  $failed = false;
  try {
    $handler("not-expected");
  } catch (Throwable $e) {
    $failed = true;
  }
  assertTrue($failed);
}

function testMethodWithHandlerGenericReturn()
{
  global $obj;
  $result = null;
  $handler = $obj->methodWithHandlerGenericReturn(function ($res) use (&$result) {
    $result = $res;
  });
  $handler("the-result");
  assertEquals($result, "the-result");
  //TODO wrapper类传到php暂时不知道如何实现
//  $handler($obj);
//  assertEquals($obj, $result);
}

function testMethodWithHandlerVertxGenReturn()
{
  global $obj, $refedObj;
  $handler = $obj->methodWithHandlerVertxGenReturn("the-result");
  $refedObj->setString("the-result");
  $handler($refedObj);
}

function testMethodWithHandlerAsyncResultStringReturn()
{
  global $obj;
  $succeedingHandler = $obj->methodWithHandlerAsyncResultStringReturn("the-result", false);
  $succeedingHandler("the-result", null);
  $succeedingHandler("the-result");
  $failed = false;
  try {
    $succeedingHandler("not-expected");
  } catch (Throwable $e) {
    $failed = true;
  }
  assertTrue($failed);
  $failingHandler = $obj->methodWithHandlerAsyncResultStringReturn("an-error", true);
  try {
    throw new Exception("an-error");
  } catch (Throwable $e) {
    $failingHandler("whatever", $e);
  }
  $failed = false;
  try {
    $failingHandler("whatever");
  } catch (Throwable $e) {
    $failed = true;
  }
  assertTrue($failed);
}

function testMethodWithHandlerAsyncResultGenericReturn()
{
  global $obj;
  $result = null;
  $succeedingHandler = $obj->methodWithHandlerAsyncResultGenericReturn(function ($res, $err) use (&$result) {
    $result = $err != null ? $err : $res;
  });
  $succeedingHandler("the-result");
  assertEquals($result, "the-result");
  $succeedingHandler(null, "the-error");
  /** @noinspection PhpUndefinedMethodInspection */
  assertEquals($result->getMessage(), "the-error");
  //TODO wrapper类传到php暂时不知道如何实现
//  $succeedingHandler(obj);
//  assertEquals(result, $obj->_jdel);
}

function testMethodWithHandlerAsyncResultVertxGenReturn()
{
  global $obj, $refedObj;
  $handler = $obj->methodWithHandlerAsyncResultVertxGenReturn("the-async-result", false);
  $refedObj->setString("the-async-result");
  $handler($refedObj);
  $err = null;
  try {
    throw new Exception("it-fails");
  } catch (Throwable $e) {
    $err = $e;
  }
  $handler = $obj->methodWithHandlerAsyncResultVertxGenReturn("it-fails", true);
  $handler(null, $err);
}

function testMethodWithGenericParam()
{
  global $obj;
  $obj->methodWithGenericParam("String", "foo");
  $jsonObj = array(
    "foo" => "hello",
    "bar" => 123
  );
  $obj->methodWithGenericParam("JsonObject", $jsonObj);
  $jsonArr = ["foo", "bar", "wib"];
  $obj->methodWithGenericParam("JsonArray", $jsonArr);
}

function testMethodWithGenericHandler()
{
  global $obj;
  $count = 0;
  $obj->methodWithGenericHandler("String", function ($res) use (&$count) {
    assertEquals("foo", $res);
    $count++;
  });
  assertEquals(1, $count);
  //TODO wrapper类传到php暂时不知道如何实现
//  $count = 0;
//  $obj->methodWithGenericHandler("Ref", function($res) use(&$count) {
//    assertEquals("bar", $res->getString());
//    $count++;
//  });
//  assertEquals(1, $count);
  $count = 0;
  $obj->methodWithGenericHandler("JsonObject", function ($res) use (&$count) {
    assertEquals("hello", $res["foo"]);
    assertEquals(123, $res["bar"]);
    $count++;
  });
  assertEquals(1, $count);
  $count = 0;
  $obj->methodWithGenericHandler("JsonArray", function ($res) use (&$count) {
    assertEquals("foo", $res[0]);
    assertEquals("bar", $res[1]);
    assertEquals("wib", $res[2]);
    $count++;
  });
  assertEquals(1, $count);
  $count = 0;
  $obj->methodWithGenericHandler("JsonObjectComplex", function ($res) use (&$count) {
    assertTrue(gettype($res) === 'array');
    assertTrue(gettype($res["outer"]) === 'array');
    assertEquals("hello", $res["outer"]["foo"]);
    assertTrue(is_array($res["bar"]));
    assertEquals("this", $res["bar"][0]);
    assertEquals("that", $res["bar"][1]);
    $count++;
  });
  assertEquals(1, $count);
}

function testMethodWithGenericHandlerAsyncResult()
{
  global $obj;
  $count = 0;
  $obj->methodWithGenericHandlerAsyncResult("String", function ($res, $err) use (&$count) {
    assertNull($err);
    assertEquals("foo", $res);
    $count++;
  });
  assertEquals(1, $count);
//  $count = 0;
//  $obj->methodWithGenericHandlerAsyncResult("Ref", function ($res, $err) use(&$count) {
//    assertNull($err);
//    assertEquals("bar", $res.getString());
//    $count++;
//  });
//  assertEquals(1, $count);
  $count = 0;
  $obj->methodWithGenericHandlerAsyncResult("JsonObject", function ($res, $err) use (&$count) {
    assertNull($err);
    assertEquals("hello", $res["foo"]);
    assertEquals(123, $res["bar"]);
    $count++;
  });
  assertEquals(1, $count);
  $count = 0;
  $obj->methodWithGenericHandlerAsyncResult("JsonObjectComplex", function ($res, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($res) === 'array');
    assertTrue(gettype($res["outer"]) === 'array');
    assertEquals("hello", $res["outer"]["foo"]);
    assertTrue(is_array($res["bar"]));
    assertEquals("this", $res["bar"][0]);
    assertEquals("that", $res["bar"][1]);
    $count++;
  });
  assertEquals(1, $count);
  $count = 0;
  $obj->methodWithGenericHandlerAsyncResult("JsonArray", function ($res, $err) use (&$count) {
    assertEquals("foo", $res[0]);
    assertEquals("bar", $res[1]);
    assertEquals("wib", $res[2]);
    $count++;
  });
  assertEquals(1, $count);
}

function testJsonParams()
{
  global $obj;
  $jsonObject = array(
    "cat" => "lion",
    "cheese" => "cheddar"
  );
  $jsonArray = ["house", "spider"];
  $obj->methodWithJsonParams($jsonObject, $jsonArray);
}

function testNullJsonParams()
{
  global $obj;
  $obj->methodWithNullJsonParams(null, null);
}

function testJsonHandlerParams()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerJson(function ($jsonObject) use (&$count) {
    assertTrue(gettype($jsonObject) === 'array');
    assertEquals("stilton", $jsonObject["cheese"]);
    $count++;
  }, function ($jsonArray) use (&$count) {
    assertTrue(gettype($jsonArray) === 'array');
    assertTrue(is_array($jsonArray));
    assertEquals("socks", $jsonArray[0]);
    assertEquals("shoes", $jsonArray[1]);
    $count++;
  });
  assertEquals(2, $count);
}

function testComplexJsonHandlerParams()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerComplexJson(function ($jsonObject) use (&$count) {
    assertTrue(gettype($jsonObject) === 'array');
    assertTrue(gettype($jsonObject["outer"]) === 'array');
    assertEquals("tartan", $jsonObject["outer"]["socks"]);
    assertTrue(is_array($jsonObject["list"]));
    assertEquals("yellow", $jsonObject["list"][0]);
    assertEquals("blue", $jsonObject["list"][1]);
    $count++;
  }, function ($jsonArray) use (&$count) {
    assertTrue(gettype($jsonArray) === 'array');
    assertTrue(is_array($jsonArray[0]));
    assertTrue(gettype($jsonArray[0][0]) === 'array');
    assertEquals("hello", $jsonArray[0][0]["foo"]);
    assertTrue(gettype($jsonArray[1][0]) === 'array');
    assertEquals("bye", $jsonArray[1][0]["bar"]);
    $count++;
  });
  assertEquals(2, $count);
}

function testJsonHandlerAsyncResultParams()
{
  global $obj;
   $count = 0;
   $obj->methodWithHandlerAsyncResultJsonObject(function($jsonObject, $err) use (&$count) {
     assertNull($err);
     assertTrue(gettype($jsonObject) === 'array');
     assertEquals("stilton", $jsonObject["cheese"]);
     $count++;
   });
   $obj->methodWithHandlerAsyncResultJsonArray(function($jsonArray, $err) use (&$count) {
     assertNull($err);
     assertTrue(gettype($jsonArray) === 'array');
     assertTrue(is_array($jsonArray));
     assertEquals("socks", $jsonArray[0]);
     assertEquals("shoes", $jsonArray[1]);
     $count++;
   });
   assertEquals(2, $count);
}

function testNullJsonHandlerAsyncResultParams()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerAsyncResultNullJsonObject(function ($jsonObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($jsonObject) === 'NULL');
    assertNull($jsonObject);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultNullJsonArray(function ($jsonArray, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($jsonArray) === 'NULL');
    assertNull($jsonArray);
    $count++;
  });
  assertEquals(2, $count);
}

function testComplexJsonHandlerAsyncResultParams()
{
  global $obj;
  $count = 0;
  $obj->methodWithHandlerAsyncResultComplexJsonObject(function ($jsonObject, $err) use (&$count) {
    assertNull($err);
    assertTrue(gettype($jsonObject) === 'array');
    assertTrue(gettype($jsonObject["outer"]) === 'array');
    assertEquals("tartan", $jsonObject["outer"]["socks"]);
    assertTrue(is_array($jsonObject["list"]));
    assertEquals("yellow", $jsonObject["list"][0]);
    assertEquals("blue", $jsonObject["list"][1]);
    $count++;
  });
  $obj->methodWithHandlerAsyncResultComplexJsonArray(function ($jsonArray, $err) use (&$count) {
    assertNull($err);
    assertTrue(is_array($jsonArray));
    assertTrue(gettype($jsonArray[0]) === 'array');
    assertEquals("hello", $jsonArray[0]["foo"]);
    assertTrue(gettype($jsonArray[1]) === 'array');
    assertEquals("bye", $jsonArray[1]["bar"]);
    $count++;
  });
  assertEquals(2, $count);
}

function testEnumParam()
{
  global $obj;
  $ret = $obj->methodWithEnumParam("sausages", "TIM");
  assertEquals("sausagesTIM", $ret);
}

function testBasicReturns()
{
  global $obj;
  $ret = $obj->methodWithByteReturn();
  assertEquals($ret, 123);
  $ret = $obj->methodWithShortReturn();
  assertEquals($ret, 12345);
  $ret = $obj->methodWithIntReturn();
  assertEquals($ret, 12345464);
  $ret = $obj->methodWithLongReturn();
  assertEquals(65675123, $ret);
  $ret = $obj->methodWithFloatReturn();
  assertEquals(1.23, $ret);
  $ret = $obj->methodWithDoubleReturn();
  assertEquals(3.34535, $ret);
  $ret = $obj->methodWithBooleanReturn();
  assertTrue($ret);
  $ret = $obj->methodWithCharReturn();
  assertEquals("Y", $ret);
  $ret = $obj->methodWithStringReturn();
  assertEquals("orangutan", $ret);
}

function testVertxGenReturn()
{
  global $obj;
  $ret = $obj->methodWithVertxGenReturn();
  assertNotNull($ret);
  assertEquals("chaffinch", $ret->getString());
}

function testVertxGenNullReturn()
{
  global $obj;
  $ret = $obj->methodWithVertxGenNullReturn();
  assertNull($ret);
}

function testAbstractVertxGenReturn()
{
  global $obj;
  $ret = $obj->methodWithAbstractVertxGenReturn();
  assertNotNull($ret);
  assertEquals("abstractchaffinch", $ret->getString());
}

function testDataObjectReturn()
{
  global $obj;
  $ret = $obj->methodWithDataObjectReturn();
  assertTrue(gettype($ret) === 'array');
  assertEquals("foo", $ret["foo"]);
  assertEquals(123, $ret["bar"]);
  assertEquals(0.0, $ret["wibble"]);
}

function testDataObjectNullReturn()
{
  global $obj;
  $ret = $obj->methodWithDataObjectNullReturn();
  assertNull($ret);
}

function testOverloadedMethods()
{
  global $obj, $refedObj;
  $refedObj->setString("dog");
  $ret = $obj->overloadedMethod("cat", $refedObj);
  assertEquals("meth1", $ret);
  $called = false;
  $ret = $obj->overloadedMethod("cat", $refedObj, 12345, function ($animal) use (&$called) {
    assertEquals("giraffe", $animal);
    $called = true;
  });
  assertEquals("meth2", $ret);
  assertTrue($called);
  $called = false;
  $ret = $obj->overloadedMethod("cat", function ($animal) use (&$called) {
    assertEquals("giraffe", $animal);
    $called = true;
  });
  assertEquals("meth3", $ret);
  assertTrue($called);
  $called = false;
  $ret = $obj->overloadedMethod("cat", $refedObj, function ($animal) use (&$called) {
    assertEquals("giraffe", $animal);
    $called = true;
  });
  assertEquals("meth4", $ret);
  assertTrue($called);

  try {
    /** @noinspection PhpParamsInspection */
    $obj->overloadedMethod("cat");
  } catch (Throwable $e) {
    assertTrue($e instanceof Error);
  }
  try {
    /** @noinspection PhpMethodParametersCountMismatchInspection */
    $obj->overloadedMethod("cat", $refedObj, 12345, function ($animal) {
    }, "foo");
  } catch (Throwable $e) {
    assertTrue($e instanceof Error);
  }

  try {

    /** @noinspection PhpParamsInspection */
    $obj->overloadedMethod($refedObj);

  } catch (Throwable $e) {
    assertTrue($e instanceof Error);
  }

  try {
    /** @noinspection PhpParamsInspection */
    $obj->overloadedMethod(function ($animal) {
    });
  } catch (Throwable $e) {
    assertTrue($e instanceof Error);
  }
}

function testSuperInterfaces()
{
  global $obj;
  $obj->superMethodWithBasicParams(123, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', 'foobar');
  $obj->otherSuperMethodWithBasicParams(123, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', 'foobar');
}

function testMethodWithGenericReturn()
{
  global $obj;
  $ret = $obj->methodWithGenericReturn("JsonObject");
  assertTrue(gettype($ret) === 'array');
  assertEquals("hello", $ret["foo"]);
  assertEquals(123, $ret["bar"]);

  $ret = $obj->methodWithGenericReturn("JsonArray");
  assertTrue(gettype($ret) === 'array');
  assertTrue(is_array($ret));
  assertEquals("foo", $ret[0]);
  assertEquals("bar", $ret[1]);
  assertEquals("wib", $ret[2]);
}

function testFluentMethod()
{
  global $obj;
  $ret = $obj->fluentMethod("bar");
  $ret->fluentMethod("bar");
  assertTrue($obj === $ret);
}

function testStaticFactoryMethod()
{
  $ret = TestInterface::staticFactoryMethod("bar");
  assertTrue(gettype($ret) === 'object');
  assertEquals("bar", $ret->getString());
}

function testMethodWithCachedReturn()
{
  global $obj;
  $ret = $obj->methodWithCachedReturn("bar");
  assertTrue(gettype($ret) === 'object');
  assertEquals("bar", $ret->getString());
  $ret2 = $obj->methodWithCachedReturn("bar");
  assertTrue($ret === $ret2);
  $ret3 = $obj->methodWithCachedReturn("bar");
  assertTrue($ret2 === $ret3);
}

function testJsonReturns()
{
  global $obj;
  $ret = $obj->methodWithJsonObjectReturn();
  assertTrue(gettype($ret) === "array");
  assertEquals("stilton", $ret["cheese"]);
  $ret = $obj->methodWithJsonArrayReturn();
  assertTrue(gettype($ret) === "array");
  assertTrue(is_array($ret));
  assertEquals("socks", $ret[0]);
  assertEquals("shoes", $ret[1]);
}

function testNullJsonReturns()
{
  global $obj;
  $ret = $obj->methodWithNullJsonObjectReturn();
  assertNull($ret);
  $ret = $obj->methodWithNullJsonArrayReturn();
  assertNull($ret);
}

function testComplexJsonReturns()
{
  global $obj;
  $ret = $obj->methodWithComplexJsonObjectReturn();
  assertTrue(gettype($ret) === 'array');
  assertTrue(gettype($ret["outer"]) === 'array');
  assertEquals("tartan", $ret["outer"]["socks"]);
  assertTrue(is_array($ret["list"]));
  assertEquals("yellow", $ret["list"][0]);
  assertEquals("blue", $ret["list"][1]);
  $ret = $obj->methodWithComplexJsonArrayReturn();
  assertTrue(is_array($ret));
  assertTrue(gettype($ret[0]) === 'array');
  assertEquals("hello", $ret[0]["foo"]);
  assertTrue(gettype($ret[1]) === 'array');
  assertEquals("bye", $ret[1]["bar"]);
}

function testEnumReturn()
{
  global $obj;
  $ret = $obj->methodWithEnumReturn("JULIEN");
  assertEquals("JULIEN", $ret);
}

function testThrowableReturn()
{
  global $obj;
  $ret = $obj->methodWithThrowableReturn("bogies");
  assertEquals("bogies", $ret->getMessage());
}

function testThrowableParam($undefined = null)
{
  global $obj;
  try {
    /** @noinspection PhpUndefinedMethodInspection */
    $undefined->does_not_exist();
    throw new Exception("error");
  } catch (Throwable $e) {
    $msg = $obj->methodWithThrowableParam($e);
    assertEquals("Cannot call 'does_not_exist' method of non-object", $msg);
  }
}

function testSuperMethodOverloadedBySubclass()
{
  global $obj;
  assertEquals(0, $obj->superMethodOverloadedBySubclass());
  assertEquals(1, $obj->superMethodOverloadedBySubclass("sstring_arg"));
}

function testCustomModule()
{
  $my = MyInterface::create();
  $testInterface = $my->method();
  $testInterface->methodWithBasicParams(123, 12345, 1234567, 1265615234, 12.345, 12.34566, true, 'X', 'foobar');
  $sub = $my->sub();
  assertEquals("olleh", $sub->reverse("hello"));
}
