package io.vertx.lang.jphp;

import php.runtime.Memory;
import php.runtime.ext.support.compile.FunctionsContainer;
import php.runtime.memory.DoubleMemory;

@SuppressWarnings({"unused", "WeakerAccess"})
public class AssertFunctions extends FunctionsContainer {
  public static Memory assertEquals(Memory expected, Memory actual) {
    if (isNull(actual)) {
      if (!isNull(expected)) {
        throw new AssertionError("Expected " + expected + " got null");
      }
    } else {
      if (isNull(expected)) {
        throw new AssertionError("Expected null instead of " + actual);
      } else if(expected instanceof DoubleMemory || actual instanceof DoubleMemory){
        int i = expected.minus(actual).compareTo(DoubleMemory.valueOf(0.0001d));
        if (i > 0) {
          throw new AssertionError("double value Not equals : " + expected + " != " + actual);
        }
      } else if(!expected.equal(actual)) {
        throw new AssertionError("Not equals : " + expected + " != " + actual);
      }
    }
    return Memory.NULL;
  }

  public static Memory assertTrue(boolean condition) {
    if (!condition) throw new AssertionError();
    return Memory.NULL;
  }

  public static Memory assertFalse(boolean condition) {
    return assertTrue(!condition);
  }

  public static Memory assertNull(Memory expected) {
    if (!isNull(expected)) {
      throw new AssertionError("Expected null");
    }
    return Memory.NULL;
  }
  public static Memory assertNotNull(Memory expected) {
    if (isNull(expected)) {
      throw new AssertionError("Expected not null");
    }
    return Memory.NULL;
  }



  private static boolean isNull(Memory value) {
    return value == null || value == Memory.NULL;
  }
}
