package io.vertx.lang.php.codegen.type;

import io.vertx.codegen.type.ClassKind;

public class TypeInfo {
    private final io.vertx.codegen.type.TypeInfo type;
    private final String packageName;
    public TypeInfo(io.vertx.codegen.type.TypeInfo type){
        this.type = type;
        if (type.getRaw() != null) {
            if (type.getKind() == ClassKind.API) {
                this.packageName = type.getRaw().translatePackageName("php");
            } else {
                this.packageName = type.getRaw().getPackageName();
            }
        } else {
            this.packageName = "";
        }
    }
}
