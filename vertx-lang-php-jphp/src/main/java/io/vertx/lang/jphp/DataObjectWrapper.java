package io.vertx.lang.jphp;

import php.runtime.env.Environment;

public class DataObjectWrapper<DATA> extends BaseWrapper<DATA> {
    public DataObjectWrapper(Environment __env__, DATA __wrappedObject) {
        super(__env__, __wrappedObject);
    }
}
