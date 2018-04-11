package io.vertx.codetrans.lang.jphp;

import com.sun.source.tree.LambdaExpressionTree;
import com.sun.tools.javac.comp.Todo;
import io.vertx.codegen.type.*;
import io.vertx.codetrans.*;
import io.vertx.codetrans.expression.*;
import io.vertx.codetrans.statement.StatementModel;

import java.util.*;

class JPhpCodeBuilder implements CodeBuilder {
    private TreeSet<String> imports = new TreeSet<>();

    JPhpCodeBuilder() {
    }

    @Override
    public JPhpWriter newWriter() {
        return new JPhpWriter(this);
    }

    @Override
    public String render(RunnableCompilationUnit unit, RenderMode renderMode) {
        JPhpWriter writer = newWriter();
        if (renderMode != RenderMode.SNIPPET) {
            throw new RuntimeException("todo");
        }
        System.err.println(unit.getMain().getStatement().getClass());
        unit.getMain().render(writer);
        return writer.getBuffer().toString();
    }

    @Override
    public DataObjectClassModel dataObjectClass(ClassTypeInfo type) {
        System.err.println("/*dataObjectClass*/");
        addImport(type);
        imports.add(type.translatePackageName("jphp") + ".*");
        return CodeBuilder.super.dataObjectClass(type);
    }

    @Override
    public EnumExpressionModel enumType(EnumTypeInfo type) {
        System.err.println("/*enumType*/");
        addImport(type);
        return CodeBuilder.super.enumType(type);
    }

    @Override
    public ApiTypeModel apiType(ApiTypeInfo type) {
        System.err.println("/*enumType*/");
        addImport(type);
        return CodeBuilder.super.apiType(type);
    }

    @Override
    public ExpressionModel asyncResultHandler(LambdaExpressionTree.BodyKind bodyKind, ParameterizedTypeInfo resultType, String resultName, CodeModel body, CodeModel succeededBody, CodeModel failedBody) {
        System.err.println("/*asyncResultHandler*/");
        return new LambdaExpressionModel(this, bodyKind, Collections.singletonList(resultType), Collections.singletonList(resultName), body);
    }

    @Override
    public StatementModel variableDecl(VariableScope scope, TypeInfo type, String name, ExpressionModel initializer) {
        //----finish
        return StatementModel.render(renderer -> {
            System.err.println("/*variableDecl*/");
            renderer.append("/*variableDecl*/");
            renderer.append("$").append(name);
            if (initializer != null) {
                renderer.append(" = ");
                initializer.render(renderer);
            }
        });
    }

    @Override
    public StatementModel enhancedForLoop(String variableName, ExpressionModel expression, StatementModel body) {
        return StatementModel.render(renderer -> {
            System.err.println("/*enhancedForLoop*/");
            renderer.append("/*enhancedForLoop*/");
            renderer.append("foreach (");
            expression.render(renderer);
            renderer.append(" as $").append(variableName).append(") { \n");
            renderer.indent();
            body.render(renderer);
            renderer.unindent();
            renderer.append("}");
        });
    }

    @Override
    public StatementModel forLoop(StatementModel initializer, ExpressionModel condition, ExpressionModel update, StatementModel body) {
        return StatementModel.conditional((renderer) -> {
            System.err.println("/*forLoop*/");
            renderer.append("/*forLoop*/");
            renderer.append("for (");
            initializer.render(renderer);
            renderer.append("; ");
            condition.render(renderer);
            renderer.append("; ");
            update.render(renderer);
            renderer.append(") {\n");
            renderer.indent();
            body.render(renderer);
            renderer.unindent();
            renderer.append("}");
        });
    }

    @Override
    public StatementModel sequenceForLoop(String variableName, ExpressionModel fromValue, ExpressionModel toValue, StatementModel body) {
        //----finish
        return StatementModel.conditional((renderer) -> {
            System.err.println("/*sequenceForLoop*/");
            renderer.append("/*sequenceForLoop*/");
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
    public JsonObjectClassModel jsonObjectClassModel() {
        System.err.println("/*jsonObjectClassModel*/");
        imports.add("io.vertx.kotlin.core.json.*");
        return CodeBuilder.super.jsonObjectClassModel();
    }

    @Override
    public JsonArrayClassModel jsonArrayClassModel() {
        System.err.println("/*jsonArrayClassModel*/");
        imports.add("io.vertx.kotlin.core.json.*");
        return CodeBuilder.super.jsonArrayClassModel();
    }

    private void renderType(TypeInfo type, JPhpWriter renderer) {
        renderer.append("/*renderType*/");
        System.err.println("/*renderType*/");
        if (type instanceof ApiTypeInfo) {
            renderer.renderApiType((ApiTypeInfo) type);
        } else if (type instanceof ClassTypeInfo) {
            renderer.renderJavaType((ClassTypeInfo) type);
        } else if (type instanceof PrimitiveTypeInfo) {
            renderer.renderBasicType(type);
        } else {
            renderer.append(type.getName());
        }
    }

    private void addImport(ClassTypeInfo importedType) {
        System.err.println("/*addImport*/");
        String fqn = importedType.getName();
/*
    if (importedType instanceof ApiTypeInfo) {
      fqn = importedType.translateName("kotlin");
    }
*/
        imports.add(fqn);
    }
}
