package io.vertx.codetrans.lang.jphp;

import com.sun.source.tree.LambdaExpressionTree;
import io.vertx.codegen.type.*;
import io.vertx.codetrans.*;
import io.vertx.codetrans.expression.*;
import io.vertx.codetrans.statement.StatementModel;

import java.util.*;
import java.util.function.Consumer;


class JPhpCodeBuilder implements CodeBuilder {
  boolean defineFunction = false;
  Set<String> imports = new HashSet<>();

  @Override
  public CodeWriter newWriter() {
    return new JPhpWriter(this);
  }

  @Override
  public String render(RunnableCompilationUnit unit, RenderMode renderMode) {
    CodeWriter render = newWriter();
    render.append("<?php\n");
    render.indent();

    for (String importClass : imports) {
      render.append("use ").append(importClass.replace(".", "\\")).append(";\n");
    }
    if (renderMode != RenderMode.SNIPPET) {
      for (Map.Entry<String, StatementModel> field : unit.getFields().entrySet()) {
        field.getValue().render(render);
        render.append(";\n");
      }
      for (Map.Entry<String, MethodModel> member : unit.getMethods().entrySet()) {
        defineFunction = true;
        render.append("function ").append(member.getKey()).append("(");
        for (Iterator<String> it = member.getValue().getParameterNames().iterator(); it.hasNext(); ) {
          String paramName = it.next();
          render.append("$").append(paramName);
          if (it.hasNext()) {
            render.append(", ");
          }
        }
        render.append(") {\n");
        render.indent();
        member.getValue().render(render);
        render.unindent();
        render.append("};\n");
      }
      defineFunction = false;
    }

    unit.getMain().render(render);
    return render.getBuffer().toString();
  }

  @Override
  public ExpressionModel asyncResultHandler(LambdaExpressionTree.BodyKind bodyKind, ParameterizedTypeInfo resultType, String resultName, CodeModel body, CodeModel succeededBody, CodeModel failedBody) {
    return new LambdaExpressionModel(this, bodyKind, Arrays.asList(resultType.getArgs().get(0), TypeReflectionFactory.create(Throwable.class)), Arrays.asList(resultName, resultName + "_err"), body);
  }

  @Override
  public StatementModel variableDecl(VariableScope scope, TypeInfo type, String name, ExpressionModel initializer) {
    return StatementModel.render(render -> {
      render.append("$").append(name);
      if (initializer != null) {
        render.append(" = ");
        initializer.render(render);
      }
    });
  }

  @Override
  public StatementModel enhancedForLoop(String variableName, ExpressionModel expression, StatementModel body) {
    return StatementModel.render(renderer -> {
      renderer.append("foreach(");
      expression.render(renderer);
      renderer.append(" as ").append("$").append(variableName);
//      renderer.append("foreach( $").append(variableName).append(" as ");
//      expression.render(renderer);
      renderer.append(") {\n");
      renderer.indent();
      body.render(renderer);
      renderer.unindent();
      renderer.append("}");
    });
  }

  @Override
  public StatementModel forLoop(StatementModel initializer, ExpressionModel condition, ExpressionModel update, StatementModel body) {
    return StatementModel.render((renderer) -> {
      initializer.render(renderer);
      renderer.append(";\n");
      renderer.append("while (");
      condition.render(renderer);
      renderer.append(") {\n").indent();
      body.render(renderer);
      renderer.append("\n");
      update.render(renderer);
      renderer.append(";\n");
      renderer.unindent().append("}");
    });
  }

  @Override
  public StatementModel sequenceForLoop(String variableName, ExpressionModel fromValue, ExpressionModel toValue, StatementModel body) {
    return StatementModel.render((renderer) -> {
      renderer.append("for ($").append(variableName).append(" = ");
      fromValue.render(renderer);
      renderer.append("; $").append(variableName).append(" < ");
      toValue.render(renderer);
      renderer.append("; $").append(variableName).append("++) {\n");
      renderer.indent();
      body.render(renderer);
      renderer.unindent();
      renderer.append("}");
    });
  }

  @Override
  public ExpressionModel render(Consumer<CodeWriter> c) {
    return new A(this) {
      @Override
      public void render(CodeWriter writer) {
//        writer.append("/*AAAAAA*/");
        c.accept(writer);
      }
    };
  }

  @Override
  public ExpressionModel identifier(String name, VariableScope scope) {
    return new JPhpIdentifierModel(this, name, scope);
//    return CodeBuilder.super.identifier(name, scope);
  }


  class JPhpIdentifierModel extends IdentifierModel {
    private TypeInfo type;
    private VariableScope scope;

    public JPhpIdentifierModel(CodeBuilder builder, String name, VariableScope scope) {
      super(builder, name, scope);
      this.scope = scope;
    }

    public VariableScope getScope() {
      return scope;
    }

    @Override
    public ExpressionModel as(TypeInfo type) {
      this.type = type;
      return super.as(type);
    }

    public ClassKind getKind() {
      return type.getKind();
    }

    @Override
    public void render(CodeWriter writer) {
//      writer.append("/*BBBB*/");
      super.render(writer);
    }
  }

  @Override
  public ApiTypeModel apiType(ApiTypeInfo type) {
    imports.add(type.translateName("jphp"));
    return CodeBuilder.super.apiType(type);
  }

  static class A extends ExpressionModel {
    public A(CodeBuilder builder) {
      super(builder);
    }
  }
}
