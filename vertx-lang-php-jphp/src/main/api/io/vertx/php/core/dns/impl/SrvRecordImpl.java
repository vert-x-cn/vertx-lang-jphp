package io.vertx.php.core.dns.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.dns.SrvRecord;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SrvRecordImpl")
@Namespace("io\\vertx\\php\\core\\dns\\impl")
public class SrvRecordImpl extends VertxGenWrapper<io.vertx.core.dns.SrvRecord> implements SrvRecord<io.vertx.core.dns.SrvRecord>{
    
    public SrvRecordImpl(Environment env, io.vertx.core.dns.SrvRecord wrappedObject){
        super(env, wrappedObject);
    }

}
