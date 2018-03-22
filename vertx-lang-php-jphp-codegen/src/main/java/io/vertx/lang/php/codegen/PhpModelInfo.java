package io.vertx.lang.php.codegen;

import io.vertx.codegen.MethodInfo;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.lang.php.codegen.type.PhpMethodInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class PhpModelInfo extends ApiModelInfo {
    public PhpModelInfo(ClassTypeInfo type, List<MethodInfo> methods) {
        super(type, methods);
    }

    @Override
    public void init() {
        super.init();
        this.namespace = this.packageName.replace(".", "\\");

        for (Entry<String, List<MethodInfo>> entry : methodsMap.entrySet()) {
            String name = entry.getKey();
            List<MethodInfo> ms = entry.getValue();
            int min = 999;
            int max = 0;
            List<MethodInfo> rawMethods = new ArrayList<>();
            for(MethodInfo m : ms) {
                int paramSize = m.getParams().size();
                if (paramSize > max) {
                    max = paramSize;
                }
                if (paramSize < min) {
                    min = paramSize;
                }
                String paramKey = name + "-" + paramSize;
                rawMethods.addAll(sameParamSizeMethod.get(paramKey));
            }

            methods.add(new PhpMethodInfo(min, max, rawMethods));
        }
    }

    @Override
    protected void addImport(TypeInfo type, boolean param) {
        ClassKind kind = type.getKind();
        if (kind != ClassKind.API && kind != ClassKind.CLASS_TYPE) {
            return;
        }
        super.addImport(type, param);
    }

    @Override
    protected void addToImport(TypeInfo type, boolean param) {
        super.addToImport(type, param);
    }
}
