package io.vertx.core;

import io.vertx.codegen.annotations.DataObject;

@DataObject
public interface VertxOptions {
    String getString();
    void setString(String string);
}
