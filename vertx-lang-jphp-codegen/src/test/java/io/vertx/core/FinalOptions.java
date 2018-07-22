package io.vertx.core;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject
public final class FinalOptions extends BaseOptions {
    public FinalOptions(JsonObject json) {
        super(json);
    }

    public String getString() {
        return "";
    }

    public void setString(String string) {

    }
}
