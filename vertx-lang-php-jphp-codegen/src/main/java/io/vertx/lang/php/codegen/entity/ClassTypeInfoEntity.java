package io.vertx.lang.php.codegen.entity;

import io.vertx.codegen.type.TypeInfo;
import io.vertx.lang.php.codegen.Lang;

import java.util.HashMap;

public class ClassTypeInfoEntity extends TypeInfoEntity{

    static final HashMap<String, ClassTypeInfoEntity> PRIMITIVES = new HashMap<>();

    static {

    }

    public ClassTypeInfoEntity(TypeInfo type, Lang lang) {
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
