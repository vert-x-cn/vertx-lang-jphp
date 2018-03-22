package io.vertx.lang.php.codegen.entity;

import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codegen.type.TypeNameTranslator;
import io.vertx.lang.php.codegen.Lang;

import java.util.Collection;

public abstract class TypeInfoEntity {
    protected TypeInfo type;
    protected Lang lang;

    public TypeInfoEntity(TypeInfo type, Lang lang) {
        this.type = type;
        this.lang = lang;
    }


    @Override
    public abstract boolean equals(Object obj);

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public void collectImports(Collection<ClassTypeInfoEntity> imports) {

    }

    public TypeInfoEntity getErased() {
        return this;
    }

    public ClassTypeInfoEntity getRaw(){
        return null;
    }
    public ClassKind getKind(){
        return ClassKind.OTHER;
    }
    public String getName(){
        return format(true);
    }
    public boolean isNullable(){
        return false;
    }
    public String translateName(String lang) {
        return translateName(TypeNameTranslator.hierarchical(lang));
    }
    public String translateName(TypeNameTranslator translator) {
        return getName();
    }

    public String getSimpleName(){
        return format(false);
    }

    public String toString(){
        return getName();
    }

    public boolean isParameterized() {
        return false;
    }

    public boolean isVariable() {
        return false;
    }

    public boolean isVoid() {
        return false;
    }

    abstract String format(boolean qualified);
}
