package io.vertx.lang.php.codegen;

import io.vertx.codegen.ParamInfo;
import io.vertx.codegen.type.*;
import io.vertx.lang.php.codegen.type.MethodInfo;

import java.util.*;

public class ApiModelInfo {
    protected final String className;
    protected final String packageName;
    protected String namespace;
    protected final Set<String> importClassSet = new HashSet<>();
    protected final ClassTypeInfo type;
    protected final List<io.vertx.codegen.MethodInfo> rawMethods;
    protected final List<MethodInfo> methods;

    public ApiModelInfo(ClassTypeInfo type, List<io.vertx.codegen.MethodInfo> methods){
        this.className = type.getSimpleName();
        this.packageName = type.translatePackageName("php");
        this.type = type;
        this.rawMethods = methods;
        this.methods = new ArrayList<>();
        init();
    }

    protected Map<String, List<io.vertx.codegen.MethodInfo>> methodsMap = new TreeMap<>();
    protected Map<String, List<io.vertx.codegen.MethodInfo>> sameParamSizeMethod = new HashMap<>();
    public void init(){
        Map<String, List<List<ParamInfo>>> paramsMap = new HashMap<>();
        Map<String, Set<ParamInfo>> paramSetMap = new HashMap<>();
        for (io.vertx.codegen.MethodInfo method : rawMethods) {
            String methodName = method.getName();
            List<ParamInfo> methodParams = method.getParams();
            int paramSize = methodParams.size();
            String paramKey = methodName + "-" + paramSize;
            Set<ParamInfo> paramSet = paramSetMap.computeIfAbsent(paramKey, k -> new HashSet<>());

            List<List<ParamInfo>> srcParam = paramsMap.get(paramKey);
            if (srcParam != null) {
                sameParamSizeMethod.get(paramKey).add(method);
                for(int i = 0; i < paramSize; i++) {
                    ParamInfo curParam = methodParams.get(i);
                    boolean sameType = false;

                }
            } else {
                List<io.vertx.codegen.MethodInfo> methodList = methodsMap.computeIfAbsent(methodName, k -> new ArrayList<>());
                methodList.add(method);
                List<List<ParamInfo>> params = new ArrayList<>();
                for (ParamInfo param : methodParams) {
                    List<ParamInfo> list = new ArrayList<>();
                    list.add(param);
                    params.add(list);
                    addImport(param.getType(), true);
                    addParamNoSameTypeAndName(paramSet, param);
                }
                paramsMap.put(paramKey, params);
                List<io.vertx.codegen.MethodInfo> l = new ArrayList<>();
                l.add(method);
                sameParamSizeMethod.put(paramKey, l);
            }

            if (!method.isFluent()) {
                TypeInfo returnType = method.getReturnType();
                addImport(returnType, false);
            }
        }
    }

    private void addParamNoSameTypeAndName(Set<ParamInfo> paramSet, ParamInfo param) {

    }

    protected void addImport(TypeInfo type, boolean param){
        //TypeVariableInfo, VoidTypeInfo, PrimitiveTypeInfo has no raw type
        if (type.isVariable() || type.isVoid() || type instanceof PrimitiveTypeInfo) {
            return;
        }
        ClassKind kind = type.getKind();
        switch(kind) {
            case STRING:
            case BOXED_PRIMITIVE:
            case PRIMITIVE:
                break;
            case ENUM:
                addToImport(type, param);
                break;
            case JSON_OBJECT:
                addToImport(type, param);
                break;
            case JSON_ARRAY:
                addToImport(type, param);
                break;
            case THROWABLE:
                break;
            case VOID:
                break;
            case OBJECT:
                //
                break;
            case LIST:
                addToImport(type, param);
                break;
            case SET:
                addToImport(type, param);
                break;
            case MAP:
                addToImport(type, param);
                break;
            case API:
                addToImport(type, param);
                break;
            case DATA_OBJECT:
                addToImport(type, param);
                break;
            case HANDLER:
                addToImport(type, param);
                break;
            case FUNCTION:
                addToImport(type, param);
                break;
            case ASYNC_RESULT:
                addToImport(type, param);
                break;
            case CLASS_TYPE:
                addToImport(type, param);
                break;
            case OTHER:
                addToImport(type, param);
                break;
        }


    }
    protected void addToImport(TypeInfo type, boolean param){
        importClassSet.add(type.getRaw().getPackageName());
    }

    public String getClassName() {
        return className;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getNamespace() {
        return namespace;
    }

    public Set<String> getImportClassSet() {
        return importClassSet;
    }

    public List<MethodInfo> getMethods() {
        return methods;
    }
}
