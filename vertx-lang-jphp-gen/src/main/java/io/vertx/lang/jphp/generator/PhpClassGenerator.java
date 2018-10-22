package io.vertx.lang.jphp.generator;

import io.vertx.codegen.ClassModel;
import io.vertx.codegen.MethodInfo;
import io.vertx.codegen.ParamInfo;
import io.vertx.codegen.doc.Tag;
import io.vertx.codegen.doc.Text;
import io.vertx.codegen.doc.Token;
import io.vertx.codegen.type.TypeInfo;
import io.vertx.codegen.writer.CodeWriter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.join;

public class PhpClassGenerator extends AbstractPhpClassGenerator {
  @Override
  public String filename(ClassModel model) {
    return phpFileName(model);
  }

  @Override
  void genPackageOrNamespace(CodeWriter writer, String packageOrNamespace) {
    genPhpNamespace(writer, packageOrNamespace);
  }

  @Override
  void genImportsOrUses(ClassModel model, CodeWriter writer) {
    Set<String> importClassSet = new TreeSet<>();
    for (MethodInfo method : model.getMethods()) {
      addImport(model, importClassSet, method.getReturnType());
      for (ParamInfo param : method.getParams()) {
        addImport(model, importClassSet, param.getType());
      }
    }
    for (String importClass : importClassSet) {
      writer.format("use %s;", importClass.replace(".", "\\")).println();
    }
  }

  @Override
  void genDeprecatedDoc(ClassModel model, CodeWriter writer) {
    writer.println(" * @deprecated");
  }

  @Override
  void genClassStartTemplate(ClassModel model, CodeWriter writer) {
    writer.format("class %s", model.getIfaceSimpleName()).println();
    writer.println("{");
  }

  @Override
  void genConstructor(ClassModel model, CodeWriter writer) {
    writer.println("private function __construct()");
    writer.println("{");
    writer.indent().println();
    writer.unindent().println("}");
  }

  @Override
  void genMethod(ClassModel model, String methodName, CodeWriter writer) {
    List<MethodInfo> methods = model.getMethodMap().get(methodName);
    TypeInfo returnType = null;
    String returnDescription = "";
    int minParamSize = Integer.MAX_VALUE;
    int maxParamSize = 0;
    boolean isStatic = false;
    for (MethodInfo method : methods) {
      if (returnType == null) {
        if (method.isFluent()) {
          returnType = model.getType();
        } else {
          returnType = method.getReturnType();
        }
        if (method.getReturnDescription() != null) {
          returnDescription = method.getReturnDescription().getValue();
        }
      }
      int methodParamSize = method.getParams().size();
      if (methodParamSize > maxParamSize) {
        maxParamSize = methodParamSize;
      }
      if (methodParamSize < minParamSize) {
        minParamSize = methodParamSize;
      }
      isStatic = method.isStaticMethod();
    }
    writer.println("/**");
    List<Set<String>> paramTypes = new ArrayList<>();
    boolean allDeprecated = true;
    for (MethodInfo method : methods) {
      if (method.getDoc() != null) {
        Token.toHtml(method.getDoc().getTokens(), " *", this::renderLinkToHtml, "\n", writer);
        writer.println(" *");
      }
      for (ParamInfo param : method.getParams()) {
        Text t = param.getDescription();
        writer.format(" * param $%s %s %s", param.getName(), getPHPDocType(param.getType()).stream().collect(Collectors.joining(" | ", "[", "]")), t == null ? "" : t.getValue()).println();
//        writer.println(" *");
      }
      writer.println(" * <b>");
      if (method.isDeprecated()) {
        writer.println(" * this method is deprecated");
        writer.println(" * <s>");
      }
      writer.format(" * %s(", methodName);
      allDeprecated = allDeprecated && method.isDeprecated();
      for (int index = 0; index < method.getParams().size(); index++) {
        ParamInfo param = method.getParam(index);
        Set<String> params = index < paramTypes.size() ? paramTypes.get(index) : null;
        if (params == null) {
          params = new HashSet<>();
          paramTypes.add(params);
        }
        List<String> paramTypeList = getPHPDocType(param.getType());
        params.addAll(paramTypeList);
        if (index > 0) {
          writer.print(", ");
        }
        writer.print("$" + param.getName());
      }
      writer.println(")");
      if (method.isDeprecated()) {
        writer.println(" * </s>");
      }
      writer.println(" * </b>");
      writer.println(" *");
    }
    for (int index = 0; index < paramTypes.size(); index++) {
      writer.format(" * @param $arg%d %s", index, join(" | ", paramTypes.get(index))).println();
    }
    writer.format(" * @return %s %s", returnType == null ? "" : join(" | ", getPHPDocType(returnType)), returnDescription).println();
    if (allDeprecated) {
      writer.println(" * @deprecated");
    }
    writer.println(" */");
    writer.print("public");
    if (isStatic) {
      writer.print(" static");
    }
    writer.format(" function %s(%s)", methodName, getParamName(minParamSize, maxParamSize)).println();
    writer.println("{");
    writer.indent();
    if (returnType != null && returnType.getName().equals("void")) {
      writer.println();
    } else {
      writer.format("return %s;", getReturnInfo(returnType)).println();
    }
    writer.unindent().println("}");
  }

  private String getParamName(int min, int max) {
    return IntStream.range(0, max).mapToObj(i -> "$arg" + i + (i >= min ? " = null" : "")).collect(Collectors.joining(", "));
  }

  @Override
  String renderLinkToHtml(Tag.Link link) {
    return renderPhpLinkToHtml(link);
  }
}
