package io.vertx.test.lang.jphp;

import org.junit.Test;

public class ConstantTCKTest extends JPhpTestBase {
  @Test
  public void testBasic() throws Exception {
    runTest();
  }

  @Test
  public void testVertxGen() throws Exception {
    runTest();
  }

  @Test
  public void testDataObject() throws Exception {
    runTest();
  }

  @Test
  public void testJson() throws Exception {
    runTest();
  }

  @Test
  public void testEnum() throws Exception {
    runTest();
  }

  @Test
  public void testThrowable() throws Exception {
    runTest();
  }

  @Test
  public void testObject() throws Exception {
    runTest();
  }

  @Test
  public void testNullable() throws Exception {
    runTest();
  }

  @Test
  public void testList() throws Exception {
    runTest();
  }

  @Test
  public void testSet() throws Exception {
    runTest();
  }

  @Test
  public void testMap() throws Exception {
    runTest();
  }

  private void runTest() throws Exception {
    runTest("constant_tck_test.php", testName.getMethodName());
  }
}
