package io.vertx.php.ext.stomp.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.stomp.Acknowledgement;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("AcknowledgementImpl")
@Namespace("io\\vertx\\php\\ext\\stomp\\impl")
public class AcknowledgementImpl extends VertxGenWrapper<io.vertx.ext.stomp.Acknowledgement> implements Acknowledgement<io.vertx.ext.stomp.Acknowledgement>{
    
    public AcknowledgementImpl(Environment env, io.vertx.ext.stomp.Acknowledgement wrappedObject){
        super(env, wrappedObject);
    }

}
