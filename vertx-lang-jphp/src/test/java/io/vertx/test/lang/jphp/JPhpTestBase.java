package io.vertx.test.lang.jphp;

import org.junit.Rule;
import org.junit.rules.TestName;

public abstract class JPhpTestBase {
  @Rule
  public final TestName testName = new TestName();
  protected void runTest(String script, String testName) throws Exception{
    new JPhpRunner().run(script, testName);
  }
}
