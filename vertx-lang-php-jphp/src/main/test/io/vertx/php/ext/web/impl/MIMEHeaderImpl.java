package io.vertx.php.ext.web.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.MIMEHeader;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MIMEHeaderImpl")
@Namespace("io\\vertx\\php\\ext\\web\\impl")
public class MIMEHeaderImpl extends VertxGenWrapper<io.vertx.ext.web.MIMEHeader> implements MIMEHeader<io.vertx.ext.web.MIMEHeader>{
    
    public MIMEHeaderImpl(Environment env, io.vertx.ext.web.MIMEHeader wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory parameter(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().parameter(key)
    }

    @Signature
    public Memory isMatchedBy(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().isMatchedBy(matchTry)
    }

}
