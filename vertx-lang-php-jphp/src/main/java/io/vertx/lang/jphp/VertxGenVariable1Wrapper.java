package io.vertx.lang.jphp;

import io.vertx.lang.jphp.converter.VariableConverter;
import php.runtime.env.Environment;

public abstract class VertxGenVariable1Wrapper<API, V> extends VertxGenVariable0Wrapper<API> {
    private VariableConverter<V> variable1;
    public VertxGenVariable1Wrapper(Environment __env__, API __wrappedObject, VariableConverter<V> variable1) {
        super(__env__, __wrappedObject);
        this.variable1 = variable1;
    }
    public VariableConverter<V> getVariable1(){
        return variable1;
    }
    public void setVariable1(VariableConverter<V> variable1) {
        this.variable1 = variable1;
    }
}
