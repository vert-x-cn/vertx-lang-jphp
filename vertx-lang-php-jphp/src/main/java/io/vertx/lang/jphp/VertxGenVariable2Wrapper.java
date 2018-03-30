package io.vertx.lang.jphp;

import io.vertx.lang.jphp.converter.VariableConverter;
import php.runtime.env.Environment;

public abstract class VertxGenVariable2Wrapper<API, V1, V2> extends VertxGenVariable1Wrapper<API, V1> {
    private VariableConverter<V2> variable2;

    public VertxGenVariable2Wrapper(Environment __env__, API __wrappedObject, VariableConverter<V1> variable1, VariableConverter<V2> variable2) {
        super(__env__, __wrappedObject, variable1);
        this.variable2 = variable2;
    }

    public VariableConverter<V2> getVariable2() {
        return variable2;
    }

    public void setVariable2(VariableConverter<V2> variable2) {
        this.variable2 = variable2;
    }
}
