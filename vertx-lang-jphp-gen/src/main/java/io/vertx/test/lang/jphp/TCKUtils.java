package io.vertx.test.lang.jphp;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.codegen.testmodel.CollectionTCK;
import io.vertx.codegen.testmodel.CollectionTCKImpl;
import io.vertx.codegen.testmodel.RefedInterface1;
import io.vertx.codegen.testmodel.RefedInterface1Impl;

@VertxGen
public interface TCKUtils {
  static RefedInterface1 createRefedInterface1() {
    return new RefedInterface1Impl();
  }

  static CollectionTCK createCollectionTCK() {
    return new CollectionTCKImpl();
  }
}
