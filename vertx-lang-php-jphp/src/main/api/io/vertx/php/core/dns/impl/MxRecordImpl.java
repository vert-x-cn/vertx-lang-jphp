package io.vertx.php.core.dns.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.core.dns.MxRecord;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("MxRecordImpl")
@Namespace("io\\vertx\\php\\core\\dns\\impl")
public class MxRecordImpl extends VertxGenWrapper<io.vertx.core.dns.MxRecord> implements MxRecord<io.vertx.core.dns.MxRecord>{
    
    public MxRecordImpl(Environment env, io.vertx.core.dns.MxRecord wrappedObject){
        super(env, wrappedObject);
    }

}
