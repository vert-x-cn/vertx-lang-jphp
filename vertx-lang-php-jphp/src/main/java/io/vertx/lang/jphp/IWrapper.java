package io.vertx.lang.jphp;

import php.runtime.Memory;
import php.runtime.lang.IObject;

public interface IWrapper<API> extends IObject {
    Memory toMemory();
    API getWrappedObject();
}
