package io.vertx.lang.php.codegen;

import io.vertx.codegen.type.TypeInfo;

public enum Lang {
    JAVA {
        @Override
        public String getPackageName(TypeInfo type) {
            return null;
        }
    },
    PHP {
        @Override
        public String getPackageName(TypeInfo type) {
            return null;
        }
    }
    ;
    public abstract String getPackageName(TypeInfo type);
}
