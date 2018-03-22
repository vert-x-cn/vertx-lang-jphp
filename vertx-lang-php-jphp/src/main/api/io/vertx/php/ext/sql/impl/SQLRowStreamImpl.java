package io.vertx.php.ext.sql.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.sql.SQLRowStream;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SQLRowStreamImpl")
@Namespace("io\\vertx\\php\\ext\\sql\\impl")
public class SQLRowStreamImpl extends VertxGenWrapper<io.vertx.ext.sql.SQLRowStream> implements SQLRowStream<io.vertx.ext.sql.SQLRowStream>{
    
    public SQLRowStreamImpl(Environment env, io.vertx.ext.sql.SQLRowStream wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory exceptionHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().exceptionHandler(handler)
    }

    @Signature
    public Memory handler(Environment __env__, Memory... args) {
        this.getWrappedObject().handler(handler)
    }

    @Signature
    public Memory endHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().endHandler(endHandler)
    }

    @Signature
    public Memory column(Environment __env__, Memory... args) {
        return Utils.convReturnUnknow(__env__, this.getWrappedObject().column(name)
    }

    @Signature
    public Memory resultSetClosedHandler(Environment __env__, Memory... args) {
        this.getWrappedObject().resultSetClosedHandler(handler)
    }

    @Signature
    public void close(Environment __env__, Memory... args) {
        this.getWrappedObject().close()
    }

}
