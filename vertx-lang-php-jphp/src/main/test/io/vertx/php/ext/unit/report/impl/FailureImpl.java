package io.vertx.php.ext.unit.report.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.unit.report.Failure;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("FailureImpl")
@Namespace("io\\vertx\\php\\ext\\unit\\report\\impl")
public class FailureImpl extends VertxGenWrapper<io.vertx.ext.unit.report.Failure> implements Failure<io.vertx.ext.unit.report.Failure>{
    
    public FailureImpl(Environment env, io.vertx.ext.unit.report.Failure wrappedObject){
        super(env, wrappedObject);
    }

}
