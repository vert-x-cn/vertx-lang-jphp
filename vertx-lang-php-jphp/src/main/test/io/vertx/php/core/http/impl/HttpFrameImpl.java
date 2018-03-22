package io.vertx.php.core.http.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.http.HttpFrame;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("HttpFrameImpl")
@Namespace("io\\vertx\\php\\core\\http\\impl")
public class HttpFrameImpl extends VertxGenWrapper<io.vertx.core.http.HttpFrame> implements HttpFrame<io.vertx.core.http.HttpFrame>{
    
    public HttpFrameImpl(Environment env, io.vertx.core.http.HttpFrame wrappedObject){
        super(env, wrappedObject);
    }

}
