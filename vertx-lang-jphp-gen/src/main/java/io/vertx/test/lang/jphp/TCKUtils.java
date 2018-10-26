package io.vertx.test.lang.jphp;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.testmodel.*;

@VertxGen
public interface TCKUtils {
  static RefedInterface1 createRefedInterface1() {
    return new RefedInterface1Impl();
  }

  static CollectionTCK createCollectionTCK() {
    return new CollectionTCKImpl();
  }

  static DataObjectTCK createDataObjectTCK() {
    return new DataObjectTCKImpl();
  }
}
