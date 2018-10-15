package io.vertx.core;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject
public abstract class BaseOptions implements Options1, Options2{

    public BaseOptions() {

    }

    public BaseOptions(JsonObject json) {

    }

    public abstract String getString();
    public abstract void setString(String string);
}
