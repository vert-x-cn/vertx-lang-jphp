package io.vertx.lang.php.codegen.type;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhpMethodInfo extends MethodInfo {
    private final int min;
    private final int max;
    private final List<io.vertx.codegen.MethodInfo> rawMethods;
    private Set<TypeInfo> returnType;
    public PhpMethodInfo(int min, int max, List<io.vertx.codegen.MethodInfo> rawMethods){
        this.min = min;
        this.max = max;
        this.rawMethods = rawMethods;
        returnType = new HashSet<>();
        io.vertx.codegen.type.TypeInfo prev = null;
        for(io.vertx.codegen.MethodInfo m : rawMethods) {
            if (prev == null) {
                prev = m.getReturnType();
            } else {
//                if (prev.isVoid())
            }
        }
    }


}
