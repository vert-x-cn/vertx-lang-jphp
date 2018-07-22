package io.vertx.lang.jphp;

import php.runtime.lang.IObject;

public interface IWrapper<W> extends IObject, IMemory {
    W getWrappedObject();
}
