package io.vertx.lang.jphp.generator.dataobject;

import io.vertx.codegen.*;
import io.vertx.codegen.doc.Doc;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.type.ApiTypeInfo;
import io.vertx.codegen.type.ClassKind;
import io.vertx.codegen.type.ClassTypeInfo;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.lang.jphp.generator.AbstractClassGenerator;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.vertx.codegen.type.ClassKind.*;

abstract class AbstractPhpDataObjectGenerator extends AbstractClassGenerator<DataObjectModel> {
    AbstractPhpDataObjectGenerator(boolean implement, String suffix) {
        super(implement, suffix);
        this.kinds = Collections.singleton("dataObject");
    }

    @Override
    public String filename(DataObjectModel model) {
        return !model.isConcrete() || !implement ? super.filename(model) : null;
    }

    void addImports(DataObjectModel model){
        for (PropertyInfo property : model.getPropertyMap().values()) {
            if (property.getType().getKind() == DATA_OBJECT) {
                addImport(model, property.getType());
            }
        }
    }

    @Override
    protected void render(DataObjectModel model, int index, int size, Map<String, Object> session, PrintWriter writer) {
        addImports(model);
        ClassTypeInfo type = model.getType();
        String packageName = type.getRaw().translatePackageName("jphp");
        if (implement) {
            packageName += ".impl";
        }
        genPackageName(packageName, writer);
        writer.println();
        for (String importedClass : importClassSet) {
            genImport(importedClass, writer);
        }
        genTypeDocAndDeprecated(model.getDoc(), model.isDeprecated(), writer);
        startClassTemplate(packageName, model, writer);

        if (model.isClass() || implement) {
            genConstruct(model, writer);
        }

        for (PropertyInfo property : model.getPropertyMap().values()) {
            if (property.getAdderMethod() != null) {
                genAdderMethod(model, property, writer);
            }
            if (property.getGetterMethod() != null) {
                genGetterMethod(model, property, writer);
            }
            if (property.getSetterMethod() != null) {
                genSetterMethod(model, property, writer);
            }
        }

        writer.print("}");

    }

    void genAdderMethod(DataObjectModel model, PropertyInfo propertyInfo, PrintWriter writer) {
        writer.println();
        Runnable run = () -> {
            if (model.isClass() || implement) {
                writer.println();
                writer.println("  {");
                writer.println("    return $this;");
                writer.println("  }");
            } else {
                writer.println(";");
            }
        };
        if (propertyInfo.getKind().isMap()) {
            writer.println("  /**");
            writer.println("   * @param $key String");
            writer.println("   * @param $value String");
            writer.println("   * @return $this");
            writer.println("   */");
            writer.print("  public function ");
            writer.print(propertyInfo.getAdderMethod());
            writer.print("($key, $value) ");
            run.run();
        } else {
            writer.println("  /**");
            writer.print("   * @param $");
            writer.print(propertyInfo.getName());
            writer.println(getPHPDocType(propertyInfo.getType(), "|", "", ""));
            writer.println("   * @return $this");
            writer.println("   */");
            writer.print("  public function ");
            writer.print(propertyInfo.getAdderMethod());
            writer.print("($");
            writer.print(propertyInfo.getName());
            writer.print(") ");
            run.run();
        }
    }

    void genGetterMethod(DataObjectModel model, PropertyInfo propertyInfo, PrintWriter writer) {
        writer.println();
        writer.println("  /**");
        writer.print("   * @return ");
        writer.println(getPHPDocType(propertyInfo.getType(), "|", "", ""));
        writer.println("   */");
        writer.print("  public function ");
        writer.print(propertyInfo.getGetterMethod());
        writer.print("()");
        if (model.isClass() || implement) {
            writer.println("  {");
            writer.print("    return ");
            writer.print(getReturnInfo(propertyInfo.getType()));
            writer.println(";");
            writer.println("  }");
        } else {
            writer.println(";");
        }
    }

    void genSetterMethod(DataObjectModel model, PropertyInfo propertyInfo, PrintWriter writer) {
        writer.println();
        writer.println("  /**");
        writer.print("   * @param $");
        writer.print(propertyInfo.getName());
        writer.print(" ");
        writer.println(getPHPDocType(propertyInfo.getType(), "|", "", ""));
        writer.println("   * @return $this");
        writer.println("   */");
        writer.print("  public function ");
        writer.print(propertyInfo.getSetterMethod());
        writer.print("(");
        writer.print("$");
        writer.print(propertyInfo.getName());
        writer.print(")");
        if (model.isClass() || implement) {
            writer.println("  {");
            writer.println("    return $this;");
            writer.println("  }");
        } else {
            writer.println(";");
        }
    }
    private String getReturnInfo(TypeInfo type){
        ClassKind kind = type.getKind();
        if (kind.collection || kind.json) {
            return "[]";
        } else if (kind.basic) {
            if (kind == STRING) {
                return "\"\"";
            } else if (type.getSimpleName().equalsIgnoreCase("boolean")) {
                return "false";
            } else {
                return "0";
            }
        } else {
            return "null";
        }
    }

    private String getPHPDocType(TypeInfo typeInfo, String delimiter, String prefix, String suffix) {
        return getPHPDocType(typeInfo).stream().collect(Collectors.joining(delimiter, prefix, suffix));
    }

    private List<String> getPHPDocType(TypeInfo type) {
        List<String> list = new ArrayList<>();
        ClassKind kind = type.getKind();
        if ("void".equals(type.getName())) {
            list.add("void");
        } else if (type.getKind() == STRING) {
            list.add("string");
        } else if (kind.basic) {
            //这里是基础数据类型及其包装类，因为ClassKind中除了STRING之后，只有基础数据类型的包装类是basic，而上一个if已经判断了STRING，所以这里直接判断basic
            String simpleName = type.getSimpleName();
            if ("boolean".equalsIgnoreCase(simpleName)) {
                list.add("bool");
            } else if ("dobule".equalsIgnoreCase(simpleName) || "float".equalsIgnoreCase(simpleName)) {
                list.add("float");
            } else if ("char".equals(simpleName) || "Character".equals(simpleName)) {
                list.add("string");
            } else {
                list.add("integer");
            }
        } else if (kind.json) {
            list.add("array");
        } else if (kind == DATA_OBJECT) {
            list.add(type.getSimpleName());
            list.add("mixed");
        } else if (kind == ENUM) {
            list.add("string");
        } else if (kind == API) {
            ApiTypeInfo api = (ApiTypeInfo) type;
            list.add(type.getSimpleName());
            if (api.isHandler()) {
                list.add("callable");
            }
        } else if (kind == MAP) {
            list.add("array");
        } else if (kind.collection) {
            list.add("array");
        } else if (kind == OBJECT) {
            list.add("mixed");
        } else if (kind == HANDLER) {
            list.add("callable");
        } else if (kind == FUNCTION) {
            list.add("callable");
        } else if (kind == THROWABLE) {
            list.add("\\Exception");
        } else if (kind == CLASS_TYPE) {
            list.add("string");
        } else {
            throw new RuntimeException("未处理的类型：" + type);
        }
        return list;
    }

    void genConstruct(DataObjectModel model, PrintWriter writer) {
        writer.print("  public function __construct($");
        writer.print(model.getType().getSimpleName(Case.LOWER_CAMEL));
        if (model.hasEmptyConstructor()) {
            writer.print(" = null");
        }
        writer.println(")");
        writer.println("  {");
        writer.println("  }");
    }

    void genPackageName(String packageName, PrintWriter writer) {
        writer.print("namespace ");
        writer.print(packageName.replace(".", "\\"));
        writer.println(";");
    }

    void genImport(String packageName, PrintWriter writer) {
        writer.print("use ");
        writer.print(packageName.replace(".", "\\"));
        writer.println(";");
    }
    void genClassModifiers(DataObjectModel model, PrintWriter writer) {
        Element element = model.getElement();
        if(element.getModifiers().contains(Modifier.FINAL)) {
            writer.print("final ");
        }
        if (implement || model.isClass()) {
            if (!implement && !model.isConcrete()) {
                writer.print("abstract ");
            }
            writer.print("class ");
        } else {
            writer.print("interface ");
        }
    }
    void startClassTemplate(String packageName, DataObjectModel model, PrintWriter writer) {
//        ModuleInfo module = model.getModule();
        ClassTypeInfo type = model.getType();
        genClassModifiers(model, writer);
        writer.print(type.getSimpleName());
        if (implement || model.isClass()) {
            if (implement) {
                writer.print("Impl");
            }
            if (!model.isClass()) {
                writer.print(" implements ");
            } else if (implement){
                writer.print(" extends ");
            }
            if (implement) {
                writer.print(type.getSimpleName());
                writer.print("Interface");
            }
        }
        writer.println();
        writer.println("{");
    }

    void genTypeDocAndDeprecated(Doc doc, boolean deprecated, PrintWriter writer) {
        if (doc != null || deprecated) {
            writer.println("/**");
            if (doc != null) {
                Token.toHtml(doc.getTokens(), " *", this::renderLinkToHtml, "\n", writer);
            }
            if (deprecated) {
                writer.println(" * @deprecated");
            }
            writer.println(" */");
        }
    }

    protected String renderLinkToHtml(Tag.Link link) {
        ClassTypeInfo rawType = link.getTargetType().getRaw();
        if (rawType.getModule() != null) {
            String label = link.getLabel().trim();
            if (rawType.getKind() == DATA_OBJECT) {
                return "{@link " + rawType.getName() + "}";
            } else {
                if (rawType.getKind() == API) {
                    Element elt = link.getTargetElement();
                    String eltKind = elt.getKind().name();
                    String ret = "{@link " + rawType.translateName(id);
                    if ("METHOD".equals(eltKind)) {
                        ret += "#" + elt.getSimpleName().toString();
                    }
                    if (label.length() > 0) {
                        ret += " " + label;
                    }
                    ret += "}";
                    return ret;
                }
            }
        }
        return "{@link " + rawType.getName() + "}";
    }
}
