package io.vertx.codetrans.lang.jphp;

import com.sun.source.tree.LambdaExpressionTree;
import io.vertx.codegen.type.*;
import io.vertx.codetrans.*;
import io.vertx.codetrans.expression.*;
import io.vertx.codetrans.statement.StatementModel;
import kotlin.collections.CollectionsKt;

import javax.lang.model.element.TypeElement;
import java.util.*;
import java.util.stream.Collectors;

class JPhpWriter extends CodeWriter {


    private static final Map<String, String> BASIC_TYPES = new HashMap<>();

    static {
        BASIC_TYPES.put(java.lang.Byte.class.getName(), "Byte");
        BASIC_TYPES.put(byte.class.getName(), "Byte");
        BASIC_TYPES.put(java.lang.Short.class.getName(), "Short");
        BASIC_TYPES.put(short.class.getName(), "Short");
        BASIC_TYPES.put(java.lang.Integer.class.getName(), "Int");
        BASIC_TYPES.put(int.class.getName(), "Int");
        BASIC_TYPES.put(java.lang.Long.class.getName(), "Long");
        BASIC_TYPES.put(long.class.getName(), "Long");
        BASIC_TYPES.put(java.lang.Float.class.getName(), "Float");
        BASIC_TYPES.put(float.class.getName(), "Float");
        BASIC_TYPES.put(java.lang.Double.class.getName(), "Double");
        BASIC_TYPES.put(double.class.getName(), "Double");
        BASIC_TYPES.put(java.lang.Character.class.getName(), "Char");
        BASIC_TYPES.put(char.class.getName(), "Char");
        BASIC_TYPES.put(java.lang.Boolean.class.getName(), "Boolean");
        BASIC_TYPES.put(boolean.class.getName(), "Boolean");
    }

    private int jsonLevel = 0;

    public JPhpWriter(CodeBuilder builder) {
        super(builder);
    }

    @Override
    public JPhpCodeBuilder getBuilder() {
        return (JPhpCodeBuilder) super.getBuilder();
    }

    @Override
    public void renderStringLiteral(List<?> parts) {
        System.err.println("renderStringLiteral");
        append('"');
        for (Object part : parts) {
            if (part instanceof ExpressionModel) {
                append("${");
                ((ExpressionModel) part).render(this);
                append("}");
            } else {
                renderChars(part.toString());
            }
        }
        append('"');
    }

    public void renderChars(String value) {
        System.err.println("renderChars");
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '\b':
                    append("\\b");
                    break;
                case '\f':
                    append("\\u000c");
                    break;
                case '\n':
                    append("\\n");
                    break;
                case '\t':
                    append("\\t");
                    break;
                case '\r':
                    append("\\r");
                    break;
                case '"':
                    append("\\\"");
                    break;
                case '\\':
                    append("\\\\");
                    break;
                case '$':
                    append("\\$");
                default:
                    if (c < 32 || c > 126) {
                        String s = Integer.toHexString(c).toUpperCase();
                        while (s.length() < 4) {
                            s = "0" + s;
                        }
                        append("\\u").append(s);
                    } else {
                        append(c);
                    }
            }
        }
    }

    @Override
    public void renderNewList() {
        System.err.println("renderNewList");
        append("array()");
    }

    @Override
    public void renderNewMap() {
        System.err.println("renderNewMap");
        append("array()");
    }

    @Override
    public void renderThis() {
        System.err.println("renderThis");
        append("$this");
    }

    @Override
    public void renderMethodReference(ExpressionModel expression, MethodSignature signature) {
        System.err.println("renderMethodReference");
        append("{ ");
        List<ExpressionModel> arguments = new ArrayList<>();

        if (!signature.getParameterTypes().isEmpty()) {
            for (int i = 0, m = signature.getParameterTypes().size(); i < m; ++i) {
                String name;
                if (m == 1) {
                    name = "it";
                } else {
                    name = "p" + Integer.toString(i);
                }

                arguments.add(new IdentifierModel(builder, name, VariableScope.VARIABLE));
            }

            if (arguments.size() > 1) {
                for (int i = 0, m = arguments.size(); i < m; ++i) {
                    if (i > 0) {
                        append(", ");
                    }

                    append(((IdentifierModel) arguments.get(i)).name);
                }

                append(" -> ");
            }
        }

        renderMethodInvocation(expression, VoidTypeInfo.INSTANCE, signature, VoidTypeInfo.INSTANCE, Collections.emptyList(), arguments, CollectionsKt.emptyList());
        append(" }");
    }

    @Override
    public void renderLongLiteral(String value) {
        System.err.println("renderLongLiteral");
        renderChars(value);
        append('L');
    }

    @Override
    public void renderFloatLiteral(String value) {
        System.err.println("renderFloatLiteral");
        renderChars(value);
        append('f');
    }

    @Override
    public void renderDoubleLiteral(String value) {
        System.err.println("renderDoubleLiteral");
        renderChars(value);
    }

    @Override
    public void renderBinary(BinaryExpressionModel expression) {
        System.err.println("renderBinary");
        expression.getLeft().render(this);
        append(" ");

        append(expression.getOp());

        append(" ");
        expression.getRight().render(this);
    }

    @Override
    public void renderStatement(StatementModel statement) {
        System.err.println("renderStatement");
        statement.render(this);
        append("\n");
    }

    @Override
    public void renderTryCatch(StatementModel tryBlock, StatementModel catchBlock) {
        System.err.println("renderTryCatch");
        append("try {\n");
        indent();
        tryBlock.render(this);
        unindent();
        append("} catch(e: Exception) {\n");
        indent();
        catchBlock.render(this);
        unindent();
        append("}\n");
    }

    @Override
    public void renderThrow(String throwableType, ExpressionModel reason) {
        System.err.println("renderThrow");
        append("throw ");
        append(throwableType);
        append("(");

        if (reason != null) {
            reason.render(this);
        }

        append(")");
    }

    @Override
    public void renderSystemOutPrintln(ExpressionModel expression) {
        System.err.println("renderSystemOutPrintln");
        append("echo ");
        expression.render(this);
        append(".\"\\n\";");
    }

    @Override
    public void renderSystemErrPrintln(ExpressionModel expression) {
        System.err.println("renderSystemErrPrintln");
        append("echo ");
        expression.render(this);
        append(".\"\\n\";");
    }


    @Override
    public void renderLambda(LambdaExpressionTree.BodyKind bodyKind, List<TypeInfo> parameterTypes, List<String> parameterNames, CodeModel body) {
        System.err.println("renderLambda");
        append("{");
        if (!parameterNames.isEmpty()) {
            for (int i = 0; i < parameterNames.size(); i++) {
                if (i == 0) {
                    append(" ");
                } else {
                    append(", ");
                }
                append(parameterNames.get(i));
            }
            append(" ->\n");
        } else {
            append("\n");
        }
        indent();
        body.render(this);
        if (bodyKind == LambdaExpressionTree.BodyKind.EXPRESSION) {
            append("\n");
        }
        unindent();
        append("}");
    }

    @Override
    public void renderApiType(ApiTypeInfo apiType) {
        System.err.println("renderApiType");
        append(apiType.getSimpleName());
    }

    @Override
    public void renderJavaType(ClassTypeInfo javaType) {
        System.err.println("renderJavaType");
        switch (javaType.getKind()) {
            case STRING:
                append("String");
                break;
            case VOID:
                append("Unit");
                break;
            case BOXED_PRIMITIVE:
                renderBasicType(javaType);
                break;
            default:
                append(javaType.getName());
        }
    }

    private static final Set<String> reservedWords = new HashSet<>(Arrays.asList("object", "class"));

    @Override
    public void renderIdentifier(String name, VariableScope scope) {
        System.err.println("renderIdentifier");
        append("$");
        if (reservedWords.contains(name)) {
            append("`");
            append(name);
            append("`");
        } else {
            append(name);
        }
    }

    public void renderBasicType(TypeInfo type) {
        System.err.println("renderBasicType");
        append(BASIC_TYPES.getOrDefault(type.getName(), type.getName()));
    }

    @Override
    public void renderAsyncResultSucceeded(TypeInfo resultType, String name) {
        System.err.println("renderAsyncResultSucceeded");
        append(name).append(".succeeded()");
    }

    @Override
    public void renderAsyncResultFailed(TypeInfo resultType, String name) {
        System.err.println("renderAsyncResultFailed");
        append(name).append(".failed()");
    }

    @Override
    public void renderAsyncResultCause(TypeInfo resultType, String name) {
        System.err.println("renderAsyncResultCause");
        append(name).append(".cause()");
    }

    @Override
    public void renderAsyncResultValue(TypeInfo resultType, String name) {
        System.err.println("renderAsyncResultValue");
        append(name).append(".result()");
    }

    @Override
    public void renderEnumConstant(EnumTypeInfo type, String constant) {
        System.err.println("renderEnumConstant");
        append(type.getSimpleName()).append('.').append(constant);
    }

    @Override
    public void renderListAdd(ExpressionModel list, ExpressionModel value) {
        System.err.println("renderListAdd");
        list.render(this);
        append(".add(");
        value.render(this);
        append(")");
    }

    @Override
    public void renderListSize(ExpressionModel list) {
        System.err.println("renderListSize");
        append("sizeof(");
        list.render(this);
        append(")");
    }

    @Override
    public void renderListGet(ExpressionModel list, ExpressionModel index) {
        System.err.println("renderListGet");
        list.render(this);
        append("[");
        index.render(this);
        append("]");
    }

    @Override
    public void renderMapGet(ExpressionModel map, ExpressionModel key) {
        System.err.println("renderMapGet");
        map.render(this);
        append("[");
        key.render(this);
        append("]");
    }

    @Override
    public void renderMapPut(ExpressionModel map, ExpressionModel key, ExpressionModel value) {
        System.err.println("renderMapPut");
        map.render(this);
        append("[");
        key.render(this);
        append("] = ");
        value.render(this);
    }

    @Override
    public void renderMapForEach(ExpressionModel map, String keyName, TypeInfo keyType, String valueName, TypeInfo valueType, LambdaExpressionTree.BodyKind bodyKind, CodeModel block) {
        System.err.println("renderMapForEach");
        append("for ((").append(keyName).append(", ").append(valueName).append(") in ");
        map.render(this);
        append(") {\n");
        indent();

        block.render(this);
        if (bodyKind == LambdaExpressionTree.BodyKind.EXPRESSION) {
            append("\n");
        }

        unindent();
        append("}\n");
    }

    @Override
    public void renderNew(ExpressionModel expression, TypeInfo type, List<ExpressionModel> argumentModels) {
        System.err.println("renderNew");
        expression.render(this);
        append('(');
        for (int i = 0; i < argumentModels.size(); i++) {
            if (i > 0) {
                append(", ");
            }
            argumentModels.get(i).render(this);
        }
        append(')');
    }

    @Override
    public void renderInstanceOf(ExpressionModel expression, TypeElement type) {
        System.err.println("renderInstanceOf");
        expression.render(this);
        append(" is ");
        append(type.getQualifiedName());
    }

    @Override
    public void renderListLiteral(List<ExpressionModel> arguments) {
        System.err.println("renderListLiteral");
        append("listOf(");
        for (int i = 0; i < arguments.size(); ++i) {
            if (i > 0) {
                append(", ");
            }

            arguments.get(i).render(this);
        }
        append(")");
    }

    @Override
    public void renderJsonArrayToString(ExpressionModel expression) {
        System.err.println("renderJsonArrayToString");
        expression.render(this);
        append(".toString()");
    }

    @Override
    public void renderJsonObjectToString(ExpressionModel expression) {
        System.err.println("renderJsonObjectToString");
        expression.render(this);
        append(".toString()");
    }

    @Override
    public void renderJsonArray(JsonArrayLiteralModel jsonArray) {
        System.err.println("renderJsonArray");
        renderJsonArray(jsonArray.getValues());
    }

    @Override
    public void renderJsonArrayAdd(ExpressionModel expression, ExpressionModel value) {
        System.err.println("renderJsonArrayAdd");
        expression.render(this);

        if (value instanceof NullLiteralModel) {
            append(".addNull()");
        } else {
            append(".add(");
            value.render(this);
            append(")");
        }
    }

    private void jsonEnter() {
        System.err.println("jsonEnter");
        if (jsonLevel == 0) {
            append("json {\n");
            indent();
        }
        jsonLevel++;
    }

    private void jsonLeave() {
        System.err.println("jsonLeave");
        jsonLevel--;
        if (jsonLevel == 0) {
            unindent();
            append("\n}");
        }
    }

    @Override
    public void renderJsonArrayGet(ExpressionModel expression, Class<?> type, ExpressionModel index) {
        System.err.println("renderJsonArrayGet");
        expression.render(this);
        append(".");
        if (type == Object.class) {
            append("get<Any?>(");
        } else {
            append("get");
            append(type.getSimpleName());
        }
        append("(");
        index.render(this);
        append(')');
    }

    private void renderJsonArray(List<ExpressionModel> entries) {
        System.err.println("renderJsonArray");
        jsonEnter();
        append("array(");

        for (int i = 0; i < entries.size(); ++i) {
            if (i > 0) {
                append(", ");
            }

            entries.get(i).render(this);
        }

        append(")");
        jsonLeave();
    }

    @Override
    public void renderJsonObject(JsonObjectLiteralModel jsonObject) {
        System.err.println("renderJsonObject");
        jsonEnter();

        renderMapStructure("obj", jsonObject.getMembers());

        jsonLeave();
    }

    @Override
    public void renderJsonObjectAssign(ExpressionModel expression, String name, ExpressionModel value) {
        System.err.println("renderJsonObjectAssign");
        ArrayList<ExpressionModel> args = new ArrayList<>();
        args.add(new StringLiteralModel(getBuilder(), name));

        if (value instanceof NullLiteralModel) {
            renderMethodInvocation(expression, VoidTypeInfo.INSTANCE, new MethodSignature("putNull", Collections.emptyList(), false, VoidTypeInfo.INSTANCE), VoidTypeInfo.INSTANCE, Collections.emptyList(), args, Collections.emptyList());
        } else {
            args.add(value);
            renderMethodInvocation(expression, VoidTypeInfo.INSTANCE, new MethodSignature("put", Collections.emptyList(), false, VoidTypeInfo.INSTANCE), VoidTypeInfo.INSTANCE, Collections.emptyList(), args, Collections.emptyList());
        }
    }

    @Override
    public void renderMethodInvocation(ExpressionModel expression, TypeInfo receiverType, MethodSignature method, TypeInfo returnType, List<TypeArg> typeArguments, List<ExpressionModel> argumentModels, List<TypeInfo> argumentTypes) {

        System.err.println("renderMethodInvocation");
        if (!(expression instanceof ThisModel)) {
            expression.render(this);
            append('.');
        }
        renderIdentifier(method.getName(), VariableScope.FIELD);
        if (typeArguments.size() > 0) {
            boolean needed = typeArguments.stream().filter(typeArg -> typeArg == null || !typeArg.resolved).count() > 0;
            if (needed) {
                append('<');
                append(typeArguments.stream().map(ti -> {
                    if (ti != null) {
                        return ti.value.getSimpleName();
                    } else {
                        return "Any";
                    }
                }).collect(Collectors.joining(", ")));
                append('>');
            }
        }
        append('(');
        for (int i = 0; i < argumentModels.size(); i++) {
            if (i > 0) {
                append(", ");
            }
            argumentModels.get(i).render(this);
        }
        append(')');
    }

    @Override
    public void renderJsonObjectMemberSelect(ExpressionModel expression, Class<?> type, String name) {
        System.err.println("renderJsonObjectMemberSelect");
        expression.render(this);
        append(".");
        if (type == Object.class) {
            append("get<Any?>");
        } else {
            append("get");
            append(type.getSimpleName());
        }
        append("(");
        renderStringLiteral(name);
        append(")");
    }

    @Override
    public void renderDataObject(DataObjectLiteralModel model) {
        System.err.println("renderDataObject");
        append(model.getType().getSimpleName());
        append("(");
        if (model.getMembers().iterator().hasNext()) {
            append("\n");
            indent();
            int index = 0;
            for (Member m : model.getMembers()) {
                if (index > 0) {
                    append(",\n");
                }
                append(m.getName()).append(" = ");
                renderMember(m);
                index++;
            }
            unindent();
        }
        append(")");
    }

    @Override
    public void renderDataObjectAssign(ExpressionModel expression, String name, ExpressionModel value) {
        System.err.println("renderDataObjectAssign");
        renderDataObjectMemberSelect(expression, name);
        append(" = ");
        value.render(this);
    }

    @Override
    public void renderDataObjectMemberSelect(ExpressionModel expression, String name) {
        System.err.println("renderDataObjectMemberSelect");
        expression.render(this);
        append(".");
        renderIdentifier(name, VariableScope.FIELD);
    }

    @Override
    public void renderMemberSelect(ExpressionModel expression, String identifier) {
        System.err.println("renderMemberSelect");
        expression.render(this);
        append('.');
        renderIdentifier(identifier, VariableScope.FIELD);
    }

    private void renderMapStructure(String builderFunctionName, Iterable<Member> members) {
        System.err.println("renderMapStructure");
        List<Member> membersList = new ArrayList<>();
        CollectionsKt.addAll(membersList, members);
        boolean feedLine = membersList.size() > 1;

        append(builderFunctionName);
        append("(");
        if (feedLine) {
            append("\n");
        }
        indent();

        int i = 0;
        for (Member m : membersList) {
            if (i > 0) {
                append(",");
                if (feedLine) {
                    append("\n");
                }
            }

            renderStringLiteral(m.getName());
            append(" to ");
            renderMember(m);

            i++;
        }

        unindent();
        if (feedLine) {
            append("\n");
        }
        append(")");
    }

    private void renderMap(Iterable<Member> members) {
        System.err.println("renderMap");
        renderMapStructure("mapOf", members);
    }

    private void renderMember(Member m) {
        System.err.println("renderMember");
        if (m instanceof Member.Single) {
            ((Member.Single) m).getValue().render(this);
        } else if (m instanceof Member.Sequence) {
            renderListLiteral(((Member.Sequence) m).getValues());
        } else if (m instanceof Member.Entries) {
            renderMap(((Member.Entries) m).entries());
        }
    }
}
