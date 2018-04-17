package io.vertx.codetrans.lang.jphp;

import com.sun.source.tree.LambdaExpressionTree;
import io.vertx.codegen.type.*;
import io.vertx.codetrans.CodeModel;
import io.vertx.codetrans.CodeWriter;
import io.vertx.codetrans.MethodSignature;
import io.vertx.codetrans.TypeArg;
import io.vertx.codetrans.expression.*;
import io.vertx.codetrans.statement.StatementModel;

import javax.lang.model.element.TypeElement;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

class JPhpWriter extends CodeWriter {
    private JPhpCodeBuilder builder;

    public JPhpWriter(JPhpCodeBuilder builder) {
        super(builder);
        this.builder = builder;
    }

    public void renderIdentifier(String name, VariableScope scope) {
        append("$");
        append(name);
    }

    private final Field f;

    {
        try {
            f = ParenthesizedModel.class.getDeclaredField("expression");
            f.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private boolean isStringModel(ExpressionModel expression) throws IllegalAccessException {
        if (expression instanceof BinaryExpressionModel) {
            BinaryExpressionModel m = (BinaryExpressionModel) expression;
            ExpressionModel left = m.getLeft();
            ExpressionModel right = m.getRight();
            return isStringModel(left) || isStringModel(right);
        } else if (expression instanceof StringLiteralModel) {
            return true;
        } else if (expression instanceof ParenthesizedModel) {
            ExpressionModel o = (ExpressionModel) f.get(expression);
            return isStringModel(o);
        } else if (expression instanceof JPhpCodeBuilder.JPhpIdentifierModel) {
            return ((JPhpCodeBuilder.JPhpIdentifierModel) expression).getKind() == ClassKind.STRING;
        }
        return false;
    }

    private void renderA(JPhpCodeBuilder.A expression) {
        append("\"");
        expression.render(this);
        append("\"");
    }

    @Override
    public void renderBinary(BinaryExpressionModel expression) {
        try {
            String op = expression.getOp();
            boolean isString = isStringModel(expression);
//      append("/*111" + isString + "," + expression.getLeft().getClass() + "," + expression.getRight().getClass() + "*/");
            if (op.equals("+") && isString) {
                ExpressionModel left = expression.getLeft();
                ExpressionModel right = expression.getRight();
                if (left instanceof JPhpCodeBuilder.A) {
                    renderA((JPhpCodeBuilder.A) left);
                } else {
                    left.render(this);
                }
                append(".");
                if (right instanceof JPhpCodeBuilder.A) {
                    renderA((JPhpCodeBuilder.A) right);
                } else {
                    right.render(this);
                }
            } else {
                super.renderBinary(expression);
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Override
    public void renderStringLiteral(List<?> parts) {
        try {
            boolean back = false;
            boolean first = true;
            for (Iterator<?> it = parts.iterator(); it.hasNext(); ) {
                Object part = it.next();
                if (part instanceof String || part instanceof StringLiteralModel || part instanceof JPhpCodeBuilder.A) {
                    if (!first) {
                        append(".");
                    }
                    if (!back) {
                        append('"');
                        back = true;
                    }
                    if (part instanceof String) {
                        renderChars((String) part);
                    } else {
                        ExpressionModel m = (ExpressionModel) part;
                        m.render(this);
                    }
                } else {
                    if (back) {
                        append('"');
                        back = false;
                        append(".");
                    }
                    if (!first && part instanceof BinaryExpressionModel) {
                        append("(");
                    }
                    ExpressionModel m = (ExpressionModel) part;
                    m.render(this);
                    if (!first && part instanceof BinaryExpressionModel) {
                        append(")");
                    }
                }
                first = false;
            }
            if (back) {
                append('"');
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
        //      if (part instanceof JPhpCodeBuilder.A) {
        //        ((JPhpCodeBuilder.A) part).render(this);
        //      } else if (part instanceof IdentifierModel) {
        //        IdentifierModel identifier = (IdentifierModel) part;
        //        append("${");
        //        append(identifier.name);
        //        append("}");
        //      } else if (part instanceof ExpressionModel) {
        //        System.err.println(part.getClass());
        ////        append("/*");
        ////        append(part.getClass().getSimpleName());
        ////        append("*/");
        //        append("\".");
        //        if (!(part instanceof ParenthesizedModel)) {
        //          append("(");
        //        }
        //        ((ExpressionModel) part).render(this);
        //        append("/*end*/");
        //        if (!(part instanceof ParenthesizedModel)) {
        //          append(")");
        //        }
        //        if (hasNext) {
        //          append(".\"");
        //        }
        //      } else {
        //        renderChars(part.toString());
        //      }
        //    }
        //    append('"');
    }

    @Override
    public void renderStatement(StatementModel statement) {
        statement.render(this);
        append(";\n");
    }

    @Override
    public void renderTryCatch(StatementModel tryBlock, StatementModel catchBlock) {
        append("try {\n");
        indent();
        tryBlock.render(this);
        unindent();
        append("} catch(Exception $throwable) {\n");
        indent();
        catchBlock.render(this);
        unindent();
        append("}\n");
    }

    @Override
    public void renderMethodReference(ExpressionModel expression, MethodSignature signature) {
        if (!(expression instanceof ThisModel)) {
            append("array(");
            expression.render(this);
            append(", ");
        }
        renderStringLiteral(signature.getName());
        if (!(expression instanceof ThisModel)) {
            append(")");
        }
    }

    @Override
    public void renderNew(ExpressionModel expression, TypeInfo type, List<ExpressionModel> argumentModels) {
        expression.render(this);
        append(".newInstance(");
        for (int i = 0; i < argumentModels.size(); i++) {
            if (i > 0) {
                append(", ");
            }
            argumentModels.get(i).render(this);
        }
        append(')');
    }

    @Override
    public void renderListAdd(ExpressionModel list, ExpressionModel value) {
        list.render(this);
        append("[] = ");
        value.render(this);
    }

    @Override
    public void renderListSize(ExpressionModel list) {
        append("sizeof(");
        list.render(this);
        append(")");
    }

    @Override
    public void renderListGet(ExpressionModel list, ExpressionModel index) {
        list.render(this);
        append("[");
        index.render(this);
        append("]");
    }

    @Override
    public void renderListLiteral(List<ExpressionModel> arguments) {
        append("array(");
        Iterator<ExpressionModel> it = arguments.iterator();
        while (it.hasNext()) {
            append("");
            append(" ");
            it.next().render(this);
            if (it.hasNext()) {
                append(", ");
            }
        }
        append(")");
    }

    @Override
    public void renderMapGet(ExpressionModel map, ExpressionModel key) {
        map.render(this);
        append("[");
        key.render(this);
        append("]");
    }

    @Override
    public void renderMapPut(ExpressionModel map, ExpressionModel key, ExpressionModel value) {
        map.render(this);
        append("[");
        key.render(this);
        append("] = ");
        value.render(this);
    }

    @Override
    public CodeWriter indent() {
        super.indent();
        return super.indent();
    }

    @Override
    public CodeWriter unindent() {
        super.unindent();
        return super.unindent();
    }

    @Override
    public void renderMapForEach(ExpressionModel map, String keyName, TypeInfo keyType, String valueName, TypeInfo valueType, LambdaExpressionTree.BodyKind bodyKind, CodeModel block) {
        append("foreach (");
        map.render(this);
        append(" as $");
        append(keyName);
        append(" => ");
        append("$");
        append(valueName);
        append(") {\n").indent();
        block.render(this);
        unindent();
        append("}\n");
    }

    @Override
    public void renderJsonObject(JsonObjectLiteralModel model) {
        renderJsonObject(model.getMembers());
    }

    @Override
    public void renderJsonArray(JsonArrayLiteralModel jsonArray) {
        renderJsonArray(jsonArray.getValues());
    }


    @Override
    public void renderDataObject(DataObjectLiteralModel model) {
        renderJsonObject(model.getMembers());
    }

    private void renderJsonObject(Iterable<Member> members) {
        append("array(\n");
        indent();
        for (Iterator<Member> iterator = members.iterator(); iterator.hasNext(); ) {
            Member member = iterator.next();
            String name = member.getName();
            append("\"");
            renderChars(name);
            append("\" => ");
            if (member instanceof Member.Single) {
                ((Member.Single) member).getValue().render(this);
            } else if (member instanceof Member.Sequence) {
                renderJsonArray(((Member.Sequence) member).getValues());
            } else if (member instanceof Member.Entries) {
                renderJsonObject(((Member.Entries) member).entries());
            }
            if (iterator.hasNext()) {
                append(',');
            }
            append('\n');
        }
        unindent().append(")");
    }

    private void renderJsonArray(List<ExpressionModel> values) {
        append("[\n").indent();
        for (int i = 0; i < values.size(); i++) {
            values.get(i).render(this);
            if (i < values.size() - 1) {
                append(',');
            }
            append('\n');
        }
        unindent().append(']');
    }

    @Override
    public void renderJsonObjectAssign(ExpressionModel expression, String name, ExpressionModel value) {
        expression.render(this);
        append("[\"");
        append(name);
        append("\"]");
        append(" = ");
        value.render(this);
    }

    @Override
    public void renderDataObjectAssign(ExpressionModel expression, String name, ExpressionModel value) {
        renderJsonObjectAssign(expression, name, value);
    }

    @Override
    public void renderJsonObjectToString(ExpressionModel expression) {
        renderJson(expression);
    }

    private void renderJson(ExpressionModel expression) {
        append("json_encode(");
        expression.render(this);
        append(")");
    }

    @Override
    public void renderJsonArrayToString(ExpressionModel expression) {
        renderJson(expression);
    }

    @Override
    public void renderJsonObjectMemberSelect(ExpressionModel expression, Class<?> type, String name) {
        expression.render(this);
        append("[\"");
        append(name);
        append("\"]");
    }

    @Override
    public void renderDataObjectMemberSelect(ExpressionModel expression, String name) {
        renderJsonObjectMemberSelect(expression, Object.class, name);
    }

    @Override
    public void renderNewMap() {
        append("array()");
    }

    @Override
    public void renderNewList() {
        append("array()");
    }

    @Override
    public void renderAsyncResultSucceeded(TypeInfo resultType, String name) {
        append("$").append(name).append(" != null");
    }

    @Override
    public void renderAsyncResultFailed(TypeInfo resultType, String name) {
        append("$").append(name).append("_err != null");
    }

    @Override
    public void renderAsyncResultCause(TypeInfo resultType, String name) {
        append("$").append(name).append("_err");
    }

    @Override
    public void renderAsyncResultValue(TypeInfo resultType, String name) {
        append("$").append(name);
    }

    @Override
    public void renderLambda(LambdaExpressionTree.BodyKind bodyKind, List<TypeInfo> parameterTypes, List<String> parameterNames, CodeModel body) {
        append("function (");
        for (int i = 0; i < parameterNames.size(); i++) {
            if (i > 0) {
                append(", ");
            }
            append("$");
            append(parameterNames.get(i));
        }
        append(") {\n");
        indent();
        body.render(this);
        if (bodyKind == LambdaExpressionTree.BodyKind.EXPRESSION) {
            append(";\n");
        }
        unindent();
        append("}");
    }

    @Override
    public void renderEnumConstant(EnumTypeInfo type, String constant) {
        append('"');
        append(constant);
        append('"');
    }

    @Override
    public void renderSystemOutPrintln(ExpressionModel expression) {
        append("echo ");
        if (expression instanceof StringLiteralModel) {
            StringLiteralModel str = (StringLiteralModel) expression;
            append("\"");
            renderChars(str.getValue());
            append("\\n\"");
        } else {
            expression.render(this);
            append(".\"\\n\"");
        }
    }

    @Override
    public void renderMethodInvocation(ExpressionModel expression, TypeInfo receiverType, MethodSignature method, TypeInfo returnType, List<TypeArg> typeArguments, List<ExpressionModel> argumentModels, List<TypeInfo> argumentTypes) {
        List<TypeInfo> parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.size(); i++) {
            TypeInfo parameterType = parameterTypes.get(i);
            TypeInfo argumentType = argumentTypes.get(i);
            if (io.vertx.codetrans.Helper.isHandler(parameterType) && io.vertx.codetrans.Helper.isInstanceOfHandler(argumentType)) {
                ExpressionModel expressionModel = argumentModels.get(i);
                argumentModels.set(i, builder.render(expressionModel::render));
            }
        }

        //
        if (expression instanceof JPhpCodeBuilder.JPhpIdentifierModel && ((JPhpCodeBuilder.JPhpIdentifierModel) expression).getKind() == ClassKind.STRING) {
            if (method.getName().equals("startsWith")) {
                append("substr(");
                expression.render(this);
                append(", 0, strlen(");
                argumentModels.get(0).render(this);
                append(")) === ");
                argumentModels.get(0).render(this);
                if (argumentModels.size() > 1) {
                    append("/*wrong arg num*/");
                }
            } else if (method.getName().equals("length")) {
                append("strlen(");
                expression.render(this);
                append(")");
            } else {
                append("/*string method").append(method.getName()).append("*/");
            }
        } else {
            if (!(expression instanceof ThisModel)) {
                expression.render(this);
                renderJoiner(expression);
            }
            append(method.getName());
            append('(');
            for (int i = 0; i < argumentModels.size(); i++) {
                if (i > 0) {
                    append(", ");
                }
                argumentModels.get(i).render(this);
            }
            append(')');
        }

    }

    @Override
    public void renderSystemErrPrintln(ExpressionModel expression) {
        renderSystemOutPrintln(expression);
    }

    @Override
    public void renderThrow(String throwableType, ExpressionModel reason) {
        append("throw new ");
        append(throwableType.replace(".", "\\"));
        append("(");

        if (reason != null) {
            reason.render(this);
        }

        append(")");
    }

    @Override
    public void renderThis() {
        append("$this");
    }

    @Override
    public void renderApiType(ApiTypeInfo apiType) {
        append(apiType.getSimpleName());
    }

    @Override
    public void renderJavaType(ClassTypeInfo apiType) {
        append("Java::type(\"");
        append(apiType.getPackageName());
        append(".");
        append(apiType.getSimpleName());
        append("\")");
    }

    private void renderJoiner(ExpressionModel expression) {
        if (expression instanceof ApiTypeModel) {
            append("::");
        } else if (expression instanceof ClassModel) {
            append("->");
        } else {
            append("->");
        }
    }

    public void renderMemberSelect(ExpressionModel expression, String identifier) {
        expression.render(this);
        renderJoiner(expression);
        append(identifier);
    }

    @Override
    public void renderJsonArrayAdd(ExpressionModel expression, ExpressionModel value) {
        renderListAdd(expression, value);
    }

    @Override
    public void renderInstanceOf(ExpressionModel expression, TypeElement type) {
        expression.render(this);
        append(".getClass().getSimpleName() == '");
        append(type.getSimpleName());
        append("'");
    }

    @Override
    public void renderAssign(ExpressionModel variable, ExpressionModel expression) {
        if (expression instanceof JPhpCodeBuilder.JPhpIdentifierModel) {
            JPhpCodeBuilder.JPhpIdentifierModel e = (JPhpCodeBuilder.JPhpIdentifierModel) expression;
            if (e.getScope() == VariableScope.FIELD && builder.defineFunction) {
                append("global $").append(e.name).append(";");
            }
        }
        variable.render(this);
        append(" = ");
        expression.render(this);
    }
}
