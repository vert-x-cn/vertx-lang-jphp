package io.vertx.lang.php.codegen.entity;

import io.vertx.codegen.type.TypeInfo;
import io.vertx.lang.php.codegen.Lang;

public class TypeVariableInfoEntity extends TypeInfoEntity {
    public TypeVariableInfoEntity(TypeInfo type, Lang lang) {
        super(type, lang);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    String format(boolean qualified) {
        return null;
    }
}
