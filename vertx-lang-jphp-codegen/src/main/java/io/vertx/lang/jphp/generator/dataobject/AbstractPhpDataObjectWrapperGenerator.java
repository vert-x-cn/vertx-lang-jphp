package io.vertx.lang.jphp.generator.dataobject;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.type.ClassTypeInfo;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import java.io.PrintWriter;
import java.util.Map;

public class AbstractPhpDataObjectWrapperGenerator extends AbstractPhpDataObjectGenerator {
    AbstractPhpDataObjectWrapperGenerator(boolean implement) {
        super(implement, "java");
    }


    @Override
    protected void render(DataObjectModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        importClassSet.add("php.runtime.annotation.Reflection.Name");
        importClassSet.add("php.runtime.annotation.Reflection.Namespace");
        importClassSet.add("php.runtime.annotation.Reflection.Signature");
        Element element = model.getElement();
        boolean isFinal = element.getModifiers().contains(Modifier.FINAL);
        if (isFinal) {
            importClassSet.add("io.vertx.lang.jphp.BaseWrapper");
        }

        super.render(model, index, size, session, writer);
    }

    @Override
    void genConstruct(DataObjectModel model, PrintWriter writer) {
        if (model.hasEmptyConstructor()) {

        }
    }

    @Override
    void genAdderMethod(DataObjectModel model, PropertyInfo propertyInfo, PrintWriter writer) {
    }

    @Override
    void genGetterMethod(DataObjectModel model, PropertyInfo propertyInfo, PrintWriter writer) {
    }

    @Override
    void genSetterMethod(DataObjectModel model, PropertyInfo propertyInfo, PrintWriter writer) {
    }

    @Override
    void genPackageName(String packageName, PrintWriter writer) {
        writer.print("package ");
        writer.print(packageName);
        writer.println(";");
    }

    @Override
    void genImport(String packageName, PrintWriter writer) {
        writer.print("import ");
        writer.print(packageName);
        writer.println(";");
    }

    @Override
    void startClassTemplate(String packageName, DataObjectModel model, PrintWriter writer) {
        Element element = model.getElement();
        boolean isFinal = element.getModifiers().contains(Modifier.FINAL);
        ClassTypeInfo type = model.getType();
        String simpleName = type.getSimpleName();
        writer.print("@Name(\"");
        writer.print(simpleName);
        writer.println("\")");
        writer.print("@Namespace(\"");
        writer.print(packageName.replace(".", "\\\\"));
        writer.println("\")");
        writer.print("public ");
        genClassModifiers(model, writer);
        writer.print(simpleName);
        if (implement || model.isClass()) {
            if (implement) {
                writer.print("Impl");
            }
            if (model.isClass()) {
                writer.print(" extends ");
            } else {
                writer.print(" implements ");
            }
            if (implement) {
                writer.print(type.translateName(id));
            } else if (!isFinal){
                writer.print(type.getName());
            } else {
                writer.print("BaseWrapper<");
                writer.print(type.getName());
                writer.print(">");
            }
        } else {
            writer.print(" extends ");
            writer.print(type.getName());
        }
        writer.println(" {");
    }


    @Override
    void genTypeDocAndDeprecated(Doc doc, boolean deprecated, PrintWriter writer) {
        if (doc != null) {
            //FIXME java因为没有deprecated的信息，所以不添加@deprecated注释
            super.genTypeDocAndDeprecated(doc, false, writer);
        }
        if (deprecated) {
            writer.println("@Deprecated");
        }
    }
}
