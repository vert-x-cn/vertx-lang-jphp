package io.vertx.lang.php.codegen.entity;

import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.PrimitiveTypeInfo;
import io.vertx.lang.php.codegen.Lang;

public class PrimitiveTypeInfoEntity extends TypeInfoEntity{

    final String name;
    public PrimitiveTypeInfoEntity(PrimitiveTypeInfo type, Lang lang) {
        super(type, lang);
        this.name = type.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PrimitiveTypeInfoEntity) {
            return name.equals(((PrimitiveTypeInfoEntity) obj).name);
        }
        return false;
    }

    public ClassTypeInfoEntity getBoxed(){
//        return ClassTypeInfo.PRIMITIVES.get()
        return null;
    }

    @Override
    public ClassKind getKind() {
        return super.getKind();
    }

    @Override
    String format(boolean qualified) {
        return name;
    }


}
