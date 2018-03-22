package io.vertx.lang.php.codegen;

import io.vertx.codegen.MethodInfo;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.type.ParameterizedTypeInfo;
import io.vertx.codegen.type.TypeInfo;

import java.util.List;

public class JavaModelInfo extends ApiModelInfo {
    public JavaModelInfo(ClassTypeInfo type, List<MethodInfo> methods) {
        super(type, methods);
    }

    public void init(){
        super.init();
        this.namespace = this.packageName.replace(".", "\\\\");
        importClassSet.add("php.runtime.annotation.Reflection.Name");
        importClassSet.add("php.runtime.annotation.Reflection.Namespace");
        importClassSet.add("php.runtime.annotation.Reflection.Signature");
        importClassSet.add("php.runtime.Memory");
        importClassSet.add("io.vertx.lang.php.BaseWrapper");
        importClassSet.add("php.runtime.memory.support.MemoryUtils");
        importClassSet.add("php.runtime.env.Environment");
    }

    @Override
    protected void addImport(TypeInfo type, boolean param) {
        if (!param && type.getKind() == ClassKind.HANDLER) {
            ParameterizedTypeInfo in = (ParameterizedTypeInfo) type;
            if(in.getArg(0).getKind() == ClassKind.ASYNC_RESULT) {
                importClassSet.add("io.vertx.lang.php.util.Wrapper");
                importClassSet.add("php.runtime.lang.BaseException");
            }
        }
        super.addImport(type, param);
    }
}
