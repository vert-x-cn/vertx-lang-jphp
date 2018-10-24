package io.vertx.lang.jphp.generator;

import io.vertx.codegen.*;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.type.*;
import io.vertx.codegen.writer.CodeWriter;

import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static io.vertx.codegen.type.ClassKind.*;

public class PhpClassWrapperGenerator extends AbstractPhpClassGenerator {

  @Override
  public String filename(ClassModel model) {
    return javaFileName(model);
  }


  @Override
  void genPackageOrNamespace(CodeWriter writer, String packageOrNamespace) {
    genJavaPackage(writer, packageOrNamespace);
  }

  @Override
  void genImportsOrUses(ClassModel model, CodeWriter writer) {
    Set<String> importClassSet = new TreeSet<>();
    importClassSet.add("php.runtime.annotation.Reflection.Name");
    importClassSet.add("php.runtime.annotation.Reflection.Namespace");
    importClassSet.add("php.runtime.annotation.Reflection.Signature");
    importClassSet.add("php.runtime.env.Environment");
    importClassSet.add("io.vertx.lang.jphp.wrapper.PhpGen");
    importClassSet.add("io.vertx.lang.jphp.converter.*");
//    importClassSet.add("io.vertx.lang.jphp.converter.TypeConverter");
//    importClassSet.add("io.vertx.lang.jphp.converter.VertxGenVariable0Converter");
//    importClassSet.add("io.vertx.lang.jphp.converter.ContainerConverter");
//    importClassSet.add("io.vertx.lang.jphp.converter.DataObjectConverter");
//    importClassSet.add("io.vertx.lang.jphp.converter.EnumConverter");
    if (model.getTypeParams().size() > 0) {
      importClassSet.add("io.vertx.lang.jphp.converter.TypeConverter");
    }
    ApiTypeInfo type = (ApiTypeInfo) model.getType();
    if (type.isHandler()) {
      importClassSet.add("io.vertx.lang.jphp.Handler");
      importClassSet.add("io.vertx.lang.jphp.converter.TypeConverter");
      addImport(model, importClassSet, type.getHandlerArg(), true, true);
    }
    boolean noConverter = true;
    boolean cacheMap = false;
    for (String methodName : model.getMethodMap().keySet()) {
      for(MethodInfo m : model.getMethodMap().get(methodName)) {
        if (noConverter && (!m.getReturnType().getName().equals("void") || m.getParams().size() > 0)) {
          noConverter = false;
        }
        for (ParamInfo param : m.getParams()) {
          addImport(model, importClassSet, param.getType(), false, true);
        }
        addImport(model, importClassSet, m.getReturnType(), false, false);
        if (m.isCacheReturn()) {
          cacheMap = true;
        }
      }
    }
    if (cacheMap) {
      importClassSet.add("java.util.HashMap");
      importClassSet.add("java.util.Map");
    }
    if (!noConverter) {
      importClassSet.add("php.runtime.Memory");
      importClassSet.add("io.vertx.lang.jphp.Utils");
    }

    importClassSet.add("io.vertx.lang.jphp.wrapper.VertxGenVariable" + model.getTypeParams().size() + "Wrapper");

    for (String importClass : importClassSet) {
      writer.format("import %s;", importClass).println();
    }
  }

  @Override
  void genClassStartTemplate(ClassModel model, CodeWriter writer) {
    String simpleName = model.getIfaceSimpleName();
    String fqn = model.getFqn();
    List<? extends TypeParamInfo> typeParams = model.getTypeParams();
    writer.format("@Name(\"%s\")", simpleName).println();
    writer.format("@Namespace(\"%s\")", model.getType().translatePackageName(id).replace(".", "\\\\")).println();
    writer.format("@PhpGen(%s.class)", fqn).println();
    writer.println("@SuppressWarnings(\"ALL\")");
    if (model.isDeprecated()) {
      writer.println("@Deprecated");
    }
    writer.format("public class %s%s extends VertxGenVariable%dWrapper<%s%s>", simpleName, genTypeParamInfo(typeParams), typeParams.size(), model.getIfaceFQCN(), typeParams.stream().map(t -> ", " + t.getName()).collect(Collectors.joining()));
    ApiTypeInfo type = (ApiTypeInfo) model.getType();
    if (type.isHandler()) {
      writer.format(" implements Handler<%s>", type.getHandlerArg().getName());
    }
    writer.println(" {");
  }

  @Override
  void genConstructor(ClassModel model, CodeWriter writer) {
    String simpleName = model.getIfaceSimpleName();
    String fqcn = model.getFqn();
    List<? extends TypeParamInfo> typeParams = model.getTypeParams();
    boolean cacheMap = model.getMethods().stream().anyMatch(MethodInfo::isCacheReturn);
    if (cacheMap) {
      writer.println("private Map<String, Memory> cacheMap = new HashMap<>();");
    }
    writer.format("private %s(Environment env, %s wrappedObject%s) {", simpleName, model.getIfaceFQCN(), getParamsInfo4TypeParam(model, typeParams)).println();
    writer.indent().format("super(env, wrappedObject%s);", getParamNames4TypeParam(model, typeParams)).println();
    writer.unindent().println("}");

    String typeParamInfo = genTypeParamInfo(typeParams);

    writer.format("public static %s %s%s __create(Environment env, %s wrappedObject%s) {", typeParamInfo, simpleName, typeParamInfo, fqcn, getParamsInfo4TypeParam(model, typeParams)).println();
    writer.indent().format("return new %s%s(env, wrappedObject%s);", simpleName, typeParams.size() > 0 ? "<>" : "", getParamNames4TypeParam(model, typeParams)).println();
    writer.unindent().println("}");

    if (typeParams.size() > 0) {
      typeParamInfo = typeParams.stream().map(s -> "Object").collect(Collectors.joining(", ", "<", ">"));
      writer.println();
      writer.format("public static %s%s __create(Environment env, %s%s wrappedObject) {", simpleName, typeParamInfo, fqcn, typeParamInfo).println();
      writer.indent().format("return new %s<>(env, wrappedObject, %s);", simpleName, typeParams.stream().map(s -> "TypeConverter.UNKNOWN_TYPE").collect(Collectors.joining(", "))).println();
      writer.unindent().println("}");
    }
  }

  @Override
  void genMethodBody(ClassModel model, CodeWriter writer) {
    for (int index = 0; index < model.getTypeParams().size(); ) {
      TypeParamInfo typeParam = model.getTypeParams().get(index);
      index++;
      String fieldName = getConverterFieldName(model, typeParam);
      writer.println();
      writer.format("public TypeConverter<%s> %s() {", typeParam.getName(), getConverterMethodName(model, "get", typeParam.getName())).println();
      writer.indent().format("return this.getTypeConverter%d();", index).println();
      writer.unindent().println("}");
      writer.format("public void %s(TypeConverter<%s> %s) {", getConverterMethodName(model, "set", typeParam.getName()), typeParam.getName(), fieldName).println();
      writer.indent().format("this.setTypeConverter%d(%s);", index, fieldName).println();
      writer.unindent().println("}");
      writer.println();

    }
    ApiTypeInfo type = (ApiTypeInfo) model.getType().getRaw();
    if (type.isHandler()) {
      writer.format("public TypeConverter<%s> get__handlerConverter__(){", type.getHandlerArg().getName()).println();
      writer.indent().format("return %s;", getTypeConverter(model, type.getHandlerArg())).println();
      writer.unindent().println("}");
    }
    super.genMethodBody(model, writer);
  }

  @Override
  void genMethod(ClassModel model, String methodName, CodeWriter writer) {
    List<MethodInfo> methods = model.getMethodMap().get(methodName);
    Map<Integer, List<MethodInfo>> methodGroup = methods.stream().collect(Collectors.groupingBy(m -> m.getParams().size()));
    for (Map.Entry<Integer, List<MethodInfo>> entry : methodGroup.entrySet()) {
      int paramSize = entry.getKey();
      List<MethodInfo> ms = entry.getValue();
      writer.println("@Signature");
      if (paramSize == 0 && methodName.equals("toString")) {
        writer.println("public String toString(){");
        writer.indent().println("return this.getWrappedObject().toString();");
        writer.unindent().println("}");
      } else {
        MethodInfo m = methods.get(0);
        String returnType;
        if(m.getReturnType().getName().equals("void")) {
          returnType = "void";
        } else {
          returnType = "Memory";
        }
        writer.format("public %s%s %s(Environment __ENV__%s) {", m.isStaticMethod()?"static ":"", returnType, methodName, getParamNames(paramSize)).println();
        writer.indent();
        if (paramSize == 0) {
          getReturnInfo(model, ms.get(0), writer);
//          if (ms.get(0).getReturnType().getName().equals("void")) {
//            writer.println();
//          } else {
//            writer.println("return null;");
//          }
        } else {
          for (MethodInfo method : ms) {
            writer.format("if(%s) {", checkParamType(model, method));
            writer.indent().println("");

//            if (ms.get(0).getReturnType().getName().equals("void")) {
//              writer.println();
//            } else {
//              writer.println("return null;");
//            }
            getReturnInfo(model, method, writer);

            writer.unindent().print("} else ");
          }
          writer.println("{");
          writer.indent().println("throw new RuntimeException(\"function invoked with invalid arguments\");");
          writer.unindent().println("}");
        }
        writer.unindent().println("}");
      }
    }
  }

  private void getReturnInfo(ClassModel model, MethodInfo method, CodeWriter writer){
    TypeInfo returnType = method.getReturnType();
    if (!returnType.getName().equals("void") && !method.isFluent()) {
      if (method.isCacheReturn()) {
        writer.format("Memory cache = cacheMap.get(\"%s\");", method.getName()).println();
        writer.println("if (cache == null) {");
        writer.indent().print("cache = ");
      } else {
        writer.print("return ");
      }
      String typeConverter = getTypeConverter(model, returnType);
      writer.format("%s.convReturn(__ENV__, ", typeConverter);
    }

    if (method.isStaticMethod()) {
      writer.print(model.getFqn());
    } else {
      writer.print("this.getWrappedObject()");
    }
    writer.format(".%s(", method.getName());
    for (int index = 0; index < method.getParams().size(); index++) {
      if (index != 0) {
        writer.print(", ");
      }
      ParamInfo param = method.getParam(index);
      String typeConverter = getTypeConverter(model, param.getType());
      writer.format("%s.convParam(__ENV__, arg%d)", typeConverter, index);
    }
    writer.print(")");
    if (!returnType.getName().equals("void") && !method.isFluent()) {
      writer.print(")");
    }
    writer.println(";");
    if (method.isFluent()) {
      writer.println("return toMemory();");
    } else if (!returnType.getName().equals("void")) {
      if (method.isCacheReturn()) {
        writer.format("cacheMap.put(\"%s\", cache);", method.getName()).println();
        writer.unindent().println("}");
        writer.println("return cache;");
      }
    }
  }

  private String checkParamType(ClassModel model, MethodInfo method){
    StringWriter sw = new StringWriter();
    CodeWriter writer = new CodeWriter(sw);
    for (int index = 0; index < method.getParams().size(); index++) {
      ParamInfo param = method.getParam(index);
      if (index != 0) {
        writer.print(" && ");
      }
      if (!param.isNullable()) {
        writer.format("Utils.isNotNull(arg%d) && ", index);
      }
      String typeConverter = getTypeConverter(model, param.getType());
      writer.format("%s.accept(__ENV__, arg%d)", typeConverter, index);
    }
    return sw.toString();
  }

  private String getParamNames(int num){
    return IntStream.range(0, num).mapToObj(i -> ", Memory arg" + i).collect(Collectors.joining());
  }


  private String getParamNames4TypeParam(ClassModel model, List<? extends TypeParamInfo> typeParams) {
    return typeParams.stream().map(t -> ", " + getConverterFieldName(model, t)).collect(Collectors.joining());
  }
  private String getParamsInfo4TypeParam(ClassModel model, List<? extends TypeParamInfo> typeParams){
    return typeParams.stream().map(s -> ", TypeConverter<" + s.getName() + "> " + getConverterFieldName(model, s)).collect(Collectors.joining());
  }
  private String genTypeParamInfo(List<? extends TypeParamInfo> typeParams){
    return typeParams.size() == 0 ? "" : typeParams.stream().map(TypeParamInfo::getName).collect(Collectors.joining(", ", "<", ">"));
  }


  @Override
  protected String getConverterMethodName(ClassModel model, String methodPrefix, String paramName) {
    return methodPrefix + model.getIfaceSimpleName() + "Variable" + paramName + "Converter";
  }


  private void addImport(ClassModel model, Set<String> importClassSet, TypeInfo typeInfo, boolean isParameterized, boolean isParam) {
    if (typeInfo.isVariable() || typeInfo.isVoid()) {
      return;
    }
    ClassKind typeKind = typeInfo.getKind();
    if (typeKind == API || typeKind == DATA_OBJECT) {
      importClassSet.add(typeInfo.getRaw().translateName(id));
    } else {
      if (!typeKind.basic) {
        if (typeInfo.getRaw() == null) {
//          importClassSet.add(typeInfo.getName());
          return;
        }
        String fqn = typeInfo.getRaw().getName();
        if (!fqn.startsWith("java.lang") && typeKind != HANDLER) {
          importClassSet.add(fqn);
        }
      }
    }
    if (typeInfo.isParameterized()) {
      ParameterizedTypeInfo p = (ParameterizedTypeInfo) typeInfo;
      for (TypeInfo arg : p.getArgs()) {
        addImport(model, importClassSet, arg, true, isParam);
      }
    }
  }
  private void addImport1(ClassModel model, Set<String> importClassSet, TypeInfo typeInfo, boolean isParameterized, boolean isParam) {
    if (typeInfo.isVariable()) {
      if (isParameterized) {
        importClassSet.add("io.vertx.lang.jphp.converter.TypeConverter");
      }
      return;
    }
    ClassKind typeKind = typeInfo.getKind();
    if (typeKind == API) {
      if (!typeInfo.getRaw().getPackageName().equals(model.getIfacePackageName())) {
        importClassSet.add(typeInfo.getRaw().translatePackageName("jphp") + "." + typeInfo.getRaw().getSimpleName());
      }
    } else if (typeKind == DATA_OBJECT) {
      if (!typeInfo.getRaw().getPackageName().equals(model.getIfacePackageName())) {
        importClassSet.add(typeInfo.getRaw().translatePackageName("jphp") + "." + typeInfo.getRaw().getSimpleName());
      }
    } else if (typeKind == ENUM) {
      if (!typeInfo.getRaw().getPackageName().equals(model.getIfacePackageName())) {
        importClassSet.add(typeInfo.getRaw().getName());
      }
    } else if (typeKind == JSON_OBJECT) {
      if (isParameterized && !isParam) {
        importClassSet.add("io.vertx.core.json.JsonObject");
      }
    } else if (typeKind == JSON_ARRAY) {
      if (isParameterized) {
        importClassSet.add("io.vertx.core.json.JsonArray");
      }
    } else if (!typeKind.basic
      && !typeKind.collection
      && typeKind != THROWABLE
      && typeKind != OBJECT
      && typeKind != HANDLER
      && typeKind != ASYNC_RESULT
      && typeKind != CLASS_TYPE
      && typeKind != FUNCTION
      && typeKind != VOID
      && typeInfo.getRaw() != null) {
      if (isParam || isParameterized) {
        importClassSet.add(typeInfo.getRaw().getPackageName() + "." + typeInfo.getRaw().getSimpleName());
      }
    }
    if (isParameterized) {
      if (typeKind.basic || typeKind.json || typeKind == VOID || typeKind == THROWABLE || typeKind == CLASS_TYPE || typeInfo.isVariable()) {
        importClassSet.add("io.vertx.lang.jphp.converter.TypeConverter");
      } else if (typeKind == ENUM) {
        importClassSet.add("io.vertx.lang.jphp.converter.EnumConverter");
        importClassSet.add(typeInfo.getRaw().getName());
      } else if (typeKind == DATA_OBJECT) {
        importClassSet.add("io.vertx.lang.jphp.converter.DataObjectConverter");
      } else if (typeKind.collection) {
        importClassSet.add("io.vertx.lang.jphp.converter.ContainerConverter");
      } else if (typeKind == API) {
        importClassSet.add("io.vertx.lang.jphp.converter.VertxGenVariable0Converter");
      }
    }
    if (typeKind != CLASS_TYPE && typeInfo.isParameterized()) {
      ParameterizedTypeInfo type = (ParameterizedTypeInfo) typeInfo;
      for (TypeInfo arg : type.getArgs()) {
        addImport(model, importClassSet, arg, true, isParam);
      }
    }
  }


  @Override
  String renderLinkToHtml(Tag.Link link) {
    return renderJavaLinkToHtml(link);
  }

  private String getConverterFieldName(ClassModel model, TypeParamInfo typeParam){
    return Case.CAMEL.to(Case.LOWER_CAMEL, model.getIfaceSimpleName()) + "Variable" + typeParam.getName() + "Converter";
  }
}
